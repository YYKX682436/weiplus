package x40;

/* loaded from: classes9.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f451754d;

    /* renamed from: e, reason: collision with root package name */
    public int f451755e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x40.h f451756f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f451757g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f451758h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ byte[] f451759i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(x40.h hVar, java.util.Map map, android.content.Context context, byte[] bArr, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f451756f = hVar;
        this.f451757g = map;
        this.f451758h = context;
        this.f451759i = bArr;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new x40.e(this.f451756f, this.f451757g, this.f451758h, this.f451759i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((x40.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        x40.h hVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f451755e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.Map map = this.f451757g;
            byte[] bArr = this.f451759i;
            if (bArr != null) {
                map.put("insertedBufferFromAudioMixFeedItem", bArr);
            }
            hVar = this.f451756f;
            this.f451754d = hVar;
            this.f451755e = 1;
            obj = x40.h.a(hVar, "main_feed", map, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            hVar = (x40.h) this.f451754d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f451754d = null;
        this.f451755e = 2;
        if (x40.h.b(hVar, (pi0.l1) obj, this.f451758h, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
