package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class bc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f112002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.gc f112003e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f112004f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cm2.i0 f112005g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc(com.tencent.mm.plugin.finder.live.plugin.gc gcVar, android.widget.TextView textView, cm2.i0 i0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f112003e = gcVar;
        this.f112004f = textView;
        this.f112005g = i0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.live.plugin.bc bcVar = new com.tencent.mm.plugin.finder.live.plugin.bc(this.f112003e, this.f112004f, this.f112005g, continuation);
        bcVar.f112002d = obj;
        return bcVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.bc bcVar = (com.tencent.mm.plugin.finder.live.plugin.bc) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        bcVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f112002d;
        st2.g3 g3Var = st2.g3.f412326a;
        java.lang.String valueOf = java.lang.String.valueOf(this.f112003e.f112680g);
        android.widget.TextView textView = this.f112004f;
        cm2.i0 i0Var = this.f112005g;
        java.util.LinkedList list = i0Var.f43354v.getList(2);
        java.lang.String string = i0Var.f43354v.getString(3);
        if (string == null) {
            string = "";
        }
        g3Var.t(valueOf, y0Var, textView, list, string, true, false, true, (r30 & 256) != 0 ? true : true, (r30 & 512) != 0 ? i65.a.b(textView.getContext(), 16) : 0, (r30 & 1024) != 0 ? gm2.c1.f273320a.k() : 0, (r30 & 2048) != 0 ? java.lang.Float.valueOf(1.0f) : null, (r30 & 4096) != 0 ? null : null);
        return jz5.f0.f302826a;
    }
}
