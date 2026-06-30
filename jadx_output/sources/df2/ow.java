package df2;

/* loaded from: classes3.dex */
public final class ow extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.xw f231010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f231011e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow(df2.xw xwVar, kotlin.jvm.internal.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231010d = xwVar;
        this.f231011e = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.ow(this.f231010d, this.f231011e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.ow) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        df2.xw xwVar = this.f231010d;
        boolean isEmpty = xwVar.f231809m.isEmpty();
        jz5.f0 f0Var = jz5.f0.f302826a;
        kotlin.jvm.internal.h0 h0Var = this.f231011e;
        if (isEmpty) {
            xwVar.f231809m.addAll((java.util.Collection) h0Var.f310123d);
            if2.b.Y6(xwVar, qo0.b.f365380l5, null, 2, null);
            return f0Var;
        }
        xwVar.f231809m.addAll((java.util.Collection) h0Var.f310123d);
        com.tencent.mm.plugin.finder.live.plugin.vk0 vk0Var = (com.tencent.mm.plugin.finder.live.plugin.vk0) xwVar.R6(com.tencent.mm.plugin.finder.live.plugin.vk0.class);
        if (vk0Var == null) {
            return null;
        }
        vk0Var.v1((java.util.List) h0Var.f310123d);
        return f0Var;
    }
}
