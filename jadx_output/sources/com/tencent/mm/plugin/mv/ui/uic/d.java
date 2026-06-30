package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.mv.ui.uic.d f151092d = new com.tencent.mm.plugin.mv.ui.uic.d();

    public d() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pm3.a state = (pm3.a) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof pm3.b)) {
            state.f356868e = ((pm3.b) dVar).f356870b;
        }
        if (dVar != null && (dVar instanceof pm3.d)) {
            state.f356869f = ((pm3.d) dVar).f356876c;
        }
        return jz5.f0.f302826a;
    }
}
