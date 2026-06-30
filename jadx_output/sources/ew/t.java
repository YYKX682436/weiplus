package ew;

/* loaded from: classes10.dex */
public final class t implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandecs.flutter.FlutterBrsFinderLivePlayerPlugin f257001a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f257002b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.biz_base.FinderLivePlayInfo f257003c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn0.b0 f257004d;

    public t(com.tencent.mm.feature.brandecs.flutter.FlutterBrsFinderLivePlayerPlugin flutterBrsFinderLivePlayerPlugin, long j17, com.tencent.pigeon.biz_base.FinderLivePlayInfo finderLivePlayInfo, mn0.b0 b0Var) {
        this.f257001a = flutterBrsFinderLivePlayerPlugin;
        this.f257002b = j17;
        this.f257003c = finderLivePlayInfo;
        this.f257004d = b0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        if (kotlin.jvm.internal.o.b(((java.util.concurrent.ConcurrentHashMap) r6).get(java.lang.Long.valueOf(r4)), java.lang.Boolean.TRUE) == false) goto L13;
     */
    @Override // gm5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object call(java.lang.Object r9) {
        /*
            r8 = this;
            com.tencent.mm.modelbase.f r9 = (com.tencent.mm.modelbase.f) r9
            com.tencent.mm.protobuf.f r0 = r9.f70618d
            r45.h51 r0 = (r45.h51) r0
            r1 = 2
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r1)
            com.tencent.mm.protocal.protobuf.FinderObject r0 = (com.tencent.mm.protocal.protobuf.FinderObject) r0
            int r2 = r9.f70615a
            if (r2 != 0) goto Lc2
            int r2 = r9.f70616b
            if (r2 != 0) goto Lc2
            if (r0 == 0) goto Lc2
            r45.nw1 r2 = r0.getLiveInfo()
            if (r2 == 0) goto Lc2
            com.tencent.mm.feature.brandecs.flutter.FlutterBrsFinderLivePlayerPlugin r2 = r8.f257001a
            java.util.Map r3 = r2.f65223n
            long r4 = r8.f257002b
            java.lang.Long r6 = java.lang.Long.valueOf(r4)
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
            boolean r3 = r3.containsKey(r6)
            java.util.Map r6 = r2.f65223n
            if (r3 == 0) goto L44
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            r7 = r6
            java.util.concurrent.ConcurrentHashMap r7 = (java.util.concurrent.ConcurrentHashMap) r7
            java.lang.Object r3 = r7.get(r3)
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            boolean r3 = kotlin.jvm.internal.o.b(r3, r7)
            if (r3 != 0) goto Lc2
        L44:
            java.util.Set r3 = r2.f65224o
            java.lang.Long r7 = java.lang.Long.valueOf(r4)
            java.util.HashSet r3 = (java.util.HashSet) r3
            boolean r7 = r3.contains(r7)
            if (r7 != 0) goto L67
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "try start play after stop or destroy has been called, playerId: "
            r9.<init>(r0)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = r2.f65216d
            com.tencent.mars.xlog.Log.w(r0, r9)
            goto Lc2
        L67:
            java.lang.Long r7 = java.lang.Long.valueOf(r4)
            r3.remove(r7)
            com.tencent.mm.protobuf.f r9 = r9.f70618d
            r45.h51 r9 = (r45.h51) r9
            com.tencent.mm.protobuf.f r9 = r9.getCustom(r1)
            com.tencent.mm.protocal.protobuf.FinderObject r9 = (com.tencent.mm.protocal.protobuf.FinderObject) r9
            if (r9 == 0) goto La1
            r45.nw1 r9 = r9.getLiveInfo()
            if (r9 == 0) goto La1
            r45.p72 r1 = new r45.p72
            r1.<init>()
            bw5.os0 r2 = r2.f65226q
            java.lang.String r2 = r2.toString()
            r3 = 0
            r1.set(r3, r2)
            mn0.b0 r2 = r8.f257004d
            mn0.y r2 = (mn0.y) r2
            r2.S(r9, r1)
            java.lang.Long r9 = java.lang.Long.valueOf(r4)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.util.concurrent.ConcurrentHashMap r6 = (java.util.concurrent.ConcurrentHashMap) r6
            r6.put(r9, r1)
        La1:
            com.tencent.pigeon.biz_base.FinderLivePlayInfo r9 = r8.f257003c
            java.lang.String r9 = r9.getFinder_export_id()
            java.lang.String r1 = ""
            if (r9 != 0) goto Lac
            r9 = r1
        Lac:
            boolean r1 = kotlin.jvm.internal.o.b(r9, r1)
            if (r1 != 0) goto Lc2
            java.lang.Class<vw.r> r1 = vw.r.class
            i95.m r1 = i95.n0.c(r1)
            vw.r r1 = (vw.r) r1
            r1.getClass()
            java.util.concurrent.ConcurrentHashMap r1 = r1.f440723d
            r1.put(r9, r0)
        Lc2:
            jz5.f0 r9 = jz5.f0.f302826a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ew.t.call(java.lang.Object):java.lang.Object");
    }
}
