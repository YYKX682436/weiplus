package db5;

/* loaded from: classes11.dex */
public class n6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMTagPanel f228446d;

    public n6(com.tencent.mm.ui.base.MMTagPanel mMTagPanel) {
        this.f228446d = mMTagPanel;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMTagPanel$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.base.MMTagPanel mMTagPanel = this.f228446d;
        boolean z17 = mMTagPanel.f197582n;
        if (mMTagPanel.f197582n) {
            mMTagPanel.h();
            mMTagPanel.F.requestFocus();
            com.tencent.mm.ui.widget.MMEditText mMEditText = mMTagPanel.F;
            mMEditText.setSelection(mMEditText.getText().length());
            ((android.view.inputmethod.InputMethodManager) mMTagPanel.getContext().getSystemService("input_method")).showSoftInput(mMTagPanel.F, 0);
            db5.t6 t6Var = mMTagPanel.C;
            if (t6Var != null) {
                t6Var.c();
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/base/MMTagPanel$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
