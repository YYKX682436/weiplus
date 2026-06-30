package mn2;

/* loaded from: classes4.dex */
public final class w0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f330143d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u26.w f330144e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f330145f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f330146g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(u26.w wVar, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f330144e = wVar;
        this.f330145f = bitmap;
        this.f330146g = bitmap2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mn2.w0(this.f330144e, this.f330145f, this.f330146g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mn2.w0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f330143d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.graphics.Bitmap bitmap = this.f330145f;
            if (bitmap == null) {
                android.graphics.Bitmap originBitmap = this.f330146g;
                kotlin.jvm.internal.o.f(originBitmap, "$originBitmap");
                bitmap = originBitmap;
            }
            this.f330143d = 1;
            if (this.f330144e.t(bitmap, this) == aVar) {
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
