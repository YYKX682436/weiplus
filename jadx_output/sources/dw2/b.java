package dw2;

/* loaded from: classes2.dex */
public final class b extends dw2.o {

    /* renamed from: v, reason: collision with root package name */
    public boolean f244111v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.ref.WeakReference f244112w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.ref.WeakReference f244113x;

    public b() {
        java.lang.String str = "FinderColumnFeedSelectorAdapter@" + hashCode();
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.f244136a = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03c7 A[LOOP:2: B:80:0x01d4->B:87:0x03c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03e3 A[EDGE_INSN: B:88:0x03e3->B:89:0x03e3 BREAK  A[LOOP:2: B:80:0x01d4->B:87:0x03c7], SYNTHETIC] */
    @Override // dw2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(java.util.Set r39, boolean r40, java.lang.String r41) {
        /*
            Method dump skipped, instructions count: 1278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dw2.b.e(java.util.Set, boolean, java.lang.String):void");
    }

    @Override // dw2.o
    public com.tencent.mm.plugin.finder.assist.p0 j(int i17, in5.s0 s0Var) {
        in5.s0 s0Var2;
        jz5.f0 f0Var;
        java.util.LinkedList<r45.mb4> mediaList;
        r45.mb4 mb4Var;
        if (s0Var == null) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f244138c;
            androidx.recyclerview.widget.k3 q07 = recyclerView != null ? recyclerView.q0(0, false) : null;
            s0Var2 = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
        } else {
            s0Var2 = s0Var;
        }
        if (s0Var2 == null) {
            com.tencent.mars.xlog.Log.w(this.f244136a, "handleOnPageSelected return for holder:" + s0Var2 + " position:0");
            return null;
        }
        java.lang.Object obj = s0Var2.f293125i;
        so2.j5 j5Var = obj instanceof so2.j5 ? (so2.j5) obj : null;
        if (j5Var == null) {
            com.tencent.mars.xlog.Log.w(this.f244136a, "handleOnPageSelected return for item:" + j5Var + " position:0");
            return null;
        }
        com.tencent.mm.plugin.finder.storage.FeedData o17 = o(j5Var);
        com.tencent.mm.plugin.finder.assist.p0 p0Var = new com.tencent.mm.plugin.finder.assist.p0(false, 0L, null, null, null, 0, 0, null, null, 511, null);
        p0Var.f102443f = j5Var.h();
        p0Var.f102444g = 0;
        p0Var.f102445h = s0Var2;
        p0Var.f102439b = j5Var.getItemId();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
        p0Var.f102440c = baseFinderFeed != null ? baseFinderFeed.w() : null;
        p0Var.f102442e = o17;
        p0Var.f102446i = j5Var;
        android.view.View p17 = s0Var2.p(com.tencent.mm.R.id.f484869fs3);
        java.util.LinkedList<r45.mb4> mediaList2 = o17 != null ? o17.getMediaList() : null;
        if (p17 == null || mediaList2 == null) {
            f0Var = null;
        } else {
            com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner finderBaseMediaBanner = (com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner) p17;
            if (finderBaseMediaBanner.getFocusPosition() >= 0 && finderBaseMediaBanner.getFocusPosition() < mediaList2.size()) {
                r45.mb4 mb4Var2 = (r45.mb4) kz5.n0.a0(mediaList2, finderBaseMediaBanner.getFocusPosition());
                java.lang.String string = mb4Var2 != null ? mb4Var2.getString(9) : null;
                if (string == null) {
                    string = "";
                }
                p0Var.f102441d = string;
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            java.lang.String string2 = (o17 == null || (mediaList = o17.getMediaList()) == null || (mb4Var = (r45.mb4) kz5.n0.a0(mediaList, 0)) == null) ? null : mb4Var.getString(9);
            p0Var.f102441d = string2 != null ? string2 : "";
        }
        return p0Var;
    }
}
