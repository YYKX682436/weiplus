package com.tencent.mm.plugin.websearch;

/* loaded from: classes10.dex */
public final class w0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.FlutterSearchFinderLivePlayerPlugin f181695a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f181696b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mn0.b0 f181697c;

    public w0(com.tencent.mm.plugin.websearch.FlutterSearchFinderLivePlayerPlugin flutterSearchFinderLivePlayerPlugin, long j17, mn0.b0 b0Var) {
        this.f181695a = flutterSearchFinderLivePlayerPlugin;
        this.f181696b = j17;
        this.f181697c = b0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        if (kotlin.jvm.internal.o.b(((java.util.concurrent.ConcurrentHashMap) r5).get(java.lang.Long.valueOf(r3)), java.lang.Boolean.TRUE) == false) goto L13;
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
            if (r2 != 0) goto L94
            int r2 = r9.f70616b
            if (r2 != 0) goto L94
            if (r0 == 0) goto L94
            r45.nw1 r0 = r0.getLiveInfo()
            if (r0 == 0) goto L94
            com.tencent.mm.plugin.websearch.FlutterSearchFinderLivePlayerPlugin r0 = r8.f181695a
            java.util.Map r2 = r0.f181410n
            long r3 = r8.f181696b
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2
            boolean r2 = r2.containsKey(r5)
            java.util.Map r5 = r0.f181410n
            if (r2 == 0) goto L44
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            r6 = r5
            java.util.concurrent.ConcurrentHashMap r6 = (java.util.concurrent.ConcurrentHashMap) r6
            java.lang.Object r2 = r6.get(r2)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r2 = kotlin.jvm.internal.o.b(r2, r6)
            if (r2 != 0) goto L94
        L44:
            java.util.Set r2 = r0.f181411o
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
            r7 = r2
            java.util.HashSet r7 = (java.util.HashSet) r7
            boolean r6 = r7.contains(r6)
            if (r6 != 0) goto L68
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = "try start play after stop or destroy has been called, playerId: "
            r9.<init>(r1)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = r0.f181403d
            com.tencent.mars.xlog.Log.w(r0, r9)
            goto L94
        L68:
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.util.HashSet r2 = (java.util.HashSet) r2
            r2.remove(r0)
            com.tencent.mm.protobuf.f r9 = r9.f70618d
            r45.h51 r9 = (r45.h51) r9
            com.tencent.mm.protobuf.f r9 = r9.getCustom(r1)
            com.tencent.mm.protocal.protobuf.FinderObject r9 = (com.tencent.mm.protocal.protobuf.FinderObject) r9
            if (r9 == 0) goto L94
            r45.nw1 r9 = r9.getLiveInfo()
            if (r9 == 0) goto L94
            mn0.b0 r0 = r8.f181697c
            r2 = 0
            mn0.b0.L(r0, r9, r2, r1, r2)
            java.lang.Long r9 = java.lang.Long.valueOf(r3)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.util.concurrent.ConcurrentHashMap r5 = (java.util.concurrent.ConcurrentHashMap) r5
            r5.put(r9, r0)
        L94:
            jz5.f0 r9 = jz5.f0.f302826a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.websearch.w0.call(java.lang.Object):java.lang.Object");
    }
}
