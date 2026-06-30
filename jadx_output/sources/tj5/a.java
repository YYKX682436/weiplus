package tj5;

/* loaded from: classes8.dex */
public class a implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.search.FTSEditTextView f419832d;

    public a(com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView) {
        this.f419832d = fTSEditTextView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView = this.f419832d;
        tj5.n nVar = fTSEditTextView.E;
        if (nVar != null) {
            nVar.U1(z17);
        }
        fTSEditTextView.l(z17);
    }
}
