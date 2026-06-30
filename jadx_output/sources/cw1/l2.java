package cw1;

/* loaded from: classes12.dex */
public final class l2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI f223099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f223100e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f223101f;

    public l2(com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI cleanCacheUI, java.util.List list, java.util.ArrayList arrayList) {
        this.f223099d = cleanCacheUI;
        this.f223100e = list;
        this.f223101f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI cleanCacheUI = this.f223099d;
        cleanCacheUI.f95692g = this.f223100e;
        cw1.o0 o0Var = cleanCacheUI.f95690e;
        if (o0Var != null) {
            o0Var.g(3, this.f223101f);
        }
    }
}
