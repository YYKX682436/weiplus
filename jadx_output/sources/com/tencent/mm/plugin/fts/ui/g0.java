package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class g0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tg3.r1 f138061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSBaseMainUI f138062e;

    public g0(com.tencent.mm.plugin.fts.ui.FTSBaseMainUI fTSBaseMainUI, tg3.r1 r1Var) {
        this.f138062e = fTSBaseMainUI;
        this.f138061d = r1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f138061d);
        this.f138062e.S1 = null;
    }
}
