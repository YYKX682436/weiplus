package w24;

/* loaded from: classes15.dex */
public final class w extends w24.l {

    /* renamed from: e, reason: collision with root package name */
    public boolean f442643e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f442644f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f442645g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f442646h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f442647i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f442648j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(java.lang.String key, boolean z17) {
        super(key);
        kotlin.jvm.internal.o.g(key, "key");
        this.f442643e = z17;
        this.f442647i = "";
        this.f442648j = true;
    }

    public final void b(boolean z17) {
        this.f442643e = z17;
        c();
    }

    public final void c() {
        android.widget.TextView textView = this.f442644f;
        if (textView != null) {
            textView.setText(this.f442647i);
        }
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.f442645g;
        if (mMSwitchBtn != null) {
            mMSwitchBtn.setCheck(this.f442643e);
        }
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2 = this.f442645g;
        if (mMSwitchBtn2 != null) {
            mMSwitchBtn2.setSwitchListener(new w24.v(this));
        }
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn3 = this.f442645g;
        if (mMSwitchBtn3 == null) {
            return;
        }
        mMSwitchBtn3.setEnabled(this.f442648j);
    }
}
