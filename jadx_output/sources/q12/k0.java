package q12;

/* loaded from: classes5.dex */
public final class k0 extends com.tencent.mm.sdk.event.n {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f359598d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f359599e;

    public k0() {
        super(0);
        this.f359598d = new java.util.ArrayList();
        this.f359599e = new q12.j0(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    @Override // com.tencent.mm.sdk.event.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean callback(com.tencent.mm.sdk.event.IEvent r7) {
        /*
            r6 = this;
            com.tencent.mm.autogen.events.DeleteMsgEvent r7 = (com.tencent.mm.autogen.events.DeleteMsgEvent) r7
            java.lang.String r0 = "event"
            kotlin.jvm.internal.o.g(r7, r0)
            r0 = 1
            java.lang.String r1 = "EmoticonMsgDeleteListener"
            am.y3 r2 = r7.f54086g
            if (r2 != 0) goto L15
            java.lang.String r7 = "event data is null"
            com.tencent.mars.xlog.Log.i(r1, r7)
            goto Laf
        L15:
            java.lang.Class<e42.e0> r3 = e42.e0.class
            i95.m r3 = i95.n0.c(r3)
            e42.e0 r3 = (e42.e0) r3
            e42.c0 r4 = e42.c0.clicfg_emoticon_deletion_event_report_android
            h62.d r3 = (h62.d) r3
            r5 = 0
            boolean r3 = r3.fj(r4, r5)
            if (r3 != 0) goto L2a
            goto Laf
        L2a:
            java.lang.String r3 = r2.f8427c
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L39
            java.lang.String r3 = "talker is empty"
            com.tencent.mars.xlog.Log.i(r1, r3)
            goto L63
        L39:
            kotlin.jvm.internal.o.d(r3)
            boolean r4 = com.tencent.mm.storage.z3.j4(r3)
            if (r4 != 0) goto L59
            boolean r4 = c01.e2.U(r3)
            if (r4 != 0) goto L59
            boolean r4 = com.tencent.mm.storage.z3.D4(r3)
            if (r4 != 0) goto L59
            java.lang.String r4 = "gh_"
            boolean r4 = r26.i0.y(r3, r4, r5)
            if (r4 == 0) goto L57
            goto L59
        L57:
            r3 = r0
            goto L64
        L59:
            java.lang.String r4 = "talker is not real chat "
            java.lang.String r3 = r4.concat(r3)
            com.tencent.mars.xlog.Log.i(r1, r3)
        L63:
            r3 = r5
        L64:
            if (r3 != 0) goto L67
            goto Laf
        L67:
            int r3 = r2.f8428d
            r4 = 47
            if (r3 != r4) goto L6f
            r4 = r0
            goto L70
        L6f:
            r4 = r5
        L70:
            if (r4 == 0) goto L93
            long r3 = r2.f8425a
            pt0.e0 r7 = pt0.f0.f358209b1
            java.lang.String r2 = r2.f8427c
            com.tencent.mm.storage.f9 r7 = r7.n(r2, r3)
            java.lang.String r2 = r7.Q0()
            if (r2 != 0) goto L88
            java.lang.String r7 = "info or talker is null"
            com.tencent.mars.xlog.Log.i(r1, r7)
            goto Laf
        L88:
            q12.h0 r1 = new q12.h0
            r1.<init>(r6, r7)
            r2 = 0
            pm0.v.V(r2, r1)
            goto Laf
        L93:
            if (r3 != 0) goto L97
            r1 = r0
            goto L98
        L97:
            r1 = r5
        L98:
            if (r1 == 0) goto Laf
            long r1 = r2.f8425a
            r3 = -9223372036854775808
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto La3
            r5 = r0
        La3:
            if (r5 == 0) goto Laf
            q12.i0 r1 = new q12.i0
            r1.<init>(r6, r7)
            r2 = 1000(0x3e8, double:4.94E-321)
            pm0.v.V(r2, r1)
        Laf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q12.k0.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
