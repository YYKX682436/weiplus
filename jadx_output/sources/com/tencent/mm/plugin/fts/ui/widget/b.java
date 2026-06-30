package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes12.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.widget.v f138244d;

    public b(com.tencent.mm.plugin.fts.ui.widget.v vVar) {
        this.f138244d = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.fts.ui.widget.v vVar = this.f138244d;
        com.tencent.mm.plugin.fts.ui.widget.a0 a0Var = vVar.f138333y;
        java.lang.String query = vVar.f209962e.getText().toString();
        a0Var.getClass();
        kotlin.jvm.internal.o.g(query, "query");
        z13.f fVar = a0Var.f138243b;
        int i17 = k23.s2.a(fVar.f469406o) ? com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS : 17;
        org.json.JSONObject a76 = fVar.a7();
        org.json.JSONObject c76 = fVar.c7();
        k23.r2 r2Var = fVar.f469406o;
        kotlin.jvm.internal.o.g(r2Var, "<this>");
        z50.c.f470162a.e(a0Var.f138242a, query, i17, r2Var == k23.r2.f303685g ? 238 : 3, a76, c76);
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
