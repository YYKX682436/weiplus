package j00;

/* loaded from: classes3.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f296825d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(yz5.l lVar) {
        super(1);
        this.f296825d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bw5.x7 x7Var = (bw5.x7) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchPresentJumpInfoAsync callback jumpInfo.isNull ");
        sb6.append(x7Var == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftEntrancePreloadLogicNew", sb6.toString());
        this.f296825d.invoke(x7Var);
        return jz5.f0.f302826a;
    }
}
