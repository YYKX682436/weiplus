package x40;

/* loaded from: classes9.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f451740d;

    /* renamed from: e, reason: collision with root package name */
    public int f451741e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x40.h f451742f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f451743g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f451744h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f451745i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ byte[] f451746m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(x40.h hVar, java.util.Map map, android.content.Context context, boolean z17, byte[] bArr, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f451742f = hVar;
        this.f451743g = map;
        this.f451744h = context;
        this.f451745i = z17;
        this.f451746m = bArr;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new x40.c(this.f451742f, this.f451743g, this.f451744h, this.f451745i, this.f451746m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((x40.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        x40.h hVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f451741e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f451745i);
            java.util.Map map = this.f451743g;
            map.put("isAuthor", valueOf);
            byte[] bArr = this.f451746m;
            if (bArr != null) {
                map.put("categoryItem", bArr);
            }
            x40.h hVar2 = this.f451742f;
            this.f451740d = hVar2;
            this.f451741e = 1;
            java.lang.Object a17 = x40.h.a(hVar2, "audio_collection", map, this);
            if (a17 == aVar) {
                return aVar;
            }
            hVar = hVar2;
            obj = a17;
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            hVar = (x40.h) this.f451740d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f451740d = null;
        this.f451741e = 2;
        if (x40.h.b(hVar, (pi0.l1) obj, this.f451744h, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
