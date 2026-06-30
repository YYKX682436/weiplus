package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes14.dex */
public final class yw extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x91.h f136617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.sx f136618e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(x91.h hVar, com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar) {
        super(0);
        this.f136617d = hVar;
        this.f136618e = sxVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        x91.c cVar;
        x91.h hVar = this.f136617d;
        if (hVar != null && hVar.f452647a != null) {
            com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar = this.f136618e;
            if (sxVar.H != 3) {
                java.util.ArrayList S6 = sxVar.S6();
                x91.h hVar2 = this.f136617d;
                synchronized (S6) {
                    int i18 = 0;
                    i17 = -1;
                    for (java.lang.Object obj : S6) {
                        int i19 = i18 + 1;
                        java.lang.String str = null;
                        if (i18 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        com.tencent.mm.plugin.finder.viewmodel.component.tv tvVar = (com.tencent.mm.plugin.finder.viewmodel.component.tv) obj;
                        x91.c cVar2 = hVar2.f452647a;
                        java.lang.String str2 = cVar2 != null ? cVar2.f452641i : null;
                        x91.h hVar3 = tvVar.f136061a;
                        if (hVar3 != null && (cVar = hVar3.f452647a) != null) {
                            str = cVar.f452641i;
                        }
                        if (com.tencent.mm.sdk.platformtools.t8.D0(str2, str)) {
                            i17 = i18;
                        }
                        i18 = i19;
                    }
                }
                if (i17 != -1 && i17 > 0 && i17 < this.f136618e.S6().size()) {
                    this.f136618e.S6().remove(i17);
                    this.f136618e.R6().notifyItemRemoved(i17);
                }
                if (this.f136618e.S6().isEmpty()) {
                    this.f136618e.W6(1);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
