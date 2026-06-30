package zx2;

/* loaded from: classes2.dex */
public final class f implements zx2.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zx2.h f477036a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout f477037b;

    public f(zx2.h hVar, com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout) {
        this.f477036a = hVar;
        this.f477037b = finderTabLayout;
    }

    @Override // zx2.o
    public void a(zx2.u uVar) {
        if (uVar != null) {
            zx2.h hVar = this.f477036a;
            zx2.z e76 = hVar.e7();
            android.content.Context context = this.f477037b.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.lang.Object obj = uVar.f477081a;
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.tabcomp.FinderBaseTab");
            e76.a(context, (zx2.i) obj);
            java.lang.Object obj2 = uVar.f477081a;
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.tabcomp.FinderBaseTab");
            android.view.View view = uVar.f477086f;
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
            ((zx2.i) obj2).d(true, (android.view.ViewGroup) view);
            java.lang.Object obj3 = uVar.f477081a;
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.tabcomp.FinderBaseTab");
            int indexOf = hVar.f7().indexOf((zx2.i) obj3);
            com.tencent.mars.xlog.Log.i("Finder.FinderTabUIC", "setCurrentPage:" + indexOf);
            if (indexOf == -1) {
                indexOf = 0;
            }
            hVar.u7(indexOf);
        }
    }

    @Override // zx2.o
    public void b(zx2.u uVar) {
        if (uVar == null || !(uVar.f477081a instanceof zx2.i)) {
            return;
        }
        zx2.z e76 = this.f477036a.e7();
        android.content.Context context = this.f477037b.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.Object obj = uVar.f477081a;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.tabcomp.FinderBaseTab");
        e76.b(context, (zx2.i) obj);
        java.lang.Object obj2 = uVar.f477081a;
        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.tabcomp.FinderBaseTab");
        android.view.View view = uVar.f477086f;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ((zx2.i) obj2).d(false, (android.view.ViewGroup) view);
    }

    @Override // zx2.o
    public void c(zx2.u uVar) {
    }
}
