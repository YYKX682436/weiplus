package mm2;

/* loaded from: classes3.dex */
public final class g {
    public g(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(java.lang.String liveId) {
        boolean z17;
        kotlin.jvm.internal.o.g(liveId, "liveId");
        java.util.Iterator it = mm2.w.f329496v.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            if (r26.n0.D((java.lang.CharSequence) ((java.util.Map.Entry) it.next()).getKey(), liveId, false, 2, null)) {
                z17 = true;
                break;
            }
        }
        if (z17) {
            ae2.in inVar = ae2.in.f3688a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.C1).getValue()).r()).intValue() == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(java.lang.String liveId_adId) {
        kotlin.jvm.internal.o.g(liveId_adId, "liveId_adId");
        java.lang.Boolean bool = (java.lang.Boolean) mm2.w.f329496v.get(liveId_adId);
        if (!(bool == null ? false : bool.booleanValue())) {
            return false;
        }
        ae2.in inVar = ae2.in.f3688a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.C1).getValue()).r()).intValue() == 0;
    }
}
