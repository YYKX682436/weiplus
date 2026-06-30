package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class fz implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.rz f118380d;

    public fz(com.tencent.mm.plugin.finder.live.widget.rz rzVar) {
        this.f118380d = rzVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.tencent.mm.plugin.finder.live.widget.rz rzVar = this.f118380d;
        if (rzVar != null) {
            rzVar.a(false);
        }
    }
}
