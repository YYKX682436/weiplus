package jn2;

/* loaded from: classes10.dex */
public final class r0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f300675d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f300676e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f300677f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f300678g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Set f300679h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.p f300680i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.l f300681m;

    public r0(android.content.Context context, gk2.e liveData) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        this.f300675d = context;
        this.f300676e = liveData;
        this.f300677f = new java.util.ArrayList();
        this.f300678g = new java.util.ArrayList();
        this.f300679h = new java.util.LinkedHashSet();
        zl2.q4.f473933a.R("FinderLiveAnchorSingSongEditPanelAdapter");
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f300677f).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        jn2.p0 holder = (jn2.p0) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        r45.z22 songInfo = (r45.z22) ((java.util.ArrayList) this.f300677f).get(i17);
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        r45.by1 by1Var = songInfo.f391631h;
        r45.ay1 ay1Var = by1Var != null ? by1Var.f371143d : null;
        holder.f300664e.A(ay1Var != null ? ay1Var.f370351e : null, ay1Var != null ? ay1Var.f370353g : null, ay1Var != null ? ay1Var.f370354h : 0, ay1Var != null ? ay1Var.f370355i : null, songInfo.f391628e);
        jn2.r0 r0Var = holder.f300666g;
        mm2.j6 j6Var = (mm2.j6) ((kotlinx.coroutines.flow.h3) ((mm2.m6) r0Var.f300676e.a(mm2.m6.class)).f329251s).getValue();
        boolean b17 = j6Var instanceof mm2.i6 ? kotlin.jvm.internal.o.b(((mm2.i6) j6Var).f329141a.f391629f, songInfo.f391629f) : false;
        com.tencent.mm.plugin.finder.live.widget.singlist.common.FinderLiveSongInfoView finderLiveSongInfoView = holder.f300664e;
        android.view.View f119781w = finderLiveSongInfoView.getF119781w();
        com.tencent.mm.view.MMPAGView auditionPlayingAnim = finderLiveSongInfoView.getAuditionPlayingAnim();
        android.widget.TextView a17 = finderLiveSongInfoView.getA();
        android.content.Context context = r0Var.f300675d;
        if (b17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(f119781w, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongEditPanelAdapter$EditViewHolder", "updatePlayingState", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f119781w.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(f119781w, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongEditPanelAdapter$EditViewHolder", "updatePlayingState", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            auditionPlayingAnim.setVisibility(0);
            auditionPlayingAnim.g();
            a17.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479206su));
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(f119781w, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongEditPanelAdapter$EditViewHolder", "updatePlayingState", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f119781w.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(f119781w, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongEditPanelAdapter$EditViewHolder", "updatePlayingState", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            auditionPlayingAnim.setVisibility(8);
            auditionPlayingAnim.n();
            a17.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.abw));
        }
        java.lang.String str = songInfo.f391629f;
        holder.f300663d.setChecked(str != null ? r0Var.f300679h.contains(str) : false);
        holder.itemView.setOnClickListener(new jn2.n0(songInfo, r0Var, holder, i17));
        holder.f300665f.setOnTouchListener(new jn2.o0(r0Var, holder));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.e8m, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new jn2.p0(this, inflate);
    }
}
