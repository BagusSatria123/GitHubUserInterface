package com.bagus.githubuserinterface.models;

import java.util.ArrayList;

public class UserData {


    // array to store data that will be displayed on RecyclerView
    public static String[][] data = new String[][] {
            // copy from my gits, link in description
            // this data from wikipedia
            {"JakeWharton",
            "Jake Wharton",
            "@drawable/user1",
            "Google, Inc.",
            "Pittsburgh, PA, USA",
                    "102",
            "56995",
            " 12"},
        {"amitshekhariitbhu",
        "AMIT SHEKHAR",
        "@drawable/user2",
        "@MindOrksOpenSource",
        "New Delhi, India",
        "37",
        "5153",
                "2"},
        {"romainguy",
        "Romain Guy",
        "@drawable/user3",
        "Google",
        "California",
         "9",
        "7972",
          "0"},
        {"chrisbanes",
        "Chris Banes",
        "@drawable/user4",
        "@google working on @android",
        "Sydney, Australia",
        "30",
        "14725",
         "1"},
        {"tipsy",
        "David",
        "@drawable/user5",
        "Working Group Two",
        "Trondheim, Norway",
        "56",
        "788",
         "0"},
        {"ravi8x",
        "Ravi Tamada",
        "@drawable/user6",
        "AndroidHive | Droid5",
        "India",
         "28",
        "18628",
        "3"},
        {"jasoet",
        "Deny Prasetyo",
        "@drawable/user7",
        "@gojek-engineering",
        "Kotagede, Yogyakarta, Indonesia",
        "44",
        "277",
        "39"},
        {"budioktaviyan",
        "Budi Oktaviyan",
         "@drawable/user8",
        "@KotlinID",
        "Jakarta, Indonesia",
        "110",
        "178",
        "23"},
        {"hendisantika",
        "Hendi Santika",
        "@drawable/user9",
        "@JVMDeveloperID @KotlinID @IDDevOps",
        "Bojongsoang - Bandung Jawa Barat",
        "1064",
        "428",
         "61"},
        {"sidiqpermana",
        "Sidiq Permana",
        "@drawable/user10",
        "Nusantara Beta Studio",
         "Jakarta Indonesia",
         "65",
        "465",
         "10"}
    };

    public static ArrayList<User> getListData() {
        User user;
        ArrayList<User> list = new ArrayList<>();

        for (String[] mData : data) {
            user = new User();
            user.setUsername(mData[0]);
            user.setName(mData[1]);
            user.setCompany(mData[3]);
            user.setLocation(mData[4]);
            user.setRepository(mData[5]);
            user.setFollower(mData[6]);
            user.setFollowing(mData[7]);

            list.add(user);
        }

        return list;
    }
}
