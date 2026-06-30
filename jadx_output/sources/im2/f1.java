package im2;

/* loaded from: classes3.dex */
public final class f1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f292313d;

    public f1(im2.z3 z3Var) {
        this.f292313d = z3Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        im2.z3 z3Var = this.f292313d;
        z3Var.f292652m2 = true;
        z3Var.R6();
        com.tencent.mm.ui.widget.MMEditText e76 = z3Var.e7();
        kotlin.jvm.internal.o.f(e76, "access$getMNewTitleEditText(...)");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) z3Var.f292658q).getValue();
        kotlin.jvm.internal.o.f(textView, "access$getMNewTitleLimitText(...)");
        ck5.f b17 = ck5.f.b(e76);
        b17.f42561f = 0;
        int i17 = z3Var.N1;
        b17.f42560e = i17;
        b17.f42562g = com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2;
        b17.f42556a = true;
        b17.d(new im2.d0(textView, i17, 5));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
