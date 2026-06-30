package hk4;

/* loaded from: classes10.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hk4.n f281954d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(hk4.n nVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f281954d = nVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hk4.l(this.f281954d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hk4.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        hk4.n nVar = this.f281954d;
        if (com.tencent.mm.vfs.w6.j(nVar.f281959n)) {
            nVar.f281963r = com.tencent.mm.sdk.platformtools.x.K(nVar.f281959n);
            java.lang.String str = nVar.f281956k;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadImageBitmap file already exist: ");
            sb6.append(nVar.f281963r);
            sb6.append(", size:[");
            android.graphics.Bitmap bitmap = nVar.f281963r;
            sb6.append(bitmap != null ? new java.lang.Integer(bitmap.getWidth()) : null);
            sb6.append(", ");
            android.graphics.Bitmap bitmap2 = nVar.f281963r;
            sb6.append(bitmap2 != null ? new java.lang.Integer(bitmap2.getHeight()) : null);
            sb6.append("], path:");
            sb6.append(nVar.f281959n);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            if (nVar.f281963r != null) {
                return java.lang.Boolean.TRUE;
            }
        }
        return java.lang.Boolean.FALSE;
    }
}
