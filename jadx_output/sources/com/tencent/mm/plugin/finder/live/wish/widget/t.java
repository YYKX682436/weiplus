package com.tencent.mm.plugin.finder.live.wish.widget;

/* loaded from: classes3.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.hn f120774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.widget.x f120775e;

    public t(r45.hn hnVar, com.tencent.mm.plugin.finder.live.wish.widget.x xVar) {
        this.f120774d = hnVar;
        this.f120775e = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/wish/widget/WishAudiencePanelWidget$addBoardEventEntryView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.hn hnVar = this.f120774d;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) hnVar.getCustom(2);
        if (finderJumpInfo != null) {
            com.tencent.mars.xlog.Log.i("WishAudiencePanelWidget", "board event entry clicked: " + hnVar.getString(0));
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            com.tencent.mm.plugin.finder.live.wish.widget.x xVar = this.f120775e;
            if (b6Var != null) {
                android.content.Context context = xVar.f118381d;
                kotlin.jvm.internal.o.g(context, "context");
                xc2.y2 y2Var = xc2.y2.f453343a;
                xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
                p0Var.f453252n = 0;
                xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
            }
            xVar.a();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/wish/widget/WishAudiencePanelWidget$addBoardEventEntryView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
