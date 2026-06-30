package cw2;

/* loaded from: classes15.dex */
public final class j7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy f223788d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy) {
        super(0);
        this.f223788d = finderThumbPlayerProxy;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f223788d;
        cw2.z5 z5Var = finderThumbPlayerProxy.G1;
        if (z5Var != null) {
            z5Var.d();
        }
        finderThumbPlayerProxy.G1 = null;
        android.os.ConditionVariable conditionVariable = finderThumbPlayerProxy.H1;
        if (conditionVariable == null) {
            return null;
        }
        conditionVariable.open();
        return jz5.f0.f302826a;
    }
}
