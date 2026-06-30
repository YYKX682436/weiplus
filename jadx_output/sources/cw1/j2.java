package cw1;

/* loaded from: classes3.dex */
public final class j2 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI f223020d;

    public j2(com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI cleanCacheUI) {
        this.f223020d = cleanCacheUI;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        ((com.tencent.mm.app.y7) f14.g.b()).d(new android.content.Intent().putExtra("Intro_Need_Clear_Top ", true), this.f223020d.getContext());
    }
}
