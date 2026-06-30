package com.tencent.soter.core.biometric;

/* loaded from: classes15.dex */
class SoterBiometricAntiBruteForceStrategy {
    private static final long DEFAULT_FREEZE_TIME = -1;
    private static final int FREEZE_SECOND = 30;
    private static final java.lang.String KEY_FAIL_TIMES = "key_fail_times";
    private static final java.lang.String KEY_LAST_FREEZE_TIME = "key_last_freeze_time";
    private static final int MAX_FAIL_NUM = 5;
    private static final java.lang.String TAG = "Soter.SoterBiometricAntiBruteForceStrategy";

    public static void addFailTime(android.content.Context context) {
        setCurrentFailTime(context, java.lang.Integer.valueOf(java.lang.Integer.valueOf(getCurrentFailTime(context)).intValue() + 1).intValue());
    }

    public static void freeze(android.content.Context context) {
        setCurrentFailTime(context, 6);
        setLastFreezeTime(context, java.lang.System.currentTimeMillis());
    }

    private static int getCurrentFailTime(android.content.Context context) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(getCurrentFailTimeInDB(context));
        zt5.h.c(TAG, "soter: current retry time: " + valueOf, new java.lang.Object[0]);
        return valueOf.intValue();
    }

    private static int getCurrentFailTimeInDB(android.content.Context context) {
        return android.preference.PreferenceManager.getDefaultSharedPreferences(context).getInt(KEY_FAIL_TIMES, 0);
    }

    private static long getLastFreezeTime(android.content.Context context) {
        java.lang.Long valueOf = java.lang.Long.valueOf(getLastFreezeTimeInDB(context));
        zt5.h.c(TAG, "soter: current last freeze time: " + valueOf, new java.lang.Object[0]);
        return valueOf.longValue();
    }

    private static long getLastFreezeTimeInDB(android.content.Context context) {
        return android.preference.PreferenceManager.getDefaultSharedPreferences(context).getLong(KEY_LAST_FREEZE_TIME, -1L);
    }

    public static boolean isCurrentFailTimeAvailable(android.content.Context context) {
        if (getCurrentFailTime(context) >= 5) {
            return false;
        }
        zt5.h.c(TAG, "soter: fail time available", new java.lang.Object[0]);
        return true;
    }

    public static boolean isCurrentTweenTimeAvailable(android.content.Context context) {
        int currentTimeMillis = (int) ((java.lang.System.currentTimeMillis() - getLastFreezeTime(context)) / 1000);
        zt5.h.c(TAG, "soter: tween sec after last freeze: " + currentTimeMillis, new java.lang.Object[0]);
        if (currentTimeMillis <= 30) {
            return false;
        }
        zt5.h.a(TAG, "soter: after last freeze", new java.lang.Object[0]);
        return true;
    }

    public static boolean isSystemHasAntiBruteForce() {
        return true;
    }

    private static void setCurrentFailTime(android.content.Context context, int i17) {
        zt5.h.c(TAG, "soter: setting to time: " + i17, new java.lang.Object[0]);
        if (i17 < 0) {
            zt5.h.f(TAG, "soter: illegal fail time", new java.lang.Object[0]);
        } else {
            setCurrentFailTimeInDB(context, i17);
        }
    }

    private static void setCurrentFailTimeInDB(android.content.Context context, int i17) {
        if (context == null) {
            zt5.h.b(TAG, "soter: context is null", new java.lang.Object[0]);
            return;
        }
        android.content.SharedPreferences.Editor edit = android.preference.PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putInt(KEY_FAIL_TIMES, i17);
        edit.apply();
    }

    private static void setLastFreezeTime(android.content.Context context, long j17) {
        zt5.h.c(TAG, "soter: setting last freeze time: " + j17, new java.lang.Object[0]);
        if (j17 < -1) {
            zt5.h.f(TAG, "soter: illegal setLastFreezeTime", new java.lang.Object[0]);
        } else {
            setLastFreezeTimeInDB(context, j17);
        }
    }

    private static void setLastFreezeTimeInDB(android.content.Context context, long j17) {
        if (context == null) {
            zt5.h.b(TAG, "soter: context is null", new java.lang.Object[0]);
            return;
        }
        android.content.SharedPreferences.Editor edit = android.preference.PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putLong(KEY_LAST_FREEZE_TIME, j17);
        edit.apply();
    }

    public static void unFreeze(android.content.Context context) {
        setLastFreezeTime(context, -1L);
        setCurrentFailTime(context, 0);
    }
}
