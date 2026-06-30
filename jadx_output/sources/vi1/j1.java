package vi1;

/* loaded from: classes7.dex */
public final class j1 implements vi1.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f437344a;

    /* renamed from: b, reason: collision with root package name */
    public final vi1.d0 f437345b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f437346c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.phonenumber.widget.MMFormVerifyCodeInputView f437347d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.base.MMFormInputView f437348e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMSwitchBtn f437349f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.Button f437350g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f437351h;

    public j1(android.content.Context mContext, vi1.d0 d0Var) {
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn;
        android.widget.EditText contentEditText;
        android.widget.EditText contentEditText2;
        kotlin.jvm.internal.o.g(mContext, "mContext");
        this.f437344a = mContext;
        this.f437345b = d0Var;
        android.view.View inflate = android.view.View.inflate(mContext, com.tencent.mm.R.layout.f488060fr, null);
        this.f437346c = inflate;
        com.tencent.mm.plugin.appbrand.phonenumber.widget.MMFormVerifyCodeInputView mMFormVerifyCodeInputView = inflate != null ? (com.tencent.mm.plugin.appbrand.phonenumber.widget.MMFormVerifyCodeInputView) inflate.findViewById(com.tencent.mm.R.id.f483182yv) : null;
        this.f437347d = mMFormVerifyCodeInputView;
        if (mMFormVerifyCodeInputView != null && (contentEditText2 = mMFormVerifyCodeInputView.getContentEditText()) != null) {
            contentEditText2.setTextColor(mContext.getResources().getColor(com.tencent.mm.R.color.a0b));
        }
        com.tencent.mm.ui.base.MMFormInputView mMFormInputView = inflate != null ? (com.tencent.mm.ui.base.MMFormInputView) inflate.findViewById(com.tencent.mm.R.id.f483184yx) : null;
        this.f437348e = mMFormInputView;
        if (mMFormInputView != null && (contentEditText = mMFormInputView.getContentEditText()) != null) {
            contentEditText.setTextColor(mContext.getResources().getColor(com.tencent.mm.R.color.a0b));
        }
        if (inflate == null || (mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) inflate.findViewById(com.tencent.mm.R.id.f483183yw)) == null) {
            mMSwitchBtn = null;
        } else {
            zk1.m.f473414l.a(mMSwitchBtn, (r27 & 2) != 0 ? null : null, (r27 & 4) != 0 ? null : null, (r27 & 8) != 0 ? false : false, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? null : java.lang.Integer.valueOf(com.tencent.mm.R.string.f490026iv), (r27 & 128) != 0 ? null : null, (r27 & 256) != 0 ? null : null, (r27 & 512) != 0 ? null : null, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null, (r27 & 4096) == 0 ? java.lang.Integer.valueOf(com.tencent.mm.R.dimen.f479672c9) : null);
            java.lang.String string = mContext.getString(com.tencent.mm.R.string.f490301r6);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String string2 = mContext.getString(com.tencent.mm.R.string.f490303r8);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            mMSwitchBtn.setContentDescription(mMSwitchBtn.f211363x ? string : string2);
            mMSwitchBtn.setSwitchListener(new vi1.e1(mMSwitchBtn, string, string2));
        }
        this.f437349f = mMSwitchBtn;
        android.widget.Button button = inflate != null ? (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.f483181yu) : null;
        this.f437350g = button;
        this.f437351h = vi1.o0.f437416a.b();
        if (mMFormVerifyCodeInputView != null) {
            mMFormVerifyCodeInputView.setInputType(3);
        }
        if (mMFormVerifyCodeInputView != null) {
            mMFormVerifyCodeInputView.setSendSmsBtnClickListener(new vi1.f1(this));
        }
        if (mMFormVerifyCodeInputView != null) {
            vi1.g1 g1Var = new vi1.g1(this);
            android.widget.EditText editText = mMFormVerifyCodeInputView.f87410e;
            if (editText != null) {
                editText.addTextChangedListener(g1Var);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.MMFormVerifyCodeInputView", "watcher : %s, contentET : %s", g1Var, editText);
            }
        }
        if (mMFormInputView != null) {
            mMFormInputView.setInputType(3);
        }
        if (mMFormInputView != null) {
            mMFormInputView.a(new vi1.h1(this));
        }
        if (button != null) {
            button.setOnClickListener(new vi1.i1(this));
        }
    }
}
