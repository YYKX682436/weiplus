package df2;

/* loaded from: classes3.dex */
public final class rm extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.cn f231255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f231256e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.wg7 f231257f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f231258g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm(df2.cn cnVar, boolean z17, r45.wg7 wg7Var, boolean z18) {
        super(0);
        this.f231255d = cnVar;
        this.f231256e = z17;
        this.f231257f = wg7Var;
        this.f231258g = z18;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x008f, code lost:
    
        if (r8.u7(r1, r2 != null ? java.lang.Integer.valueOf(r2.getInteger(2)) : null) != false) goto L21;
     */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r15 = this;
            sh2.g r0 = sh2.g.f408020e
            java.lang.Class<mm2.e1> r1 = mm2.e1.class
            df2.cn r8 = r15.f231255d
            androidx.lifecycle.c1 r1 = r8.business(r1)
            mm2.e1 r1 = (mm2.e1) r1
            r45.nw1 r1 = r1.f328988r
            r2 = 0
            long r3 = r1.getLong(r2)
            boolean r12 = r15.f231256e
            r45.wg7 r1 = r15.f231257f
            int r13 = r1.f389153d
            sh2.d r14 = r8.F
            r0.getClass()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "dolike "
            r5.<init>(r6)
            r5.append(r3)
            r6 = 32
            r5.append(r6)
            r5.append(r12)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "Finder.FinderLiveLikeActionMgr"
            com.tencent.mars.xlog.Log.i(r6, r5)
            sh2.c r5 = new sh2.c
            r9 = r5
            r10 = r3
            r9.<init>(r10, r12, r13, r14)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.util.concurrent.ConcurrentHashMap r4 = r0.f408023c
            r4.put(r3, r5)
            sh2.j r3 = new sh2.j
            r3.<init>(r5)
            sh2.e r4 = new sh2.e
            r4.<init>(r0, r5)
            fp0.o r0 = r0.f408021a
            r0.b(r3, r4)
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData r0 = r8.f229897u
            r3 = 0
            boolean r4 = r15.f231256e
            if (r4 == 0) goto L9b
            gm0.b0 r4 = gm0.j1.u()
            com.tencent.mm.storage.n3 r4 = r4.c()
            com.tencent.mm.storage.u3 r5 = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_SHOW_LIKE_RECOMMEND_ROLE_BOOLEAN_SYNC
            boolean r2 = r4.o(r5, r2)
            java.lang.String r4 = r8.f229892p
            java.lang.String r5 = "[likeOrCancel] "
            com.tencent.mars.xlog.Log.i(r4, r5)
            if (r2 != 0) goto L92
            androidx.lifecycle.j0 r2 = r8.f229899w
            java.lang.Object r2 = r2.getValue()
            r45.i62 r2 = (r45.i62) r2
            if (r2 == 0) goto L8a
            r4 = 2
            int r2 = r2.getInteger(r4)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L8b
        L8a:
            r2 = r3
        L8b:
            boolean r1 = r8.u7(r1, r2)
            if (r1 == 0) goto L92
            goto Lda
        L92:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.postValue(r1)
            df2.cn.m7(r8)
            goto Lbf
        L9b:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.postValue(r1)
            boolean r0 = r15.f231258g
            if (r0 == 0) goto Lbf
            android.content.Context r0 = r8.O6()
            int r1 = com.tencent.mm.ui.widget.dialog.f4.f211790n
            com.tencent.mm.ui.widget.dialog.e4 r1 = new com.tencent.mm.ui.widget.dialog.e4
            r1.<init>(r0)
            android.content.Context r0 = r8.O6()
            r2 = 2131764137(0x7f1023a9, float:1.9159399E38)
            java.lang.String r0 = r0.getString(r2)
            r1.f211776c = r0
            r1.c()
        Lbf:
            kotlinx.coroutines.r2 r0 = r8.f229901y
            if (r0 == 0) goto Lc7
            r1 = 1
            kotlinx.coroutines.p2.a(r0, r3, r1, r3)
        Lc7:
            r0 = 0
            r4 = 0
            df2.qm r5 = new df2.qm
            java.lang.String r1 = "likeOrCancel"
            r5.<init>(r8, r1, r3)
            r6 = 3
            r7 = 0
            r2 = r8
            r3 = r0
            kotlinx.coroutines.r2 r0 = com.tencent.mm.plugin.finder.live.util.y.o(r2, r3, r4, r5, r6, r7)
            r8.f229901y = r0
        Lda:
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.rm.invoke():java.lang.Object");
    }
}
