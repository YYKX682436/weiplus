package hf2;

/* loaded from: classes10.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.h0 f281036d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(hf2.h0 h0Var) {
        super(1);
        this.f281036d = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.ei0 restoreData = (r45.ei0) obj;
        kotlin.jvm.internal.o.g(restoreData, "restoreData");
        hf2.h0 h0Var = this.f281036d;
        com.tencent.mars.xlog.Log.e(h0Var.f281071b, "launchStickerOperationContainer operation cancel");
        h0Var.f281070a.n7("operation cancel");
        h0Var.a();
        return jz5.f0.f302826a;
    }
}
