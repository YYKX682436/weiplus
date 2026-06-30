package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class n1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.m1 f151907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView f151908e;

    public n1(com.tencent.mm.plugin.mv.ui.view.m1 m1Var, com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView musicMvCommentView) {
        this.f151907d = m1Var;
        this.f151908e = musicMvCommentView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$MusicCommentConverter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.ns4 ns4Var = this.f151907d.f151898d.f151920a;
        long j17 = ns4Var.f381649o;
        java.lang.String str = ns4Var.f381650p;
        if (str == null) {
            str = "";
        }
        rm3.a aVar = this.f151908e.f151661g;
        if (aVar != null) {
            aVar.c(j17, str);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$MusicCommentConverter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
