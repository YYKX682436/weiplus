package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes.dex */
public final class o3 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f205135a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yb5.d f205136b;

    public o3(com.tencent.mm.ui.widget.dialog.u3 u3Var, yb5.d dVar) {
        this.f205135a = u3Var;
        this.f205136b = dVar;
    }

    @Override // q80.f0
    public void fail() {
        db5.t7.makeText(this.f205136b.g(), com.tencent.mm.R.string.ggb, 0).show();
        this.f205135a.cancel();
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1293L, 32L, 1L);
        this.f205135a.cancel();
    }
}
