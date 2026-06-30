package dt1;

/* loaded from: classes12.dex */
public final class g extends dt1.a {

    /* renamed from: i, reason: collision with root package name */
    public final wf0.h1 f243154i;

    static {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(int r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, wf0.h1 r10) {
        /*
            r5 = this;
            java.lang.String r0 = "session_id"
            kotlin.jvm.internal.o.g(r7, r0)
            java.lang.String r0 = "from_username"
            kotlin.jvm.internal.o.g(r8, r0)
            java.lang.String r0 = "to_username"
            kotlin.jvm.internal.o.g(r9, r0)
            java.lang.String r0 = "fakeScene"
            kotlin.jvm.internal.o.g(r10, r0)
            r45.fr r0 = new r45.fr
            r0.<init>()
            r45.lr r1 = new r45.lr
            r1.<init>()
            r0.f374564p = r1
            r0.f374561m = r7
            r0.f374556e = r8
            r0.f374557f = r9
            r8 = 43
            r0.f374555d = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = c01.z1.r()
            java.lang.String r9 = com.tencent.mm.sdk.platformtools.w2.a(r9)
            r8.append(r9)
            r8.append(r7)
            r7 = r10
            t21.q1 r7 = (t21.q1) r7
            java.lang.String r7 = r7.f414886f
            r8.append(r7)
            r7 = 95
            r8.append(r7)
            long r1 = c01.id.c()
            r7 = 1000(0x3e8, float:1.401E-42)
            long r3 = (long) r7
            long r1 = r1 / r3
            r8.append(r1)
            java.lang.String r7 = r8.toString()
            r0.f374558g = r7
            r5.<init>(r6, r0)
            r5.f243154i = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dt1.g.<init>(int, java.lang.String, java.lang.String, java.lang.String, wf0.h1):void");
    }

    @Override // dt1.a, com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        wf0.h1 h1Var = this.f243154i;
        java.lang.String str = ((t21.q1) h1Var).f414886f;
        ((vf0.y1) x1Var).getClass();
        t21.v2 h17 = t21.d3.h(str);
        if (h17 == null) {
            com.tencent.mars.xlog.Log.e("Byp.CgiBypSendVideo", "null == info %s", ((t21.q1) h1Var).f414886f);
            ((t21.q1) h1Var).f414893p.a(3, -1, 0L, "");
            return -1;
        }
        r45.xu6 H = ((t21.q1) h1Var).H(h17, u0Var);
        java.lang.String str2 = H.f390453t;
        r45.fr frVar = this.f243125d;
        frVar.f374559h = str2;
        r45.lr lrVar = frVar.f374564p;
        lrVar.f379765d = H.f390455v;
        lrVar.f379766e = H.f390454u;
        lrVar.f379767f = 43;
        lrVar.f379768g = H.f390444m;
        lrVar.f379769h = H.f390447p;
        lrVar.f379770i = H.B;
        lrVar.f379771m = H.f390457x;
        lrVar.f379772n = H.f390460y;
        lrVar.f379773o = H.A;
        lrVar.f379774p = H.f390463z;
        lrVar.f379775q = H.E;
        lrVar.f379777s = H.Q;
        dn.h hVar = ((t21.q1) h1Var).f414891n;
        lrVar.f379776r = java.lang.String.valueOf(hVar != null ? java.lang.Integer.valueOf(hVar.field_videoFormat) : null);
        com.tencent.mars.xlog.Log.i("Byp.CgiBypSendVideo", "[doScene] " + lrVar.f379773o + ':' + lrVar.f379774p + ", " + ((t21.q1) h1Var).f414886f);
        return dispatch(sVar, this.f243126e, this);
    }

    @Override // dt1.a, com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 rr6, byte[] bArr) {
        kotlin.jvm.internal.o.g(rr6, "rr");
        r45.yu6 yu6Var = new r45.yu6();
        com.tencent.mm.protobuf.f fVar = ((com.tencent.mm.modelbase.o) rr6).f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BypSendResponse");
        r45.rr rrVar = (r45.rr) fVar;
        yu6Var.f391378h = rrVar.f385130d;
        com.tencent.mars.xlog.Log.i("Byp.CgiBypSendVideo", "[onCgiBack] errType=" + i18 + " errCode=" + i19 + " errMsg=" + str + " newmsgid=" + rrVar.f385130d);
        ((t21.q1) this.f243154i).J(i17, i18, i19, str, yu6Var, this);
    }
}
