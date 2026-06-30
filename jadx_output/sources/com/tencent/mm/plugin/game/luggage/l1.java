package com.tencent.mm.plugin.game.luggage;

/* loaded from: classes8.dex */
public class l1 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.m1 f139807d;

    public l1(com.tencent.mm.plugin.game.luggage.m1 m1Var) {
        this.f139807d = m1Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        boolean z17 = bundle.getBoolean("preload_success");
        boolean z18 = bundle.getBoolean("has_preload");
        com.tencent.mm.plugin.game.luggage.m1 m1Var = this.f139807d;
        if (m1Var != null) {
            m1Var.a(z18, z17);
        }
    }
}
