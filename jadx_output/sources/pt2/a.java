package pt2;

/* loaded from: classes2.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f358235d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f358236e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment f358237f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f358238g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17, com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment finderMixSearchFeedFragment, androidx.recyclerview.widget.k3 k3Var) {
        super(1);
        this.f358235d = baseFinderFeed;
        this.f358236e = i17;
        this.f358237f = finderMixSearchFeedFragment;
        this.f358238g = k3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r0.getInteger(2) == 1) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r2 != false) goto L11;
     */
    @Override // yz5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Number r14 = (java.lang.Number) r14
            r14.intValue()
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r14 = r13.f358235d
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r14.getFeedObject()
            boolean r0 = r0.isLiveFeed()
            r1 = 0
            if (r0 != 0) goto L28
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r14.getFeedObject()
            r45.nw1 r0 = r0.getLiveInfo()
            if (r0 == 0) goto L25
            r2 = 2
            int r0 = r0.getInteger(r2)
            r2 = 1
            if (r0 != r2) goto L25
            goto L26
        L25:
            r2 = r1
        L26:
            if (r2 == 0) goto L49
        L28:
            java.lang.Class<zy2.zb> r0 = zy2.zb.class
            i95.m r0 = i95.n0.c(r0)
            java.lang.String r2 = "getService(...)"
            kotlin.jvm.internal.o.f(r0, r2)
            r3 = r0
            zy2.zb r3 = (zy2.zb) r3
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r13.f358235d
            int r0 = r13.f358236e
            long r5 = (long) r0
            ml2.x1 r7 = ml2.x1.f328207n
            ml2.q1 r0 = ml2.q1.f327812e
            java.lang.String r8 = "temp_4"
            r9 = 0
            r10 = 0
            r11 = 48
            r12 = 0
            zy2.zb.s3(r3, r4, r5, r7, r8, r9, r10, r11, r12)
        L49:
            zl2.q4 r0 = zl2.q4.f473933a
            boolean r0 = r0.C(r14)
            com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment r2 = r13.f358237f
            if (r0 == 0) goto L62
            com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter r0 = r2.f125904u
            if (r0 == 0) goto L7b
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.util.List r2 = r2.f125905v
            r0.g(r14, r1, r2)
            goto L7b
        L62:
            int r0 = r2.f129265p
            r3 = -1
            if (r0 != r3) goto L68
            goto L69
        L68:
            r1 = r0
        L69:
            com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter r0 = r2.f125904u
            if (r0 == 0) goto L7b
            java.util.List r2 = r2.f125905v
            androidx.recyclerview.widget.k3 r3 = r13.f358238g
            android.view.View r3 = r3.itemView
            java.lang.String r4 = "itemView"
            kotlin.jvm.internal.o.f(r3, r4)
            r0.m(r14, r2, r1, r3)
        L7b:
            jz5.f0 r14 = jz5.f0.f302826a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: pt2.a.invoke(java.lang.Object):java.lang.Object");
    }
}
