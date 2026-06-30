package df2;

/* loaded from: classes10.dex */
public final class t9 extends if2.b implements df2.y6 {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f231426m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f231427n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f231428o;

    /* renamed from: p, reason: collision with root package name */
    public final df2.n9 f231429p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231426m = "Finder.InteractiveGiftController";
        this.f231428o = "GIFT_CNT_KEY";
        this.f231429p = new df2.n9(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x028a -> B:12:0x028d). Please report as a decompilation issue!!! */
    @Override // df2.y6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object G6(df2.w6 r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.t9.G6(df2.w6, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z6(int r5, wh2.b r6, long r7, kotlin.coroutines.Continuation r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof df2.q9
            if (r0 == 0) goto L13
            r0 = r9
            df2.q9 r0 = (df2.q9) r0
            int r1 = r0.f231148g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f231148g = r1
            goto L18
        L13:
            df2.q9 r0 = new df2.q9
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.f231146e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f231148g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f231145d
            df2.t9 r5 = (df2.t9) r5
            kotlin.ResultKt.throwOnFailure(r9)
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.throwOnFailure(r9)
            df2.s9 r9 = new df2.s9
            r2 = 0
            r9.<init>(r4, r5, r6, r2)
            r0.f231145d = r4
            r0.f231148g = r3
            java.lang.Object r5 = kotlinx.coroutines.a4.c(r7, r9, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            r5 = r4
        L48:
            dk2.ef r6 = dk2.ef.f233372a
            tn0.w0 r6 = dk2.ef.f233378d
            if (r6 == 0) goto L51
            r6.o0()
        L51:
            java.lang.String r6 = r5.f231426m
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            int r5 = r5.hashCode()
            r7.append(r5)
            java.lang.String r5 = ", playOnce finally finish!"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            com.tencent.mars.xlog.Log.i(r6, r5)
            jz5.f0 r5 = jz5.f0.f302826a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.t9.Z6(int, wh2.b, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // df2.y6
    public boolean j1(df2.w6 event) {
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.plugin.finder.live.util.l1 l1Var = event.f231668b;
        r45.kv1 kv1Var = (r45.kv1) l1Var.f115592g.getCustom(3);
        java.lang.String a17 = kv1Var != null ? wh2.f.f445949a.a(kv1Var) : null;
        if (kv1Var == null || !l1Var.f115597o) {
            return false;
        }
        java.lang.String string = kv1Var.getString(20);
        if (string == null || string.length() == 0) {
            return false;
        }
        return !(a17 == null || a17.length() == 0);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
        ((com.tencent.mm.plugin.finder.live.util.j1) ((mm2.c1) business(mm2.c1.class)).f328806g).l(this.f231429p);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        ((com.tencent.mm.plugin.finder.live.util.j1) ((mm2.c1) business(mm2.c1.class)).f328806g).n(this.f231429p);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLivePause() {
        com.tencent.mars.xlog.Log.i(this.f231426m, "clear interactiveGiftQueue");
        dk2.ef efVar = dk2.ef.f233372a;
        tn0.w0 w0Var = dk2.ef.f233378d;
        if (w0Var != null) {
            w0Var.o0();
        }
    }

    @Override // df2.y6
    public void p6() {
        com.tencent.mars.xlog.Log.i(this.f231426m, "[onQueueWithoutType]");
        dk2.ef efVar = dk2.ef.f233372a;
        tn0.w0 w0Var = dk2.ef.f233378d;
        if (w0Var != null) {
            w0Var.o0();
        }
    }
}
