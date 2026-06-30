package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class lq implements android.view.View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f113432d;

    public lq(com.tencent.mm.plugin.finder.live.plugin.et etVar) {
        this.f113432d = etVar;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        java.lang.CharSequence charSequence;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin$2", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        int i18 = 0;
        if (i17 == 67 && keyEvent.getAction() == 0) {
            com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f113432d;
            int selectionEnd = etVar.f112461y.getSelectionEnd();
            android.text.Editable text = etVar.f112461y.getText();
            if (text != null) {
                int i19 = selectionEnd - 1;
                if (i19 < 0) {
                    i19 = 0;
                }
                charSequence = text.subSequence(i19, selectionEnd);
            } else {
                charSequence = null;
            }
            if (kotlin.jvm.internal.o.b(java.lang.String.valueOf(charSequence), "\u2005")) {
                java.lang.CharSequence subSequence = text.subSequence(0, selectionEnd);
                int length = subSequence.length() - 1;
                while (true) {
                    if (-1 >= length) {
                        break;
                    }
                    if (subSequence.charAt(length) == '@') {
                        i18 = length;
                        break;
                    }
                    length--;
                }
                com.tencent.mm.ui.widget.MMEditText mMEditText = etVar.f112461y;
                mMEditText.setText(mMEditText.getText().replace(i18, selectionEnd, ""));
                com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", "[inputEt.setOnKeyListener] text = " + ((java.lang.Object) etVar.f112461y.getText()));
                etVar.f112461y.setSelection(i18);
                etVar.f112461y.setCursorVisible(true);
                yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin$2", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return true;
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin$2", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return false;
    }
}
