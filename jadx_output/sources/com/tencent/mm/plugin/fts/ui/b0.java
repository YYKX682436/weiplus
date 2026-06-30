package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class b0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ab0.v f138019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSAddWw f138020e;

    public b0(com.tencent.mm.plugin.fts.ui.FTSAddWw fTSAddWw, ab0.v vVar) {
        this.f138020e = fTSAddWw;
        this.f138019d = vVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d((com.tencent.mm.modelbase.m1) this.f138019d);
        this.f138020e.L = null;
    }
}
