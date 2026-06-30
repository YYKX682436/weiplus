package ws0;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ws0.a f448953a = new ws0.a();

    /* renamed from: b, reason: collision with root package name */
    public static int f448954b = 3;

    /* renamed from: c, reason: collision with root package name */
    public static int f448955c = 40;

    /* renamed from: d, reason: collision with root package name */
    public static int f448956d = 40;

    /* renamed from: e, reason: collision with root package name */
    public static yz5.p f448957e;

    public final void a(java.lang.String type, int i17) {
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mars.xlog.Log.i("MicroMsg.VendorConfig", "setConfig: " + type + ", " + i17);
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("vendor_effect_config");
        if (kotlin.jvm.internal.o.b(type, ya.b.LEVEL)) {
            f448954b = i17;
            M.putInt("vendor_fb_level", i17);
        } else if (kotlin.jvm.internal.o.b(type, "skin")) {
            f448955c = i17;
            M.putInt("vendor_skin_rate", i17);
        } else if (kotlin.jvm.internal.o.b(type, "slim")) {
            f448956d = i17;
            M.putInt("vendor_slim_rate", i17);
        }
        yz5.p pVar = f448957e;
        if (pVar != null) {
            pVar.invoke(type, java.lang.Integer.valueOf(i17));
        }
    }
}
