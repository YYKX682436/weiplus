package sr2;

/* loaded from: classes10.dex */
public final class l0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.w0 f411617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f411618e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f411619f;

    public l0(sr2.w0 w0Var, java.lang.String str, int i17) {
        this.f411617d = w0Var;
        this.f411618e = str;
        this.f411619f = i17;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        sr2.w0 w0Var = this.f411617d;
        if (w0Var.i7()) {
            java.lang.String b17 = qd2.x.f361849a.b(w0Var.getActivity(), java.lang.String.valueOf(editable), this.f411618e);
            boolean z17 = true;
            if (b17.length() == 0) {
                db5.d5 d5Var = w0Var.f411770x;
                if (d5Var != null) {
                    d5Var.dismiss();
                }
                w0Var.f411770x = null;
            } else {
                w0Var.r7(b17);
                z17 = false;
            }
            w0Var.f411766t = z17;
            int length = editable != null ? editable.length() : 0;
            if (length == 0) {
                android.widget.ImageView imageView = w0Var.f411762p;
                if (imageView == null) {
                    kotlin.jvm.internal.o.o("shortTitleTipsIv");
                    throw null;
                }
                imageView.setVisibility(0);
            } else {
                android.widget.ImageView imageView2 = w0Var.f411762p;
                if (imageView2 == null) {
                    kotlin.jvm.internal.o.o("shortTitleTipsIv");
                    throw null;
                }
                imageView2.setVisibility(8);
            }
            int i17 = this.f411619f;
            if (length / i17 >= 0.95d) {
                android.widget.TextView textView = w0Var.f411761o;
                if (textView == null) {
                    kotlin.jvm.internal.o.o("shortTitleCountTv");
                    throw null;
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(length);
                sb6.append('/');
                sb6.append(i17);
                textView.setText(sb6.toString());
                if (length > i17) {
                    android.widget.TextView textView2 = w0Var.f411761o;
                    if (textView2 == null) {
                        kotlin.jvm.internal.o.o("shortTitleCountTv");
                        throw null;
                    }
                    textView2.setTextColor(w0Var.getResources().getColor(com.tencent.mm.R.color.Red_100));
                    w0Var.f411766t = false;
                } else {
                    android.widget.TextView textView3 = w0Var.f411761o;
                    if (textView3 == null) {
                        kotlin.jvm.internal.o.o("shortTitleCountTv");
                        throw null;
                    }
                    textView3.setTextColor(w0Var.getResources().getColor(com.tencent.mm.R.color.FG_1));
                }
                android.widget.TextView textView4 = w0Var.f411761o;
                if (textView4 == null) {
                    kotlin.jvm.internal.o.o("shortTitleCountTv");
                    throw null;
                }
                textView4.setVisibility(0);
            } else {
                android.widget.TextView textView5 = w0Var.f411761o;
                if (textView5 == null) {
                    kotlin.jvm.internal.o.o("shortTitleCountTv");
                    throw null;
                }
                textView5.setText("");
                android.widget.TextView textView6 = w0Var.f411761o;
                if (textView6 == null) {
                    kotlin.jvm.internal.o.o("shortTitleCountTv");
                    throw null;
                }
                textView6.setVisibility(8);
            }
            w0Var.P6();
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
