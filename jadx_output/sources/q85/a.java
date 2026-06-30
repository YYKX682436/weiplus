package q85;

/* loaded from: classes14.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f360787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360788e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f360789f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String str, n0.v2 v2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f360788e = str;
        this.f360789f = v2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new q85.a(this.f360788e, this.f360789f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((q85.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f360787d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f360787d = 1;
            com.tencent.mars.xlog.Log.i("PlatformOp", "getAvatarBitmap() called with: userName = " + this.f360788e);
            obj = null;
            if (aVar == null) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            this.f360789f.setValue(new h1.a(e1.e.b(bitmap), 0L, 0L, 6, null));
        }
        return jz5.f0.f302826a;
    }
}
