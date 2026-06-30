package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class sa extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.widget.sa f119745d = new com.tencent.mm.plugin.finder.live.widget.sa();

    public sa() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        re2.e0 e0Var = re2.j1.f394438b;
        if (e0Var != null) {
            com.tencent.mars.xlog.Log.i("Finder.CoLiveTaskManager", "destroy: invitationId=" + e0Var.f394390c + ", phase=" + e0Var.f394389b);
            e0Var.a();
        }
        re2.j1.f394438b = null;
        return jz5.f0.f302826a;
    }
}
