package com.tencent.mm.plugin.finder.view;

/* loaded from: classes5.dex */
public final class z6 implements android.view.View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentFooter f133452d;

    public z6(com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter) {
        this.f133452d = finderCommentFooter;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderCommentFooter$onFinishInflate$9", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        if (i17 == 67 && keyEvent.getAction() == 0) {
            com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = this.f133452d;
            int selectionEnd = finderCommentFooter.getEditText().getSelectionEnd();
            android.text.Editable text = finderCommentFooter.getEditText().getText();
            int i18 = selectionEnd - 1;
            if (i18 < 0) {
                i18 = 0;
            }
            if (kotlin.jvm.internal.o.b(java.lang.String.valueOf(text != null ? text.subSequence(i18, selectionEnd) : null), "\u2005")) {
                java.lang.CharSequence subSequence = text.subSequence(0, selectionEnd);
                int length = subSequence.length() - 1;
                while (true) {
                    if (-1 >= length) {
                        break;
                    }
                    int size = com.tencent.mm.plugin.finder.storage.t70.f127590a.d().size();
                    int i19 = 0;
                    while (true) {
                        if (i19 >= size) {
                            z17 = false;
                            break;
                        }
                        if (subSequence.charAt(length) == ((java.lang.String) com.tencent.mm.plugin.finder.storage.t70.f127590a.d().get(i19)).charAt(0) && subSequence.charAt(length) != '@') {
                            z17 = true;
                            break;
                        }
                        i19++;
                    }
                    if (z17) {
                        break;
                    }
                    if (subSequence.charAt(length) == '@') {
                        i18 = length;
                        break;
                    }
                    length--;
                }
                if (i18 != -1) {
                    finderCommentFooter.getEditText().setText(finderCommentFooter.getEditText().getText().replace(i18, selectionEnd, ""));
                    finderCommentFooter.getEditText().setSelection(i18);
                }
                yj0.a.i(true, this, "com/tencent/mm/plugin/finder/view/FinderCommentFooter$onFinishInflate$9", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return true;
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/view/FinderCommentFooter$onFinishInflate$9", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return false;
    }
}
