package f93;

/* loaded from: classes11.dex */
public class f3 implements db5.t6 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelSelectUI f260336d;

    public f3(com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI) {
        this.f260336d = contactLabelSelectUI;
    }

    @Override // db5.t6
    public void a(java.lang.String str) {
    }

    @Override // db5.t6
    public void c() {
    }

    @Override // db5.t6
    public void d(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append("");
    }

    @Override // db5.t6
    public void f(java.lang.String str) {
        com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI = this.f260336d;
        java.lang.String str2 = (java.lang.String) contactLabelSelectUI.P.get(str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Label.ContactLabelSelectUI", "onTagUnSelected:get id failed, name=%s", str);
        } else {
            contactLabelSelectUI.c(str2, true, true);
        }
    }

    @Override // db5.t6
    public void g(java.lang.String str) {
    }

    @Override // db5.t6
    public void h(java.lang.String str) {
    }

    @Override // db5.t6
    public void j(boolean z17, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(z17);
        sb6.append("");
    }
}
