package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes12.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.widget.v f138283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g23.c f138284e;

    public j(com.tencent.mm.plugin.fts.ui.widget.v vVar, g23.c cVar) {
        this.f138283d = vVar;
        this.f138284e = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView$initAISearchAndYuanbaoAd$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        z50.d dVar = z50.e.f470163a;
        vu4.a aVar = vu4.a.f440249s;
        vu4.b bVar = vu4.b.f440272v;
        com.tencent.mm.plugin.fts.ui.widget.v vVar = this.f138283d;
        dVar.b(aVar, bVar, vVar.f138333y.f138243b.a7(), vVar.f138333y.f138243b.f469401g);
        com.tencent.mm.plugin.fts.ui.widget.a0 a0Var = vVar.f138333y;
        a0Var.getClass();
        g23.c innerInputConfig = this.f138284e;
        kotlin.jvm.internal.o.g(innerInputConfig, "innerInputConfig");
        java.lang.String str = innerInputConfig.f267894d;
        kotlin.jvm.internal.o.f(str, "getExtParams(...)");
        java.lang.String str2 = innerInputConfig.f267895e;
        kotlin.jvm.internal.o.f(str2, "getNavBarParms(...)");
        org.json.JSONObject X6 = a0Var.f138243b.X6(str, str2);
        z50.b bVar2 = z50.c.f470162a;
        android.content.Context context = a0Var.f138242a;
        java.lang.String str3 = innerInputConfig.f267891a;
        kotlin.jvm.internal.o.f(str3, "getHotword(...)");
        bVar2.d(context, str3, innerInputConfig.f267892b, innerInputConfig.f267893c, X6);
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView$initAISearchAndYuanbaoAd$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
