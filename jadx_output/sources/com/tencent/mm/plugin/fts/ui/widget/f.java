package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes12.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.widget.v f138265d;

    public f(com.tencent.mm.plugin.fts.ui.widget.v vVar) {
        this.f138265d = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.fts.ui.widget.a0 a0Var = this.f138265d.f138333y;
        a0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSActionBarAISearchViewModel", "handleSettingOptionClick");
        android.content.Context context = a0Var.f138242a;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((i23.e) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(i23.e.class)).f288079d.f().i();
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
