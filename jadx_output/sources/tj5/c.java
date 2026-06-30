package tj5;

/* loaded from: classes8.dex */
public class c implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.search.FTSEditTextView f419836d;

    public c(com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView) {
        this.f419836d = fTSEditTextView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView = this.f419836d;
        java.lang.String totalQuery = fTSEditTextView.getTotalQuery();
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSEditTextView", "[hitest] onTextChanged, query=%s, lastText=%s, textChangeStatus=%s, hasFocus=%s", totalQuery, fTSEditTextView.f209830x, fTSEditTextView.G, java.lang.Boolean.valueOf(fTSEditTextView.f209816g.hasFocus()));
        java.lang.String str = fTSEditTextView.f209830x;
        if (totalQuery == str || totalQuery.equals(str)) {
            return;
        }
        fTSEditTextView.f209830x = totalQuery;
        if (fTSEditTextView.f209826t) {
            return;
        }
        if (totalQuery.length() > 0) {
            fTSEditTextView.f209815f.setVisibility(0);
        } else {
            fTSEditTextView.f209815f.setVisibility(8);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSEditTextView", "[hitest] onTextChanged -> onEditTextChange, textChangeStatus=%s", fTSEditTextView.G);
        com.tencent.mm.ui.search.FTSEditTextView.a(fTSEditTextView);
    }
}
