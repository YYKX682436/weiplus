package rb2;

/* loaded from: classes10.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final jz5.l a(float f17, float f18) {
        java.lang.Object obj;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.R.dimen.f479664c2);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.tencent.mm.R.dimen.f479734dr);
        if (f17 <= 0.0f || f18 <= 0.0f) {
            rb2.a aVar = rb2.b.f393570g;
            return new jz5.l(valueOf2, valueOf);
        }
        float f19 = f17 / f18;
        java.lang.Object[] array = rb2.b.f393572i.toArray(new rb2.b[0]);
        if (array.length == 0) {
            obj = null;
        } else {
            java.lang.Object obj2 = array[0];
            int length = array.length - 1;
            if (length != 0) {
                float abs = java.lang.Math.abs(f19 - ((rb2.b) obj2).f393573d);
                kz5.x0 it = new e06.k(1, length).iterator();
                while (((e06.j) it).f246214f) {
                    java.lang.Object obj3 = array[it.b()];
                    float abs2 = java.lang.Math.abs(f19 - ((rb2.b) obj3).f393573d);
                    if (java.lang.Float.compare(abs, abs2) > 0) {
                        obj2 = obj3;
                        abs = abs2;
                    }
                }
            }
            obj = obj2;
        }
        rb2.b bVar = (rb2.b) obj;
        if (bVar != null) {
            return new jz5.l(java.lang.Integer.valueOf(bVar.f393574e), java.lang.Integer.valueOf(bVar.f393575f));
        }
        rb2.a aVar2 = rb2.b.f393570g;
        return new jz5.l(valueOf2, valueOf);
    }
}
