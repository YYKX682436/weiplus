package com.tencent.mm.plugin.finder.service;

/* loaded from: classes2.dex */
public final class k2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f126101d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f126102e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.service.l2 f126103f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f126104g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f126105h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f126106i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(int i17, java.lang.String str, com.tencent.mm.plugin.finder.service.l2 l2Var, java.lang.String str2, int i18, int i19) {
        super(0);
        this.f126101d = i17;
        this.f126102e = str;
        this.f126103f = l2Var;
        this.f126104g = str2;
        this.f126105h = i18;
        this.f126106i = i19;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0036, code lost:
    
        if (com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(r4, 0).isUrlValid() == false) goto L6;
     */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r13 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "recordPreloadFeed commentScene:"
            r0.<init>(r1)
            int r1 = r13.f126101d
            r0.append(r1)
            r2 = 32
            r0.append(r2)
            java.lang.String r2 = r13.f126102e
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "FinderFeedDetailService"
            com.tencent.mars.xlog.Log.i(r3, r0)
            com.tencent.mm.plugin.finder.service.l2 r0 = r13.f126103f
            com.tencent.mm.sdk.platformtools.c0 r4 = r0.f126113d
            java.lang.Object r4 = r4.b(r2)
            com.tencent.mm.protocal.protobuf.FinderObject r4 = (com.tencent.mm.protocal.protobuf.FinderObject) r4
            if (r4 == 0) goto L38
            com.tencent.mm.plugin.finder.storage.h90 r5 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion
            r6 = 0
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.a(r4, r6)
            boolean r5 = r5.isUrlValid()
            if (r5 != 0) goto L39
        L38:
            r6 = 1
        L39:
            jz5.f0 r5 = jz5.f0.f302826a
            int r7 = r13.f126106i
            if (r6 == 0) goto Lba
            java.lang.Runnable r4 = r0.f126119m
            java.util.concurrent.CopyOnWriteArraySet r6 = r0.f126120n
            java.lang.String r8 = r13.f126104g
            if (r4 == 0) goto L9e
            com.tencent.mm.plugin.finder.service.x1 r4 = new com.tencent.mm.plugin.finder.service.x1
            r4.<init>(r2, r8)
            r6.add(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r9 = "recordPreloadFeed 聚合 commentScene:"
            r4.<init>(r9)
            r4.append(r1)
            java.lang.String r9 = " feedId:"
            r4.append(r9)
            r4.append(r2)
            java.lang.String r9 = " list:"
            r4.append(r9)
            java.util.concurrent.CopyOnWriteArraySet r9 = r0.f126118i
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 10
            int r11 = kz5.d0.q(r9, r11)
            r10.<init>(r11)
            java.util.Iterator r9 = r9.iterator()
        L77:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L92
            java.lang.Object r11 = r9.next()
            java.lang.Long r11 = (java.lang.Long) r11
            kotlin.jvm.internal.o.d(r11)
            long r11 = r11.longValue()
            java.lang.String r11 = pm0.v.u(r11)
            r10.add(r11)
            goto L77
        L92:
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            com.tencent.mars.xlog.Log.i(r3, r4)
            r3 = r5
            goto L9f
        L9e:
            r3 = 0
        L9f:
            if (r3 != 0) goto Lc5
            com.tencent.mm.plugin.finder.service.x1 r3 = new com.tencent.mm.plugin.finder.service.x1
            r3.<init>(r2, r8)
            r6.add(r3)
            com.tencent.mm.plugin.finder.service.j2 r2 = new com.tencent.mm.plugin.finder.service.j2
            int r3 = r13.f126105h
            r2.<init>(r0, r1, r3, r7)
            r0.f126119m = r2
            java.util.regex.Pattern r0 = pm0.v.f356802a
            r0 = 300(0x12c, double:1.48E-321)
            com.tencent.mm.sdk.platformtools.u3.i(r2, r0)
            goto Lc5
        Lba:
            if (r4 == 0) goto Lc5
            java.util.List r2 = kz5.b0.c(r4)
            com.tencent.mm.plugin.finder.service.b2 r0 = r0.f126114e
            r0.a(r1, r2, r7)
        Lc5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.service.k2.invoke():java.lang.Object");
    }
}
