package ri;

/* loaded from: classes.dex */
public final /* synthetic */ class q$$a implements r.a {
    @Override // r.a
    public final java.lang.Object apply(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        double d17 = 0.0d;
        if (list.isEmpty()) {
            return java.lang.Double.valueOf(0.0d);
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            d17 += ((java.lang.Double) it.next()).doubleValue();
        }
        return java.lang.Double.valueOf(d17 / list.size());
    }
}
