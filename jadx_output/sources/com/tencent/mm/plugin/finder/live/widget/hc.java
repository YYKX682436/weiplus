package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class hc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.jc f118563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.b2 f118564e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f118565f;

    public hc(com.tencent.mm.plugin.finder.live.widget.jc jcVar, mm2.b2 b2Var, int i17) {
        this.f118563d = jcVar;
        this.f118564e = b2Var;
        this.f118565f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveCommentDanmakuSettingWidget$initView$setRangeClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.jc jcVar = this.f118563d;
        kotlinx.coroutines.flow.q2 q2Var = (kotlinx.coroutines.flow.q2) ((mm2.j2) jcVar.getBuContext().a(mm2.j2.class)).f329175w;
        mm2.b2 b2Var = this.f118564e;
        q2Var.e(b2Var);
        jcVar.e(b2Var);
        jcVar.getClass();
        com.tencent.mm.plugin.finder.live.widget.jc.f118746p.a(jcVar.f118748i, 4, kz5.b1.e(new jz5.l("barrage_range", java.lang.Integer.valueOf(this.f118565f))));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCommentDanmakuSettingWidget$initView$setRangeClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
