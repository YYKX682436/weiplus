package tj5;

/* loaded from: classes8.dex */
public class d implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.search.FTSEditTextView f419838d;

    public d(com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView) {
        this.f419838d = fTSEditTextView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView;
        tj5.n nVar;
        if (3 != i17 || (nVar = (fTSEditTextView = this.f419838d).E) == null) {
            return false;
        }
        nVar.x0();
        return fTSEditTextView.E.G0();
    }
}
