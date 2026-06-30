package uf2;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf2.f f427171d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xh2.b f427172e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(uf2.f fVar, xh2.b bVar) {
        super(0);
        this.f427171d = fVar;
        this.f427172e = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Map map;
        uf2.f fVar = this.f427171d;
        ((java.util.LinkedHashMap) fVar.f427180o).clear();
        java.util.Map map2 = fVar.f427180o;
        map2.putAll(this.f427172e.f454522a);
        java.util.Map map3 = fVar.f427178m;
        java.util.Iterator it = ((java.util.LinkedHashMap) map3).entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            map = fVar.f427179n;
            if (!hasNext) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            jz5.o oVar = (jz5.o) ((java.util.LinkedHashMap) map).get(entry.getKey());
            if (!map2.containsKey(entry.getKey()) || oVar == null) {
                fVar.c7((uf2.a) entry.getValue());
                it.remove();
            } else {
                ((uf2.a) entry.getValue()).f427164c = (android.graphics.Rect) ((java.util.LinkedHashMap) map2).get(entry.getKey());
                uf2.f.Z6(fVar, (uf2.a) entry.getValue(), ((java.lang.Number) oVar.f302842e).intValue());
            }
        }
        for (java.util.Map.Entry entry2 : ((java.util.LinkedHashMap) map).entrySet()) {
            if (!map3.containsKey(entry2.getKey())) {
                fVar.e7((java.lang.String) entry2.getKey(), (java.lang.String) ((jz5.o) entry2.getValue()).f302841d, ((java.lang.Number) ((jz5.o) entry2.getValue()).f302842e).intValue());
            }
        }
        return jz5.f0.f302826a;
    }
}
