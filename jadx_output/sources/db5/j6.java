package db5;

/* loaded from: classes11.dex */
public class j6 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMTagPanel f228409d;

    public j6(com.tencent.mm.ui.base.MMTagPanel mMTagPanel) {
        this.f228409d = mMTagPanel;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String obj = editable.toString();
        com.tencent.mm.ui.base.MMTagPanel mMTagPanel = this.f228409d;
        db5.t6 t6Var = mMTagPanel.C;
        if (t6Var != null) {
            t6Var.g(obj);
        }
        if (mMTagPanel.c(mMTagPanel.F, editable, obj, this).length() <= 0) {
            mMTagPanel.F.setBackground(null);
            return;
        }
        mMTagPanel.h();
        if (mMTagPanel.I) {
            return;
        }
        mMTagPanel.F.setBackground(mMTagPanel.getResources().getDrawable(com.tencent.mm.R.drawable.f481911aj2));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
