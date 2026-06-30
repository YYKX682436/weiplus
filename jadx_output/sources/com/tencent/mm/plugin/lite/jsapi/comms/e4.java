package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes8.dex */
public final class e4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.o2 f143565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.f4 f143566e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(com.tencent.mm.pluginsdk.model.o2 o2Var, com.tencent.mm.plugin.lite.jsapi.comms.f4 f4Var) {
        super(0);
        this.f143565d = o2Var;
        this.f143566e = f4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context c17 = this.f143566e.c();
        kotlin.jvm.internal.o.f(c17, "getContext(...)");
        ((com.tencent.mm.pluginsdk.ui.otherway.u0) this.f143565d).n(c17);
        return jz5.f0.f302826a;
    }
}
