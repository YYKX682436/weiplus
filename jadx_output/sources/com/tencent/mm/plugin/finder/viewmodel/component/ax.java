package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes14.dex */
public final class ax extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x91.h f133807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.sx f133808e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(x91.h hVar, com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar) {
        super(0);
        this.f133807d = hVar;
        this.f133808e = sxVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        x91.c cVar;
        x91.h hVar = this.f133807d;
        if (hVar != null && hVar.f452647a != null) {
            com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar = this.f133808e;
            if (sxVar.H != 3) {
                java.util.ArrayList S6 = sxVar.S6();
                x91.h hVar2 = this.f133807d;
                synchronized (S6) {
                    int i18 = 0;
                    i17 = -1;
                    for (java.lang.Object obj : S6) {
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        com.tencent.mm.plugin.finder.viewmodel.component.tv tvVar = (com.tencent.mm.plugin.finder.viewmodel.component.tv) obj;
                        x91.h hVar3 = tvVar.f136061a;
                        java.lang.String str = (hVar3 == null || (cVar = hVar3.f452647a) == null) ? null : cVar.f452641i;
                        x91.c cVar2 = hVar2.f452647a;
                        if (com.tencent.mm.sdk.platformtools.t8.D0(str, cVar2 != null ? cVar2.f452641i : null)) {
                            tvVar.f136061a = hVar2;
                            i17 = i18;
                        }
                        i18 = i19;
                    }
                }
                this.f133808e.W6(2);
                if (i17 != -1 && i17 > 0 && i17 < this.f133808e.S6().size()) {
                    this.f133808e.R6().notifyItemChanged(i17);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
