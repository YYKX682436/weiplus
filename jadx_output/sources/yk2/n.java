package yk2;

/* loaded from: classes3.dex */
public final class n extends yk2.g {

    /* renamed from: f, reason: collision with root package name */
    public boolean f462798f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f462799g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f462800h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.view.ViewGroup root) {
        super(root);
        kotlin.jvm.internal.o.g(root, "root");
        this.f462799g = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.pr9);
        this.f462800h = "";
    }

    @Override // yk2.g
    public void a(r45.lk2 response) {
        r45.aw1 aw1Var;
        kotlin.jvm.internal.o.g(response, "response");
        this.f462792e = response;
        r45.v32 v32Var = (r45.v32) response.getCustom(31);
        if (v32Var == null || (aw1Var = (r45.aw1) v32Var.getCustom(0)) == null) {
            return;
        }
        android.view.ViewGroup viewGroup = this.f462791d;
        viewGroup.setVisibility(0);
        if (!this.f462798f) {
            this.f462798f = true;
            com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
            java.lang.String b17 = b();
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            a4Var.a(b17, "", b52.b.b(), "person_page_reward_level", "");
        }
        java.lang.String string = aw1Var.getString(3);
        if (string == null) {
            string = "";
        }
        this.f462800h = string;
        this.f462799g.setText(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.d6i, java.lang.Integer.valueOf(aw1Var.getInteger(0))));
    }

    @Override // yk2.g
    public int c() {
        return 8;
    }

    @Override // yk2.g
    public void d() {
        com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
        java.lang.String b17 = b();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        a4Var.b(b17, b52.b.b(), "person_page_reward_level", "");
        java.lang.String str = this.f462800h;
        if (str == null || str.length() == 0) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f462800h);
        j45.l.n(this.f462791d.getContext(), "webview", ".ui.tools.WebViewUI", intent, 1016);
    }
}
