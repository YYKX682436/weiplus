package j35;

/* loaded from: classes14.dex */
public class f0 implements j35.a {

    /* renamed from: a, reason: collision with root package name */
    public j35.a f297506a;

    public f0(j35.a aVar) {
        this.f297506a = aVar;
    }

    @Override // j35.a
    public void a(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog.O6(absRequestFloatWindowPermissionDialog);
        j35.a aVar = this.f297506a;
        if (aVar != null) {
            aVar.a(absRequestFloatWindowPermissionDialog);
        }
    }

    @Override // j35.a
    public void b(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog.O6(absRequestFloatWindowPermissionDialog);
        j35.a aVar = this.f297506a;
        if (aVar != null) {
            aVar.b(absRequestFloatWindowPermissionDialog);
        }
    }

    @Override // j35.a
    public void c(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog.O6(absRequestFloatWindowPermissionDialog);
        j35.a aVar = this.f297506a;
        if (aVar != null) {
            aVar.c(absRequestFloatWindowPermissionDialog);
        }
    }

    public void d() {
        this.f297506a = null;
        com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog.f189527i.clear();
        com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog.f189525g = null;
    }
}
