package us2;

/* loaded from: classes2.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f430538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f430539e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f430540f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f430541g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f430542h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.lang.String str, int i17, int i18, boolean z17, boolean z18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f430538d = str;
        this.f430539e = i17;
        this.f430540f = i18;
        this.f430541g = z17;
        this.f430542h = z18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new us2.s(this.f430538d, this.f430539e, this.f430540f, this.f430541g, this.f430542h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((us2.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.Object obj2 = us2.u.f430550c;
        java.lang.String str = this.f430538d;
        int i17 = this.f430539e;
        int i18 = this.f430540f;
        boolean z17 = this.f430541g;
        boolean z18 = this.f430542h;
        synchronized (obj2) {
            java.util.Map map = us2.u.f430551d;
            if (((kotlinx.coroutines.r2) ((java.util.LinkedHashMap) map).get(str)) != null) {
                return jz5.f0.f302826a;
            }
            map.put(str, kotlinx.coroutines.l.d(us2.u.f430548a.i(), null, null, new us2.r(str, i17, i18, z17, z18, null), 3, null));
            return jz5.f0.f302826a;
        }
    }
}
