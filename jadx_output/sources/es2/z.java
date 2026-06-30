package es2;

/* loaded from: classes2.dex */
public final class z implements ek4.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ es2.h0 f256419a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cs2.p f256420b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ so2.i3 f256421c;

    public z(es2.h0 h0Var, cs2.p pVar, so2.i3 i3Var) {
        this.f256419a = h0Var;
        this.f256420b = pVar;
        this.f256421c = i3Var;
    }

    @Override // ek4.w
    public void b(int i17, dn.o oVar) {
        es2.h0 h0Var = this.f256419a;
        java.lang.String str = h0Var.f256375h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preload task on Start ");
        cs2.p pVar = this.f256420b;
        sb6.append(pVar);
        sb6.append(' ');
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (i17 < 0 && ((cs2.p) h0Var.j("onPreloadCompleted", new es2.y(h0Var, pVar))) != null) {
            h0Var.f256376i.e(pVar.f222092i2, "onPreloadCompleted start ret=" + i17 + " error", pVar, h0Var.f256371d.size(), h0Var.f256372e.size());
        }
        if (i17 == 0) {
            h0Var.f256376i.f(pVar.f222092i2, pVar, h0Var.f256371d.size(), h0Var.f256372e.size());
            kw2.y Uj = ((c61.l7) i95.n0.c(c61.l7.class)).Uj();
            java.lang.String field_mediaId = pVar.field_mediaId;
            kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
            Uj.h(field_mediaId, pVar, this.f256421c);
        }
    }
}
