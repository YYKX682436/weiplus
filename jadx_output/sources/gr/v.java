package gr;

/* loaded from: classes10.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final gr.v f274696a = new gr.v();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Boolean[] f274697b = {java.lang.Boolean.FALSE};

    /* renamed from: c, reason: collision with root package name */
    public static final gr.u f274698c = new gr.u();

    public final void a(boolean z17) {
        java.lang.Boolean[] boolArr = f274697b;
        if (!boolArr[0].booleanValue() || z17) {
            synchronized (boolArr) {
                if (!boolArr[0].booleanValue() || z17) {
                    gr.u uVar = f274698c;
                    java.lang.Object obj = uVar.get();
                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                    if (kotlin.jvm.internal.o.b(obj, bool)) {
                        return;
                    }
                    try {
                        uVar.set(bool);
                        java.util.ArrayList a17 = gr.t.g().a();
                        kotlin.jvm.internal.o.d(a17);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (java.lang.Object obj2 : a17) {
                            if (true ^ n22.m.l((com.tencent.mm.storage.emotion.EmojiInfo) obj2)) {
                                arrayList.add(obj2);
                            }
                        }
                        int size = arrayList.size();
                        boolean z18 = size >= gr.z.a();
                        gr.v vVar = f274696a;
                        vVar.b().putInt("normal_custom_size", size);
                        vVar.b().putBoolean("custom_full", z18);
                        int size2 = gr.t.g().b(false).size();
                        boolean z19 = size2 >= com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("CaptureEmojiMaxSize"), 300);
                        vVar.b().putInt("capture_custom_size", size2);
                        vVar.b().putBoolean("capture_full", z19);
                        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiStorageState", "init: normal size is " + size + ' ' + z18 + "; capture size is " + size2 + ' ' + z19);
                    } finally {
                        f274698c.set(java.lang.Boolean.FALSE);
                    }
                }
            }
        }
    }

    public final com.tencent.mm.sdk.platformtools.o4 b() {
        a(false);
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("emoji_stg");
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        return M;
    }

    public final boolean c() {
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            return true;
        }
        boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_EMOJI_STORE_IP_INTRO_SHOWN_BOOLEAN, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiStorageState", "hasShowIpIntro: " + o17);
        return o17;
    }

    public final void d() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiStorageState", "setIpIntroShow: ");
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EMOJI_STORE_IP_INTRO_SHOWN_BOOLEAN, java.lang.Boolean.TRUE);
        }
    }
}
