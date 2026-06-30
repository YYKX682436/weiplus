package dn2;

/* loaded from: classes3.dex */
public interface e {
    java.lang.Integer a();

    default java.lang.Object b(android.view.View view, dk2.zf zfVar, kotlin.coroutines.Continuation continuation) {
        return jz5.f0.f302826a;
    }

    android.view.View c(android.view.View view, dk2.zf zfVar, cn2.p0 p0Var);

    default void d(cn2.k curConfig, yz5.l continueAnim) {
        kotlin.jvm.internal.o.g(curConfig, "curConfig");
        kotlin.jvm.internal.o.g(continueAnim, "continueAnim");
    }

    int getLayoutId();
}
