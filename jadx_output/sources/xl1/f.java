package xl1;

/* loaded from: classes7.dex */
public class f implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeViewNew f455105d;

    public f(com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeViewNew editVerifyCodeViewNew) {
        this.f455105d = editVerifyCodeViewNew;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        if (z17) {
            this.f455105d.b();
            return;
        }
        com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeViewNew editVerifyCodeViewNew = this.f455105d;
        editVerifyCodeViewNew.getClass();
        ((ku5.t0) ku5.t0.f312615d).B(new xl1.h(editVerifyCodeViewNew));
    }
}
