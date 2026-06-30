package mx0;

/* loaded from: classes5.dex */
public final class d6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f331918d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f331918d = shootComposingPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.d6(this.f331918d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.d6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        hu3.q0 loadingDialog;
        hu3.q0 loadingDialog2;
        hu3.q0 loadingDialog3;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f331918d;
        kotlin.jvm.internal.o.g(shootComposingPluginLayout, "<this>");
        by0.c cVar = by0.c.f36323a;
        android.content.Context context = shootComposingPluginLayout.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.app.Activity a17 = cVar.a(context);
        if (a17 == null) {
            return null;
        }
        if (!a17.isFinishing() && !a17.isDestroyed()) {
            loadingDialog = shootComposingPluginLayout.getLoadingDialog();
            if (!loadingDialog.isShowing()) {
                loadingDialog3 = shootComposingPluginLayout.getLoadingDialog();
                loadingDialog3.show();
            }
            loadingDialog2 = shootComposingPluginLayout.getLoadingDialog();
            loadingDialog2.b(null);
        }
        return jz5.f0.f302826a;
    }
}
