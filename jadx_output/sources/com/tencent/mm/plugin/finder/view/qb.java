package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class qb implements oc2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f132886a;

    public qb(java.lang.ref.WeakReference weakReference) {
        this.f132886a = weakReference;
    }

    @Override // oc2.e
    public void a(oc2.j result) {
        com.tencent.mm.plugin.finder.view.hb hbVar;
        kotlin.jvm.internal.o.g(result, "result");
        java.lang.ref.WeakReference weakReference = this.f132886a;
        if (weakReference == null || (hbVar = (com.tencent.mm.plugin.finder.view.hb) weakReference.get()) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.convert.ig igVar = (com.tencent.mm.plugin.finder.convert.ig) hbVar;
        igVar.f103666a.p(igVar.f103667b, igVar.f103668c, igVar.f103669d);
    }
}
