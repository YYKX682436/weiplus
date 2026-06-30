package tj5;

/* loaded from: classes8.dex */
public class k implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.search.FTSEditTextView f419846d;

    public k(com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView) {
        this.f419846d = fTSEditTextView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView = this.f419846d;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSEditTextView", "[hitest] updateEllipsize.onFocusChange, hasFocus=%s, textChangeStatus=%s", valueOf, fTSEditTextView.G);
        tj5.n nVar = fTSEditTextView.E;
        if (nVar != null) {
            nVar.U1(z17);
        }
        if (z17) {
            fTSEditTextView.G = tj5.o.UserInput;
            fTSEditTextView.f209816g.setEllipsize(null);
            fTSEditTextView.f209816g.setKeyListener(new android.text.method.TextKeyListener(android.text.method.TextKeyListener.Capitalize.NONE, false));
            fTSEditTextView.m();
            android.text.Selection.setSelection(fTSEditTextView.f209816g.getText(), fTSEditTextView.f209816g.getText().length());
            fTSEditTextView.s();
        }
        fTSEditTextView.l(z17);
    }
}
