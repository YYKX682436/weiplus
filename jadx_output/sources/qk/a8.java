package qk;

/* loaded from: classes2.dex */
public interface a8 extends i95.m {
    static void E8(qk.a8 a8Var, android.app.Activity context, bw5.ar0 scene, bw5.v70 listenItem, qk.z7 z7Var, int i17, int i18, android.view.View view, android.graphics.Rect rect, android.graphics.Bitmap bitmap, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addToPlayList");
        }
        int i27 = (i19 & 16) != 0 ? 0 : i17;
        int i28 = (i19 & 32) != 0 ? 0 : i18;
        android.view.View view2 = (i19 & 64) != 0 ? null : view;
        android.graphics.Rect rect2 = (i19 & 128) != 0 ? null : rect;
        android.graphics.Bitmap bitmap2 = (i19 & 256) != 0 ? null : bitmap;
        ef0.q1 q1Var = (ef0.q1) a8Var;
        q1Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(listenItem, "listenItem");
        ef0.q1.wi(q1Var, context, null, scene, listenItem, z7Var, i27, i28, view2, rect2, bitmap2, false, 1024, null);
    }
}
