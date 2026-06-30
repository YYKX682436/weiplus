package mr3;

/* loaded from: classes.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f330889d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMRoundCornerImageView f330890e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(android.graphics.Bitmap bitmap, com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f330889d = bitmap;
        this.f330890e = mMRoundCornerImageView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mr3.p(this.f330889d, this.f330890e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mr3.p pVar = (mr3.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        pVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.graphics.Bitmap bitmap = this.f330889d;
        if (bitmap != null) {
            this.f330890e.setImageBitmap(bitmap);
        }
        return jz5.f0.f302826a;
    }
}
