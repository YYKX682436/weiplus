package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class f4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f210397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.s4 f210398e;

    public f4(com.tencent.mm.ui.tools.s4 s4Var, android.view.View view) {
        this.f210398e = s4Var;
        this.f210397d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.s4 s4Var = this.f210398e;
        int i17 = s4Var.f210718y;
        s4Var.getClass();
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewAnimation", "dancy enter Animation not Start!");
            this.f210397d.requestLayout();
        }
    }
}
