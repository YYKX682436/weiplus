package gg2;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final tc2.g f271664a;

    public b(tc2.g store) {
        kotlin.jvm.internal.o.g(store, "store");
        this.f271664a = store;
    }

    public abstract java.lang.Object a(android.view.View view, kotlin.coroutines.Continuation continuation);

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof gg2.a
            if (r0 == 0) goto L13
            r0 = r8
            gg2.a r0 = (gg2.a) r0
            int r1 = r0.f271663g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f271663g = r1
            goto L18
        L13:
            gg2.a r0 = new gg2.a
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f271661e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f271663g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r0 = r0.f271660d
            android.view.View r0 = (android.view.View) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L62
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            kotlin.ResultKt.throwOnFailure(r8)
            tc2.g r8 = r7.f271664a
            in5.s0 r8 = r8.f417149i
            if (r8 == 0) goto L40
            android.content.Context r8 = r8.f293121e
            goto L41
        L40:
            r8 = r4
        L41:
            if (r8 != 0) goto L44
            return r4
        L44:
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r8)
            int r2 = r7.c()
            r5 = 0
            android.view.View r8 = r8.inflate(r2, r4, r5)
            kotlin.jvm.internal.o.d(r8)
            r0.f271660d = r8
            r0.f271663g = r3
            java.lang.Object r0 = r7.a(r8, r0)
            if (r0 != r1) goto L5f
            return r1
        L5f:
            r6 = r0
            r0 = r8
            r8 = r6
        L62:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L6b
            return r0
        L6b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: gg2.b.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public abstract int c();

    public final java.util.HashMap d() {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        r45.nw1 liveInfo;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f271664a.f417148h;
        return kz5.c1.i(new jz5.l("liveid", java.lang.String.valueOf((baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (finderObject = feedObject.getFinderObject()) == null || (liveInfo = finderObject.getLiveInfo()) == null) ? 0L : liveInfo.getLong(0))), new jz5.l("components_bar_type", java.lang.String.valueOf(e())), new jz5.l("components_bar_txt", f()));
    }

    public abstract int e();

    public abstract java.lang.String f();

    public abstract int g();

    public final r45.kr0 h() {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f271664a.f417148h;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null) ? null : feedObject.getFinderObject();
        if (finderObject != null) {
            return com.tencent.mm.plugin.finder.storage.FinderItem.Companion.d(finderObject);
        }
        return null;
    }

    public abstract java.lang.String i();

    public boolean j(gg2.b other) {
        kotlin.jvm.internal.o.g(other, "other");
        return false;
    }

    public final void k() {
        uc2.g gVar = (uc2.g) this.f271664a.b(uc2.g.class);
        com.tencent.mm.plugin.finder.assist.v3.f102621a.d(gVar != null ? ((sb2.l) gVar).c7() : null, ml2.t1.f327941d3, d());
        com.tencent.mars.xlog.Log.i(i(), "ILiveConvertExpItem report click, type = " + e() + ", wording = " + f());
    }
}
