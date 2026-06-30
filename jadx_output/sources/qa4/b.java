package qa4;

/* loaded from: classes4.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f361072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361073e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361074f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f361075g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String str, java.lang.String str2, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f361073e = str;
        this.f361074f = str2;
        this.f361075g = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePath$2");
        qa4.b bVar = new qa4.b(this.f361073e, this.f361074f, this.f361075g, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePath$2");
        return bVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePath$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePath$2");
        java.lang.Object invokeSuspend = ((qa4.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePath$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePath$2");
        return invokeSuspend;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cc  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qa4.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
