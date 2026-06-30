package kd1;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f306701c = lp0.b.X() + "files/wxofflinevoicenew/";

    /* renamed from: d, reason: collision with root package name */
    public static kd1.e f306702d;

    /* renamed from: a, reason: collision with root package name */
    public java.util.Set f306703a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f306704b = new java.lang.Object();

    public static com.tencent.mm.sdk.platformtools.o4 a() {
        return com.tencent.mm.sdk.platformtools.o4.M("voice_offline_res_new");
    }

    public static kd1.e b() {
        if (f306702d == null) {
            f306702d = new kd1.e();
        }
        return f306702d;
    }

    public static java.lang.String c(java.lang.String str) {
        return a().getString(str + com.tencent.mapsdk.internal.ep.f49376u, "");
    }

    public static void f(java.lang.String str) {
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_VOICE_OFFLINE_RES_ID_STRING_SYNC, str);
        new com.tencent.mm.autogen.events.ReInitVoiceOffLineSynthesizerEvent().e();
    }

    public final void d() {
        if (this.f306703a == null) {
            this.f306703a = new java.util.HashSet();
            java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_VOICE_OFFLINE_RES_IDS_STRING_SYNC, "");
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return;
            }
            for (java.lang.String str2 : str.split(",")) {
                this.f306703a.add(str2);
            }
        }
    }

    public boolean e(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        synchronized (this.f306704b) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.VoiceOffLineHelper", "saveVoiceOfflineLanguageResId, resId :%s、path:%s、md5:%s,version:%s", str, str2, str3, str4);
            d();
            com.tencent.mm.sdk.platformtools.o4 a17 = a();
            a17.getClass();
            a17.putString(str, str2).commit();
            if (com.tencent.mm.sdk.platformtools.t8.D0(str, "0")) {
                com.tencent.mm.sdk.platformtools.o4 a18 = a();
                a18.getClass();
                a18.putString("0-1_md5", str3).commit();
                com.tencent.mm.sdk.platformtools.o4 a19 = a();
                a19.getClass();
                if (str4 == null) {
                    str4 = "";
                }
                a19.putString("0-1_version", str4).commit();
                return true;
            }
            com.tencent.mm.sdk.platformtools.o4 a27 = a();
            a27.getClass();
            a27.putString(str + com.tencent.mapsdk.internal.ep.f49376u, str3).commit();
            com.tencent.mm.sdk.platformtools.o4 a28 = a();
            a28.getClass();
            java.lang.String str5 = str + com.tencent.mapsdk.internal.ep.f49375t;
            if (str4 == null) {
                str4 = "";
            }
            a28.putString(str5, str4).commit();
            if (((java.util.HashSet) this.f306703a).contains(str)) {
                return true;
            }
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_VOICE_OFFLINE_RES_IDS_STRING_SYNC;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder((java.lang.String) c17.m(u3Var, ""));
            if (((java.util.HashSet) this.f306703a).size() <= 0) {
                sb6.append(str);
            } else {
                sb6.append(",");
                sb6.append(str);
            }
            gm0.j1.u().c().x(u3Var, sb6.toString());
            return ((java.util.HashSet) this.f306703a).add(str);
        }
    }
}
