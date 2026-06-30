package cw1;

/* loaded from: classes10.dex */
public final class o1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheProgressUI f223193d;

    public o1(com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheProgressUI cleanCacheProgressUI) {
        this.f223193d = cleanCacheProgressUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheProgressUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        view.setEnabled(false);
        yv1.i0 i0Var = this.f223193d.f95674d.f466000d;
        if (i0Var != null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CleanService", "Cancel clean tasks triggered");
            i0Var.f466072d.cancel();
            aw1.l0 l0Var = aw1.l0.f14568a;
            synchronized (l0Var) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CompressOriginalMediaService", "stopCompressOriginalMediaTaskAsync");
                if (aw1.l0.f14574g) {
                    l0Var.e(false);
                    android.os.CancellationSignal cancellationSignal = aw1.l0.f14577j;
                    if (cancellationSignal != null) {
                        cancellationSignal.cancel();
                    }
                    aw1.l0.f14577j = null;
                    d11.d dVar = aw1.l0.f14587t;
                    if (dVar == null) {
                        kotlin.jvm.internal.o.o("videoTransController");
                        throw null;
                    }
                    dVar.f225657b.a();
                    com.tencent.mars.xlog.Log.i("MicroMsg.CompressOriginalMediaService", "stopCompressOriginalMediaTaskAsync, done");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CompressOriginalMediaService", "stopCompressOriginalMediaTaskAsync task not running");
                }
            }
            bw1.f fVar = i0Var.f466071c;
            if (fVar != null) {
                fVar.a(jz5.f0.f302826a);
            }
            i0Var.d(true, false);
        }
        mt1.b0.s(35, 0L, new java.lang.Long[0]);
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheProgressUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
