package com.tencent.mm.sns_compose.page;

/* loaded from: classes14.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f193460d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q85.g f193461e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(androidx.lifecycle.y yVar, q85.g gVar) {
        super(1);
        this.f193460d = yVar;
        this.f193461e = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        kotlin.jvm.internal.o.g(DisposableEffect, "$this$DisposableEffect");
        final q85.g gVar = this.f193461e;
        androidx.lifecycle.v vVar = new androidx.lifecycle.v() { // from class: com.tencent.mm.sns_compose.page.ListItemsKt$VideoContent$1$observer$1
            @Override // androidx.lifecycle.v
            public final void onStateChanged(androidx.lifecycle.y yVar, androidx.lifecycle.m event) {
                pk4.d dVar;
                kotlin.jvm.internal.o.g(yVar, "<anonymous parameter 0>");
                kotlin.jvm.internal.o.g(event, "event");
                if (event != androidx.lifecycle.m.ON_START) {
                    androidx.lifecycle.m mVar = androidx.lifecycle.m.ON_PAUSE;
                    q85.g gVar2 = q85.g.this;
                    if (event == mVar) {
                        pk4.d dVar2 = gVar2.f360807i;
                        if (dVar2 != null) {
                            dVar2.pause();
                            return;
                        }
                        return;
                    }
                    if (event != androidx.lifecycle.m.ON_DESTROY) {
                        if (event == androidx.lifecycle.m.ON_RESUME && gVar2.f360808m && (dVar = gVar2.f360807i) != null) {
                            dVar.start();
                            return;
                        }
                        return;
                    }
                    pk4.d dVar3 = gVar2.f360807i;
                    if (dVar3 != null) {
                        dVar3.stop();
                    }
                    gVar2.f360807i = null;
                    java.util.List list = q85.g.f360801o;
                    java.util.List list2 = q85.g.f360801o;
                    kotlin.jvm.internal.o.f(list2, "access$getPlayerRecycler$cp(...)");
                    java.util.Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        ((pk4.d) it.next()).stop();
                    }
                    q85.g.f360801o.clear();
                }
            }
        };
        androidx.lifecycle.y yVar = this.f193460d;
        yVar.mo133getLifecycle().a(vVar);
        return new com.tencent.mm.sns_compose.page.e0(yVar, vVar);
    }
}
