package mr3;

/* loaded from: classes.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f330862d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMRoundCornerImageView f330863e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.graphics.Bitmap bitmap, com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f330862d = bitmap;
        this.f330863e = mMRoundCornerImageView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mr3.g(this.f330862d, this.f330863e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mr3.g gVar = (mr3.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        gVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.graphics.Bitmap bitmap = this.f330862d;
        if (bitmap != null) {
            this.f330863e.setImageBitmap(bitmap);
        }
        return jz5.f0.f302826a;
    }
}
