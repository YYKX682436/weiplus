package yw3;

/* loaded from: classes4.dex */
public final class s3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI f466877d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI repairerMvvmDBDemoUI) {
        super(0);
        this.f466877d = repairerMvvmDBDemoUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new xm3.t0((com.tencent.mm.plugin.mvvmlist.MvvmList) ((jz5.n) this.f466877d.f).getValue(), new in5.s() { // from class: com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI$buildItemConvertFactory$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new yw3.c();
            }
        }, false, 4, null);
    }
}
