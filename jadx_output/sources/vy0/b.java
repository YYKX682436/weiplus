package vy0;

/* loaded from: classes5.dex */
public final class b implements com.tencent.mm.ui.widget.dialog.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f441406a;

    public b(yz5.l lVar) {
        this.f441406a = lVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.q3
    public final void dismiss() {
        com.tencent.mars.xlog.Log.i("MaasPermissionCheckHelp", "requestPermission cancel");
        this.f441406a.invoke(java.lang.Boolean.TRUE);
    }
}
