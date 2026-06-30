package mo2;

/* loaded from: classes2.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f330379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f330380e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mo2.q f330381f;

    public l(boolean[] zArr, in5.s0 s0Var, mo2.q qVar) {
        this.f330379d = zArr;
        this.f330380e = s0Var;
        this.f330381f = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/view/MemberCommonConvert$refreshStarCount$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean[] zArr = this.f330379d;
        if (zArr[0]) {
            zArr[0] = false;
        } else {
            fo3.s sVar = fo3.s.INSTANCE;
            sVar.Z7("ce_feed_fav", "<FeedFav>");
            sVar.H2("ce_feed_fav", android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535));
            sVar.Qa("ce_feed_fav");
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClickStar: ");
        in5.s0 s0Var = this.f330380e;
        sb6.append(s0Var.getAdapterPosition());
        com.tencent.mars.xlog.Log.i("MemberCommonConvert.kt", sb6.toString());
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i;
        nv2.o oVar = nv2.o.f340558e;
        boolean z17 = !nv2.o.f340558e.c(baseFinderFeed.getFeedObject().getFeedObject());
        com.tencent.mm.plugin.finder.member.question.c cVar = this.f330381f.f330388e;
        if (cVar != null) {
            cVar.u2(baseFinderFeed.getFeedObject(), z17, this.f330380e, 0, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert$refreshStarCount$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
