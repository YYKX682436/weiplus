package p14;

/* loaded from: classes5.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.qrcode.SelfQrCodeView f351210d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.plugin.setting.ui.qrcode.SelfQrCodeView selfQrCodeView) {
        super(0);
        this.f351210d = selfQrCodeView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView = (android.widget.TextView) this.f351210d.findViewById(com.tencent.mm.R.id.lfj);
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        return textView;
    }
}
