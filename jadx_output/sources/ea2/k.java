package ea2;

/* loaded from: classes2.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f250563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC f250564e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f250565f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f250566g;

    public k(java.util.List list, com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC, int i17, kotlin.jvm.internal.h0 h0Var) {
        this.f250563d = list;
        this.f250564e = finderMusicTopicHeaderUIC;
        this.f250565f = i17;
        this.f250566g = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initArtist$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.List list = this.f250563d;
        int integer = ((r45.iw2) list.get(0)).getInteger(1);
        com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC = this.f250564e;
        if (integer == 1) {
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) ((r45.iw2) list.get(0)).getCustom(0);
            if (finderContact == null || (str = finderContact.getUsername()) == null) {
                str = "";
            }
            java.lang.String str2 = str;
            boolean z17 = str2.length() > 0;
            ea2.g gVar = com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC.f101758w;
            if (z17) {
                ea2.g.b(gVar, finderMusicTopicHeaderUIC.getActivity(), str2, null, 4, null);
            } else {
                gVar.a(finderMusicTopicHeaderUIC.getContext(), (r45.iw2) list.get(0));
            }
        }
        fa2.a aVar = fa2.a.f260706a;
        android.app.Activity context = finderMusicTopicHeaderUIC.getContext();
        r45.r03 r03Var = (r45.r03) finderMusicTopicHeaderUIC.f452719d;
        aVar.b(context, 1, r03Var != null ? (r45.hj2) r03Var.getCustom(19) : null, this.f250565f, (java.lang.String) this.f250566g.f310123d);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initArtist$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
