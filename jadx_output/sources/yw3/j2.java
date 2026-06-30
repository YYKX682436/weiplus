package yw3;

/* loaded from: classes.dex */
public final class j2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterShareScreenDemoUI f466776d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterShareScreenDemoUI repairerFlutterShareScreenDemoUI) {
        super(1);
        this.f466776d = repairerFlutterShareScreenDemoUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object value = ((kotlin.Result) obj).getValue();
        if (kotlin.Result.m527isFailureimpl(value)) {
            value = null;
        }
        com.tencent.pigeon.voipmp.VoIPMPSelectFileResult voIPMPSelectFileResult = (com.tencent.pigeon.voipmp.VoIPMPSelectFileResult) value;
        if (voIPMPSelectFileResult != null) {
            ((jp5.o) i95.n0.c(jp5.o.class)).m4(voIPMPSelectFileResult, true, this.f466776d);
        }
        return jz5.f0.f302826a;
    }
}
