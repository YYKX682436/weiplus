package j62;

/* loaded from: classes15.dex */
public abstract class g {
    public static final j62.f a(j62.a aVar, j62.c cVar) {
        boolean z17 = aVar != null && aVar.f297879d > 0 && aVar.c();
        boolean z18 = cVar != null && cVar.field_exptId > 0 && cVar.y0();
        if (!z17 && !z18) {
            return null;
        }
        if (z17 && !z18) {
            return aVar;
        }
        if (!z17 && z18) {
            return cVar;
        }
        if (z17 && z18) {
            return aVar.f297882g == 0 ? aVar : cVar;
        }
        return null;
    }
}
