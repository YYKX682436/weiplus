package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class gz implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f118483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f118484e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f118485f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.rz f118486g;

    public gz(boolean z17, android.content.Context context, java.lang.String str, com.tencent.mm.plugin.finder.live.widget.rz rzVar) {
        this.f118483d = z17;
        this.f118484e = context;
        this.f118485f = str;
        this.f118486g = rzVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "download game dialog ok isInstall:" + this.f118483d);
        com.tencent.mm.plugin.finder.assist.b3 b3Var = com.tencent.mm.plugin.finder.assist.b3.f102022a;
        java.lang.String str = this.f118485f;
        if (str == null) {
            str = "";
        }
        b3Var.c(this.f118484e, str);
        com.tencent.mm.plugin.finder.live.widget.rz rzVar = this.f118486g;
        if (rzVar != null) {
            rzVar.a(true);
        }
    }
}
