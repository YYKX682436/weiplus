package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ic implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.jc f118664d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.d2 f118665e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f118666f;

    public ic(com.tencent.mm.plugin.finder.live.widget.jc jcVar, mm2.d2 d2Var, int i17) {
        this.f118664d = jcVar;
        this.f118665e = d2Var;
        this.f118666f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveCommentDanmakuSettingWidget$initView$setTransClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.jc jcVar = this.f118664d;
        kotlinx.coroutines.flow.q2 q2Var = (kotlinx.coroutines.flow.q2) ((mm2.j2) jcVar.getBuContext().a(mm2.j2.class)).f329174v;
        mm2.d2 d2Var = this.f118665e;
        q2Var.e(d2Var);
        jcVar.f(d2Var);
        jcVar.getClass();
        com.tencent.mm.plugin.finder.live.widget.jc.f118746p.a(jcVar.f118748i, 5, kz5.b1.e(new jz5.l("transparency_range", java.lang.Integer.valueOf(this.f118666f))));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCommentDanmakuSettingWidget$initView$setTransClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
