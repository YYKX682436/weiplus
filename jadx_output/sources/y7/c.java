package y7;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static volatile java.lang.Integer f459667a;

    public static int a(android.content.Context context) {
        long e17 = y7.b.e(context);
        int i17 = com.tencent.rtmp.TXLiveConstants.PLAY_EVT_VOD_LOADING_END;
        if (e17 != -1) {
            if (e17 <= 805306368) {
                return y7.b.d() <= 1 ? com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_RESOLUTION : com.tencent.rtmp.TXLiveConstants.PLAY_EVT_GET_PLAYINFO_SUCC;
            }
            if (e17 <= 1073741824) {
                return y7.b.b() < 1300000 ? com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_ROTATION : com.tencent.rtmp.TXLiveConstants.PLAY_EVT_GET_MESSAGE;
            }
            if (e17 <= 1610612736) {
                return y7.b.b() < 1800000 ? com.tencent.rtmp.TXLiveConstants.PLAY_EVT_GET_MESSAGE : com.tencent.rtmp.TXLiveConstants.PLAY_EVT_VOD_PLAY_PREPARED;
            }
            if (e17 <= 2147483648L) {
                return com.tencent.rtmp.TXLiveConstants.PLAY_EVT_VOD_PLAY_PREPARED;
            }
            if (e17 <= 3221225472L) {
                return com.tencent.rtmp.TXLiveConstants.PLAY_EVT_VOD_LOADING_END;
            }
            if (e17 <= 5368709120L) {
                return com.tencent.rtmp.TXLiveConstants.PLAY_EVT_STREAM_SWITCH_SUCC;
            }
            return 2016;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int d17 = y7.b.d();
        int i18 = d17 < 1 ? -1 : d17 == 1 ? 2008 : d17 <= 3 ? com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_ROTATION : 2012;
        if (i18 != -1) {
            arrayList.add(java.lang.Integer.valueOf(i18));
        }
        long b17 = y7.b.b();
        int i19 = b17 == -1 ? -1 : b17 <= 528000 ? 2008 : b17 <= 620000 ? com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_RESOLUTION : b17 <= 1020000 ? com.tencent.rtmp.TXLiveConstants.PLAY_EVT_GET_PLAYINFO_SUCC : b17 <= 1220000 ? com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_ROTATION : b17 <= 1520000 ? 2012 : b17 <= 2020000 ? com.tencent.rtmp.TXLiveConstants.PLAY_EVT_VOD_PLAY_PREPARED : 2014;
        if (i19 != -1) {
            arrayList.add(java.lang.Integer.valueOf(i19));
        }
        long e18 = y7.b.e(context);
        if (e18 <= 0) {
            i17 = -1;
        } else if (e18 <= 201326592) {
            i17 = 2008;
        } else if (e18 <= 304087040) {
            i17 = com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_RESOLUTION;
        } else if (e18 <= 536870912) {
            i17 = com.tencent.rtmp.TXLiveConstants.PLAY_EVT_GET_PLAYINFO_SUCC;
        } else if (e18 <= 1073741824) {
            i17 = com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_ROTATION;
        } else if (e18 <= 1610612736) {
            i17 = 2012;
        } else if (e18 <= 2147483648L) {
            i17 = com.tencent.rtmp.TXLiveConstants.PLAY_EVT_VOD_PLAY_PREPARED;
        }
        if (i17 != -1) {
            arrayList.add(java.lang.Integer.valueOf(i17));
        }
        if (arrayList.isEmpty()) {
            return -1;
        }
        java.util.Collections.sort(arrayList);
        if ((arrayList.size() & 1) == 1) {
            return ((java.lang.Integer) arrayList.get(arrayList.size() / 2)).intValue();
        }
        int size = (arrayList.size() / 2) - 1;
        return ((java.lang.Integer) arrayList.get(size)).intValue() + ((((java.lang.Integer) arrayList.get(size + 1)).intValue() - ((java.lang.Integer) arrayList.get(size)).intValue()) / 2);
    }

    public static int b(android.content.Context context) {
        if (f459667a == null) {
            synchronized (y7.c.class) {
                if (f459667a == null) {
                    f459667a = java.lang.Integer.valueOf(a(context));
                }
            }
        }
        return f459667a.intValue();
    }
}
