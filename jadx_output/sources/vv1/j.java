package vv1;

/* loaded from: classes3.dex */
public class j implements k70.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vv1.k f440419d;

    public j(vv1.k kVar) {
        this.f440419d = kVar;
    }

    @Override // k70.w
    public void f(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, java.lang.String str2, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgFileWorker_Image", "[onImgTaskEnd] imgLocalId:%s msgLocalId:%s err[%s:%s:%s]", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), str2);
        lo.o oVar = (lo.o) i95.n0.c(lo.o.class);
        vv1.k kVar = this.f440419d;
        com.tencent.mm.storage.f9 f9Var = kVar.f440420m;
        ((qb5.g) oVar).getClass();
        m11.b0 v17 = com.tencent.mm.ui.chatting.gallery.t2.v(f9Var);
        lo.o oVar2 = (lo.o) i95.n0.c(lo.o.class);
        com.tencent.mm.storage.f9 f9Var2 = kVar.f440420m;
        ((qb5.g) oVar2).getClass();
        java.lang.String x17 = com.tencent.mm.ui.chatting.gallery.t2.x(f9Var2, v17, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgFileWorker_Image", "imgPath:%s", x17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(x17)) {
            kVar.a();
        } else {
            kVar.p(x17);
        }
    }

    @Override // k70.w
    public void l(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj) {
        this.f440419d.a();
    }

    @Override // k70.w
    public void o(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, com.tencent.mm.modelbase.m1 m1Var) {
        this.f440419d.b(i19, i27);
    }
}
