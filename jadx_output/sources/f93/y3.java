package f93;

/* loaded from: classes11.dex */
public class y3 implements db5.t6 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelUI f260522d;

    public y3(com.tencent.mm.plugin.label.ui.ContactLabelUI contactLabelUI) {
        this.f260522d = contactLabelUI;
    }

    @Override // db5.t6
    public void a(java.lang.String str) {
    }

    @Override // db5.t6
    public void c() {
    }

    @Override // db5.t6
    public void d(java.lang.String str) {
    }

    @Override // db5.t6
    public void f(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append("");
        com.tencent.mm.plugin.label.ui.ContactLabelUI contactLabelUI = this.f260522d;
        com.tencent.mm.plugin.label.ui.widget.MMLabelPanel mMLabelPanel = contactLabelUI.f143302m;
        if (mMLabelPanel != null) {
            mMLabelPanel.p(str);
        }
        com.tencent.mm.plugin.label.ui.ContactLabelUI.V6(contactLabelUI, str);
        if (contactLabelUI.Z6()) {
            contactLabelUI.enableOptionMenu(true);
        }
        if (contactLabelUI.H.contains(str)) {
            contactLabelUI.H.remove(str);
        }
    }

    @Override // db5.t6
    public void g(java.lang.String str) {
    }

    @Override // db5.t6
    public void h(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append("");
        com.tencent.mm.plugin.label.ui.ContactLabelUI contactLabelUI = this.f260522d;
        com.tencent.mm.plugin.label.ui.widget.MMLabelPanel mMLabelPanel = contactLabelUI.f143302m;
        if (mMLabelPanel != null) {
            mMLabelPanel.d(str, true);
        }
        contactLabelUI.Y6(str, contactLabelUI.E);
        if (contactLabelUI.Z6()) {
            contactLabelUI.enableOptionMenu(true);
        }
        if (contactLabelUI.H.contains(str)) {
            return;
        }
        contactLabelUI.H.add(str);
    }

    @Override // db5.t6
    public void j(boolean z17, int i17) {
    }
}
