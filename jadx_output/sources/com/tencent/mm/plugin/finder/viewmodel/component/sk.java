package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class sk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.bl f135907d;

    public sk(com.tencent.mm.plugin.finder.viewmodel.component.bl blVar) {
        this.f135907d = blVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.appcompat.app.AppCompatActivity activity = this.f135907d.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        int S6 = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).S6();
        com.tencent.mm.plugin.finder.viewmodel.component.bl blVar = this.f135907d;
        if (blVar.G || S6 == 3) {
            com.tencent.mm.plugin.finder.viewmodel.component.bl.p7(blVar, false, null, false, 6, null);
        } else {
            blVar.H = true;
        }
    }
}
