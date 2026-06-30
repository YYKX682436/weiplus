package hf2;

/* loaded from: classes10.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.h0 f281212d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(hf2.h0 h0Var) {
        super(2);
        this.f281212d = h0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        r45.ei0 restoreData = (r45.ei0) obj2;
        kotlin.jvm.internal.o.g(restoreData, "restoreData");
        hf2.h0 h0Var = this.f281212d;
        com.tencent.mars.xlog.Log.e(h0Var.f281071b, "onError: " + ((java.lang.Exception) obj) + ",restoreData:" + restoreData.hashCode());
        hf2.x xVar = h0Var.f281070a;
        xVar.t7("finishErrorCallback", restoreData);
        xVar.m7("sticker error");
        h0Var.a();
        return jz5.f0.f302826a;
    }
}
