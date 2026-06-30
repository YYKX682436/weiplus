package mm2;

/* loaded from: classes3.dex */
public final class x5 {
    public x5(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(java.util.LinkedList showBoxItems) {
        kotlin.jvm.internal.o.g(showBoxItems, "showBoxItems");
        if (showBoxItems.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        for (java.lang.Object obj : showBoxItems) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            sb6.append("[index:" + i17 + ',');
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(pm0.b0.g((r45.p56) obj));
            sb7.append(']');
            sb6.append(sb7.toString());
            i17 = i18;
        }
        java.lang.String sb8 = sb6.toString();
        kotlin.jvm.internal.o.f(sb8, "toString(...)");
        return sb8;
    }
}
