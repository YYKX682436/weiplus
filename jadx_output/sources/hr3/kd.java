package hr3;

/* loaded from: classes11.dex */
public final class kd implements com.tencent.mm.pluginsdk.ui.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hr3.ld f283723a;

    public kd(hr3.ld ldVar) {
        this.f283723a = ldVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.h2
    public void a(android.view.View view) {
        androidx.appcompat.app.AppCompatActivity activity = this.f283723a.getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity != null) {
            mMActivity.hideVKB();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.h2
    public void b() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.h2
    public void c() {
        hr3.ld ldVar = this.f283723a;
        com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView = ldVar.f283766d;
        if (profileEditPhoneNumberView == null) {
            kotlin.jvm.internal.o.o("editPhoneNumberView");
            throw null;
        }
        if (profileEditPhoneNumberView.f()) {
            ldVar.getClass();
            android.widget.TextView textView = ldVar.f283768f;
            if (textView == null) {
                kotlin.jvm.internal.o.o("maxPhoneTv");
                throw null;
            }
            textView.setVisibility(8);
            com.tencent.mm.ui.base.FlowLayout flowLayout = ldVar.f283767e;
            if (flowLayout != null) {
                flowLayout.setVisibility(0);
                return;
            } else {
                kotlin.jvm.internal.o.o("recommendPhoneFlowLayout");
                throw null;
            }
        }
        ldVar.getClass();
        android.widget.TextView textView2 = ldVar.f283768f;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("maxPhoneTv");
            throw null;
        }
        textView2.setVisibility(0);
        com.tencent.mm.ui.base.FlowLayout flowLayout2 = ldVar.f283767e;
        if (flowLayout2 != null) {
            flowLayout2.setVisibility(8);
        } else {
            kotlin.jvm.internal.o.o("recommendPhoneFlowLayout");
            throw null;
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.h2
    public void onChange() {
    }
}
