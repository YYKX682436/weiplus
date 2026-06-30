package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class w implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderActivityDescUI f129969d;

    public w(com.tencent.mm.plugin.finder.ui.FinderActivityDescUI finderActivityDescUI) {
        this.f129969d = finderActivityDescUI;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f129969d.f128497x = null;
    }
}
