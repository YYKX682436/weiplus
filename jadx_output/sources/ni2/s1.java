package ni2;

/* loaded from: classes3.dex */
public final class s1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni2.z1 f337466d;

    public s1(ni2.z1 z1Var) {
        this.f337466d = z1Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String str;
        if (editable == null || (str = editable.toString()) == null) {
            str = "";
        }
        int length = str.length();
        boolean z17 = 46 <= length && length < 50;
        ni2.z1 z1Var = this.f337466d;
        if (z17) {
            fg2.p1 p1Var = z1Var.K;
            if (p1Var == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            p1Var.f262238r.setVisibility(0);
            fg2.p1 p1Var2 = z1Var.K;
            if (p1Var2 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            p1Var2.f262238r.setText(java.lang.String.valueOf(50 - str.length()));
            fg2.p1 p1Var3 = z1Var.K;
            if (p1Var3 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            p1Var3.f262238r.setTextColor(z1Var.f118183e.getResources().getColor(com.tencent.mm.R.color.FG_2));
        } else if (str.length() > 50) {
            fg2.p1 p1Var4 = z1Var.K;
            if (p1Var4 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            p1Var4.f262238r.setVisibility(0);
            fg2.p1 p1Var5 = z1Var.K;
            if (p1Var5 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            p1Var5.f262238r.setText(java.lang.String.valueOf(50 - str.length()));
            fg2.p1 p1Var6 = z1Var.K;
            if (p1Var6 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            p1Var6.f262238r.setTextColor(z1Var.f118183e.getResources().getColor(com.tencent.mm.R.color.Red_100));
        } else {
            fg2.p1 p1Var7 = z1Var.K;
            if (p1Var7 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            p1Var7.f262238r.setVisibility(8);
        }
        if (z1Var.f0()) {
            fg2.p1 p1Var8 = z1Var.K;
            if (p1Var8 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            p1Var8.f262224d.setAlpha(1.0f);
            fg2.p1 p1Var9 = z1Var.K;
            if (p1Var9 != null) {
                p1Var9.f262224d.setEnabled(true);
                return;
            } else {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
        }
        fg2.p1 p1Var10 = z1Var.K;
        if (p1Var10 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        p1Var10.f262224d.setAlpha(0.5f);
        fg2.p1 p1Var11 = z1Var.K;
        if (p1Var11 != null) {
            p1Var11.f262224d.setEnabled(false);
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
