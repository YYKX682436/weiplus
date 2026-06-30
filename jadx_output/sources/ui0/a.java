package ui0;

/* loaded from: classes4.dex */
public abstract class a {
    public static final boolean a(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<this>");
        com.tencent.mm.storage.z3 q17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(str);
        if (q17 == null || q17.o2() || q17.y2()) {
            return true;
        }
        return p94.w0.f() != null ? ((com.tencent.mm.plugin.sns.storage.r2) p94.w0.f()).P0(str, 5L) : false;
    }
}
