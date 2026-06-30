package sr0;

/* loaded from: classes14.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr0.f f411416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f411417e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f411418f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f411419g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f411420h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(sr0.f fVar, int i17, int i18, int i19, android.graphics.Bitmap bitmap, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f411416d = fVar;
        this.f411417e = i17;
        this.f411418f = i18;
        this.f411419g = i19;
        this.f411420h = bitmap;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sr0.c(this.f411416d, this.f411417e, this.f411418f, this.f411419g, this.f411420h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sr0.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        return this.f411416d.y(this.f411417e, this.f411418f, this.f411419g, this.f411420h, false);
    }
}
