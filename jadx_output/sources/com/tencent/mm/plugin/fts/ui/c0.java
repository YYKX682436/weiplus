package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSAddWw f138025d;

    public c0(com.tencent.mm.plugin.fts.ui.FTSAddWw fTSAddWw) {
        this.f138025d = fTSAddWw;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fts.ui.FTSAddWw fTSAddWw = this.f138025d;
        android.app.Dialog dialog = fTSAddWw.L;
        if (dialog != null) {
            dialog.dismiss();
            fTSAddWw.L = null;
        }
    }
}
