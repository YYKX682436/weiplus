package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class bn implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f131729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.cn f131730e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.dn f131731f;

    public bn(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.finder.view.cn cnVar, com.tencent.mm.plugin.finder.view.dn dnVar) {
        this.f131729d = h0Var;
        this.f131730e = cnVar;
        this.f131731f = dnVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderWxProfileApi$IdConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((com.tencent.mm.ui.widget.imageview.WeImageView) this.f131729d.f310123d).setVisibility(0);
        this.f131730e.f131787e.invoke(java.lang.Integer.valueOf(this.f131731f.f131911e));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi$IdConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
