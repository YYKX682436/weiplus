package com.tencent.mm.sns_compose.page;

/* loaded from: classes14.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f193490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f193491e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f193492f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f193493g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r45.jj4 jj4Var, boolean z17, n0.v2 v2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f193491e = jj4Var;
        this.f193492f = z17;
        this.f193493g = v2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.sns_compose.page.i(this.f193491e, this.f193492f, this.f193493g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.sns_compose.page.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f193490d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f193490d = 1;
            com.tencent.mars.xlog.Log.i("PlatformOp", "getSnsMediaBitmap() called with: mediaId = " + this.f193491e.f377855d + ", thumb = " + this.f193492f);
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
            this.f193493g.setValue(e1.e.b(bitmap));
        }
        return jz5.f0.f302826a;
    }
}
