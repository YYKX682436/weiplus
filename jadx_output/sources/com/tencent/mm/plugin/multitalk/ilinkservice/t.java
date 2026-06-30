package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    public boolean f149790b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.voip.model.e f149791c;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f149789a = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public final fp.j f149792d = new fp.j();

    public final int a(com.tencent.mm.plugin.voip.model.b bVar, int i17, int i18, int i19) {
        if (this.f149791c == null) {
            com.tencent.mm.plugin.voip.model.e eVar = new com.tencent.mm.plugin.voip.model.e();
            this.f149791c = eVar;
            eVar.c(i17, i18, i19, 0);
        }
        com.tencent.mm.plugin.voip.model.e eVar2 = this.f149791c;
        kotlin.jvm.internal.o.d(eVar2);
        eVar2.b(com.tencent.mm.sdk.platformtools.x2.f193071a, false);
        com.tencent.mm.plugin.voip.model.e eVar3 = this.f149791c;
        kotlin.jvm.internal.o.d(eVar3);
        eVar3.f176454q = bVar;
        com.tencent.mm.plugin.voip.model.e eVar4 = this.f149791c;
        kotlin.jvm.internal.o.d(eVar4);
        return eVar4.d();
    }
}
