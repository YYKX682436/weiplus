package ov4;

/* loaded from: classes8.dex */
public final class e implements nv4.h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f349217a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f349218b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f349219c;

    /* renamed from: d, reason: collision with root package name */
    public final int f349220d;

    /* renamed from: e, reason: collision with root package name */
    public final int f349221e;

    /* renamed from: f, reason: collision with root package name */
    public final ov4.f f349222f;

    /* renamed from: g, reason: collision with root package name */
    public final long f349223g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f349224h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f349225i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f349226j;

    /* renamed from: k, reason: collision with root package name */
    public final int f349227k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f349228l;

    /* renamed from: m, reason: collision with root package name */
    public final int f349229m;

    public e(java.lang.String sessionId, java.lang.String searchId, java.lang.String requestId, int i17, int i18, ov4.f actionId, long j17, java.lang.String featureInfo, java.lang.String itemInfo, java.lang.String docInfo, int i19, java.lang.String parentSearchID, int i27) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(searchId, "searchId");
        kotlin.jvm.internal.o.g(requestId, "requestId");
        kotlin.jvm.internal.o.g(actionId, "actionId");
        kotlin.jvm.internal.o.g(featureInfo, "featureInfo");
        kotlin.jvm.internal.o.g(itemInfo, "itemInfo");
        kotlin.jvm.internal.o.g(docInfo, "docInfo");
        kotlin.jvm.internal.o.g(parentSearchID, "parentSearchID");
        this.f349217a = sessionId;
        this.f349218b = searchId;
        this.f349219c = requestId;
        this.f349220d = i17;
        this.f349221e = i18;
        this.f349222f = actionId;
        this.f349223g = j17;
        this.f349224h = featureInfo;
        this.f349225i = itemInfo;
        this.f349226j = docInfo;
        this.f349227k = i19;
        this.f349228l = parentSearchID;
        this.f349229m = i27;
    }

    @Override // nv4.h
    public java.lang.String A() {
        return "25147-" + this.f349217a + ',' + this.f349218b + ',' + this.f349219c + ',' + this.f349220d + ',' + this.f349221e + ',' + this.f349222f.f349234d + ',' + this.f349224h + ',' + this.f349225i + ',' + this.f349227k + ',' + this.f349228l + ',' + this.f349229m;
    }

    @Override // nv4.h
    public nv4.h B(nv4.h item) {
        kotlin.jvm.internal.o.g(item, "item");
        ov4.e eVar = item instanceof ov4.e ? (ov4.e) item : null;
        if (eVar == null) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("25147 merge ");
        java.lang.String str = this.f349226j;
        sb6.append(str);
        sb6.append(" with ");
        java.lang.String str2 = eVar.f349226j;
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i("FTSReportItem25147", sb6.toString());
        java.lang.String docInfo = str + '#' + str2;
        int i17 = this.f349220d;
        int i18 = this.f349221e;
        long j17 = this.f349223g;
        int i19 = this.f349227k;
        int i27 = this.f349229m;
        java.lang.String sessionId = this.f349217a;
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        java.lang.String searchId = this.f349218b;
        kotlin.jvm.internal.o.g(searchId, "searchId");
        java.lang.String requestId = this.f349219c;
        kotlin.jvm.internal.o.g(requestId, "requestId");
        ov4.f actionId = this.f349222f;
        kotlin.jvm.internal.o.g(actionId, "actionId");
        java.lang.String featureInfo = this.f349224h;
        kotlin.jvm.internal.o.g(featureInfo, "featureInfo");
        java.lang.String itemInfo = this.f349225i;
        kotlin.jvm.internal.o.g(itemInfo, "itemInfo");
        kotlin.jvm.internal.o.g(docInfo, "docInfo");
        java.lang.String parentSearchID = this.f349228l;
        kotlin.jvm.internal.o.g(parentSearchID, "parentSearchID");
        return new ov4.e(sessionId, searchId, requestId, i17, i18, actionId, j17, featureInfo, itemInfo, docInfo, i19, parentSearchID, i27);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov4.e)) {
            return false;
        }
        ov4.e eVar = (ov4.e) obj;
        return kotlin.jvm.internal.o.b(this.f349217a, eVar.f349217a) && kotlin.jvm.internal.o.b(this.f349218b, eVar.f349218b) && kotlin.jvm.internal.o.b(this.f349219c, eVar.f349219c) && this.f349220d == eVar.f349220d && this.f349221e == eVar.f349221e && this.f349222f == eVar.f349222f && this.f349223g == eVar.f349223g && kotlin.jvm.internal.o.b(this.f349224h, eVar.f349224h) && kotlin.jvm.internal.o.b(this.f349225i, eVar.f349225i) && kotlin.jvm.internal.o.b(this.f349226j, eVar.f349226j) && this.f349227k == eVar.f349227k && kotlin.jvm.internal.o.b(this.f349228l, eVar.f349228l) && this.f349229m == eVar.f349229m;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.f349217a.hashCode() * 31) + this.f349218b.hashCode()) * 31) + this.f349219c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f349220d)) * 31) + java.lang.Integer.hashCode(this.f349221e)) * 31) + this.f349222f.hashCode()) * 31) + java.lang.Long.hashCode(this.f349223g)) * 31) + this.f349224h.hashCode()) * 31) + this.f349225i.hashCode()) * 31) + this.f349226j.hashCode()) * 31) + java.lang.Integer.hashCode(this.f349227k)) * 31) + this.f349228l.hashCode()) * 31) + java.lang.Integer.hashCode(this.f349229m);
    }

    public java.lang.String toString() {
        return "FTSReportItem25147(sessionId=" + this.f349217a + ", searchId=" + this.f349218b + ", requestId=" + this.f349219c + ", sceneType=" + this.f349220d + ", scene=" + this.f349221e + ", actionId=" + this.f349222f + ", clientTimestamp=" + this.f349223g + ", featureInfo=" + this.f349224h + ", itemInfo=" + this.f349225i + ", docInfo=" + this.f349226j + ", reqBusinessType=" + this.f349227k + ", parentSearchID=" + this.f349228l + ", h5Version=" + this.f349229m + ')';
    }

    @Override // nv4.h
    public void z() {
        java.lang.String str = this.f349218b;
        boolean z17 = str.length() == 0;
        java.lang.String str2 = this.f349219c;
        if (z17) {
            str = str2;
        }
        jx3.f.INSTANCE.kvStat(25147, this.f349217a + ',' + str + ',' + str2 + ',' + this.f349220d + ',' + this.f349221e + ',' + this.f349222f.f349234d + ',' + this.f349223g + ',' + this.f349224h + ',' + this.f349225i + ',' + this.f349226j + ',' + this.f349227k + ',' + this.f349228l + ',' + this.f349229m);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, int r23, ov4.f r24, long r25, java.lang.String r27, java.lang.String r28, java.lang.String r29, int r30, java.lang.String r31, int r32, int r33, kotlin.jvm.internal.i r34) {
        /*
            r18 = this;
            r0 = r33
            r1 = r0 & 2
            java.lang.String r2 = ""
            if (r1 == 0) goto La
            r5 = r2
            goto Lc
        La:
            r5 = r20
        Lc:
            r1 = r0 & 4
            if (r1 == 0) goto L12
            r6 = r2
            goto L14
        L12:
            r6 = r21
        L14:
            r1 = r0 & 8
            if (r1 == 0) goto L1b
            r1 = 1
            r7 = r1
            goto L1d
        L1b:
            r7 = r22
        L1d:
            r1 = r0 & 64
            if (r1 == 0) goto L29
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.f192989a
            long r3 = java.lang.System.currentTimeMillis()
            r10 = r3
            goto L2b
        L29:
            r10 = r25
        L2b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L31
            r13 = r2
            goto L33
        L31:
            r13 = r28
        L33:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L39
            r14 = r2
            goto L3b
        L39:
            r14 = r29
        L3b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L42
            r1 = 0
            r15 = r1
            goto L44
        L42:
            r15 = r30
        L44:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L4b
            r16 = r2
            goto L4d
        L4b:
            r16 = r31
        L4d:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L55
            r0 = 2
            r17 = r0
            goto L57
        L55:
            r17 = r32
        L57:
            r3 = r18
            r4 = r19
            r8 = r23
            r9 = r24
            r12 = r27
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ov4.e.<init>(java.lang.String, java.lang.String, java.lang.String, int, int, ov4.f, long, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, int, kotlin.jvm.internal.i):void");
    }
}
