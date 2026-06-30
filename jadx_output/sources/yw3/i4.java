package yw3;

/* loaded from: classes4.dex */
public final class i4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmListDemoUI f466769d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmListDemoUI repairerMvvmListDemoUI) {
        super(0);
        this.f466769d = repairerMvvmListDemoUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmListDemoUI repairerMvvmListDemoUI = this.f466769d;
        return new xm3.t0(new ym3.i(((java.util.List) ((jz5.n) repairerMvvmListDemoUI.e).getValue()).size(), new yw3.h4(repairerMvvmListDemoUI)), repairerMvvmListDemoUI, new com.tencent.mm.plugin.mvvmlist.MapItemConvertFactory(kz5.b1.e(new jz5.l(0, yw3.h.class)), yw3.h.class), false);
    }
}
