package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ea extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f134240d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f134241e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f134242f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f134240d = new java.util.ArrayList();
    }

    public final void O6(com.tencent.mm.plugin.finder.viewmodel.component.ba request) {
        kotlin.jvm.internal.o.g(request, "request");
        boolean z17 = this.f134242f;
        java.lang.String str = request.f133860b;
        if (z17 && this.f134241e) {
            com.tencent.mars.xlog.Log.i("Finder.FinderDialogCoordinatorUIC", "registerDialogRequest: skipped, dialog is showing, name=" + str);
            return;
        }
        java.util.List list = this.f134240d;
        kz5.h0.B(list, new com.tencent.mm.plugin.finder.viewmodel.component.ca(request));
        ((java.util.ArrayList) list).add(request);
        com.tencent.mars.xlog.Log.i("Finder.FinderDialogCoordinatorUIC", "registerDialogRequest: name=" + str + ", priority=" + request.f133859a);
        if (!this.f134242f || this.f134241e) {
            return;
        }
        P6();
    }

    public final void P6() {
        if (!this.f134242f || this.f134241e) {
            return;
        }
        java.util.List list = this.f134240d;
        if (((java.util.ArrayList) list).isEmpty()) {
            com.tencent.mars.xlog.Log.i("Finder.FinderDialogCoordinatorUIC", "showHighestPriority: no pending dialogs");
            return;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ba baVar = (com.tencent.mm.plugin.finder.viewmodel.component.ba) kz5.n0.X(kz5.n0.F0(list, new com.tencent.mm.plugin.finder.viewmodel.component.da()));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (true ^ kotlin.jvm.internal.o.b((com.tencent.mm.plugin.finder.viewmodel.component.ba) obj, baVar)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.tencent.mm.plugin.finder.viewmodel.component.ba) it.next()).f133860b);
        }
        ((java.util.ArrayList) list).clear();
        this.f134241e = true;
        com.tencent.mars.xlog.Log.i("Finder.FinderDialogCoordinatorUIC", "showHighestPriority: showing " + baVar.f133860b + ", dropped=" + arrayList2);
        baVar.f133861c.invoke();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        if (bundle != null) {
            this.f134242f = true;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        this.f134242f = true;
        P6();
    }
}
