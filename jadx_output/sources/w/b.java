package w;

/* loaded from: classes13.dex */
public class b implements w.d {
    public final w.e a(w.c cVar) {
        return (w.e) ((w.a) cVar).f441809a;
    }

    public void b(w.c cVar, float f17) {
        w.e a17 = a(cVar);
        w.a aVar = (w.a) cVar;
        boolean useCompatPadding = aVar.f441810b.getUseCompatPadding();
        boolean preventCornerOverlap = aVar.f441810b.getPreventCornerOverlap();
        if (f17 != a17.f441815e || a17.f441816f != useCompatPadding || a17.f441817g != preventCornerOverlap) {
            a17.f441815e = f17;
            a17.f441816f = useCompatPadding;
            a17.f441817g = preventCornerOverlap;
            a17.c(null);
            a17.invalidateSelf();
        }
        c(aVar);
    }

    public void c(w.c cVar) {
        float f17;
        w.a aVar = (w.a) cVar;
        if (!aVar.f441810b.getUseCompatPadding()) {
            aVar.a(0, 0, 0, 0);
            return;
        }
        float f18 = a(aVar).f441815e;
        float f19 = a(aVar).f441811a;
        if (aVar.f441810b.getPreventCornerOverlap()) {
            f17 = (float) (f18 + ((1.0d - w.f.f441822a) * f19));
        } else {
            int i17 = w.f.f441823b;
            f17 = f18;
        }
        int ceil = (int) java.lang.Math.ceil(f17);
        int ceil2 = (int) java.lang.Math.ceil(w.f.a(f18, f19, r2.getPreventCornerOverlap()));
        aVar.a(ceil, ceil2, ceil, ceil2);
    }
}
