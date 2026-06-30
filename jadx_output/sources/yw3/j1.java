package yw3;

/* loaded from: classes.dex */
public final class j1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterHybridNavigatorDemoUI f466775d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterHybridNavigatorDemoUI repairerFlutterHybridNavigatorDemoUI) {
        super(1);
        this.f466775d = repairerFlutterHybridNavigatorDemoUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object value = ((kotlin.Result) obj).getValue();
        com.tencent.mars.xlog.Log.i(this.f466775d.d, "call dart service result : " + ((java.lang.Object) kotlin.Result.m529toStringimpl(value)));
        return jz5.f0.f302826a;
    }
}
