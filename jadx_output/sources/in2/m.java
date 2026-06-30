package in2;

/* loaded from: classes10.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.s f292860d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(in2.s sVar) {
        super(0);
        this.f292860d = sVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        in2.s sVar = this.f292860d;
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = sVar.P;
        if (mMSwitchBtn != null) {
            mMSwitchBtn.setCheck(false);
        }
        sVar.I.q7(false);
        db5.t7.g(sVar.f118183e, "设置失败，请稍后再试");
        return jz5.f0.f302826a;
    }
}
