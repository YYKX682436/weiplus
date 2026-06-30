package we2;

/* loaded from: classes3.dex */
public final class i {
    public i(kotlin.jvm.internal.i iVar) {
    }

    public final int a() {
        return ((java.lang.Number) ((jz5.n) we2.o.f445238k).getValue()).intValue();
    }

    public final int b() {
        return ((java.lang.Number) ((jz5.n) we2.o.f445237j).getValue()).intValue();
    }

    public final boolean c(android.content.Context context, dk2.zf commentData) {
        boolean z17;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(commentData, "commentData");
        java.lang.String a17 = commentData.a();
        if (kotlin.jvm.internal.o.b(a17, c01.z1.r())) {
            return true;
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        java.util.LinkedList<r45.of1> a18 = com.tencent.mm.plugin.finder.live.util.n2.f115640a.a();
        if (!a18.isEmpty()) {
            for (r45.of1 of1Var : a18) {
                if (kotlin.jvm.internal.o.b(of1Var.getString(3), a17) && of1Var.getInteger(2) == 2) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        return z17 || kotlin.jvm.internal.o.b(a17, xy2.c.e(context));
    }
}
