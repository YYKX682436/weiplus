package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes4.dex */
public final class xa0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ya0 f136431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f136432e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f136433f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa0(com.tencent.mm.plugin.finder.viewmodel.component.ya0 ya0Var, int i17, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f136431d = ya0Var;
        this.f136432e = i17;
        this.f136433f = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.xa0(this.f136431d, this.f136432e, this.f136433f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.viewmodel.component.xa0 xa0Var = (com.tencent.mm.plugin.finder.viewmodel.component.xa0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        xa0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.viewmodel.component.ya0 ya0Var = this.f136431d;
        java.lang.String string = ya0Var.getActivity().getResources().getString(this.f136432e);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        android.widget.TextView textView = ya0Var.f136544d;
        if (textView != null) {
            textView.setText(string);
        }
        android.widget.TextView textView2 = ya0Var.f136544d;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        android.widget.TextView textView3 = ya0Var.f136544d;
        if (textView3 != null) {
            textView3.post(new com.tencent.mm.plugin.finder.viewmodel.component.wa0(this.f136433f, ya0Var, string));
        }
        return jz5.f0.f302826a;
    }
}
