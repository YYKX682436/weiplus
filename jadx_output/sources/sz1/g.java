package sz1;

/* loaded from: classes13.dex */
public abstract class g {
    public static java.util.List a(int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if ((i17 & 1) != 0) {
            arrayList.add(1);
        }
        if ((i17 & 2) != 0) {
            arrayList.add(2);
        }
        if ((i17 & 4) != 0) {
            arrayList.add(4);
        }
        if ((i17 & 32) != 0) {
            arrayList.add(32);
        }
        if ((i17 & 64) != 0) {
            arrayList.add(64);
        }
        if ((i17 & 128) != 0) {
            arrayList.add(128);
        }
        if ((i17 & 8) != 0) {
            arrayList.add(8);
        }
        if ((i17 & 16) != 0) {
            arrayList.add(16);
        }
        return arrayList;
    }

    public static java.util.List b(int i17) {
        if ((i17 & 1) != 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if ((i17 & 2) != 0) {
            arrayList.add(2);
        }
        if ((i17 & 4) != 0) {
            arrayList.add(4);
        }
        if ((i17 & 8) != 0) {
            arrayList.add(8);
        }
        if ((i17 & 16) != 0) {
            arrayList.add(16);
        }
        if ((i17 & 32) != 0) {
            arrayList.add(32);
        }
        if ((i17 & 64) != 0) {
            arrayList.add(64);
        }
        if ((i17 & 128) != 0) {
            arrayList.add(128);
        }
        return arrayList;
    }

    public static java.util.List c(int i17) {
        if ((i17 & 1) != 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if ((i17 & 16) != 0) {
            arrayList.add(16);
        }
        if ((i17 & 32) != 0) {
            arrayList.add(32);
        }
        if ((i17 & 64) != 0) {
            arrayList.add(64);
        }
        if ((i17 & 128) != 0) {
            arrayList.add(128);
        }
        if ((i17 & 2) != 0) {
            arrayList.add(2);
        }
        return arrayList;
    }

    public static java.util.List d(int i17) {
        if ((i17 & 1) != 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if ((i17 & 4) != 0) {
            arrayList.add(4);
        }
        if ((i17 & 8) != 0) {
            arrayList.add(8);
        }
        if ((i17 & 2) != 0) {
            arrayList.add(2);
        }
        if ((i17 & 256) != 0) {
            arrayList.add(256);
        }
        if ((i17 & 512) != 0) {
            arrayList.add(512);
        }
        return arrayList;
    }

    public static java.util.List e(int i17) {
        if ((i17 & 1) != 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if ((i17 & 2) != 0) {
            arrayList.add(2);
        }
        if ((i17 & 4) != 0) {
            arrayList.add(4);
        }
        if ((i17 & 8) != 0) {
            arrayList.add(8);
        }
        if ((i17 & 16) != 0) {
            arrayList.add(16);
        }
        if ((i17 & 32) != 0) {
            arrayList.add(32);
        }
        if ((i17 & 64) != 0) {
            arrayList.add(64);
        }
        if ((i17 & 128) != 0) {
            arrayList.add(128);
        }
        if ((i17 & 256) != 0) {
            arrayList.add(256);
        }
        if ((i17 & 512) != 0) {
            arrayList.add(512);
        }
        return arrayList;
    }

    public static int f(java.lang.String str) {
        if (u46.l.c(str, "video_play")) {
            return 1;
        }
        if (u46.l.c(str, "video_pause")) {
            return 2;
        }
        if (u46.l.c(str, "video_stop")) {
            return 4;
        }
        if (u46.l.c(str, "audio_play")) {
            return 32;
        }
        if (u46.l.c(str, "audio_pause")) {
            return 64;
        }
        if (u46.l.c(str, "audio_stop")) {
            return 128;
        }
        if (u46.l.c(str, "cgi_req")) {
            return 8;
        }
        return u46.l.c(str, "cgi_resp") ? 16 : 0;
    }

    public static int g(java.lang.String str) {
        if (u46.l.c(str, "page_in")) {
            return 6;
        }
        if (u46.l.c(str, "page_out")) {
            return 10;
        }
        if (u46.l.c(str, "session_in")) {
            return 18;
        }
        if (u46.l.c(str, "session_out")) {
            return 34;
        }
        if (u46.l.c(str, "biz_in")) {
            return 66;
        }
        return u46.l.c(str, "biz_out") ? 130 : 0;
    }

    public static int h(java.lang.String str) {
        if (u46.l.c(str, "view_clk")) {
            return 14;
        }
        if (u46.l.c(str, "view_double_tap")) {
            return 258;
        }
        if (u46.l.c(str, "view_long_press")) {
            return 514;
        }
        if (u46.l.c(str, "view_exp")) {
            return 50;
        }
        return u46.l.c(str, "view_unexp") ? 194 : 0;
    }

    public static boolean i(java.lang.String str, int i17) {
        if (u46.l.e(str)) {
            return true;
        }
        return !(u46.l.c(str, "video_play") || u46.l.c(str, "video_pause") || u46.l.c(str, "video_stop") || u46.l.c(str, "audio_play") || u46.l.c(str, "audio_pause") || u46.l.c(str, "audio_stop") || u46.l.c(str, "cgi_req") || u46.l.c(str, "cgi_resp")) || (f(str) & i17) == 0;
    }

    public static boolean j(java.lang.String str, int i17) {
        if (u46.l.e(str)) {
            return true;
        }
        if ((u46.l.c(str, "view_clk") || u46.l.c(str, "view_exp") || u46.l.c(str, "view_unexp") || u46.l.c(str, "view_double_tap") || u46.l.c(str, "view_long_press")) && (i17 & 1) == 0) {
            return (i17 & 2) == 0 && (h(str) & i17) == 0;
        }
        return true;
    }
}
