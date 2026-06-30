package com.tencent.mm.roomsdk.model.factory;

/* loaded from: classes11.dex */
public class i implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.roomsdk.model.factory.j f192268d;

    public i(com.tencent.mm.roomsdk.model.factory.j jVar) {
        this.f192268d = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17 = m1Var instanceof m65.a;
        com.tencent.mm.roomsdk.model.factory.j jVar = this.f192268d;
        if (z17) {
            jVar.getClass();
            ((m65.a) m1Var).l(null);
        }
        jVar.getClass();
        if (i17 == 0 && i18 == 0) {
            o65.b bVar = jVar.f192270b;
            if (bVar != null) {
                bVar.a(i17, i18, str, bVar);
                return;
            }
            return;
        }
        o65.b bVar2 = jVar.f192271c;
        if (bVar2 != null) {
            bVar2.a(i17, i18, str, bVar2);
        }
    }
}
