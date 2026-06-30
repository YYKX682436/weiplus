package zd1;

/* loaded from: classes7.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f471583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f471584e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zd1.a0 f471585f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(int i17, android.graphics.Bitmap bitmap, zd1.a0 a0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f471583d = i17;
        this.f471584e = bitmap;
        this.f471585f = a0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zd1.y(this.f471583d, this.f471584e, this.f471585f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        zd1.y yVar = (zd1.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        yVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            float min = this.f471583d / java.lang.Math.min(this.f471584e.getWidth(), this.f471584e.getHeight());
            zd1.f fVar = zd1.g.f471531i;
            if (min >= 1.0f) {
                android.graphics.Bitmap bitmap = this.f471584e;
                com.tencent.mm.plugin.appbrand.service.c0 C0 = this.f471585f.f471521a.C0();
                kotlin.jvm.internal.o.f(C0, "getService(...)");
                fVar.a(bitmap, C0, false);
            } else {
                android.graphics.Bitmap F0 = com.tencent.mm.sdk.platformtools.x.F0(this.f471584e, min, min, true);
                if (F0 != null && !F0.isRecycled()) {
                    com.tencent.mm.plugin.appbrand.service.c0 C02 = this.f471585f.f471521a.C0();
                    kotlin.jvm.internal.o.f(C02, "getService(...)");
                    fVar.a(F0, C02, true);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.SecuritySnapshotContext", "scale and dispatch bitmap for " + this.f471585f.f471521a.f74803n + ", get exception:" + e17);
        }
        return jz5.f0.f302826a;
    }
}
