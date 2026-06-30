package n01;

/* loaded from: classes7.dex */
public abstract class c {
    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioPlayerHelper", "createAudioPlayer, appId:%s, audioId:%s", str, str2);
        am.f0 f0Var = new am.f0();
        am.d0 d0Var = f0Var.f6621a;
        d0Var.f6413a = 10;
        d0Var.f6415c = str;
        d0Var.f6414b = str2;
        dl3.c.a(f0Var);
        return d0Var.f6414b;
    }

    public static boolean b(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioPlayerHelper", "destroyAudio, audioId:%s", str);
        am.f0 f0Var = new am.f0();
        am.d0 d0Var = f0Var.f6621a;
        d0Var.f6413a = 5;
        d0Var.f6414b = str;
        dl3.c.a(f0Var);
        return f0Var.f6622b.f6512a;
    }

    public static n01.b c(java.lang.String str) {
        am.f0 f0Var = new am.f0();
        am.d0 d0Var = f0Var.f6621a;
        d0Var.f6413a = 16;
        d0Var.f6414b = str;
        dl3.c.a(f0Var);
        return d0Var.f6417e;
    }

    public static n01.d d(java.lang.String str) {
        am.f0 f0Var = new am.f0();
        am.d0 d0Var = f0Var.f6621a;
        d0Var.f6413a = 6;
        d0Var.f6414b = str;
        dl3.c.a(f0Var);
        return f0Var.f6622b.f6513b;
    }

    public static boolean e(java.lang.String str) {
        am.f0 f0Var = new am.f0();
        am.d0 d0Var = f0Var.f6621a;
        d0Var.f6413a = 2;
        d0Var.f6414b = str;
        dl3.c.a(f0Var);
        return f0Var.f6622b.f6512a;
    }

    public static boolean f(java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioPlayerHelper", "seekToAudio, audioId:%s, currentTime:%d", str, java.lang.Integer.valueOf(i17));
        am.f0 f0Var = new am.f0();
        am.d0 d0Var = f0Var.f6621a;
        d0Var.f6413a = 4;
        d0Var.f6414b = str;
        d0Var.f6416d = i17;
        dl3.c.a(f0Var);
        return f0Var.f6622b.f6512a;
    }

    public static boolean g(n01.b bVar) {
        java.lang.String str = bVar.f333836a;
        am.f0 f0Var = new am.f0();
        am.d0 d0Var = f0Var.f6621a;
        d0Var.f6413a = 0;
        d0Var.f6414b = bVar.f333836a;
        d0Var.f6417e = bVar;
        dl3.c.a(f0Var);
        return f0Var.f6622b.f6512a;
    }

    public static boolean h(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioPlayerHelper", "stopAudio, audioId:%s", str);
        am.f0 f0Var = new am.f0();
        am.d0 d0Var = f0Var.f6621a;
        d0Var.f6413a = 3;
        d0Var.f6414b = str;
        dl3.c.a(f0Var);
        return f0Var.f6622b.f6512a;
    }
}
