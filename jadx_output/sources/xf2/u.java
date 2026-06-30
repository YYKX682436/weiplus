package xf2;

/* loaded from: classes.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f454305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f454306e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f454307f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(kotlin.jvm.internal.c0 c0Var, android.graphics.Bitmap bitmap, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f454305d = c0Var;
        this.f454306e = bitmap;
        this.f454307f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xf2.u(this.f454305d, this.f454306e, this.f454307f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        xf2.u uVar = (xf2.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        uVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            this.f454305d.f310112d = com.tencent.mm.sdk.platformtools.x.D0(this.f454306e, 80, android.graphics.Bitmap.CompressFormat.JPEG, this.f454307f, true);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderLiveScreenShotShellView", e17.toString());
        }
        return jz5.f0.f302826a;
    }
}
