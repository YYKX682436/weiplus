package y1;

/* loaded from: classes14.dex */
public abstract class t {
    public static final z0.t a(z0.t tVar, yz5.l properties) {
        kotlin.jvm.internal.o.g(tVar, "<this>");
        kotlin.jvm.internal.o.g(properties, "properties");
        boolean z17 = androidx.compose.ui.platform.f3.f10562a;
        return z0.m.a(tVar, androidx.compose.ui.platform.e3.f10553d, new y1.r(properties));
    }

    public static final z0.t b(z0.t tVar, boolean z17, yz5.l properties) {
        kotlin.jvm.internal.o.g(tVar, "<this>");
        kotlin.jvm.internal.o.g(properties, "properties");
        boolean z18 = androidx.compose.ui.platform.f3.f10562a;
        return z0.m.a(tVar, androidx.compose.ui.platform.e3.f10553d, new y1.s(z17, properties));
    }

    public static /* synthetic */ z0.t c(z0.t tVar, boolean z17, yz5.l lVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        return b(tVar, z17, lVar);
    }
}
