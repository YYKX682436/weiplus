package zl2;

/* loaded from: classes3.dex */
public final class v2 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f474000a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f474001b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f474002c;

    public v2(yz5.l lVar, yz5.l lVar2, java.lang.String str) {
        this.f474000a = lVar;
        this.f474001b = lVar2;
        this.f474002c = str;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        java.lang.String str = this.f474002c;
        yz5.l lVar = this.f474000a;
        if (lVar != null) {
            ff0.t tVar = (ff0.t) i95.n0.c(ff0.t.class);
            kotlin.jvm.internal.o.d(bitmap);
            zl2.s2 s2Var = new zl2.s2(lVar, str);
            ((dl4.m0) tVar).getClass();
            ((ku5.t0) ku5.t0.f312615d).g(new dl4.q(bitmap, s2Var));
        }
        yz5.l lVar2 = this.f474001b;
        if (lVar2 != null) {
            ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).hj(str, new android.view.View(com.tencent.mm.sdk.platformtools.x2.f193071a), bitmap, new zl2.u2(str, lVar2));
        }
    }
}
