package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class qe extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f113993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f113994e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.live.plugin.mg mgVar) {
        super(0);
        this.f113993d = viewGroup;
        this.f113994e = mgVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f113993d.findViewById(com.tencent.mm.R.id.f484573er1);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new cn2.p0((android.view.ViewGroup) findViewById, this.f113994e);
    }
}
