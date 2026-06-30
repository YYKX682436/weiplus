package cp4;

/* loaded from: classes8.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp4.z f221093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f221094e;

    public y(cp4.z zVar, android.content.Context context) {
        this.f221093d = zVar;
        this.f221094e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cp4.z zVar = this.f221093d;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = zVar.f221097e.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        android.view.View findViewByPosition = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).findViewByPosition(zVar.f221102m);
        com.tencent.mm.ui.widget.MMEditText mMEditText = findViewByPosition != null ? (com.tencent.mm.ui.widget.MMEditText) findViewByPosition.findViewById(com.tencent.mm.R.id.f483544b62) : null;
        if (mMEditText != null) {
            mMEditText.requestFocus();
        }
        if (mMEditText != null) {
            mMEditText.setSelection(mMEditText.getText().length());
        }
        zVar.f221103n++;
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorEditCaptionView", "repeat " + zVar.f221103n);
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) this.f221094e.getSystemService("input_method");
        if (inputMethodManager == null || inputMethodManager.showSoftInput(mMEditText, 0) || zVar.f221103n >= 5) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).E(zVar.f221104o, 50L);
    }
}
