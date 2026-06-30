package xh4;

/* loaded from: classes.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f454620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f454621e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f454622f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f454623g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.app.Activity activity, yz5.a aVar, yz5.a aVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f454621e = activity;
        this.f454622f = aVar;
        this.f454623g = aVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xh4.o(this.f454621e, this.f454622f, this.f454623g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xh4.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f454620d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (uh4.c0.getService().T2()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeUtil", "[checkNeedShowDialogAfterVerifyPwd] checkSysPwd");
                android.app.Activity activity = this.f454621e;
                this.f454620d = 1;
                kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
                rVar.k();
                com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeUtil", "[checkSysPwd]");
                android.content.Intent intent = new android.content.Intent("com.android.action.PARENTAL_CREDENTIAL_AUTHENTICATE");
                intent.putExtra("key_authentication_messenger", new android.os.Messenger(new xh4.r(rVar, android.os.Looper.getMainLooper())));
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(999);
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/utils/TeenModeUtil", "checkSysPwd", "(Landroid/app/Activity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                obj = rVar.j();
                if (obj == aVar) {
                    return aVar;
                }
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.f454622f.invoke();
            return jz5.f0.f302826a;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (obj != xh4.k.f454608d) {
            yz5.a aVar2 = this.f454623g;
            if (aVar2 != null) {
                aVar2.invoke();
            }
            return jz5.f0.f302826a;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeUtil", "[checkNeedShowDialogAfterVerifyPwd] checkSysPwd success");
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        xh4.n nVar = new xh4.n(this.f454621e, null);
        this.f454620d = 2;
        if (kotlinx.coroutines.l.g(g3Var, nVar, this) == aVar) {
            return aVar;
        }
        this.f454622f.invoke();
        return jz5.f0.f302826a;
    }
}
