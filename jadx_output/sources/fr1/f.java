package fr1;

/* loaded from: classes11.dex */
public final class f extends et1.e implements ct1.x {

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f265695m = jz5.h.b(fr1.e.f265694d);

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f265696n = jz5.h.b(fr1.d.f265693d);

    @Override // et1.e, ct1.c
    public boolean b(r45.w3 rawBypMsg) {
        kotlin.jvm.internal.o.g(rawBypMsg, "rawBypMsg");
        com.tencent.mm.autogen.events.BizFansNeedCheckFansNotifyEvent bizFansNeedCheckFansNotifyEvent = new com.tencent.mm.autogen.events.BizFansNeedCheckFansNotifyEvent();
        bizFansNeedCheckFansNotifyEvent.f54002g.f7856a = s(rawBypMsg);
        bizFansNeedCheckFansNotifyEvent.e();
        return super.b(rawBypMsg);
    }

    @Override // ct1.c
    public int h() {
        return 16;
    }

    @Override // ct1.c
    public int i() {
        return 13;
    }

    @Override // ct1.c
    public void l(java.util.List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.w3 w3Var = (r45.w3) it.next();
            if (r26.i0.n(r(w3Var), "@picfansmsg", false)) {
                arrayList.add(w3Var);
            } else {
                arrayList2.add(w3Var);
            }
        }
        if (!arrayList.isEmpty()) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                arrayList3.add(s((r45.w3) it6.next()));
            }
            ((br1.m) ((zq1.u) i95.n0.c(zq1.u.class))).wi(r26.n0.Z(r((r45.w3) arrayList.get(0)), "@picfansmsg"), arrayList3, 5);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(2126L, 7L, arrayList.size());
        }
        if (true ^ arrayList2.isEmpty()) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                arrayList4.add(s((r45.w3) it7.next()));
            }
            ((br1.m) ((zq1.u) i95.n0.c(zq1.u.class))).wi(r26.n0.Z(r((r45.w3) arrayList2.get(0)), "@bizfansmsg"), arrayList4, 0);
        }
        rk.f fVar = (rk.f) ((jz5.n) ((gr1.n) ((rk.g) i95.n0.c(rk.g.class))).f274741d).getValue();
        java.util.Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            ((gr1.k) fVar).b((r45.w3) it8.next(), 5);
        }
        java.util.Iterator it9 = arrayList2.iterator();
        while (it9.hasNext()) {
            ((gr1.k) fVar).b((r45.w3) it9.next(), 0);
        }
    }

    @Override // et1.e
    public java.lang.Object q(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        boolean n17 = r26.i0.n(sessionId, "@picfansmsg", false);
        jz5.g gVar = this.f265695m;
        if (n17) {
            java.lang.Object value = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            return ((hr1.o) value).y0(sessionId);
        }
        java.lang.Object value2 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        return ((hr1.o) value2).y0(sessionId);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x03c2  */
    @Override // et1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean u(r45.w3 r27) {
        /*
            Method dump skipped, instructions count: 973
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fr1.f.u(r45.w3):boolean");
    }

    @Override // et1.e
    public void v(java.lang.Object obj, java.lang.String sessionId) {
        hr1.m session = (hr1.m) obj;
        kotlin.jvm.internal.o.g(session, "session");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        java.lang.String field_sessionId = session.field_sessionId;
        kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
        if (r26.i0.n(field_sessionId, "@picfansmsg", false)) {
            java.lang.Object value = ((jz5.n) this.f265696n).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            ((nr1.k) value).D0(session, 0, hr1.u.f283365d);
        } else {
            java.lang.Object value2 = ((jz5.n) this.f265695m).getValue();
            kotlin.jvm.internal.o.f(value2, "getValue(...)");
            ((hr1.o) value2).z0(session, 0, hr1.u.f283365d);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:2|3)|(9:5|(1:7)|8|9|10|(2:12|(1:14))|16|(1:24)(1:21)|22)|28|(0)|8|9|10|(0)|16|(1:18)|24|22) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        com.tencent.mars.xlog.Log.e("BizFans.BizFansUtil", "parseIsGreetMsg pb parse error: " + r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[Catch: IOException -> 0x0067, TRY_LEAVE, TryCatch #0 {IOException -> 0x0067, blocks: (B:10:0x004f, B:12:0x0053), top: B:9:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003c  */
    @Override // et1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean x(java.lang.Object r9, r45.w3 r10) {
        /*
            r8 = this;
            java.lang.String r0 = "BizFans.BizFansUtil"
            hr1.m r9 = (hr1.m) r9
            java.lang.String r1 = "localSessionInfo"
            kotlin.jvm.internal.o.g(r9, r1)
            java.lang.String r1 = "rawBypMsg"
            kotlin.jvm.internal.o.g(r10, r1)
            r1 = 0
            com.tencent.mm.protobuf.g r2 = r10.f388829g     // Catch: java.io.IOException -> L26
            if (r2 == 0) goto L39
            r45.br r2 = new r45.br     // Catch: java.io.IOException -> L26
            r2.<init>()     // Catch: java.io.IOException -> L26
            com.tencent.mm.protobuf.g r3 = r10.f388829g     // Catch: java.io.IOException -> L26
            byte[] r3 = r3.g()     // Catch: java.io.IOException -> L26
            r2.parseFrom(r3)     // Catch: java.io.IOException -> L26
            boolean r2 = r2.f370999e     // Catch: java.io.IOException -> L26
            goto L3a
        L26:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "pb parse error: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.mars.xlog.Log.e(r0, r2)
        L39:
            r2 = r1
        L3a:
            if (r2 == 0) goto L3e
            r10.f388830h = r1
        L3e:
            java.lang.String r2 = r10.f388827e
            java.lang.String r3 = r8.r(r10)
            java.lang.String r4 = r8.s(r10)
            r9.field_sessionId = r2
            r9.field_talker = r4
            r9.field_senderUserName = r3
            r3 = 1
            com.tencent.mm.protobuf.g r4 = r10.f388829g     // Catch: java.io.IOException -> L67
            if (r4 == 0) goto L7a
            r45.br r4 = new r45.br     // Catch: java.io.IOException -> L67
            r4.<init>()     // Catch: java.io.IOException -> L67
            com.tencent.mm.protobuf.g r10 = r10.f388829g     // Catch: java.io.IOException -> L67
            byte[] r10 = r10.g()     // Catch: java.io.IOException -> L67
            r4.parseFrom(r10)     // Catch: java.io.IOException -> L67
            int r10 = r4.f371002h     // Catch: java.io.IOException -> L67
            if (r10 != r3) goto L7a
            r1 = r3
            goto L7a
        L67:
            r10 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "parseIsGreetMsg pb parse error: "
            r4.<init>(r5)
            r4.append(r10)
            java.lang.String r10 = r4.toString()
            com.tencent.mars.xlog.Log.e(r0, r10)
        L7a:
            long r4 = r9.systemRowid
            r6 = 0
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 < 0) goto Lae
            int r10 = r9.field_isGreetSession
            if (r10 == r3) goto Lae
            if (r1 != r3) goto Lae
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "[updateSession] ignore backend greet flag for existing non-greet session, sessionId="
            r10.<init>(r0)
            r10.append(r2)
            java.lang.String r0 = ", localIsGreet="
            r10.append(r0)
            int r9 = r9.field_isGreetSession
            r10.append(r9)
            java.lang.String r9 = ", backendIsGreet="
            r10.append(r9)
            r10.append(r1)
            java.lang.String r9 = r10.toString()
            java.lang.String r10 = r8.f256567h
            com.tencent.mars.xlog.Log.w(r10, r9)
            goto Lb0
        Lae:
            r9.field_isGreetSession = r1
        Lb0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: fr1.f.x(java.lang.Object, r45.w3):boolean");
    }
}
