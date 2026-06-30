package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class qf implements ki.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.NewChattingTabUI f209555d;

    public qf(com.tencent.mm.ui.NewChattingTabUI newChattingTabUI) {
        this.f209555d = newChattingTabUI;
    }

    @Override // ki.a
    public void a(int i17) {
        if (ih.a.h("clicfg_matrix_trim_memory_chattingtab_prepared_bitmap", false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "systemTrim: recyclePrepareBitmap");
            this.f209555d.p();
        }
    }

    @Override // ki.a
    public void b() {
        if (ih.a.h("clicfg_matrix_trim_memory_chattingtab_prepared_bitmap", false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "backgroundTrim: recyclePrepareBitmap");
            this.f209555d.p();
        }
    }
}
