package pb4;

/* loaded from: classes4.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353187d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f353188e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f353189f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String str, java.util.ArrayList arrayList, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f353187d = str;
        this.f353188e = arrayList;
        this.f353189f = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage$updateSnsStarInfo$2");
        pb4.b bVar = new pb4.b(this.f353187d, this.f353188e, this.f353189f, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage$updateSnsStarInfo$2");
        return bVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage$updateSnsStarInfo$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage$updateSnsStarInfo$2");
        java.lang.Object invokeSuspend = ((pb4.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage$updateSnsStarInfo$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage$updateSnsStarInfo$2");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage$updateSnsStarInfo$2");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateSnsStarInfo >> snsInfoSize: userName: ");
        java.lang.String str = this.f353187d;
        sb6.append(str);
        sb6.append(", ");
        java.util.ArrayList arrayList = this.f353188e;
        sb6.append(arrayList.size());
        sb6.append(", ");
        int i17 = this.f353189f;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarSnsInfoStorage", sb6.toString());
        boolean isEmpty = arrayList.isEmpty();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (isEmpty) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsStarSnsInfoStorage", "snsInfo is empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage$updateSnsStarInfo$2");
            return f0Var;
        }
        int createTime = ((com.tencent.mm.plugin.sns.storage.SnsInfo) kz5.n0.i0(arrayList)).getCreateTime();
        pb4.e eVar = pb4.e.f353196a;
        eVar.e(str, i17, createTime);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            eVar.o(eVar.l((com.tencent.mm.plugin.sns.storage.SnsInfo) it.next()), str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage$updateSnsStarInfo$2");
        return f0Var;
    }
}
