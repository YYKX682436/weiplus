package y92;

/* loaded from: classes2.dex */
public final class b extends az2.j {

    /* renamed from: u, reason: collision with root package name */
    public static final y92.a f460331u = new y92.a(null);

    /* renamed from: t, reason: collision with root package name */
    public final r45.la1 f460332t;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(int r8, java.lang.String r9, java.lang.Long r10, r45.a34 r11, int r12, kotlin.jvm.internal.i r13) {
        /*
            r7 = this;
            r13 = r12 & 4
            r0 = 0
            if (r13 == 0) goto L6
            r10 = r0
        L6:
            r12 = r12 & 8
            if (r12 == 0) goto Lc
            r6 = r0
            goto Ld
        Lc:
            r6 = r11
        Ld:
            java.lang.String r11 = "topicName"
            kotlin.jvm.internal.o.g(r9, r11)
            r11 = 3
            r7.<init>(r0, r0, r11, r0)
            r45.la1 r11 = new r45.la1
            r11.<init>()
            r7.f460332t = r11
            r2 = 0
            r4 = 0
            r1 = r7
            r5 = r10
            r1.B(r2, r4, r5, r6)
            r12 = 4
            r11.set(r12, r9)
            r12 = 5
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r11.set(r12, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r12 = "topicName: "
            r8.<init>(r12)
            r8.append(r9)
            java.lang.String r9 = ", refObjectId: "
            r8.append(r9)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "Cgi.FinderGetTopicInfoCgi"
            com.tencent.mars.xlog.Log.i(r9, r8)
            y92.a r8 = y92.b.f460331u
            com.tencent.mm.modelbase.o r8 = r8.a(r11)
            r7.p(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y92.b.<init>(int, java.lang.String, java.lang.Long, r45.a34, int, kotlin.jvm.internal.i):void");
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.ma1 resp = (r45.ma1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Cgi.FinderGetTopicInfoCgi", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        if (com.tencent.mars.xlog.Log.isDebug()) {
            com.tencent.mars.xlog.Log.i("Cgi.FinderGetTopicInfoCgi", "onCgiEnd resp:" + resp.toJSON());
        }
    }

    public final void B(long j17, java.lang.String str, java.lang.Long l17, r45.a34 a34Var) {
        db2.t4 t4Var = db2.t4.f228171a;
        r45.kv0 a17 = t4Var.a(6277);
        r45.la1 la1Var = this.f460332t;
        la1Var.set(1, a17);
        la1Var.set(2, java.lang.Long.valueOf(j17));
        la1Var.set(3, str);
        la1Var.set(6, java.lang.Long.valueOf(l17 != null ? l17.longValue() : 0L));
        t4Var.k((r45.kv0) la1Var.getCustom(1), a34Var);
    }

    @Override // az2.j, ay1.m
    /* renamed from: x */
    public java.lang.String getKey() {
        u92.a aVar = u92.b.f425822e;
        r45.la1 la1Var = this.f460332t;
        return aVar.b(la1Var.getLong(2), la1Var.getString(3), la1Var.getString(4));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(long r8, java.lang.String r10, java.lang.Long r11, int r12, r45.a34 r13, int r14, kotlin.jvm.internal.i r15) {
        /*
            r7 = this;
            r15 = r14 & 4
            r0 = 0
            if (r15 == 0) goto L6
            r11 = r0
        L6:
            r14 = r14 & 16
            if (r14 == 0) goto Lc
            r6 = r0
            goto Ld
        Lc:
            r6 = r13
        Ld:
            java.lang.String r13 = "encryptedTopicEventId"
            kotlin.jvm.internal.o.g(r10, r13)
            r13 = 3
            r7.<init>(r0, r0, r13, r0)
            r45.la1 r13 = new r45.la1
            r13.<init>()
            r7.f460332t = r13
            r1 = r7
            r2 = r8
            r4 = r10
            r5 = r11
            r1.B(r2, r4, r5, r6)
            r10 = 9
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            r13.set(r10, r14)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r14 = "topicId: "
            r10.<init>(r14)
            r10.append(r8)
            java.lang.String r8 = ", refObjectId: "
            r10.append(r8)
            r10.append(r11)
            java.lang.String r8 = ", topicInfoFlag: "
            r10.append(r8)
            r10.append(r12)
            java.lang.String r8 = r10.toString()
            java.lang.String r9 = "Cgi.FinderGetTopicInfoCgi"
            com.tencent.mars.xlog.Log.i(r9, r8)
            y92.a r8 = y92.b.f460331u
            com.tencent.mm.modelbase.o r8 = r8.a(r13)
            r7.p(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y92.b.<init>(long, java.lang.String, java.lang.Long, int, r45.a34, int, kotlin.jvm.internal.i):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(long r9, java.lang.String r11, java.lang.Long r12, com.tencent.mm.protobuf.g r13, java.lang.Integer r14, r45.a34 r15, int r16, kotlin.jvm.internal.i r17) {
        /*
            r8 = this;
            r0 = r8
            r1 = r16 & 4
            r2 = 0
            if (r1 == 0) goto L8
            r1 = r2
            goto L9
        L8:
            r1 = r12
        L9:
            r3 = r16 & 8
            if (r3 == 0) goto Lf
            r3 = r2
            goto L10
        Lf:
            r3 = r13
        L10:
            r4 = r16 & 16
            if (r4 == 0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = r14
        L17:
            r5 = r16 & 32
            if (r5 == 0) goto L1d
            r5 = r2
            goto L1e
        L1d:
            r5 = r15
        L1e:
            java.lang.String r6 = "encryptedTopicEventId"
            r7 = r11
            kotlin.jvm.internal.o.g(r11, r6)
            r6 = 3
            r8.<init>(r2, r2, r6, r2)
            r45.la1 r2 = new r45.la1
            r2.<init>()
            r0.f460332t = r2
            r12 = r8
            r13 = r9
            r15 = r11
            r16 = r1
            r17 = r5
            r12.B(r13, r15, r16, r17)
            r5 = 8
            r2.set(r5, r3)
            if (r4 == 0) goto L45
            int r3 = r4.intValue()
            goto L46
        L45:
            r3 = 0
        L46:
            r5 = 9
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.set(r5, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "topicId: "
            r3.<init>(r5)
            r5 = r9
            r3.append(r9)
            java.lang.String r5 = ", refObjectId: "
            r3.append(r5)
            r3.append(r1)
            java.lang.String r1 = ", topicInfoFlag: "
            r3.append(r1)
            r3.append(r4)
            java.lang.String r1 = r3.toString()
            java.lang.String r3 = "Cgi.FinderGetTopicInfoCgi"
            com.tencent.mars.xlog.Log.i(r3, r1)
            y92.a r1 = y92.b.f460331u
            com.tencent.mm.modelbase.o r1 = r1.a(r2)
            r8.p(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y92.b.<init>(long, java.lang.String, java.lang.Long, com.tencent.mm.protobuf.g, java.lang.Integer, r45.a34, int, kotlin.jvm.internal.i):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(long j17, java.lang.String encryptedTopicEventId, java.lang.Long l17, r45.a34 a34Var) {
        super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        kotlin.jvm.internal.o.g(encryptedTopicEventId, "encryptedTopicEventId");
        r45.la1 la1Var = new r45.la1();
        this.f460332t = la1Var;
        B(j17, encryptedTopicEventId, l17, a34Var);
        com.tencent.mars.xlog.Log.i("Cgi.FinderGetTopicInfoCgi", "topicId: " + j17 + ", refObjectId: " + l17);
        p(f460331u.a(la1Var));
    }
}
