package df2;

/* loaded from: classes3.dex */
public final class d1 extends if2.b implements df2.y6 {

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String f229932p = com.tencent.mm.plugin.finder.assist.e9.f102135d + "FallingGift/";

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f229933m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f229934n;

    /* renamed from: o, reason: collision with root package name */
    public final df2.x0 f229935o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f229933m = "Finder.FallingGiftAnimController";
        this.f229935o = new df2.x0(this);
    }

    @Override // df2.y6
    public java.lang.Object G6(df2.w6 w6Var, kotlin.coroutines.Continuation continuation) {
        java.lang.Object b76;
        r45.qv1 qv1Var;
        r45.kv1 kv1Var = (r45.kv1) w6Var.f231668b.f115592g.getCustom(3);
        int integer = (kv1Var == null || (qv1Var = (r45.qv1) kv1Var.getCustom(23)) == null) ? 0 : qv1Var.getInteger(1);
        int integer2 = w6Var.f231668b.f115592g.getInteger(1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[playGiftEffect] giftId = ");
        sb6.append(kv1Var != null ? kv1Var.getString(0) : null);
        sb6.append(", dropBatchSize = ");
        sb6.append(integer);
        sb6.append(", comboSumSize = ");
        sb6.append(integer2);
        com.tencent.mars.xlog.Log.i(this.f229933m, sb6.toString());
        return (kv1Var == null || integer <= 0 || (b76 = b7(kv1Var, (int) (((float) integer2) / ((float) integer)), continuation)) != pz5.a.f359186d) ? jz5.f0.f302826a : b76;
    }

    public final com.tencent.mm.sdk.platformtools.o4 Z6() {
        return com.tencent.mm.sdk.platformtools.o4.M("FallingGift");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a7(java.lang.String r21, java.lang.String r22, kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.d1.a7(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b7(r45.kv1 r18, int r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.d1.b7(r45.kv1, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c7(java.lang.String r11, int r12, long r13, kotlin.coroutines.Continuation r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof df2.a1
            if (r0 == 0) goto L13
            r0 = r15
            df2.a1 r0 = (df2.a1) r0
            int r1 = r0.f229657h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f229657h = r1
            goto L18
        L13:
            df2.a1 r0 = new df2.a1
            r0.<init>(r10, r15)
        L18:
            java.lang.Object r15 = r0.f229655f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f229657h
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r11 = r0.f229654e
            in0.q r11 = (in0.q) r11
            java.lang.Object r12 = r0.f229653d
            df2.d1 r12 = (df2.d1) r12
            kotlin.ResultKt.throwOnFailure(r15)
            goto L7b
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            kotlin.ResultKt.throwOnFailure(r15)
            tn0.w0 r15 = dk2.ef.f233378d
            boolean r2 = r15 instanceof in0.q
            if (r2 == 0) goto L43
            in0.q r15 = (in0.q) r15
            goto L44
        L43:
            r15 = 0
        L44:
            if (r15 == 0) goto La9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "[playOnce] giftImgPath:"
            r2.<init>(r4)
            r2.append(r11)
            java.lang.String r4 = ", cnt:"
            r2.append(r4)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = r10.f229933m
            com.tencent.mars.xlog.Log.i(r4, r2)
            df2.c1 r2 = new df2.c1
            r9 = 0
            r4 = r2
            r5 = r10
            r6 = r15
            r7 = r12
            r8 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f229653d = r10
            r0.f229654e = r15
            r0.f229657h = r3
            java.lang.Object r11 = kotlinx.coroutines.a4.c(r13, r2, r0)
            if (r11 != r1) goto L79
            return r1
        L79:
            r12 = r10
            r11 = r15
        L7b:
            r11.getClass()
            java.lang.String r13 = "MicroMsg.LiveCore"
            java.lang.String r14 = "removeFallingGiftEffectRes"
            com.tencent.mars.xlog.Log.i(r13, r14)
            go0.f0 r13 = r11.f420771r
            in0.h r14 = new in0.h
            r14.<init>(r11)
            r13.l(r14)
            java.lang.String r11 = r12.f229933m
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            int r12 = r12.hashCode()
            r13.append(r12)
            java.lang.String r12 = ", playOnce finally finish!"
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            com.tencent.mars.xlog.Log.i(r11, r12)
        La9:
            jz5.f0 r11 = jz5.f0.f302826a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.d1.c7(java.lang.String, int, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // df2.y6
    public boolean j1(df2.w6 event) {
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.plugin.finder.live.util.l1 l1Var = event.f231668b;
        r45.kv1 kv1Var = (r45.kv1) l1Var.f115592g.getCustom(3);
        if (kv1Var == null || !l1Var.f115602t) {
            return false;
        }
        r45.qv1 qv1Var = (r45.qv1) kv1Var.getCustom(23);
        return (qv1Var != null ? qv1Var.getInteger(1) : 0) > 0;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
        super.onLiveActivate();
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        ((com.tencent.mm.plugin.finder.live.util.j1) ((mm2.c1) business(mm2.c1.class)).f328806g).n(this.f229935o);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        super.onLiveStart(hc1Var);
        ((com.tencent.mm.plugin.finder.live.util.j1) ((mm2.c1) business(mm2.c1.class)).f328806g).l(this.f229935o);
    }

    @Override // df2.y6
    public void p6() {
        tn0.w0 w0Var = dk2.ef.f233378d;
        in0.q qVar = w0Var instanceof in0.q ? (in0.q) w0Var : null;
        if (qVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "removeFallingGiftEffectRes");
            qVar.f420771r.l(new in0.h(qVar));
        }
    }
}
