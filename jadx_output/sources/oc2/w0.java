package oc2;

/* loaded from: classes8.dex */
public final class w0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.render.RenderView f344293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f344294e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.tencent.mm.plugin.finder.extension.reddot.render.RenderView renderView, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f344293d = renderView;
        this.f344294e = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new oc2.w0(this.f344293d, this.f344294e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        oc2.w0 w0Var = (oc2.w0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        w0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        long j17 = this.f344294e;
        com.tencent.mm.plugin.finder.extension.reddot.render.RenderView renderView = this.f344293d;
        renderView.post(new oc2.v0(renderView, j17));
        renderView.setHasInit(true);
        androidx.lifecycle.j0 j0Var = com.tencent.mm.plugin.finder.extension.reddot.ca.f105446a;
        com.tencent.mm.plugin.finder.extension.reddot.ca.f105446a.setValue(new jz5.l(new java.lang.Integer(renderView.hashCode()), java.lang.Boolean.TRUE));
        return jz5.f0.f302826a;
    }
}
