package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes12.dex */
public final class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI f191772d;

    public m3(com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI) {
        this.f191772d = fileSelectorUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorUI", "btn cancel");
        com.tencent.mm.pluginsdk.ui.tools.o1 o1Var = com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI.I;
        this.f191772d.i7(true);
    }
}
