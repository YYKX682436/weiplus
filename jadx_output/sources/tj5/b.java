package tj5;

/* loaded from: classes8.dex */
public class b implements android.view.View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.search.FTSEditTextView f419834d;

    public b(com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView) {
        this.f419834d = fTSEditTextView;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/search/FTSEditTextView$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        if (keyEvent.getAction() == 0 && 67 == i17) {
            com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView = this.f419834d;
            int selectionStart = fTSEditTextView.f209816g.getSelectionStart();
            int selectionEnd = fTSEditTextView.f209816g.getSelectionEnd();
            if (selectionStart == 0 && selectionEnd == 0 && ((java.util.ArrayList) fTSEditTextView.f209817h).size() > 0 && fTSEditTextView.f209825s) {
                ((java.util.ArrayList) fTSEditTextView.f209817h).remove(((java.util.ArrayList) r8).size() - 1);
                fTSEditTextView.w();
                com.tencent.mm.ui.search.FTSEditTextView.a(fTSEditTextView);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/search/FTSEditTextView$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return false;
    }
}
