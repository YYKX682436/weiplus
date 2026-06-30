package yv1;

/* loaded from: classes12.dex */
public final class f1 {
    public f1(kotlin.jvm.internal.i iVar) {
    }

    public final yv1.g1 a(int i17) {
        boolean z17 = false;
        if (i17 >= 0 && i17 <= kz5.c0.h(yv1.g1.f466041q)) {
            z17 = true;
        }
        if (z17) {
            return (yv1.g1) yv1.g1.f466041q.get(i17);
        }
        return null;
    }

    public final yv1.g1 b(int i17) {
        yv1.g1 a17 = a(i17);
        return a17 == null ? new yv1.g1() : a17;
    }
}
