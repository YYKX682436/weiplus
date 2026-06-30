package or3;

/* loaded from: classes11.dex */
public final class c implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.permission_view.PermissionView f347688a;

    public c(com.tencent.mm.plugin.profile.ui.mod.permission_view.PermissionView permissionView) {
        this.f347688a = permissionView;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        this.f347688a.setNotAllowSee(z17);
    }
}
