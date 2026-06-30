package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class kc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.mc f118832d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc(com.tencent.mm.plugin.finder.live.widget.mc mcVar) {
        super(0);
        this.f118832d = mcVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.widget.mc mcVar = this.f118832d;
        com.tencent.mm.plugin.finder.view.e3 e3Var = new com.tencent.mm.plugin.finder.view.e3(mcVar.f119061a);
        e3Var.a();
        android.view.View inflate = android.view.LayoutInflater.from(mcVar.f119061a).inflate(com.tencent.mm.R.layout.e9w, (android.view.ViewGroup) null, false);
        inflate.findViewById(com.tencent.mm.R.id.t78).setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.lc(mcVar));
        e3Var.f131975y.addView(inflate, 0);
        return e3Var;
    }
}
