package gl5;

/* loaded from: classes15.dex */
public class f implements android.text.TextWatcher, android.text.SpanWatcher {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.CharSequence f272971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.cedit.edit.CustomTextView f272972e;

    public f(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView, gl5.a aVar) {
        this.f272972e = customTextView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = this.f272972e;
        java.util.ArrayList arrayList = customTextView.f211578J;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                ((android.text.TextWatcher) arrayList.get(i17)).afterTextChanged(editable);
            }
        }
        if (android.text.method.MetaKeyKeyListener.getMetaState(editable, 2048) != 0) {
            jl5.c.b(customTextView, editable);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        java.lang.CharSequence charSequence2;
        boolean g17 = la5.b.f317600a.g(true);
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = this.f272972e;
        if (g17 && (charSequence2 = customTextView.C) != null) {
            this.f272971d = charSequence2.toString();
        }
        float[] fArr = com.tencent.mm.ui.widget.cedit.edit.CustomTextView.f211571o2;
        customTextView.i0(charSequence, i17, i18, i19);
    }

    @Override // android.text.SpanWatcher
    public void onSpanAdded(android.text.Spannable spannable, java.lang.Object obj, int i17, int i18) {
        this.f272972e.s0(spannable, obj, -1, i17, -1, i18);
    }

    @Override // android.text.SpanWatcher
    public void onSpanChanged(android.text.Spannable spannable, java.lang.Object obj, int i17, int i18, int i19, int i27) {
        this.f272972e.s0(spannable, obj, i17, i19, i18, i27);
    }

    @Override // android.text.SpanWatcher
    public void onSpanRemoved(android.text.Spannable spannable, java.lang.Object obj, int i17, int i18) {
        this.f272972e.s0(spannable, obj, i17, -1, i18, -1);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = this.f272972e;
        customTextView.getClass();
        float[] fArr = com.tencent.mm.ui.widget.cedit.edit.CustomTextView.f211571o2;
        gl5.e0 e0Var = customTextView.f211589g2;
        gl5.s sVar = e0Var == null ? null : e0Var.f272953k;
        if (sVar == null || sVar.f273090c == 0) {
            customTextView.w0();
        }
        if (sVar != null) {
            sVar.f273093f = true;
            int i27 = sVar.f273094g;
            if (i27 < 0) {
                sVar.f273094g = i17;
                sVar.f273095h = i17 + i18;
            } else {
                sVar.f273094g = java.lang.Math.min(i27, i17);
                sVar.f273095h = java.lang.Math.max(sVar.f273095h, (i17 + i18) - sVar.f273096i);
            }
            sVar.f273096i += i19 - i18;
        }
        customTextView.j0(charSequence, i17, i18, i19);
        if (la5.b.f317600a.g(true)) {
            if (customTextView.isFocused() || (customTextView.isSelected() && customTextView.isShown())) {
                java.lang.CharSequence charSequence2 = this.f272971d;
                android.view.accessibility.AccessibilityEvent obtain = android.view.accessibility.AccessibilityEvent.obtain(16);
                obtain.setFromIndex(i17);
                obtain.setRemovedCount(i18);
                obtain.setAddedCount(i19);
                obtain.setBeforeText(charSequence2);
                customTextView.sendAccessibilityEventUnchecked(obtain);
                this.f272971d = null;
            }
        }
    }
}
