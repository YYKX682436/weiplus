package yk2;

/* loaded from: classes3.dex */
public final class f extends yk2.g {

    /* renamed from: f, reason: collision with root package name */
    public r45.f82 f462789f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f462790g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.view.ViewGroup root) {
        super(root);
        kotlin.jvm.internal.o.g(root, "root");
    }

    @Override // yk2.g
    public void a(r45.lk2 response) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(response, "response");
        this.f462792e = response;
        r45.v32 v32Var = (r45.v32) response.getCustom(31);
        android.view.ViewGroup viewGroup = this.f462791d;
        if (v32Var != null) {
            this.f462789f = (r45.f82) v32Var.getCustom(1);
            viewGroup.setVisibility(0);
            if (!this.f462790g) {
                this.f462790g = true;
                com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
                java.lang.String b17 = b();
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                a4Var.a(b17, "", b52.b.b(), "person_page_more", "");
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            viewGroup.setVisibility(8);
        }
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
        a4Var.b(b17, b52.b.b(), "person_page_more", "");
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        android.content.Context context = this.f462791d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.content.Intent intent = new android.content.Intent();
        r45.f82 f82Var = this.f462789f;
        if (f82Var != null) {
            dk2.va vaVar = dk2.wa.f234283b;
            dk2.wa waVar = new dk2.wa(f82Var);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(c01.id.c());
            sb6.append('_');
            sb6.append(waVar.hashCode());
            java.lang.String sb7 = sb6.toString();
            dk2.wa.f234284c.put(sb7, waVar);
            intent.putExtra("KEY_PARAMS_CONFIG_MORE_OPTION_UI_BUBBLE_KEY", sb7);
            com.tencent.mm.sdk.platformtools.Log.c("Finder.FinderLiveScrollSquareBundle", "saveToIntent " + intent.hashCode() + ", " + waVar.hashCode() + ", key:" + sb7, new java.lang.Object[0]);
        }
        ((c61.p2) ybVar).getClass();
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).getClass();
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, (java.lang.Class) ((jz5.n) jz2.x0.f302776w).getValue());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLiveMoreOptionSettingUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLiveMoreOptionSettingUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
