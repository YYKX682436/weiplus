package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes14.dex */
public final class uw extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x91.h f136181d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.sx f136182e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw(x91.h hVar, com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar) {
        super(0);
        this.f136181d = hVar;
        this.f136182e = sxVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj;
        x91.c cVar;
        x91.h hVar = this.f136181d;
        if (hVar != null && hVar.f452647a != null) {
            com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar = this.f136182e;
            if (sxVar.H != 3) {
                java.util.ArrayList S6 = sxVar.S6();
                x91.h hVar2 = this.f136181d;
                synchronized (S6) {
                    java.util.Iterator it = S6.iterator();
                    while (true) {
                        obj = null;
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        x91.h hVar3 = ((com.tencent.mm.plugin.finder.viewmodel.component.tv) next).f136061a;
                        java.lang.String str = (hVar3 == null || (cVar = hVar3.f452647a) == null) ? null : cVar.f452641i;
                        x91.c cVar2 = hVar2.f452647a;
                        if (com.tencent.mm.sdk.platformtools.t8.D0(str, cVar2 != null ? cVar2.f452641i : null)) {
                            obj = next;
                            break;
                        }
                    }
                }
                com.tencent.mm.plugin.finder.viewmodel.component.tv tvVar = (com.tencent.mm.plugin.finder.viewmodel.component.tv) obj;
                this.f136182e.W6(2);
                if (tvVar == null) {
                    this.f136182e.S6().add(new com.tencent.mm.plugin.finder.viewmodel.component.tv(this.f136181d));
                    this.f136182e.R6().notifyItemInserted(this.f136182e.S6().size() - 1);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
