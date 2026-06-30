package ef;

/* loaded from: classes7.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ef.m f252121d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ef.m mVar) {
        super(1);
        this.f252121d = mVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ef.m mVar = this.f252121d;
        mVar.getClass();
        com.tencent.mars.xlog.Log.i("WebViewExtendInputClient", "onInputDone#onShowKeyboard, fromDoneButton: %b, confirmHold: %b", java.lang.Boolean.valueOf(booleanValue), java.lang.Boolean.valueOf(mVar.f252132i));
        return jz5.f0.f302826a;
    }
}
