package lj0;

/* loaded from: classes.dex */
public abstract class a {
    public static java.lang.String a(int i17, java.util.Map map) {
        if (map == null) {
            map = new java.util.HashMap();
        }
        switch (i17) {
            case 2:
                map.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID, 10);
                break;
            case 3:
                map.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID, 9);
                break;
            case 4:
                map.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID, 11);
                break;
            case 5:
                map.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID, 8);
                break;
            case 6:
                map.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID, 12);
                break;
            case 7:
                map.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID, 13);
                break;
        }
        return nj0.a.c(map);
    }

    public static void b(android.content.Context context, int i17, int i18, int i19, int i27, int i28, java.lang.String str) {
        com.tencent.mm.game.report.l.c(context, i17, i18, i19, i27, i28, str);
    }
}
