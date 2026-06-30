package f93;

/* loaded from: classes11.dex */
public final class z0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelCreateUI f260525d;

    public z0(com.tencent.mm.plugin.label.ui.ContactLabelCreateUI contactLabelCreateUI) {
        this.f260525d = contactLabelCreateUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/ContactLabelCreateUI$initViews$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.label.ui.ContactLabelCreateUI.f143212o;
        com.tencent.mm.plugin.label.ui.ContactLabelCreateUI contactLabelCreateUI = this.f260525d;
        contactLabelCreateUI.hideVKB();
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText = contactLabelCreateUI.f143213e;
        if (mMClearEditText != null) {
            android.text.Editable text = mMClearEditText.getText();
            kotlin.jvm.internal.o.f(text, "getText(...)");
            java.lang.String obj = r26.n0.u0(text).toString();
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactLabelCreateUI", "checking " + obj);
            if (f93.q5.f260441a.a(contactLabelCreateUI, obj)) {
                java.util.ArrayList d17 = kz5.c0.d(obj);
                com.tencent.mars.xlog.Log.i("MicroMsg.ContactLabelCreateUI", "save new label: " + d17);
                c01.d9.e().g(new e93.a(d17));
                contactLabelCreateUI.U6(contactLabelCreateUI.getString(com.tencent.mm.R.string.g9k));
                ((com.tencent.mm.plugin.messenger.foundation.g) vg3.n3.f436736n1.a()).wi(new vg3.e(vg3.d.f436681g, vg3.b.f436645e, vg3.c.f436668w, 0, kz5.b0.c(contactLabelCreateUI.f143217i)));
                java.util.HashMap hashMap = new java.util.HashMap();
                java.lang.String str = contactLabelCreateUI.f143216h;
                if (str == null) {
                    str = "";
                }
                hashMap.put("note_sid", str);
                java.lang.String str2 = contactLabelCreateUI.f143217i;
                hashMap.put("add_username", str2 != null ? str2 : "");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("friends_create_tab", null, hashMap, 33926);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/ContactLabelCreateUI$initViews$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
