package ms5;

/* loaded from: classes10.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f331151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map.Entry f331152e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f331153f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f331154g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.util.Map.Entry entry, java.lang.String str, org.json.JSONArray jSONArray, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f331152e = entry;
        this.f331153f = str;
        this.f331154g = jSONArray;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ms5.d(this.f331152e, this.f331153f, this.f331154g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ms5.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f331151d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.plugin.finder.detector.api.detect.BaseEventDetector baseEventDetector = (com.tencent.plugin.finder.detector.api.detect.BaseEventDetector) this.f331152e.getValue();
            ns5.a aVar2 = new ns5.a(this.f331153f, this.f331154g);
            this.f331151d = 1;
            baseEventDetector.getClass();
            if (com.tencent.plugin.finder.detector.api.detect.BaseEventDetector.b(baseEventDetector, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
