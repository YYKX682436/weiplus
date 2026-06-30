package db5;

/* loaded from: classes12.dex */
public class j1 implements android.text.TextWatcher, android.view.View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public db5.l1 f228400d;

    /* renamed from: e, reason: collision with root package name */
    public db5.k1 f228401e;

    /* renamed from: f, reason: collision with root package name */
    public db5.m1 f228402f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.EditText f228403g;

    /* renamed from: h, reason: collision with root package name */
    public int f228404h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f228405i = 4;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f228406m;

    public j1(android.widget.EditText editText) {
        this.f228403g = editText;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        db5.l1 l1Var;
        java.util.ArrayList arrayList;
        com.tencent.mm.ui.base.MMAutoSwitchEditText mMAutoSwitchEditText;
        this.f228406m = editable.toString();
        db5.m1 m1Var = this.f228402f;
        java.lang.String str = "";
        if (m1Var != null) {
            java.util.Iterator it = ((db5.q1) m1Var).f228474a.f197321i.iterator();
            java.lang.String str2 = "";
            while (it.hasNext()) {
                com.tencent.mm.ui.base.MMAutoSwitchEditText mMAutoSwitchEditText2 = (com.tencent.mm.ui.base.MMAutoSwitchEditText) it.next();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(mMAutoSwitchEditText2.getText().toString().trim())) {
                    str2 = str2 + mMAutoSwitchEditText2.getText().toString().trim();
                }
            }
        }
        int i17 = 0;
        java.lang.String str3 = "";
        for (int i18 = 0; i18 < this.f228406m.length() && (i17 = i17 + 1) <= this.f228405i; i18++) {
            str3 = str3 + this.f228406m.charAt(i18);
        }
        if (i17 > this.f228405i) {
            android.widget.EditText editText = this.f228403g;
            editText.setText(str3);
            editText.setSelection(str3.length());
        }
        if (i17 < this.f228405i || (l1Var = this.f228400d) == null) {
            return;
        }
        int i19 = this.f228404h;
        com.tencent.mm.ui.base.MMAutoSwitchEditTextView mMAutoSwitchEditTextView = ((db5.q1) l1Var).f228474a;
        java.util.Iterator it6 = mMAutoSwitchEditTextView.f197321i.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.ui.base.MMAutoSwitchEditText mMAutoSwitchEditText3 = (com.tencent.mm.ui.base.MMAutoSwitchEditText) it6.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(mMAutoSwitchEditText3.getText().toString().trim())) {
                str = str + mMAutoSwitchEditText3.getText().toString().trim();
            }
        }
        if ((com.tencent.mm.sdk.platformtools.t8.K0(str) || str.length() != mMAutoSwitchEditTextView.f197316d * mMAutoSwitchEditTextView.f197317e) && (arrayList = mMAutoSwitchEditTextView.f197321i) != null && i19 < arrayList.size() - 1 && (mMAutoSwitchEditText = (com.tencent.mm.ui.base.MMAutoSwitchEditText) arrayList.get(i19 + 1)) != null) {
            mMAutoSwitchEditText.requestFocus();
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        db5.k1 k1Var;
        com.tencent.mm.ui.base.MMAutoSwitchEditText mMAutoSwitchEditText;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMAutoSwitchEditText$AutoSwitchEditTextWatcher", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        if (i17 == 67 && this.f228403g.getText().toString().trim().length() == 0 && (k1Var = this.f228401e) != null) {
            int i18 = this.f228404h;
            com.tencent.mm.ui.base.MMAutoSwitchEditTextView mMAutoSwitchEditTextView = ((db5.q1) k1Var).f228474a;
            java.util.ArrayList arrayList2 = mMAutoSwitchEditTextView.f197321i;
            if (arrayList2 != null && i18 < arrayList2.size() && i18 != 0 && (mMAutoSwitchEditText = (com.tencent.mm.ui.base.MMAutoSwitchEditText) mMAutoSwitchEditTextView.f197321i.get(i18 - 1)) != null) {
                mMAutoSwitchEditText.requestFocus();
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/base/MMAutoSwitchEditText$AutoSwitchEditTextWatcher", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return false;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
