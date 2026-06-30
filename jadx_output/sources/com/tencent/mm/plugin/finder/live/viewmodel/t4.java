package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class t4 implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.v4 f117418d;

    public t4(com.tencent.mm.plugin.finder.live.viewmodel.v4 v4Var) {
        this.f117418d = v4Var;
    }

    @Override // com.tencent.mm.ui.tools.c5
    public final void w2(int i17, boolean z17) {
        com.tencent.mm.plugin.finder.live.viewmodel.v4 v4Var = this.f117418d;
        com.tencent.mars.xlog.Log.i(v4Var.f117472d, "onKeyboardHeightChanged, height:" + i17 + ", isResized:" + z17);
        v4Var.f117474f.setValue(new com.tencent.mm.plugin.finder.live.viewmodel.s4(i17 > 0, i17));
    }
}
