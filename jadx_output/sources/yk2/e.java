package yk2;

/* loaded from: classes3.dex */
public final class e extends yk2.g {

    /* renamed from: f, reason: collision with root package name */
    public boolean f462784f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f462785g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f462786h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f462787i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f462788m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.view.ViewGroup root) {
        super(root);
        kotlin.jvm.internal.o.g(root, "root");
        this.f462788m = "";
    }

    @Override // yk2.g
    public int c() {
        android.view.ViewGroup viewGroup = this.f462791d;
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.tl9);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f462785g = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = viewGroup.findViewById(com.tencent.mm.R.id.tl8);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f462786h = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = viewGroup.findViewById(com.tencent.mm.R.id.tl_);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f462787i = (android.widget.TextView) findViewById3;
        if (!this.f462784f) {
            this.f462784f = true;
            com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
            java.lang.String b17 = b();
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            a4Var.a(b17, "", b52.b.b(), "person_page_message", f());
        }
        java.lang.Object context = viewGroup.getContext();
        androidx.lifecycle.y yVar = context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null;
        if (yVar == null) {
            com.tencent.mars.xlog.Log.w("LiveMentionsPersonalItem", "registerRedDot: lifecycleOwner is null");
            return 0;
        }
        ll2.e eVar = ll2.e.f319133a;
        eVar.k(yVar, "LiveMentionLeft", new yk2.c(this));
        eVar.k(yVar, "LiveMentionRight", new yk2.d(this));
        return 0;
    }

    @Override // yk2.g
    public void d() {
        com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
        java.lang.String b17 = b();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        a4Var.b(b17, b52.b.b(), "person_page_message", f());
        ll2.a aVar = ll2.a.f319125f;
        e("LiveMentionLeft", aVar);
        e("LiveMentionRight", aVar);
        ll2.e eVar = ll2.e.f319133a;
        ll2.e.d(eVar, "LiveMentionLeft", false, false, 6, null);
        ll2.e.d(eVar, "LiveMentionRight", false, false, 6, null);
        android.content.Intent intent = new android.content.Intent();
        android.view.ViewGroup viewGroup = this.f462791d;
        android.content.Intent intent2 = !(viewGroup.getContext() instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(viewGroup.getContext(), com.tencent.mm.plugin.finder.feed.ui.FinderLiveMentionsUI.class);
        android.content.Context context = viewGroup.getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/personal/LiveMentionsPersonalItem", "onContentClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/live/personal/LiveMentionsPersonalItem", "onContentClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void e(java.lang.String str, ll2.a aVar) {
        ll2.e eVar = ll2.e.f319133a;
        ll2.b[] bVarArr = ll2.b.f319128d;
        this.f462788m = eVar.n(java.lang.String.valueOf(14), str, aVar.f319127d, this.f462788m);
    }

    public final java.lang.String f() {
        int i17;
        ll2.e eVar = ll2.e.f319133a;
        com.tencent.mm.plugin.finder.extension.reddot.a aVar = (com.tencent.mm.plugin.finder.extension.reddot.a) eVar.g("LiveMentionLeft").getValue();
        r45.f03 f03Var = aVar != null ? aVar.f105328b : null;
        com.tencent.mm.plugin.finder.extension.reddot.a aVar2 = (com.tencent.mm.plugin.finder.extension.reddot.a) eVar.g("LiveMentionRight").getValue();
        r45.f03 f03Var2 = aVar2 != null ? aVar2.f105328b : null;
        if (f03Var == null || f03Var.f373887d != 2 || (i17 = f03Var.f373888e) <= 0) {
            i17 = f03Var2 != null ? 1 : 0;
        }
        cl0.g gVar = new cl0.g();
        gVar.o("red_count", i17);
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        return gVar2;
    }
}
