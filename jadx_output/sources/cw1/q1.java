package cw1;

/* loaded from: classes12.dex */
public final class q1 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheProgressUI f223255a;

    public q1(com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheProgressUI cleanCacheProgressUI) {
        this.f223255a = cleanCacheProgressUI;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        if (!kotlin.jvm.internal.o.b(str, "view_clk")) {
            return kz5.q0.f314001d;
        }
        jz5.l[] lVarArr = new jz5.l[5];
        int i17 = com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheProgressUI.f95673q;
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheProgressUI cleanCacheProgressUI = this.f223255a;
        lVarArr[0] = new jz5.l("storage_ui_version", java.lang.Integer.valueOf(cleanCacheProgressUI.U6() ? 2 : 1));
        lVarArr[1] = new jz5.l("storage_enter_scene", java.lang.Integer.valueOf(cleanCacheProgressUI.f95683p));
        yv1.g1 a17 = yv1.g1.f466040p.a(cleanCacheProgressUI.f95679i);
        lVarArr[2] = new jz5.l("storage_manage_sessionid", a17 != null ? a17.f466043b : null);
        lVarArr[3] = new jz5.l("cache_remove_size", java.lang.Long.valueOf(cleanCacheProgressUI.f95682o));
        lVarArr[4] = new jz5.l("cache_removed_size", java.lang.Long.valueOf(cleanCacheProgressUI.f95681n));
        return kz5.c1.k(lVarArr);
    }
}
