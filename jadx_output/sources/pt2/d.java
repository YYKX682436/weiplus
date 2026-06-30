package pt2;

/* loaded from: classes2.dex */
public final class d extends androidx.recyclerview.widget.f2 implements zy2.fc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment f358245d;

    public d(com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment finderMixSearchFeedFragment) {
        this.f358245d = finderMixSearchFeedFragment;
    }

    @Override // zy2.fc
    public java.util.List getData() {
        return this.f358245d.f125905v;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f358245d.f125905v.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        int i18 = com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment.A;
        return this.f358245d.A0() ? 7 : 4;
    }

    @Override // zy2.fc
    public java.util.List l() {
        return kz5.p0.f313996d;
    }

    @Override // zy2.fc
    public int n(int i17) {
        return i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x03a5, code lost:
    
        if (r8.getInteger(2) == 1) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03ab  */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r34, int r35) {
        /*
            Method dump skipped, instructions count: 1534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pt2.d.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 != 7) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.b38, parent, false);
            kotlin.jvm.internal.o.d(inflate);
            return new com.tencent.mm.plugin.finder.convert.yu(inflate);
        }
        android.view.LayoutInflater from = android.view.LayoutInflater.from(parent.getContext());
        int i18 = com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment.A;
        com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment finderMixSearchFeedFragment = this.f358245d;
        android.view.View inflate2 = from.inflate(finderMixSearchFeedFragment.A0() ? com.tencent.mm.R.layout.f489337c62 : com.tencent.mm.R.layout.f489335c60, parent, false);
        kotlin.jvm.internal.o.d(inflate2);
        return new com.tencent.mm.plugin.finder.convert.su(inflate2, finderMixSearchFeedFragment.f125903t);
    }

    public final void x(android.view.View view, android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(view, "live_room_card");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(view, 40, 26236);
        if (context != null) {
            long id6 = baseFinderFeed.getFeedObject().getFeedObject().getId();
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).getClass();
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[5];
            lVarArr[0] = new jz5.l("feed_id", pm0.v.u(id6));
            r45.nw1 liveInfo = baseFinderFeed.getFeedObject().getLiveInfo();
            lVarArr[1] = new jz5.l("live_id", liveInfo != null ? pm0.v.u(liveInfo.getLong(0)) : null);
            ml2.q1 q1Var = ml2.q1.f327812e;
            lVarArr[2] = new jz5.l("comment_scene", "temp_4");
            lVarArr[3] = new jz5.l("finder_username", baseFinderFeed.getFeedObject().getFeedObject().getUsername());
            lVarArr[4] = new jz5.l("session_buffer", "");
            ((cy1.a) rVar).gk(view, kz5.c1.k(lVarArr));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(view, new pt2.c(context, baseFinderFeed));
        }
    }
}
