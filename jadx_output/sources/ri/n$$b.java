package ri;

/* loaded from: classes12.dex */
public final /* synthetic */ class n$$b implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        rh.d3 d3Var;
        rh.o2 o2Var = (rh.o2) obj;
        rh.o2 o2Var2 = (rh.o2) obj2;
        rh.d3 d3Var2 = o2Var.f395486c;
        if (d3Var2 != null && (d3Var = o2Var2.f395486c) != null) {
            long longValue = ((java.lang.Long) ((rh.f) d3Var2).f395377g.f395552a).longValue() - ((java.lang.Long) ((rh.f) d3Var).f395377g.f395552a).longValue();
            if (longValue == 0) {
                return 0;
            }
            return longValue > 0 ? -1 : 1;
        }
        oj.j.f("Matrix.battery.listener", "delta should not be null: " + o2Var + " vs " + o2Var2, new java.lang.Object[0]);
        return 0;
    }
}
