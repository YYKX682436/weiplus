package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class xa implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderModifyNameUI f130011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f130012e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f130013f;

    public xa(com.tencent.mm.plugin.finder.ui.FinderModifyNameUI finderModifyNameUI, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.h0 h0Var) {
        this.f130011d = finderModifyNameUI;
        this.f130012e = f0Var;
        this.f130013f = h0Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.finder.ui.FinderModifyNameUI finderModifyNameUI = this.f130011d;
        int i17 = finderModifyNameUI.H;
        if (i17 != 2 || editable == null) {
            if (i17 == 1) {
                finderModifyNameUI.e7();
                return;
            }
            return;
        }
        android.widget.EditText editText = finderModifyNameUI.f128629u;
        if (editText == null) {
            kotlin.jvm.internal.o.o("edit");
            throw null;
        }
        ck5.f b17 = ck5.f.b(editText);
        int d76 = finderModifyNameUI.d7();
        b17.f42561f = 1;
        b17.f42560e = d76;
        b17.f42562g = com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2;
        b17.f42556a = true;
        b17.d(finderModifyNameUI);
        android.text.style.ForegroundColorSpan[] foregroundColorSpanArr = (android.text.style.ForegroundColorSpan[]) editable.getSpans(0, editable.length(), android.text.style.ForegroundColorSpan.class);
        kotlin.jvm.internal.o.d(foregroundColorSpanArr);
        for (android.text.style.ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
            editable.removeSpan(foregroundColorSpan);
        }
        hc2.x0.g(editable.toString(), true, new com.tencent.mm.plugin.finder.ui.wa(editable));
        android.widget.EditText editText2 = finderModifyNameUI.f128629u;
        if (editText2 == null) {
            kotlin.jvm.internal.o.o("edit");
            throw null;
        }
        android.text.Editable text = editText2.getText();
        kotlin.jvm.internal.o.f(text, "getText(...)");
        int i18 = 0;
        for (int i19 = 0; i19 < text.length(); i19++) {
            if (text.charAt(i19) == '\n') {
                i18++;
            }
        }
        int i27 = i18 + 1;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i27);
        kotlin.jvm.internal.f0 f0Var = this.f130012e;
        com.tencent.mars.xlog.Log.i("Finder.FinderModifyNameUI", "afterText change %d, %d", valueOf, java.lang.Integer.valueOf(f0Var.f310116d));
        int i28 = finderModifyNameUI.K;
        kotlin.jvm.internal.h0 h0Var = this.f130013f;
        if (i27 > i28) {
            if (i27 > f0Var.f310116d) {
                f0Var.f310116d = i27;
                android.widget.EditText editText3 = finderModifyNameUI.f128629u;
                if (editText3 == null) {
                    kotlin.jvm.internal.o.o("edit");
                    throw null;
                }
                java.lang.String str = (java.lang.String) h0Var.f310123d;
                editText3.setText(str != null ? str : "");
                android.widget.EditText editText4 = finderModifyNameUI.f128629u;
                if (editText4 == null) {
                    kotlin.jvm.internal.o.o("edit");
                    throw null;
                }
                java.lang.String str2 = (java.lang.String) h0Var.f310123d;
                editText4.setSelection(str2 != null ? str2.length() : 0);
            } else {
                h0Var.f310123d = editable.toString();
                f0Var.f310116d = i27;
            }
            com.tencent.mm.plugin.finder.ui.FinderModifyNameUI finderModifyNameUI2 = this.f130011d;
            java.lang.String string = finderModifyNameUI2.getString(com.tencent.mm.R.string.d0x, finderModifyNameUI2.getString(com.tencent.mm.R.string.f5h));
            kotlin.jvm.internal.o.f(string, "getString(...)");
            com.tencent.mm.plugin.finder.ui.FinderModifyNameUI.h7(finderModifyNameUI2, string, null, null, 6, null);
            return;
        }
        if (com.tencent.mm.ui.tools.v4.f(editable.toString()) <= finderModifyNameUI.f128627J) {
            h0Var.f310123d = editable.toString();
            f0Var.f310116d = i27;
            return;
        }
        android.widget.EditText editText5 = finderModifyNameUI.f128629u;
        if (editText5 == null) {
            kotlin.jvm.internal.o.o("edit");
            throw null;
        }
        java.lang.String str3 = (java.lang.String) h0Var.f310123d;
        editText5.setText(str3 != null ? str3 : "");
        android.widget.EditText editText6 = finderModifyNameUI.f128629u;
        if (editText6 == null) {
            kotlin.jvm.internal.o.o("edit");
            throw null;
        }
        java.lang.String str4 = (java.lang.String) h0Var.f310123d;
        editText6.setSelection(str4 != null ? str4.length() : 0);
        com.tencent.mm.plugin.finder.ui.FinderModifyNameUI finderModifyNameUI3 = this.f130011d;
        java.lang.String string2 = finderModifyNameUI3.getString(com.tencent.mm.R.string.mhr);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        com.tencent.mm.plugin.finder.ui.FinderModifyNameUI.h7(finderModifyNameUI3, string2, null, null, 6, null);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        java.lang.Character C0;
        com.tencent.mm.plugin.finder.ui.FinderModifyNameUI finderModifyNameUI = this.f130011d;
        if (finderModifyNameUI.H == 2 && i19 == 1) {
            boolean z17 = false;
            if (charSequence != null && (C0 = r26.p0.C0(charSequence, i17)) != null && C0.charValue() == '@') {
                z17 = true;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("Finder.FinderModifyNameUI", "at auto goto");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_scene", 2);
                intent.putExtra("KEY_ENTER_SCENE", 1);
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Lk(finderModifyNameUI, 20001, intent, 3);
            }
        }
    }
}
