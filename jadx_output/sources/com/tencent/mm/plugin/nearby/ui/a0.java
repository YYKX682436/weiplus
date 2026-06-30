package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes3.dex */
public class a0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI f152124d;

    public a0(com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI nearbyFriendsUI) {
        this.f152124d = nearbyFriendsUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        gm0.j1.u().c().w(4104, java.lang.Boolean.TRUE);
        this.f152124d.finish();
    }
}
