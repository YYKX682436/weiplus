package dz0;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz0.v f244932d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f244933e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(dz0.v vVar, yz5.l lVar) {
        super(1);
        this.f244932d = vVar;
        this.f244933e = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.instamovie.base.MJError mJError = (com.tencent.maas.instamovie.base.MJError) obj;
        dz0.v vVar = this.f244932d;
        vVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("beginSegmentClipping: complete ");
        sb6.append(mJError != null ? mJError.message : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MJSegmentClipBehaviorHolder", sb6.toString());
        yz5.l lVar = this.f244933e;
        if (lVar != null) {
            lVar.invoke(mJError);
        }
        kotlinx.coroutines.z zVar = vVar.f245032d;
        if (zVar != null) {
            ((kotlinx.coroutines.a0) zVar).U(mJError);
        }
        vVar.f245033e = true;
        return jz5.f0.f302826a;
    }
}
