package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class x7 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.b8 f117533d;

    public x7(com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var) {
        this.f117533d = b8Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        yf2.z zVar;
        ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).mj(4);
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f117533d.f116937e;
        if (lVar == null || (zVar = (yf2.z) lVar.U0(yf2.z.class)) == null) {
            return;
        }
        zVar.a7(true);
    }
}
