package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes12.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.widget.v f138304d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.fts.ui.widget.v vVar) {
        super(0);
        this.f138304d = vVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        if (com.tencent.mm.plugin.fts.ui.n3.h()) {
            com.tencent.mm.plugin.fts.ui.widget.v vVar = this.f138304d;
            if (vVar.v() && ((java.lang.Boolean) ((jz5.n) vVar.K).getValue()).booleanValue()) {
                z17 = true;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
