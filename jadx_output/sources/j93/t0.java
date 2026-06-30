package j93;

/* loaded from: classes.dex */
public final class t0 implements com.tencent.mm.ui.widget.dialog.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j93.x0 f298499a;

    public t0(j93.x0 x0Var) {
        this.f298499a = x0Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.q3
    public final void dismiss() {
        androidx.appcompat.app.AppCompatActivity activity = this.f298499a.getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity != null) {
            mMActivity.hideVKB();
        }
    }
}
