package l31;

/* loaded from: classes9.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l31.i0 f315359d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(l31.i0 i0Var) {
        super(0);
        this.f315359d = i0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        l31.i0 i0Var = this.f315359d;
        k31.a aVar = i0Var.f315363e;
        if (aVar != null) {
            java.lang.String bizUsername = i0Var.f315313a;
            java.util.List subscribeMsgList = i0Var.f315364f;
            kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
            kotlin.jvm.internal.o.g(subscribeMsgList, "subscribeMsgList");
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandSubscribeStorageManager", "updateSubscribeMsgUiStatusTimestamp bizUsername: %s, size: %s", bizUsername, java.lang.Integer.valueOf(((java.util.ArrayList) subscribeMsgList).size()));
            ((k31.h) aVar).b(bizUsername, subscribeMsgList, false, false, false, true);
        }
        k31.o.f303850a.a(i0Var);
        return jz5.f0.f302826a;
    }
}
