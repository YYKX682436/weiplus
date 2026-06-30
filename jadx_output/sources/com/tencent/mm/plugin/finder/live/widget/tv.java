package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class tv implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.uv f119912d;

    public tv(com.tencent.mm.plugin.finder.live.widget.uv uvVar) {
        this.f119912d = uvVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        java.util.Objects.toString(charSequence);
        int length = charSequence != null ? charSequence.length() : 0;
        int i27 = 16 - length;
        com.tencent.mm.plugin.finder.live.widget.uv uvVar = this.f119912d;
        fg2.q1 q1Var = uvVar.f120007m;
        if (q1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        q1Var.f262266c.setText(java.lang.String.valueOf(i27));
        if (i27 < 0) {
            fg2.q1 q1Var2 = uvVar.f120007m;
            if (q1Var2 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            q1Var2.f262266c.setTextColor(uvVar.f118381d.getColor(com.tencent.mm.R.color.Red_100));
            fg2.q1 q1Var3 = uvVar.f120007m;
            if (q1Var3 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            q1Var3.f262267d.setVisibility(0);
            fg2.q1 q1Var4 = uvVar.f120007m;
            if (q1Var4 != null) {
                q1Var4.f262265b.setEnabled(false);
                return;
            } else {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
        }
        if (length != 0 || uvVar.f120008n) {
            fg2.q1 q1Var5 = uvVar.f120007m;
            if (q1Var5 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            q1Var5.f262266c.setTextColor(uvVar.f118381d.getColor(com.tencent.mm.R.color.f478520a84));
            fg2.q1 q1Var6 = uvVar.f120007m;
            if (q1Var6 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            q1Var6.f262267d.setVisibility(8);
            fg2.q1 q1Var7 = uvVar.f120007m;
            if (q1Var7 != null) {
                q1Var7.f262265b.setEnabled(true);
                return;
            } else {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
        }
        fg2.q1 q1Var8 = uvVar.f120007m;
        if (q1Var8 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        q1Var8.f262266c.setTextColor(uvVar.f118381d.getColor(com.tencent.mm.R.color.f478520a84));
        fg2.q1 q1Var9 = uvVar.f120007m;
        if (q1Var9 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        q1Var9.f262267d.setVisibility(8);
        fg2.q1 q1Var10 = uvVar.f120007m;
        if (q1Var10 != null) {
            q1Var10.f262265b.setEnabled(false);
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }
}
