package zl2;

/* loaded from: classes13.dex */
public final class e implements j35.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f473727a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f473728b;

    public e(kotlin.jvm.internal.c0 c0Var, kotlinx.coroutines.q qVar) {
        this.f473727a = c0Var;
        this.f473728b = qVar;
    }

    @Override // j35.a
    public void a(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderCoroutineUtil", "onResultAllow");
        zl2.f.a(this.f473727a, this.f473728b, new com.tencent.mm.plugin.finder.assist.t0(absRequestFloatWindowPermissionDialog));
    }

    @Override // j35.a
    public void b(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        com.tencent.mars.xlog.Log.i("Finder.FinderCoroutineUtil", "onResultCancel");
        zl2.f.a(this.f473727a, this.f473728b, new com.tencent.mm.plugin.finder.assist.r0(absRequestFloatWindowPermissionDialog));
    }

    @Override // j35.a
    public void c(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderCoroutineUtil", "onResultRefuse");
        zl2.f.a(this.f473727a, this.f473728b, new com.tencent.mm.plugin.finder.assist.s0(absRequestFloatWindowPermissionDialog));
    }
}
