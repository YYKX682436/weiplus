package dv0;

/* loaded from: classes5.dex */
public interface a {
    default boolean C5() {
        return false;
    }

    default void F5(au0.b boxItem) {
        kotlin.jvm.internal.o.g(boxItem, "boxItem");
    }

    default boolean H4(au0.b selectedBoxItem, com.tencent.maas.handlebox.model.MJHandleBoxItem.MJRectCorner corner) {
        kotlin.jvm.internal.o.g(selectedBoxItem, "selectedBoxItem");
        kotlin.jvm.internal.o.g(corner, "corner");
        return false;
    }

    default com.tencent.maas.handlebox.model.MJHandleBoxItem.MJRectCorner M5(android.graphics.PointF location, com.tencent.maas.base.Rect2 rect) {
        kotlin.jvm.internal.o.g(location, "location");
        kotlin.jvm.internal.o.g(rect, "rect");
        return com.tencent.maas.handlebox.model.MJHandleBoxItem.MJRectCorner.MJRectCornerInvalid;
    }

    default boolean N2(au0.b boxItem) {
        kotlin.jvm.internal.o.g(boxItem, "boxItem");
        return true;
    }

    default boolean P4(au0.b boxItem) {
        kotlin.jvm.internal.o.g(boxItem, "boxItem");
        return false;
    }

    default com.tencent.maas.base.MJID W0(android.graphics.PointF pointF) {
        kotlin.jvm.internal.o.g(pointF, "pointF");
        return null;
    }

    default void a4(au0.b boxItem, float f17, float f18, com.tencent.maas.base.Rect2 renderViewRect2) {
        kotlin.jvm.internal.o.g(boxItem, "boxItem");
        kotlin.jvm.internal.o.g(renderViewRect2, "renderViewRect2");
    }

    default java.lang.Object d5(boolean z17, kotlin.coroutines.Continuation continuation) {
        return java.lang.Boolean.FALSE;
    }

    default boolean l0(android.graphics.PointF location, com.tencent.maas.base.Rect2 rect) {
        kotlin.jvm.internal.o.g(location, "location");
        kotlin.jvm.internal.o.g(rect, "rect");
        return false;
    }

    default au0.b o6(com.tencent.maas.base.MJID mjID) {
        kotlin.jvm.internal.o.g(mjID, "mjID");
        return null;
    }

    default boolean q() {
        return false;
    }

    default void r2(au0.b boxItem, float f17, float f18, boolean z17) {
        kotlin.jvm.internal.o.g(boxItem, "boxItem");
    }

    default void r6(com.tencent.maas.moviecomposing.x onChange) {
        kotlin.jvm.internal.o.g(onChange, "onChange");
    }

    default boolean w5(au0.b boxItem) {
        kotlin.jvm.internal.o.g(boxItem, "boxItem");
        return true;
    }
}
