package h41;

/* loaded from: classes5.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.j f278774d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h41.j jVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f278774d = jVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new h41.d(this.f278774d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        h41.d dVar = (h41.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        dVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.view.WindowManager windowManager = (android.view.WindowManager) systemService;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f487861dy4, (android.view.ViewGroup) null);
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -2;
        layoutParams.type = android.os.Build.VERSION.SDK_INT >= 26 ? 2038 : 2002;
        layoutParams.format = -3;
        layoutParams.flags = 40;
        layoutParams.gravity = 48;
        layoutParams.y = ym5.x.a(context, 64.0f);
        windowManager.addView(inflate, layoutParams);
        kotlin.jvm.internal.o.d(inflate);
        this.f278774d.f278815q = new g41.f(inflate, null);
        return jz5.f0.f302826a;
    }
}
