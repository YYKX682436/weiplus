package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class g5 implements zh1.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI f191643a;

    public g5(com.tencent.mm.pluginsdk.ui.tools.h5 h5Var, com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI miniQBReaderUI) {
        this.f191643a = miniQBReaderUI;
    }

    @Override // zh1.u0
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MiniQBReaderUI", "onHidden, reset openMaterialReporter");
        this.f191643a.P = null;
    }
}
