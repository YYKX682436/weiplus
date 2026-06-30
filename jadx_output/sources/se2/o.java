package se2;

/* loaded from: classes3.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lm2.c f406869e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f406870f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f406871g;

    public o(java.lang.String str, lm2.c cVar, in5.s0 s0Var, boolean z17) {
        this.f406868d = str;
        this.f406869e = cVar;
        this.f406870f = s0Var;
        this.f406871g = z17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper$setBoxCommentActionListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zl2.r4 r4Var = zl2.r4.f473950a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("boxCommentLikeTrack onSingleTapConfirmed selfLike:");
        lm2.c cVar = this.f406869e;
        sb6.append(cVar.f319374g);
        r4Var.M2(this.f406868d, sb6.toString());
        in5.s0 s0Var = this.f406870f;
        java.lang.Object tag = s0Var.o().getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin");
        se2.d dVar = (se2.d) ((jz5.n) ((com.tencent.mm.plugin.finder.live.plugin.tb) tag).f114377y).getValue();
        kotlin.jvm.internal.o.d(view);
        dVar.getClass();
        if (!this.f406871g && se2.e.f406847a.a(cVar)) {
            com.tencent.mm.plugin.finder.view.oc ocVar = com.tencent.mm.plugin.finder.view.oc.f132781a;
            ocVar.a();
            dVar.f406845d = view.getBackground();
            se2.w wVar = se2.w.f406895a;
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.lang.String tag2 = dVar.f406844c;
            kotlin.jvm.internal.o.g(tag2, "tag");
            ocVar.e(new se2.m(cVar, context, tag2), new se2.b(s0Var, dVar, cVar, view), new se2.c(view, dVar), new com.tencent.mm.plugin.finder.view.fc(view, null, (r45.xn1) cVar.f319372e.getCustom(13), ((mm2.c1) dVar.a(mm2.c1.class)).T, true, true, cVar.a(), cVar.j(), 0, 258, null), (r16 & 16) != 0 ? null : new com.tencent.mm.plugin.finder.view.dc(true, new db5.h4(view.getContext(), com.tencent.thumbplayer.core.common.TPPixelFormat.TP_PIX_FMT_MEDIACODEC, 0), true), (r16 & 32) != 0 ? null : null);
            if (r4Var.y(cVar) || r4Var.A(cVar)) {
                view.setBackground(view.getContext().getDrawable(com.tencent.mm.R.drawable.f481707a16));
            } else {
                view.setBackground(view.getContext().getDrawable(com.tencent.mm.R.drawable.a1l));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper$setBoxCommentActionListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
