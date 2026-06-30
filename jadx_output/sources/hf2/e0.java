package hf2;

/* loaded from: classes10.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.h0 f281050d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(hf2.h0 h0Var) {
        super(2);
        this.f281050d = h0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        r45.ei0 restoreData = (r45.ei0) obj2;
        kotlin.jvm.internal.o.g(restoreData, "restoreData");
        hf2.h0 h0Var = this.f281050d;
        com.tencent.mars.xlog.Log.e(h0Var.f281071b, "launchStickerOperationContainer onError: " + ((java.lang.Exception) obj) + ",restoreData:" + restoreData.hashCode());
        h0Var.f281070a.n7("operation error");
        h0Var.a();
        return jz5.f0.f302826a;
    }
}
