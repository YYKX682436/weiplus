package x40;

/* loaded from: classes9.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f451734d;

    /* renamed from: e, reason: collision with root package name */
    public int f451735e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x40.h f451736f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f451737g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f451738h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ byte[] f451739i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(x40.h hVar, java.util.Map map, android.content.Context context, byte[] bArr, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f451736f = hVar;
        this.f451737g = map;
        this.f451738h = context;
        this.f451739i = bArr;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new x40.b(this.f451736f, this.f451737g, this.f451738h, this.f451739i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((x40.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        x40.h hVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f451735e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.Map map = this.f451737g;
            byte[] bArr = this.f451739i;
            if (bArr != null) {
                map.put("categoryItem", bArr);
            }
            hVar = this.f451736f;
            this.f451734d = hVar;
            this.f451735e = 1;
            obj = x40.h.a(hVar, "audio_author_category", map, this);
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
            hVar = (x40.h) this.f451734d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f451734d = null;
        this.f451735e = 2;
        if (x40.h.b(hVar, (pi0.l1) obj, this.f451738h, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
