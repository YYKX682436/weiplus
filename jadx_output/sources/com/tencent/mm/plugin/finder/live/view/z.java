package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class z implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.view.z f116846d = new com.tencent.mm.plugin.finder.live.view.z();

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        java.lang.String str;
        com.tencent.mm.plugin.finder.live.view.k0.Companion.getClass();
        str = com.tencent.mm.plugin.finder.live.view.k0.TAG;
        com.tencent.mars.xlog.Log.i(str, "showAlertDialog dismiss");
    }
}
