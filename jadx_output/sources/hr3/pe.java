package hr3;

/* loaded from: classes5.dex */
public final class pe extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.pf f283887d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe(hr3.pf pfVar) {
        super(1);
        this.f283887d = pfVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            hr3.pf pfVar = this.f283887d;
            pfVar.f283898q = null;
            android.widget.Button button = (android.widget.Button) ((jz5.n) pfVar.f283892h).getValue();
            if (button != null && r26.n0.N(pfVar.S6().getText())) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SayHiPictureUIC", "sendSayHiBtn disable");
                button.setEnabled(false);
            }
        }
        return jz5.f0.f302826a;
    }
}
