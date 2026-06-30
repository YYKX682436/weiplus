package yw3;

/* loaded from: classes9.dex */
public final class a3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f466686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk0.k f466687e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerImageLoaderDemoUI f466688f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(gk0.k kVar, com.tencent.mm.plugin.repairer.ui.demo.RepairerImageLoaderDemoUI repairerImageLoaderDemoUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f466687e = kVar;
        this.f466688f = repairerImageLoaderDemoUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yw3.a3(this.f466687e, this.f466688f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yw3.a3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f466686d;
        com.tencent.mm.plugin.repairer.ui.demo.RepairerImageLoaderDemoUI repairerImageLoaderDemoUI = this.f466688f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gk0.h hVar = new gk0.h("https://gtimg.wechatpay.cn/pay/img/home/solution/2.jpg");
            java.lang.String Bi = ((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).Bi(hVar, this.f466687e);
            i95.m c17 = i95.n0.c(gk0.n0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            g75.z x66 = gk0.n0.x6((gk0.n0) c17, Bi, this.f466687e, null, null, 12, null);
            x66.l("Common_HttpParams", hVar);
            gk0.b bVar = (gk0.b) ((jz5.n) repairerImageLoaderDemoUI.h).getValue();
            this.f466686d = 1;
            obj = bVar.a(x66, this);
            if (obj == aVar) {
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
            com.tencent.mm.sdk.coroutines.LifecycleScope U6 = repairerImageLoaderDemoUI.U6();
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(U6, kotlinx.coroutines.internal.b0.f310484a, null, new yw3.z2(repairerImageLoaderDemoUI, bitmap, null), 2, null);
        }
        return jz5.f0.f302826a;
    }
}
