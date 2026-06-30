package com.tencent.mm.vending.base;

/* loaded from: classes9.dex */
public class c extends fm5.d {
    public c(com.tencent.mm.vending.base.Vending vending, lm5.d dVar) {
        super(dVar);
    }

    @Override // fm5.d
    public void w(java.lang.Object obj, nm5.j jVar) {
        java.lang.Object a17 = jVar.a(0);
        em5.b bVar = (em5.b) ((com.tencent.mm.vending.base.n) obj);
        bVar.getClass();
        java.lang.Class cls = (java.lang.Class) a17;
        em5.f fVar = bVar.f255216a;
        fm5.d dVar = (fm5.d) ((java.util.HashMap) fVar.f255223m).get(cls);
        if (dVar != null) {
            nm5.a b17 = nm5.j.b(fVar.f255221h.get(cls));
            synchronized (dVar) {
                dVar.v(b17);
            }
        }
    }
}
