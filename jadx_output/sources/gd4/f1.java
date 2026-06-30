package gd4;

/* loaded from: classes4.dex */
public final class f1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f270695d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f270696e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.r1 f270697f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gd4.c2 f270698g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f270699h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f270700i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(com.tencent.mm.plugin.sns.storage.r1 r1Var, gd4.c2 c2Var, int i17, kotlinx.coroutines.flow.i2 i2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f270697f = r1Var;
        this.f270698g = c2Var;
        this.f270699h = i17;
        this.f270700i = i2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
        gd4.f1 f1Var = new gd4.f1(this.f270697f, this.f270698g, this.f270699h, this.f270700i, continuation);
        f1Var.f270696e = obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
        return f1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
        java.lang.Object invokeSuspend = ((gd4.f1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        gd4.c2 c2Var;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        kotlinx.coroutines.y0 y0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f270695d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        gd4.c2 c2Var2 = this.f270698g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var2 = (kotlinx.coroutines.y0) this.f270696e;
            com.tencent.mm.plugin.sns.storage.r1 r1Var = this.f270697f;
            if (r1Var == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion");
                com.tencent.mars.xlog.Log.w("IpInteractScheduleVideoController", "reseekBreakVideo playState is null!!! currentState = " + gd4.c2.m(c2Var2));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
                return f0Var;
            }
            gd4.c2 c2Var3 = this.f270698g;
            gd4.e1 e1Var = new gd4.e1(c2Var3);
            r1Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSectionEnd", "com.tencent.mm.plugin.sns.storage.PlayState");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSectionEnd", "com.tencent.mm.plugin.sns.storage.PlayState");
            long j17 = r1Var.f166120c;
            this.f270696e = y0Var2;
            this.f270695d = 1;
            c2Var = c2Var2;
            str = "IpInteractScheduleVideoController";
            str2 = "getTAG";
            str3 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion";
            str4 = "access$getTAG$cp";
            str5 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController";
            if (gd4.b.c(c2Var3, e1Var, j17, 50L, 0, 5, 0, this, 40, null) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
                return aVar;
            }
            y0Var = y0Var2;
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
                    return f0Var;
                }
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
                throw illegalStateException;
            }
            y0Var = (kotlinx.coroutines.y0) this.f270696e;
            kotlin.ResultKt.throwOnFailure(obj);
            str = "IpInteractScheduleVideoController";
            c2Var = c2Var2;
            str2 = "getTAG";
            str3 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion";
            str4 = "access$getTAG$cp";
            str5 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController";
        }
        java.lang.String str6 = str2;
        java.lang.String str7 = str3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(str6, str7);
        java.lang.String str8 = str4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(str8, str5);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str8, str5);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str6, str7);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reseekBreakVideo delay end ");
        sb6.append(kotlinx.coroutines.z0.h(y0Var));
        sb6.append(' ');
        int i18 = this.f270699h;
        sb6.append(i18);
        sb6.append(' ');
        sb6.append(gd4.c2.m(c2Var));
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (i18 == gd4.c2.m(c2Var)) {
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            this.f270696e = null;
            this.f270695d = 2;
            if (this.f270700i.emit(bool, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
                return aVar;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
        return f0Var;
    }
}
