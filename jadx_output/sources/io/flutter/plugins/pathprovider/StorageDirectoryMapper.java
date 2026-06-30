package io.flutter.plugins.pathprovider;

/* loaded from: classes7.dex */
class StorageDirectoryMapper {
    public static java.lang.String androidType(java.lang.Integer num) {
        if (num == null) {
            return null;
        }
        switch (num.intValue()) {
            case 0:
                return android.os.Environment.DIRECTORY_MUSIC;
            case 1:
                return android.os.Environment.DIRECTORY_PODCASTS;
            case 2:
                return android.os.Environment.DIRECTORY_RINGTONES;
            case 3:
                return android.os.Environment.DIRECTORY_ALARMS;
            case 4:
                return android.os.Environment.DIRECTORY_NOTIFICATIONS;
            case 5:
                return android.os.Environment.DIRECTORY_PICTURES;
            case 6:
                return android.os.Environment.DIRECTORY_MOVIES;
            case 7:
                return android.os.Environment.DIRECTORY_DOWNLOADS;
            case 8:
                return android.os.Environment.DIRECTORY_DCIM;
            case 9:
                return android.os.Environment.DIRECTORY_DOCUMENTS;
            default:
                throw new java.lang.IllegalArgumentException("Unknown index: " + num);
        }
    }
}
