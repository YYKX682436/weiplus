package iy0;

/* loaded from: classes5.dex */
public interface c {
    void a(android.graphics.Canvas canvas, hy0.z2 z2Var);

    default boolean c(android.graphics.RectF borderRect, android.graphics.Rect screenVisibleRect) {
        kotlin.jvm.internal.o.g(borderRect, "borderRect");
        kotlin.jvm.internal.o.g(screenVisibleRect, "screenVisibleRect");
        return borderRect.left < ((float) screenVisibleRect.right) && ((float) screenVisibleRect.left) < borderRect.right && borderRect.top < ((float) screenVisibleRect.bottom) && ((float) screenVisibleRect.top) < borderRect.bottom;
    }
}
