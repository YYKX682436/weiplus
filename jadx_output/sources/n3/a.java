package n3;

/* loaded from: classes14.dex */
public final class a extends android.view.View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final n3.c f334321a;

    public a(n3.c cVar) {
        this.f334321a = cVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean dispatchPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.f334321a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View view) {
        o3.p accessibilityNodeProvider = this.f334321a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return (android.view.accessibility.AccessibilityNodeProvider) accessibilityNodeProvider.f342646a;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.f334321a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        java.lang.Object tag;
        java.lang.Object tag2;
        java.lang.Object tag3;
        int i17;
        o3.l lVar = new o3.l(accessibilityNodeInfo);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        int i18 = android.os.Build.VERSION.SDK_INT;
        int i19 = 0;
        if (i18 >= 28) {
            tag = java.lang.Boolean.valueOf(n3.e1.d(view));
        } else {
            tag = view.getTag(com.tencent.mm.R.id.f487219nx5);
            if (!java.lang.Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        java.lang.Boolean bool = (java.lang.Boolean) tag;
        lVar.s(bool != null && bool.booleanValue());
        if (i18 >= 28) {
            tag2 = java.lang.Boolean.valueOf(n3.e1.c(view));
        } else {
            tag2 = view.getTag(com.tencent.mm.R.id.nwh);
            if (!java.lang.Boolean.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        java.lang.Boolean bool2 = (java.lang.Boolean) tag2;
        boolean z17 = bool2 != null && bool2.booleanValue();
        if (i18 >= 28) {
            accessibilityNodeInfo.setHeading(z17);
        } else {
            lVar.j(2, z17);
        }
        java.lang.CharSequence g17 = n3.l1.g(view);
        if (i18 >= 28) {
            accessibilityNodeInfo.setPaneTitle(g17);
        } else {
            o3.g.c(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", g17);
        }
        if (i18 >= 30) {
            tag3 = n3.g1.b(view);
        } else {
            tag3 = view.getTag(com.tencent.mm.R.id.nx6);
            if (!java.lang.CharSequence.class.isInstance(tag3)) {
                tag3 = null;
            }
        }
        lVar.u((java.lang.CharSequence) tag3);
        this.f334321a.onInitializeAccessibilityNodeInfo(view, lVar);
        java.lang.CharSequence text = accessibilityNodeInfo.getText();
        if (i18 < 26) {
            o3.g.c(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            o3.g.c(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            o3.g.c(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            o3.g.c(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            android.util.SparseArray sparseArray = (android.util.SparseArray) view.getTag(com.tencent.mm.R.id.nwg);
            if (sparseArray != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i27 = 0; i27 < sparseArray.size(); i27++) {
                    if (((java.lang.ref.WeakReference) sparseArray.valueAt(i27)).get() == null) {
                        arrayList.add(java.lang.Integer.valueOf(i27));
                    }
                }
                for (int i28 = 0; i28 < arrayList.size(); i28++) {
                    sparseArray.remove(((java.lang.Integer) arrayList.get(i28)).intValue());
                }
            }
            android.text.style.ClickableSpan[] clickableSpanArr = text instanceof android.text.Spanned ? (android.text.style.ClickableSpan[]) ((android.text.Spanned) text).getSpans(0, text.length(), android.text.style.ClickableSpan.class) : null;
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                o3.g.c(lVar.f342642a).putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", com.tencent.mm.R.id.f482349c4);
                android.util.SparseArray sparseArray2 = (android.util.SparseArray) view.getTag(com.tencent.mm.R.id.nwg);
                if (sparseArray2 == null) {
                    sparseArray2 = new android.util.SparseArray();
                    view.setTag(com.tencent.mm.R.id.nwg, sparseArray2);
                }
                int i29 = 0;
                while (i29 < clickableSpanArr.length) {
                    android.text.style.ClickableSpan clickableSpan = clickableSpanArr[i29];
                    int i37 = i19;
                    while (true) {
                        if (i37 >= sparseArray2.size()) {
                            i17 = o3.l.f342641d;
                            o3.l.f342641d = i17 + 1;
                            break;
                        } else {
                            if (clickableSpan.equals((android.text.style.ClickableSpan) ((java.lang.ref.WeakReference) sparseArray2.valueAt(i37)).get())) {
                                i17 = sparseArray2.keyAt(i37);
                                break;
                            }
                            i37++;
                        }
                    }
                    sparseArray2.put(i17, new java.lang.ref.WeakReference(clickableSpanArr[i29]));
                    android.text.style.ClickableSpan clickableSpan2 = clickableSpanArr[i29];
                    android.text.Spanned spanned = (android.text.Spanned) text;
                    lVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(java.lang.Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    lVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(java.lang.Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    lVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(java.lang.Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    lVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(java.lang.Integer.valueOf(i17));
                    i29++;
                    i19 = 0;
                }
            }
        }
        java.util.List<o3.f> actionList = n3.c.getActionList(view);
        for (int i38 = 0; i38 < actionList.size(); i38++) {
            lVar.b(actionList.get(i38));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.f334321a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.f334321a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean performAccessibilityAction(android.view.View view, int i17, android.os.Bundle bundle) {
        return this.f334321a.performAccessibilityAction(view, i17, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void sendAccessibilityEvent(android.view.View view, int i17) {
        this.f334321a.sendAccessibilityEvent(view, i17);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void sendAccessibilityEventUnchecked(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.f334321a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
