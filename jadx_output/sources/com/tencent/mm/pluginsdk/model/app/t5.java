package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes9.dex */
public class t5 implements java.lang.Runnable {
    public t5(com.tencent.mm.pluginsdk.model.app.u5 u5Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sight.base.SightVideoJNI.registerALL();
    }
}
