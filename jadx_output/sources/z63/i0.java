package z63;

/* loaded from: classes5.dex */
public class i0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI f470418d;

    public i0(com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI groupSolitatireEditUI) {
        this.f470418d = groupSolitatireEditUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireEditUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int actionMasked = motionEvent.getActionMasked();
        com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI groupSolitatireEditUI = this.f470418d;
        if (actionMasked == 1 && (view instanceof com.tencent.mm.ui.widget.MMEditText) && groupSolitatireEditUI.F) {
            ((com.tencent.mm.ui.widget.MMEditText) view).setCursorVisible(true);
        }
        if (motionEvent.getActionMasked() == 1 && (view instanceof com.tencent.mm.ui.widget.MMEditText)) {
            com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) view;
            if (((java.lang.Integer) mMEditText.getTag(com.tencent.mm.R.id.guj)).intValue() == 3 && groupSolitatireEditUI.L) {
                mMEditText.setCursorVisible(true);
            }
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = (com.tencent.mm.ui.widget.MMEditText) view;
        int i17 = com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI.U;
        groupSolitatireEditUI.getClass();
        if (mMEditText2.getLineCount() > mMEditText2.getMaxLines()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            groupSolitatireEditUI.K = true;
            if (motionEvent.getAction() == 1) {
                groupSolitatireEditUI.K = false;
                view.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireEditUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
