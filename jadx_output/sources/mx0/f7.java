package mx0;

/* loaded from: classes5.dex */
public final class f7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f331980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f331981e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f331980d = shootComposingPluginLayout;
        this.f331981e = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.f7(this.f331980d, this.f331981e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mx0.f7 f7Var = (mx0.f7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        f7Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        mx0.ja templateUIPlugin;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        templateUIPlugin = this.f331980d.getTemplateUIPlugin();
        templateUIPlugin.getClass();
        java.util.List newData = this.f331981e;
        kotlin.jvm.internal.o.g(newData, "newData");
        templateUIPlugin.f332081m.addAll(newData);
        mx0.t9 t9Var = templateUIPlugin.f332080i;
        t9Var.getClass();
        java.util.ArrayList arrayList = t9Var.f332358f;
        arrayList.addAll(newData);
        t9Var.notifyItemRangeChanged(0, arrayList.size());
        return jz5.f0.f302826a;
    }
}
