package dw3;

/* loaded from: classes10.dex */
public abstract class x0 {
    public static final void a(android.graphics.Rect rect, r45.vl5 proto) {
        kotlin.jvm.internal.o.g(rect, "rect");
        kotlin.jvm.internal.o.g(proto, "proto");
        proto.f388350d.clear();
        proto.f388350d.add(java.lang.Integer.valueOf(rect.left));
        proto.f388350d.add(java.lang.Integer.valueOf(rect.top));
        proto.f388350d.add(java.lang.Integer.valueOf(rect.right));
        proto.f388350d.add(java.lang.Integer.valueOf(rect.bottom));
    }

    public static final int b(int i17) {
        return i17 % 2 != 0 ? i17 - 1 : i17;
    }
}
