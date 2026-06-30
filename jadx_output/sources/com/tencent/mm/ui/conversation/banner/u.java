package com.tencent.mm.ui.conversation.banner;

/* loaded from: classes11.dex */
public class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f207576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f207577e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.banner.a0 f207578f;

    public u(com.tencent.mm.ui.conversation.banner.a0 a0Var, int i17, int i18) {
        this.f207578f = a0Var;
        this.f207576d = i17;
        this.f207577e = i18;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/banner/MainFrameBanner$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        c01.t9.e().b(this.f207576d, this.f207577e);
        com.tencent.mm.ui.conversation.banner.a0 a0Var = this.f207578f;
        com.tencent.mm.ui.conversation.banner.a0.l(a0Var, (android.content.Context) a0Var.f402842g.get(), false);
        yj0.a.h(this, "com/tencent/mm/ui/conversation/banner/MainFrameBanner$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
