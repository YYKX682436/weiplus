package j93;

/* loaded from: classes.dex */
public final class t implements com.tencent.mm.ui.widget.dialog.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j93.w f298498a;

    public t(j93.w wVar) {
        this.f298498a = wVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.q3
    public final void dismiss() {
        androidx.appcompat.app.AppCompatActivity activity = this.f298498a.getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity != null) {
            mMActivity.hideVKB();
        }
    }
}
