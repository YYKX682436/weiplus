package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class hz implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.rz f118608d;

    public hz(com.tencent.mm.plugin.finder.live.widget.rz rzVar) {
        this.f118608d = rzVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "download game dialog cancel");
        dialogInterface.dismiss();
        com.tencent.mm.plugin.finder.live.widget.rz rzVar = this.f118608d;
        if (rzVar != null) {
            rzVar.a(false);
        }
    }
}
