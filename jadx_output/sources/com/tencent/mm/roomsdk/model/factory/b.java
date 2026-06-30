package com.tencent.mm.roomsdk.model.factory;

/* loaded from: classes11.dex */
public class b implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.roomsdk.model.factory.c f192250d;

    public b(com.tencent.mm.roomsdk.model.factory.c cVar) {
        this.f192250d = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.roomsdk.model.factory.c cVar = this.f192250d;
        if (cVar.f192251f.equals(m1Var)) {
            gm0.j1.i();
            gm0.j1.n().f273288b.q(m1Var.getType(), cVar.f192252g);
            com.tencent.mm.ui.widget.dialog.u3 u3Var = cVar.f192249e;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            if (m1Var instanceof m65.a) {
                ((m65.a) m1Var).l(cVar.f192248d);
            }
            o65.b bVar = cVar.f192248d;
            if (bVar != null) {
                bVar.a(i17, i18, str, bVar);
            }
            if (i17 == 0 && i18 == 0) {
                o65.b bVar2 = cVar.f192246b;
                if (bVar2 != null) {
                    bVar2.a(i17, i18, str, bVar2);
                    return;
                }
                return;
            }
            o65.b bVar3 = cVar.f192247c;
            if (bVar3 != null) {
                bVar3.a(i17, i18, str, bVar3);
            }
        }
    }
}
