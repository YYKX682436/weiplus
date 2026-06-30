package qf2;

/* loaded from: classes.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f362673d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.y1 f362674e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362675f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(xg2.h hVar, kotlin.coroutines.Continuation continuation, qf2.y1 y1Var, yz5.l lVar) {
        super(2, continuation);
        this.f362673d = hVar;
        this.f362674e = y1Var;
        this.f362675f = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.z0(this.f362673d, continuation, this.f362674e, this.f362675f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qf2.z0 z0Var = (qf2.z0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        z0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r0 == null) goto L14;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f359186d
            kotlin.ResultKt.throwOnFailure(r6)
            xg2.h r6 = r5.f362673d
            xg2.b r6 = (xg2.b) r6
            java.lang.Object r6 = r6.f454381b
            xg2.a r6 = (xg2.a) r6
            rm0.j r0 = r6.f454379a
            r1 = 0
            qf2.y1 r2 = r5.f362674e
            if (r0 == 0) goto L27
            java.lang.String r0 = r0.f397426g
            if (r0 == 0) goto L27
            int r3 = r0.length()
            if (r3 <= 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = r1
        L21:
            if (r3 == 0) goto L24
            goto L25
        L24:
            r0 = 0
        L25:
            if (r0 != 0) goto L3b
        L27:
            android.content.Context r0 = r2.O6()
            android.content.res.Resources r0 = r0.getResources()
            r3 = 2131763140(0x7f101fc4, float:1.9157377E38)
            java.lang.String r0 = r0.getString(r3)
            java.lang.String r3 = "getString(...)"
            kotlin.jvm.internal.o.f(r0, r3)
        L3b:
            rm0.j r6 = r6.f454379a
            if (r6 == 0) goto L42
            int r3 = r6.f397425f
            goto L43
        L42:
            r3 = r1
        L43:
            if (r6 == 0) goto L47
            int r1 = r6.f397424e
        L47:
            java.lang.Class<com.tencent.mm.plugin.finder.live.plugin.na> r6 = com.tencent.mm.plugin.finder.live.plugin.na.class
            com.tencent.mm.plugin.finder.live.plugin.l r6 = r2.R6(r6)
            com.tencent.mm.plugin.finder.live.plugin.na r6 = (com.tencent.mm.plugin.finder.live.plugin.na) r6
            if (r6 == 0) goto L54
            r6.y1()
        L54:
            java.lang.Class<com.tencent.mm.plugin.finder.live.plugin.x7> r6 = com.tencent.mm.plugin.finder.live.plugin.x7.class
            com.tencent.mm.plugin.finder.live.plugin.l r6 = r2.R6(r6)
            com.tencent.mm.plugin.finder.live.plugin.x7 r6 = (com.tencent.mm.plugin.finder.live.plugin.x7) r6
            if (r6 == 0) goto L62
            r4 = 2
            r6.H1(r4)
        L62:
            android.content.Context r6 = r2.O6()
            db5.t7.g(r6, r0)
            yz5.l r6 = r5.f362675f
            if (r6 == 0) goto L72
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r6.invoke(r2)
        L72:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "anchorNewAcceptBattle fail, errCode: "
            r6.<init>(r2)
            r6.append(r3)
            java.lang.String r2 = " errMsg: "
            r6.append(r2)
            r6.append(r0)
            java.lang.String r0 = " errType: "
            r6.append(r0)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = "FinderLiveMicAnchorBattlePkController"
            com.tencent.mars.xlog.Log.i(r0, r6)
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.z0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
