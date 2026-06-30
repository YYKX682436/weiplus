package l0;

/* loaded from: classes14.dex */
public abstract class m2 {
    public static final java.lang.Float a(java.util.Map map, java.lang.Object obj) {
        java.lang.Object obj2;
        java.util.Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (kotlin.jvm.internal.o.b(((java.util.Map.Entry) obj2).getValue(), obj)) {
                break;
            }
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj2;
        if (entry != null) {
            return (java.lang.Float) entry.getKey();
        }
        return null;
    }

    public static z0.t b(z0.t swipeable, l0.a3 state, java.util.Map anchors, b0.y1 orientation, boolean z17, boolean z18, c0.o oVar, yz5.p pVar, l0.p1 p1Var, float f17, int i17, java.lang.Object obj) {
        l0.p1 p1Var2;
        float f18;
        boolean z19 = (i17 & 8) != 0 ? true : z17;
        boolean z27 = (i17 & 16) != 0 ? false : z18;
        l0.p1 p1Var3 = null;
        c0.o oVar2 = (i17 & 32) != 0 ? null : oVar;
        yz5.p thresholds = (i17 & 64) != 0 ? l0.g2.f314210d : pVar;
        if ((i17 & 128) != 0) {
            float f19 = l0.b2.f314057a;
            java.util.Set anchors2 = anchors.keySet();
            kotlin.jvm.internal.o.g(anchors2, "anchors");
            if (anchors2.size() > 1) {
                java.lang.Float n07 = kz5.n0.n0(anchors2);
                kotlin.jvm.internal.o.d(n07);
                float floatValue = n07.floatValue();
                java.lang.Float p07 = kz5.n0.p0(anchors2);
                kotlin.jvm.internal.o.d(p07);
                p1Var3 = new l0.p1(floatValue - p07.floatValue(), 10.0f, 10.0f);
            }
            p1Var2 = p1Var3;
        } else {
            p1Var2 = p1Var;
        }
        if ((i17 & 256) != 0) {
            float f27 = l0.b2.f314057a;
            f18 = l0.b2.f314057a;
        } else {
            f18 = f17;
        }
        kotlin.jvm.internal.o.g(swipeable, "$this$swipeable");
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(anchors, "anchors");
        kotlin.jvm.internal.o.g(orientation, "orientation");
        kotlin.jvm.internal.o.g(thresholds, "thresholds");
        boolean z28 = androidx.compose.ui.platform.f3.f10562a;
        return z0.m.a(swipeable, androidx.compose.ui.platform.e3.f10553d, new l0.l2(anchors, state, orientation, z19, oVar2, z27, p1Var2, thresholds, f18));
    }
}
