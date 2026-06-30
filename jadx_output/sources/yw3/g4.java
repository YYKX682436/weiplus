package yw3;

/* loaded from: classes4.dex */
public final class g4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmListDemoUI f466751d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmListDemoUI repairerMvvmListDemoUI) {
        super(0);
        this.f466751d = repairerMvvmListDemoUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmListDemoUI repairerMvvmListDemoUI = this.f466751d;
        return new xm3.t0(new yw3.f((java.util.List) ((jz5.n) repairerMvvmListDemoUI.e).getValue()), repairerMvvmListDemoUI, new com.tencent.mm.plugin.mvvmlist.SingleItemConvertFactory(yw3.h.class), false);
    }
}
