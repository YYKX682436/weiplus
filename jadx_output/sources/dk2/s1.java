package dk2;

/* loaded from: classes3.dex */
public final class s1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f234054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f234055e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f234056f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(xg2.h hVar, kotlin.coroutines.Continuation continuation, dk2.r4 r4Var, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f234054d = hVar;
        this.f234055e = r4Var;
        this.f234056f = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dk2.s1(this.f234054d, continuation, this.f234055e, this.f234056f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        dk2.s1 s1Var = (dk2.s1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        s1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.cz1 cz1Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.od1 od1Var = (r45.od1) ((xg2.i) this.f234054d).f454393b;
        boolean z17 = pm0.v.z(od1Var.getInteger(1), 1);
        dk2.r4 r4Var = this.f234055e;
        if (z17) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dot);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            r4Var.getClass();
            pm0.v.X(new dk2.r3(r4Var, string, com.tencent.mm.R.raw.icons_outlined_done));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doLikeLive attended lottery success,lotteryId:");
            km2.z zVar = ((on2.z2) r4Var.m(on2.z2.class)).f347092m;
            sb6.append((zVar == null || (cz1Var = zVar.f309232d) == null) ? null : cz1Var.getString(0));
            com.tencent.mars.xlog.Log.i(r4Var.f234009d, sb6.toString());
            if (!zl2.r4.f473950a.w1()) {
                i95.m c17 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ml2.r0.ek((ml2.r0) c17, ml2.p4.f327798i, "", null, 0, null, 28, null);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("finder_live_popup_joined_toast", null, um2.x5.f429020x1.a(), 25561);
            }
        }
        if (pm0.v.z(od1Var.getInteger(1), 8)) {
            java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.nuf);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            r4Var.getClass();
            pm0.v.X(new dk2.r3(r4Var, string2, com.tencent.mm.R.raw.icons_outlined_done));
            com.tencent.mars.xlog.Log.i(r4Var.f234009d, "doLikeLive MMFinderLiveStatusFlag_AttendedLiveGiftActivity success");
        }
        if (pm0.v.z(od1Var.getInteger(1), 4)) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            db5.t7.makeText(context, context.getResources().getString(com.tencent.mm.R.string.dzd), 0).show();
        }
        this.f234056f.f310123d = od1Var;
        return jz5.f0.f302826a;
    }
}
