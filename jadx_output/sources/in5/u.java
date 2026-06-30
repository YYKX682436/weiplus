package in5;

/* loaded from: classes.dex */
public interface u {
    default boolean a(android.view.View itemView, android.view.MotionEvent event, in5.c item, int i17) {
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(item, "item");
        return false;
    }

    default void g(android.view.View itemView, in5.c data, int i17) {
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(data, "data");
    }

    default boolean v(android.view.View itemView, in5.c data, int i17) {
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(data, "data");
        return false;
    }
}
