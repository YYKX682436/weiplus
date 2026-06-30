package sr0;

/* loaded from: classes14.dex */
public interface i extends sr0.j, sr0.h {
    java.lang.Float a();

    java.lang.Float b();

    int d();

    void e(boolean z17);

    boolean g(float f17);

    java.lang.Float getHorizontalViewAngle();

    void h(float f17, float f18);

    java.lang.Object j(int i17, int i18, kotlin.coroutines.Continuation continuation);

    jz5.l k();

    java.lang.Object l(int i17, int i18, int i19, boolean z17, kotlin.coroutines.Continuation continuation);

    int m();

    java.lang.Object n(java.lang.Boolean bool, kotlin.coroutines.Continuation continuation);

    boolean needMirror();

    boolean o();

    java.lang.Object p(kotlin.coroutines.Continuation continuation);

    java.lang.Object q(kotlin.coroutines.Continuation continuation);

    java.lang.Object s(android.content.Context context, androidx.lifecycle.y yVar, nr0.x xVar, nr0.y yVar2, kotlin.coroutines.Continuation continuation);

    void setLightTorch(boolean z17);

    boolean t();

    void u(int i17);

    default boolean v() {
        return ((sr0.f) this).f411437n.f456161c;
    }

    java.lang.Object w(bs0.f fVar, kotlin.coroutines.Continuation continuation);

    void x(int i17);
}
