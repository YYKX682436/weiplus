package os3;

/* loaded from: classes8.dex */
public class m2 implements android.view.View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl f348150d;

    public m2(com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl mailAddrsViewControl) {
        this.f348150d = mailAddrsViewControl;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        java.lang.String obj;
        android.view.View view2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl$5", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl mailAddrsViewControl = this.f348150d;
        if (i17 == 67 && keyEvent.getAction() == 0) {
            java.lang.String obj2 = mailAddrsViewControl.f154884f.getEditableText().toString();
            if (obj2.length() == 0 && (view2 = mailAddrsViewControl.f154889n) != null && view2.isSelected()) {
                mailAddrsViewControl.f((ks3.u) mailAddrsViewControl.f154889n.getTag());
                mailAddrsViewControl.f154889n = null;
                mailAddrsViewControl.a();
            } else if (obj2.length() == 0 && mailAddrsViewControl.f154883e.size() > 0) {
                int size = mailAddrsViewControl.f154883e.size() - 1;
                android.view.View childAt = mailAddrsViewControl.getChildAt(size);
                if (childAt.isSelected()) {
                    mailAddrsViewControl.f((ks3.u) mailAddrsViewControl.f154883e.get(size));
                    mailAddrsViewControl.a();
                } else {
                    childAt.setSelected(true);
                }
            }
        } else if (i17 == 66 && keyEvent.getAction() == 0 && (obj = mailAddrsViewControl.f154884f.getEditableText().toString()) != null && obj.length() > 0) {
            mailAddrsViewControl.e(obj, true);
            mailAddrsViewControl.a();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl$5", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return false;
    }
}
