package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class tz implements kotlinx.coroutines.flow.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f136071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f136072e;

    public tz(kotlinx.coroutines.flow.j jVar, yz5.p pVar) {
        this.f136071d = jVar;
        this.f136072e = pVar;
    }

    @Override // kotlinx.coroutines.flow.j
    public java.lang.Object a(kotlinx.coroutines.flow.k kVar, kotlin.coroutines.Continuation continuation) {
        java.lang.Object a17 = this.f136071d.a(new com.tencent.mm.plugin.finder.viewmodel.component.sz(kVar, this.f136072e), continuation);
        return a17 == pz5.a.f359186d ? a17 : jz5.f0.f302826a;
    }
}
