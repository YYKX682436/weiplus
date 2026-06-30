package jq4;

/* loaded from: classes5.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f301216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f301217e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jq4.z0 f301218f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f301219g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f301220h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f301221i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(android.graphics.Bitmap bitmap, jq4.z0 z0Var, android.view.View view, android.widget.ImageView imageView, android.view.View view2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f301217e = bitmap;
        this.f301218f = z0Var;
        this.f301219g = view;
        this.f301220h = imageView;
        this.f301221i = view2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new jq4.x0(this.f301217e, this.f301218f, this.f301219g, this.f301220h, this.f301221i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((jq4.x0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f301216d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.graphics.Bitmap bitmap = null;
            android.graphics.Bitmap bitmap2 = this.f301217e;
            if (bitmap2 != null) {
                android.view.View view = this.f301219g;
                int width = view.getWidth();
                int height = view.getHeight();
                this.f301218f.getClass();
                android.graphics.Bitmap m17 = com.tencent.mm.sdk.platformtools.x.m(width, height, android.graphics.Bitmap.Config.ARGB_8888, false);
                if (m17 != null) {
                    android.graphics.Bitmap X = com.tencent.mm.sdk.platformtools.x.X(bitmap2, 3);
                    if (width > 0 && X != null) {
                        android.graphics.Bitmap k07 = com.tencent.mm.sdk.platformtools.x.k0(X, X.getWidth(), (height * X.getWidth()) / width, true);
                        android.graphics.Canvas canvas = new android.graphics.Canvas(m17);
                        canvas.drawBitmap(k07, (android.graphics.Rect) null, new android.graphics.Rect(0, 0, canvas.getWidth(), canvas.getHeight()), (android.graphics.Paint) null);
                    }
                    bitmap = m17;
                }
            }
            android.graphics.Bitmap bitmap3 = bitmap;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            jq4.w0 w0Var = new jq4.w0(this.f301220h, this.f301221i, this.f301219g, bitmap3, null);
            this.f301216d = 1;
            if (kotlinx.coroutines.l.g(g3Var, w0Var, this) == aVar) {
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
