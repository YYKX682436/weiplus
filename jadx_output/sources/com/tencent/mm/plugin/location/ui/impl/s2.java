package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes8.dex */
public class s2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.q2 f144897d;

    public s2(com.tencent.mm.plugin.location.ui.impl.q2 q2Var) {
        this.f144897d = q2Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.location.ui.impl.q2 q2Var = this.f144897d;
        long longExtra = q2Var.n().getLongExtra("kFavInfoLocalId", -1L);
        com.tencent.mm.autogen.events.DeleteFavoriteEvent deleteFavoriteEvent = new com.tencent.mm.autogen.events.DeleteFavoriteEvent();
        am.w3 w3Var = deleteFavoriteEvent.f54084g;
        w3Var.f8258a = longExtra;
        w3Var.f8260c = 9;
        deleteFavoriteEvent.e();
        if (com.tencent.mm.sdk.platformtools.t8.m1(java.lang.Boolean.valueOf(deleteFavoriteEvent.f54085h.f8343a), false)) {
            q2Var.f144728d.finish();
        }
    }
}
