package s1;

/* loaded from: classes14.dex */
public abstract class h0 {
    public static int a(s1.i0 modifier, s1.u receiver, s1.t measurable, int i17) {
        kotlin.jvm.internal.o.g(receiver, "receiver");
        kotlin.jvm.internal.o.g(measurable, "measurable");
        kotlin.jvm.internal.o.g(modifier, "modifier");
        return modifier.g(new s1.x(receiver, receiver.getLayoutDirection()), new s1.z0(measurable, s1.b1.Max, s1.c1.Height), p2.d.b(0, i17, 0, 0, 13, null)).getHeight();
    }

    public static int b(s1.i0 modifier, s1.u receiver, s1.t measurable, int i17) {
        kotlin.jvm.internal.o.g(receiver, "receiver");
        kotlin.jvm.internal.o.g(measurable, "measurable");
        kotlin.jvm.internal.o.g(modifier, "modifier");
        return modifier.g(new s1.x(receiver, receiver.getLayoutDirection()), new s1.z0(measurable, s1.b1.Max, s1.c1.Width), p2.d.b(0, 0, 0, i17, 7, null)).getWidth();
    }

    public static int c(s1.i0 modifier, s1.u receiver, s1.t measurable, int i17) {
        kotlin.jvm.internal.o.g(receiver, "receiver");
        kotlin.jvm.internal.o.g(measurable, "measurable");
        kotlin.jvm.internal.o.g(modifier, "modifier");
        return modifier.g(new s1.x(receiver, receiver.getLayoutDirection()), new s1.z0(measurable, s1.b1.Min, s1.c1.Height), p2.d.b(0, i17, 0, 0, 13, null)).getHeight();
    }

    public static int d(s1.i0 modifier, s1.u receiver, s1.t measurable, int i17) {
        kotlin.jvm.internal.o.g(receiver, "receiver");
        kotlin.jvm.internal.o.g(measurable, "measurable");
        kotlin.jvm.internal.o.g(modifier, "modifier");
        return modifier.g(new s1.x(receiver, receiver.getLayoutDirection()), new s1.z0(measurable, s1.b1.Min, s1.c1.Width), p2.d.b(0, 0, 0, i17, 7, null)).getWidth();
    }
}
