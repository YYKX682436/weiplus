package e60;

/* loaded from: classes10.dex */
public interface i1 {
    static void a(e60.i1 i1Var, java.lang.String input, int i17, android.graphics.Matrix matrix, android.graphics.Rect clipRect, android.graphics.Rect contentRect, android.graphics.Rect viewRect, int i18, boolean z17, yz5.p callback, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: post");
        }
        if ((i19 & 128) != 0) {
            z17 = false;
        }
        z23.h hVar = (z23.h) i1Var;
        hVar.getClass();
        kotlin.jvm.internal.o.g(input, "input");
        kotlin.jvm.internal.o.g(matrix, "matrix");
        kotlin.jvm.internal.o.g(clipRect, "clipRect");
        kotlin.jvm.internal.o.g(contentRect, "contentRect");
        kotlin.jvm.internal.o.g(viewRect, "viewRect");
        kotlin.jvm.internal.o.g(callback, "callback");
        z23.e eVar = z17 ? new z23.e(hVar, hVar.f469745c, i18, callback) : i17 == 1 ? new z23.e(hVar, hVar.f469743a, i18, callback) : new z23.e(hVar, hVar.f469744b, i18, callback);
        eVar.f469734i = clipRect;
        eVar.f469735m = viewRect;
        eVar.f469736n = contentRect;
        eVar.f469731f = input;
        eVar.f469733h = matrix;
        eVar.f469732g = i17;
        hVar.f469746d.execute(eVar);
    }
}
