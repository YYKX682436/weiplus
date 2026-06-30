package hr3;

/* loaded from: classes11.dex */
public class q9 implements hr3.t9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMNeat7extView f283919a;

    public q9(com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference normalProfileHeaderPreference, com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView) {
        this.f283919a = mMNeat7extView;
    }

    @Override // hr3.t9
    public java.lang.CharSequence getText() {
        return this.f283919a.a();
    }

    @Override // hr3.t9
    public android.view.View getView() {
        return this.f283919a;
    }

    @Override // hr3.t9
    public void setText(java.lang.CharSequence charSequence) {
        this.f283919a.b(charSequence);
    }
}
