package z34;

/* loaded from: classes13.dex */
public class c implements z34.j {

    /* renamed from: a, reason: collision with root package name */
    public final int f469982a;

    /* renamed from: b, reason: collision with root package name */
    public final int f469983b;

    /* renamed from: c, reason: collision with root package name */
    public final int f469984c;

    /* renamed from: d, reason: collision with root package name */
    public final z34.l f469985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z34.e f469986e;

    public c(z34.e eVar, int i17) {
        this.f469986e = eVar;
        eVar.e(i17);
        this.f469982a = eVar.b();
        int b17 = eVar.b();
        eVar.e(eVar.d() + 8);
        int b18 = eVar.b();
        this.f469983b = b18;
        int b19 = eVar.b();
        this.f469984c = b19;
        int b27 = eVar.b();
        eVar.e(eVar.d() + 12);
        if (b17 != 2) {
            if (b17 == 3) {
                this.f469985d = new z34.b(this, eVar, b18, b19);
                return;
            } else if (b17 != 11) {
                return;
            }
        }
        z34.l[] lVarArr = new z34.l[b19 / b27];
    }
}
