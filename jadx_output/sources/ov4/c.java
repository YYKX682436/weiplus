package ov4;

/* loaded from: classes8.dex */
public final class c implements nv4.h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f349191a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f349192b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f349193c;

    /* renamed from: d, reason: collision with root package name */
    public final long f349194d;

    /* renamed from: e, reason: collision with root package name */
    public final ov4.d f349195e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f349196f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f349197g;

    /* renamed from: h, reason: collision with root package name */
    public final int f349198h;

    /* renamed from: i, reason: collision with root package name */
    public final int f349199i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f349200j;

    /* renamed from: k, reason: collision with root package name */
    public final int f349201k;

    /* renamed from: l, reason: collision with root package name */
    public final int f349202l;

    /* renamed from: m, reason: collision with root package name */
    public final int f349203m;

    /* renamed from: n, reason: collision with root package name */
    public final int f349204n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f349205o;

    public c(java.lang.String sessionId, java.lang.String searchId, java.lang.String requestId, long j17, ov4.d actionId, java.lang.String itemInfo, java.lang.String docInfo, int i17, int i18, java.lang.String reason, int i19, int i27, int i28, int i29, java.lang.String extInfo) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(searchId, "searchId");
        kotlin.jvm.internal.o.g(requestId, "requestId");
        kotlin.jvm.internal.o.g(actionId, "actionId");
        kotlin.jvm.internal.o.g(itemInfo, "itemInfo");
        kotlin.jvm.internal.o.g(docInfo, "docInfo");
        kotlin.jvm.internal.o.g(reason, "reason");
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        this.f349191a = sessionId;
        this.f349192b = searchId;
        this.f349193c = requestId;
        this.f349194d = j17;
        this.f349195e = actionId;
        this.f349196f = itemInfo;
        this.f349197g = docInfo;
        this.f349198h = i17;
        this.f349199i = i18;
        this.f349200j = reason;
        this.f349201k = i19;
        this.f349202l = i27;
        this.f349203m = i28;
        this.f349204n = i29;
        this.f349205o = extInfo;
    }

    @Override // nv4.h
    public java.lang.String A() {
        return "25118-" + this.f349191a + ',' + this.f349192b + ',' + this.f349193c + ',' + this.f349195e.f349216d + ',' + this.f349196f + ',' + this.f349198h + ',' + this.f349199i + ',' + this.f349200j + ',' + this.f349201k + ',' + this.f349202l + ',' + this.f349203m + ',' + this.f349204n + ',' + this.f349205o;
    }

    @Override // nv4.h
    public nv4.h B(nv4.h item) {
        kotlin.jvm.internal.o.g(item, "item");
        ov4.c cVar = item instanceof ov4.c ? (ov4.c) item : null;
        if (cVar == null) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("25118 merge ");
        java.lang.String str = this.f349197g;
        sb6.append(str);
        sb6.append(" with ");
        java.lang.String str2 = cVar.f349197g;
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i("FTSReportItem25118", sb6.toString());
        java.lang.String docInfo = str + '#' + str2;
        long j17 = this.f349194d;
        int i17 = this.f349198h;
        int i18 = this.f349199i;
        int i19 = this.f349201k;
        int i27 = this.f349202l;
        int i28 = this.f349203m;
        int i29 = this.f349204n;
        java.lang.String sessionId = this.f349191a;
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        java.lang.String searchId = this.f349192b;
        kotlin.jvm.internal.o.g(searchId, "searchId");
        java.lang.String requestId = this.f349193c;
        kotlin.jvm.internal.o.g(requestId, "requestId");
        ov4.d actionId = this.f349195e;
        kotlin.jvm.internal.o.g(actionId, "actionId");
        java.lang.String itemInfo = this.f349196f;
        kotlin.jvm.internal.o.g(itemInfo, "itemInfo");
        kotlin.jvm.internal.o.g(docInfo, "docInfo");
        java.lang.String reason = this.f349200j;
        kotlin.jvm.internal.o.g(reason, "reason");
        java.lang.String extInfo = this.f349205o;
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        return new ov4.c(sessionId, searchId, requestId, j17, actionId, itemInfo, docInfo, i17, i18, reason, i19, i27, i28, i29, extInfo);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov4.c)) {
            return false;
        }
        ov4.c cVar = (ov4.c) obj;
        return kotlin.jvm.internal.o.b(this.f349191a, cVar.f349191a) && kotlin.jvm.internal.o.b(this.f349192b, cVar.f349192b) && kotlin.jvm.internal.o.b(this.f349193c, cVar.f349193c) && this.f349194d == cVar.f349194d && this.f349195e == cVar.f349195e && kotlin.jvm.internal.o.b(this.f349196f, cVar.f349196f) && kotlin.jvm.internal.o.b(this.f349197g, cVar.f349197g) && this.f349198h == cVar.f349198h && this.f349199i == cVar.f349199i && kotlin.jvm.internal.o.b(this.f349200j, cVar.f349200j) && this.f349201k == cVar.f349201k && this.f349202l == cVar.f349202l && this.f349203m == cVar.f349203m && this.f349204n == cVar.f349204n && kotlin.jvm.internal.o.b(this.f349205o, cVar.f349205o);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.f349191a.hashCode() * 31) + this.f349192b.hashCode()) * 31) + this.f349193c.hashCode()) * 31) + java.lang.Long.hashCode(this.f349194d)) * 31) + this.f349195e.hashCode()) * 31) + this.f349196f.hashCode()) * 31) + this.f349197g.hashCode()) * 31) + java.lang.Integer.hashCode(this.f349198h)) * 31) + java.lang.Integer.hashCode(this.f349199i)) * 31) + this.f349200j.hashCode()) * 31) + java.lang.Integer.hashCode(this.f349201k)) * 31) + java.lang.Integer.hashCode(this.f349202l)) * 31) + java.lang.Integer.hashCode(this.f349203m)) * 31) + java.lang.Integer.hashCode(this.f349204n)) * 31) + this.f349205o.hashCode();
    }

    public java.lang.String toString() {
        return "FTSReportItem25118(sessionId=" + this.f349191a + ", searchId=" + this.f349192b + ", requestId=" + this.f349193c + ", timestampMs=" + this.f349194d + ", actionId=" + this.f349195e + ", itemInfo=" + this.f349196f + ", docInfo=" + this.f349197g + ", isDisplay=" + this.f349198h + ", isWebViewRealShow=" + this.f349199i + ", reason=" + this.f349200j + ", h5Version=" + this.f349201k + ", scene=" + this.f349202l + ", actionType=" + this.f349203m + ", businessType=" + this.f349204n + ", extInfo=" + this.f349205o + ')';
    }

    @Override // nv4.h
    public void z() {
        java.lang.String str = this.f349192b;
        boolean z17 = str.length() == 0;
        java.lang.String str2 = this.f349193c;
        if (z17) {
            str = str2;
        }
        jx3.f.INSTANCE.kvStat(25118, this.f349191a + ',' + str + ',' + str2 + ',' + this.f349194d + ',' + this.f349195e.f349216d + ',' + this.f349196f + ',' + this.f349197g + ',' + this.f349198h + ',' + this.f349199i + ',' + this.f349200j + ',' + this.f349201k + ',' + this.f349202l + ',' + this.f349203m + ',' + this.f349204n + ',' + fp.s0.b(this.f349205o, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(java.lang.String r21, java.lang.String r22, java.lang.String r23, long r24, ov4.d r26, java.lang.String r27, java.lang.String r28, int r29, int r30, java.lang.String r31, int r32, int r33, int r34, int r35, java.lang.String r36, int r37, kotlin.jvm.internal.i r38) {
        /*
            r20 = this;
            r0 = r37
            r1 = r0 & 2
            java.lang.String r2 = ""
            if (r1 == 0) goto La
            r5 = r2
            goto Lc
        La:
            r5 = r22
        Lc:
            r1 = r0 & 8
            if (r1 == 0) goto L18
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.f192989a
            long r3 = java.lang.System.currentTimeMillis()
            r7 = r3
            goto L1a
        L18:
            r7 = r24
        L1a:
            r1 = r0 & 128(0x80, float:1.8E-43)
            r3 = 1
            if (r1 == 0) goto L21
            r12 = r3
            goto L23
        L21:
            r12 = r29
        L23:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L29
            r13 = r3
            goto L2b
        L29:
            r13 = r30
        L2b:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L31
            r14 = r2
            goto L33
        L31:
            r14 = r31
        L33:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L3a
            r1 = 2
            r15 = r1
            goto L3c
        L3a:
            r15 = r32
        L3c:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L44
            r1 = 0
            r17 = r1
            goto L46
        L44:
            r17 = r34
        L46:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L4d
            r19 = r2
            goto L4f
        L4d:
            r19 = r36
        L4f:
            r3 = r20
            r4 = r21
            r6 = r23
            r9 = r26
            r10 = r27
            r11 = r28
            r16 = r33
            r18 = r35
            r3.<init>(r4, r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ov4.c.<init>(java.lang.String, java.lang.String, java.lang.String, long, ov4.d, java.lang.String, java.lang.String, int, int, java.lang.String, int, int, int, int, java.lang.String, int, kotlin.jvm.internal.i):void");
    }
}
