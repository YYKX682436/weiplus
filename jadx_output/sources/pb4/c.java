package pb4;

/* loaded from: classes4.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f353191e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f353192f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String str, java.util.ArrayList arrayList, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f353190d = str;
        this.f353191e = arrayList;
        this.f353192f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage$updateSnsStarInfoFp$2");
        pb4.c cVar = new pb4.c(this.f353190d, this.f353191e, this.f353192f, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage$updateSnsStarInfoFp$2");
        return cVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage$updateSnsStarInfoFp$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage$updateSnsStarInfoFp$2");
        java.lang.Object invokeSuspend = ((pb4.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage$updateSnsStarInfoFp$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage$updateSnsStarInfoFp$2");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage$updateSnsStarInfoFp$2");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateSnsStarInfoFp >> ");
        java.lang.String str = this.f353190d;
        sb6.append(str);
        sb6.append(" snsInfoSize: ");
        java.util.ArrayList arrayList = this.f353191e;
        sb6.append(arrayList.size());
        sb6.append(' ');
        boolean z17 = this.f353192f;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarSnsInfoStorage", sb6.toString());
        boolean isEmpty = arrayList.isEmpty();
        jz5.f0 f0Var = jz5.f0.f302826a;
        pb4.e eVar = pb4.e.f353196a;
        if (isEmpty) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarSnsInfoStorage", "fpSize is 0");
            eVar.a(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage$updateSnsStarInfoFp$2");
            return f0Var;
        }
        int createTime = ((com.tencent.mm.plugin.sns.storage.SnsInfo) kz5.n0.i0(arrayList)).getCreateTime();
        eVar.c(str, createTime);
        if (z17) {
            eVar.d(str, createTime);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            eVar.o(eVar.l((com.tencent.mm.plugin.sns.storage.SnsInfo) it.next()), str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage$updateSnsStarInfoFp$2");
        return f0Var;
    }
}
