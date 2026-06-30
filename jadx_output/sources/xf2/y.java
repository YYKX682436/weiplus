package xf2;

/* loaded from: classes10.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f454318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView f454319e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f454320f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f454321g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f454322h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.du1 f454323i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f454324m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f454325n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView shellView, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2, android.graphics.Bitmap bitmap3, r45.du1 du1Var, boolean z17, boolean z18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f454319e = shellView;
        this.f454320f = bitmap;
        this.f454321g = bitmap2;
        this.f454322h = bitmap3;
        this.f454323i = du1Var;
        this.f454324m = z17;
        this.f454325n = z18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xf2.y(this.f454319e, this.f454320f, this.f454321g, this.f454322h, this.f454323i, this.f454324m, this.f454325n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xf2.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f454318d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView screenShotView = this.f454319e.f111618d;
            if (screenShotView == null) {
                kotlin.jvm.internal.o.o("screenShotView");
                throw null;
            }
            android.graphics.Bitmap bitmap = this.f454320f;
            android.graphics.Bitmap bitmap2 = this.f454321g;
            android.graphics.Bitmap bitmap3 = this.f454322h;
            r45.du1 du1Var = this.f454323i;
            boolean z17 = this.f454324m;
            boolean z18 = this.f454325n;
            this.f454318d = 1;
            if (screenShotView.c(bitmap, bitmap2, bitmap3, du1Var, z17, z18, this) == aVar) {
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
