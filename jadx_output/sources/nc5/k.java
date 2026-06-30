package nc5;

/* loaded from: classes10.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f336206d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nc5.o f336207e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(nc5.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f336207e = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        nc5.k kVar = new nc5.k(this.f336207e, continuation);
        kVar.f336206d = obj;
        return kVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        nc5.k kVar = (nc5.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        kVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f336206d;
        nc5.b bVar = nc5.b.f336189a;
        nc5.o oVar = this.f336207e;
        bVar.a(oVar.f336214b);
        nc5.b.f336191c = "";
        nc5.b.f336192d = oVar.f336220h;
        if (kotlinx.coroutines.z0.h(y0Var)) {
            oVar.f336224l = true;
            qk.x7 x7Var = (qk.x7) i95.n0.c(qk.x7.class);
            android.content.Context context = oVar.f336213a;
            ((c61.ec) x7Var).getClass();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryPlugin", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
            aq.p.f12930b = bVar;
            aq.o.f12921b = nc5.b.f336190b;
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.view.activity.ImageQueryMainUI.class);
            intent.putExtra("KEY_IS_INIT", true);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/ImageQueryPlugin", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/content/Context;Lcom/tencent/mm/api/IImageQueryComposeOp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/ImageQueryPlugin", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/content/Context;Lcom/tencent/mm/api/IImageQueryComposeOp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return jz5.f0.f302826a;
    }
}
