package hr3;

/* loaded from: classes5.dex */
public final class mf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.pf f283808d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f283809e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283810f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf(hr3.pf pfVar, android.graphics.Bitmap bitmap, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f283808d = pfVar;
        this.f283809e = bitmap;
        this.f283810f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hr3.mf(this.f283808d, this.f283809e, this.f283810f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        hr3.mf mfVar = (hr3.mf) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        mfVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        hr3.pf pfVar = this.f283808d;
        pfVar.S6().getPreviewPhotoImg().setImageBitmap(this.f283809e);
        android.widget.ImageView previewPhotoImg = pfVar.S6().getPreviewPhotoImg();
        java.lang.String str = this.f283810f;
        previewPhotoImg.setOnClickListener(new hr3.lf(pfVar, str));
        pfVar.S6().setShowAddPhotoLayout(false);
        pfVar.f283898q = str;
        android.widget.Button button = (android.widget.Button) ((jz5.n) pfVar.f283892h).getValue();
        if (button != null) {
            button.setEnabled(true);
        }
        return jz5.f0.f302826a;
    }
}
