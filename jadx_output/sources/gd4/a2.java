package gd4;

/* loaded from: classes4.dex */
public final class a2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f270597d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f270598e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f270599f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gd4.c2 f270600g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.s1 f270601h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f270602i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.o1 f270603m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f270604n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.y2 f270605o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(kotlinx.coroutines.flow.i2 i2Var, gd4.c2 c2Var, com.tencent.mm.plugin.sns.storage.s1 s1Var, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.sns.storage.o1 o1Var, kotlin.jvm.internal.h0 h0Var2, com.tencent.mm.plugin.sns.storage.y2 y2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f270599f = i2Var;
        this.f270600g = c2Var;
        this.f270601h = s1Var;
        this.f270602i = h0Var;
        this.f270603m = o1Var;
        this.f270604n = h0Var2;
        this.f270605o = y2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1");
        gd4.a2 a2Var = new gd4.a2(this.f270599f, this.f270600g, this.f270601h, this.f270602i, this.f270603m, this.f270604n, this.f270605o, continuation);
        a2Var.f270598e = obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1");
        return a2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1");
        java.lang.Object invokeSuspend = ((gd4.a2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f270597d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f270598e;
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            kotlinx.coroutines.flow.j[] jVarArr = new kotlinx.coroutines.flow.j[4];
            jVarArr[0] = new gd4.q1(this.f270599f);
            l44.b3 b3Var = l44.b3.f316041a;
            gd4.c2 c2Var = this.f270600g;
            com.tencent.mm.plugin.sns.storage.SnsInfo i18 = c2Var.i();
            java.lang.String snsId = i18 != null ? i18.getSnsId() : null;
            if (snsId == null) {
                snsId = "";
            }
            jVarArr[1] = new gd4.t1(b3Var.b(snsId));
            com.tencent.mm.plugin.sns.storage.SnsInfo i19 = c2Var.i();
            java.lang.String snsId2 = i19 != null ? i19.getSnsId() : null;
            if (snsId2 == null) {
                snsId2 = "";
            }
            jVarArr[2] = new gd4.w1(b3Var.a(snsId2));
            com.tencent.mm.plugin.sns.storage.SnsInfo i27 = c2Var.i();
            java.lang.String snsId3 = i27 != null ? i27.getSnsId() : null;
            java.lang.String str = snsId3 != null ? snsId3 : "";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdCommentFlow", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
            l44.j0 j0Var = new l44.j0(l44.b3.f316042b, str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdCommentFlow", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
            jVarArr[3] = new gd4.z1(j0Var);
            int i28 = kotlinx.coroutines.flow.i1.f310295a;
            v26.v vVar = new v26.v(kz5.z.B(jVarArr), oz5.m.f350329d, -2, u26.u.SUSPEND);
            gd4.n1 n1Var = new gd4.n1(this.f270600g, this.f270601h, this.f270602i, h0Var, this.f270603m, y0Var, this.f270599f, this.f270604n, this.f270605o);
            this.f270597d = 1;
            if (vVar.a(n1Var, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1");
        return f0Var;
    }
}
