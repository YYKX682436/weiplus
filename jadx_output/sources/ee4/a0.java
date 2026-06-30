package ee4;

/* loaded from: classes4.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f251658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ee4.c0 f251659e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f251660f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f251661g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l56.i f251662h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f251663i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.List f251664m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r45.ed4 f251665n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f251666o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f251667p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f251668q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.util.List f251669r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PInt f251670s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f251671t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f251672u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f251673v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ee4.c0 c0Var, int i17, int i18, l56.i iVar, java.lang.String str, java.util.List list, r45.ed4 ed4Var, java.util.LinkedList linkedList, int i19, boolean z17, java.util.List list2, com.tencent.mm.pointers.PInt pInt, java.lang.String str2, int i27, int i28, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f251659e = c0Var;
        this.f251660f = i17;
        this.f251661g = i18;
        this.f251662h = iVar;
        this.f251663i = str;
        this.f251664m = list;
        this.f251665n = ed4Var;
        this.f251666o = linkedList;
        this.f251667p = i19;
        this.f251668q = z17;
        this.f251669r = list2;
        this.f251670s = pInt;
        this.f251671t = str2;
        this.f251672u = i27;
        this.f251673v = i28;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$commit$1");
        ee4.a0 a0Var = new ee4.a0(this.f251659e, this.f251660f, this.f251661g, this.f251662h, this.f251663i, this.f251664m, this.f251665n, this.f251666o, this.f251667p, this.f251668q, this.f251669r, this.f251670s, this.f251671t, this.f251672u, this.f251673v, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$commit$1");
        return a0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$commit$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$commit$1");
        java.lang.Object invokeSuspend = ((ee4.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$commit$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$commit$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$commit$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f251658d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        boolean z17 = true;
        ee4.c0 c0Var = this.f251659e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            c0Var.f("commit start >> threadName: " + java.lang.Thread.currentThread().getName());
            ee4.r0 l17 = c0Var.l();
            this.f251658d = 1;
            l17.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("suspendCheckLivePhotoWork", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc");
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkLivePhotoWorkFinish", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc");
            ge4.e eVar = l17.f251738n;
            if (eVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("runningJobIsEmpty", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
                boolean isEmpty = eVar.f270989b.isEmpty();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runningJobIsEmpty", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
                z17 = isEmpty;
            }
            l17.f("checkLivePhotoWorkFinish >> isFinish: " + z17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLivePhotoWorkFinish", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc");
            if (z17) {
                nVar.resumeWith(kotlin.Result.m521constructorimpl(new ee4.h1(false, false)));
            } else {
                l17.f251740p = nVar;
                l17.j().q();
            }
            a17 = nVar.a();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("suspendCheckLivePhotoWork", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc");
            if (a17 == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$commit$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$commit$1");
                    return f0Var;
                }
                if (i17 == 3) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$commit$1");
                    return f0Var;
                }
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$commit$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            a17 = obj;
        }
        ee4.h1 h1Var = (ee4.h1) a17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get livePhoto job result finish >> threadName: ");
        sb6.append(java.lang.Thread.currentThread().getName());
        sb6.append(" needToCancel: ");
        h1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isNeedToCancelPublish", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.SnsLivePhotoCheckWorkJobResult");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNeedToCancelPublish", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.SnsLivePhotoCheckWorkJobResult");
        sb6.append(h1Var.f251714a);
        sb6.append(" isShowLoading: ");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isBlockPublishToShowLoading", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.SnsLivePhotoCheckWorkJobResult");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isBlockPublishToShowLoading", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.SnsLivePhotoCheckWorkJobResult");
        sb6.append(h1Var.f251715b);
        c0Var.f(sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isNeedToCancelPublish", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.SnsLivePhotoCheckWorkJobResult");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNeedToCancelPublish", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.SnsLivePhotoCheckWorkJobResult");
        if (!h1Var.f251714a) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            ee4.z zVar = new ee4.z(this.f251659e, this.f251660f, this.f251661g, this.f251662h, this.f251663i, this.f251664m, this.f251665n, this.f251666o, this.f251667p, this.f251668q, this.f251669r, this.f251670s, this.f251671t, this.f251672u, this.f251673v, h1Var, null);
            this.f251658d = 3;
            if (kotlinx.coroutines.l.g(g3Var, zVar, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$commit$1");
                return aVar;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$commit$1");
            return f0Var;
        }
        c0Var.g("when commit live photo job is find error >> cancel commit");
        kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var2 = kotlinx.coroutines.internal.b0.f310484a;
        ee4.y yVar = new ee4.y(c0Var, null);
        this.f251658d = 2;
        if (kotlinx.coroutines.l.g(g3Var2, yVar, this) == aVar) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$commit$1");
            return aVar;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$commit$1");
        return f0Var;
    }
}
