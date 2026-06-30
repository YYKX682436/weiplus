package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class wx implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f136372d;

    public wx(android.content.Context context) {
        this.f136372d = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_create_scene", 18);
        intent.putExtra("key_router_to_profile", false);
        ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).qj(this.f136372d, intent);
    }
}
