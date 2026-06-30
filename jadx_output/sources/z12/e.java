package z12;

/* loaded from: classes12.dex */
public class e extends com.tencent.mm.sdk.platformtools.b4 {

    /* renamed from: g, reason: collision with root package name */
    public static int f469282g;

    /* renamed from: h, reason: collision with root package name */
    public static z12.e f469283h;

    /* renamed from: i, reason: collision with root package name */
    public static z12.w f469284i;

    /* renamed from: j, reason: collision with root package name */
    public static final com.tencent.mm.modelbase.u0 f469285j = new z12.c();

    public e(boolean z17) {
        super(new z12.d(), z17);
    }

    public static final z12.e f() {
        z12.e eVar = f469283h;
        if (eVar == null) {
            synchronized (z12.e.class) {
                if (f469283h == null) {
                    f469283h = new z12.e(true);
                }
            }
        } else {
            eVar.d();
        }
        return f469283h;
    }

    public static void g() {
        if (f469284i != null) {
            gm0.j1.n().f273288b.d(f469284i);
        }
        gm0.j1.n().f273288b.q(413, f469285j);
    }

    public void h() {
        f469282g = 0;
        f469284i = new z12.w("com.tencent.xin.emoticon.tusiji", 1);
        gm0.j1.n().f273288b.g(f469284i);
        gm0.j1.n().f273288b.a(413, f469285j);
    }
}
