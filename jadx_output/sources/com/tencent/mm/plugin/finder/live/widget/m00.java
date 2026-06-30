package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class m00 implements com.tencent.mm.plugin.finder.live.widget.rz {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.m10 f118994a;

    public m00(com.tencent.mm.plugin.finder.live.widget.m10 m10Var) {
        this.f118994a = m10Var;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.rz
    public void a(boolean z17) {
        com.tencent.mm.plugin.finder.live.widget.m10 m10Var = this.f118994a;
        m10Var.I = false;
        if (z17) {
            m10Var.g(0);
        } else {
            m10Var.g(1);
        }
        m10Var.t();
    }
}
