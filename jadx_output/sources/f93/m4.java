package f93;

/* loaded from: classes11.dex */
public class m4 implements db5.t6 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelUI f260390d;

    public m4(com.tencent.mm.plugin.label.ui.ContactLabelUI contactLabelUI) {
        this.f260390d = contactLabelUI;
    }

    @Override // db5.t6
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.label.ui.ContactLabelUI contactLabelUI = this.f260390d;
        com.tencent.mm.plugin.label.ui.widget.MMLabelPanel mMLabelPanel = contactLabelUI.f143307r;
        if (mMLabelPanel != null) {
            mMLabelPanel.s(str, false);
        }
        com.tencent.mm.plugin.label.ui.ContactLabelUI.V6(contactLabelUI, str);
    }

    @Override // db5.t6
    public void c() {
    }

    @Override // db5.t6
    public void d(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append("");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.plugin.label.ui.ContactLabelUI contactLabelUI = this.f260390d;
        contactLabelUI.f143302m.d(str, true);
        com.tencent.mm.plugin.label.ui.widget.MMLabelPanel mMLabelPanel = contactLabelUI.f143307r;
        if (mMLabelPanel != null) {
            mMLabelPanel.s(str, true);
        }
        contactLabelUI.Y6(str, contactLabelUI.E);
    }

    @Override // db5.t6
    public void f(java.lang.String str) {
        com.tencent.mm.plugin.label.ui.ContactLabelUI contactLabelUI = this.f260390d;
        contactLabelUI.f143302m.p(str);
        com.tencent.mm.plugin.label.ui.widget.MMLabelPanel mMLabelPanel = contactLabelUI.f143307r;
        if (mMLabelPanel != null) {
            mMLabelPanel.s(str, false);
        }
        com.tencent.mm.plugin.label.ui.ContactLabelUI.V6(contactLabelUI, str);
        if (contactLabelUI.F.contains(str)) {
            contactLabelUI.F.remove(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e0, code lost:
    
        if (r10 == null) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ee  */
    @Override // db5.t6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f93.m4.g(java.lang.String):void");
    }

    @Override // db5.t6
    public void h(java.lang.String str) {
    }

    @Override // db5.t6
    public void j(boolean z17, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(z17);
        sb6.append("");
        com.tencent.mm.plugin.label.ui.ContactLabelUI contactLabelUI = this.f260390d;
        if (z17) {
            contactLabelUI.enableOptionMenu(false);
            contactLabelUI.f143303n.setVisibility(8);
        } else {
            contactLabelUI.enableOptionMenu(true);
            contactLabelUI.f143303n.setVisibility(8);
        }
    }
}
