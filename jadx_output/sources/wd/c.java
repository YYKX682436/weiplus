package wd;

/* loaded from: classes7.dex */
public class c implements e8.d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f444674a;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f444678e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f444679f;

    /* renamed from: g, reason: collision with root package name */
    public int f444680g;

    /* renamed from: h, reason: collision with root package name */
    public double f444681h;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.ref.WeakReference f444675b = null;

    /* renamed from: c, reason: collision with root package name */
    public com.github.henryye.nativeiv.BaseImageDecodeService f444676c = null;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f444677d = "";

    /* renamed from: i, reason: collision with root package name */
    public int f444682i = 1004;

    public static void c(wd.c cVar, java.lang.String str, e8.a aVar) {
        cVar.getClass();
        if (!aVar.f249987g.equalsIgnoreCase("base64")) {
            cVar.f444678e.add(str);
            ((ch1.d) ((com.tencent.mm.plugin.appbrand.profile.c) nd.f.d(com.tencent.mm.plugin.appbrand.profile.c.class, true))).c(18076, str, aVar.f249987g, cVar.f444677d, java.lang.Integer.valueOf(cVar.f444682i), java.lang.Long.valueOf(aVar.f249981a), java.lang.Long.valueOf(aVar.f249985e), java.lang.Long.valueOf(aVar.f249986f));
            return;
        }
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        cVar.f444678e.add(com.tencent.mm.sdk.platformtools.w2.b(str.getBytes()));
        ((ch1.d) ((com.tencent.mm.plugin.appbrand.profile.c) nd.f.d(com.tencent.mm.plugin.appbrand.profile.c.class, true))).c(18076, "", aVar.f249987g, cVar.f444677d, java.lang.Integer.valueOf(cVar.f444682i), java.lang.Long.valueOf(aVar.f249981a), java.lang.Long.valueOf(aVar.f249985e), java.lang.Long.valueOf(aVar.f249986f));
    }

    @Override // e8.d
    public void a(java.lang.String str, e8.c cVar, e8.a aVar) {
        int ordinal = cVar.ordinal();
        yd.q qVar = yd.q.ERROR;
        switch (ordinal) {
            case 0:
                fe.g a17 = fe.g.a(this.f444677d);
                long j17 = aVar.f249981a;
                long j18 = aVar.f249982b;
                a17.getClass();
                ((ku5.t0) ku5.t0.f312615d).g(new fe.d(a17, j17));
                a17.f261361i.add(java.lang.Long.valueOf(j18));
                ((ku5.t0) ku5.t0.f312615d).g(new wd.b(this, str, aVar));
                if (aVar.f249982b >= 1000) {
                    e(11);
                    return;
                }
                return;
            case 1:
                if (android.text.TextUtils.isEmpty(aVar.f249988h)) {
                    d(str, qVar, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490626a13));
                } else {
                    d(str, qVar, java.lang.String.format("%s: %s", com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490626a13), aVar.f249988h));
                }
                e(7);
                return;
            case 2:
                d(str, qVar, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490627a14));
                e(5);
                return;
            case 3:
            case 9:
            default:
                return;
            case 4:
                d(str, qVar, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.a0z));
                e(0);
                return;
            case 5:
                d(str, qVar, java.lang.String.format(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490628a15), java.lang.Integer.valueOf(aVar.f249983c), java.lang.Integer.valueOf(aVar.f249984d), java.lang.Long.valueOf(aVar.f249986f), java.lang.Long.valueOf(aVar.f249985e)));
                e(3);
                return;
            case 6:
                com.tencent.mars.xlog.Log.e("MicroMsg.MBImageDecodeRegistry", "IOEXCEPTION path:%s", str);
                d(str, qVar, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490623a10));
                e(4);
                return;
            case 7:
                com.tencent.mars.xlog.Log.e("MicroMsg.MBImageDecodeRegistry", "OUT_OF_MEMORY path:%s", str);
                d(str, qVar, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490624a11));
                e(1);
                return;
            case 8:
                com.tencent.mars.xlog.Log.i("MicroMsg.MBImageDecodeRegistry", "USE_LEGACY path:%s", str);
                e(8);
                return;
            case 10:
                com.tencent.mars.xlog.Log.e("MicroMsg.MBImageDecodeRegistry", "NATIVE_DECODE_ERROR path:%s", str);
                d(str, qVar, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.a0y));
                e(5);
                return;
            case 11:
                com.tencent.mars.xlog.Log.e("MicroMsg.MBImageDecodeRegistry", "THROW_EXCEPTION path:%s", str);
                d(str, qVar, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490625a12));
                e(16);
                return;
        }
    }

    @Override // e8.d
    public void b(java.lang.String str, java.lang.Object obj, e8.e eVar, com.github.henryye.nativeiv.ImageDecodeConfig imageDecodeConfig) {
    }

    public final void d(java.lang.String str, yd.q qVar, java.lang.String str2) {
        if (this.f444675b.get() != null) {
            ((ae.a) ((ae.q) this.f444675b.get())).F0().a(qVar, str + ": " + str2);
        }
    }

    public final void e(int i17) {
        ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).c(807L, i17, 1L, false);
    }
}
