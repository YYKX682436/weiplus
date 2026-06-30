package cw2;

/* loaded from: classes2.dex */
public interface fb {
    static /* synthetic */ void j(cw2.fb fbVar, r45.mb4 mb4Var, cw2.wa waVar, int i17, nk4.e eVar, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onBeforePlay");
        }
        if ((i18 & 8) != 0) {
            eVar = null;
        }
        fbVar.x(mb4Var, waVar, i17, eVar);
    }

    static /* synthetic */ void m(cw2.fb fbVar, r45.mb4 mb4Var, nk4.a aVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onPause");
        }
        if ((i17 & 2) != 0) {
            aVar = null;
        }
        fbVar.n(mb4Var, aVar);
    }

    static /* synthetic */ void w(cw2.fb fbVar, r45.mb4 mb4Var, int i17, int i18, nk4.r rVar, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onPlayProgress");
        }
        if ((i19 & 8) != 0) {
            rVar = null;
        }
        fbVar.e(mb4Var, i17, i18, rVar);
    }

    static /* synthetic */ void y(cw2.fb fbVar, cw2.wa waVar, nk4.a aVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onStopPlay");
        }
        if ((i17 & 2) != 0) {
            aVar = null;
        }
        fbVar.s(waVar, aVar);
    }

    void D(r45.mb4 mb4Var, long j17);

    void F(r45.mb4 mb4Var);

    void G(r45.mb4 mb4Var);

    void J(r45.mb4 mb4Var, cw2.wa waVar, int i17);

    void b(float f17);

    void d(r45.mb4 mb4Var, cw2.wa waVar, int i17);

    void e(r45.mb4 mb4Var, int i17, int i18, nk4.r rVar);

    void g(r45.mb4 mb4Var, nk4.t tVar);

    void h(r45.mb4 mb4Var);

    void n(r45.mb4 mb4Var, nk4.a aVar);

    void s(cw2.wa waVar, nk4.a aVar);

    default void t(long j17, long j18, long j19, java.lang.String str, int i17, bu2.h0 mediaHWInfo, java.lang.String specFormat) {
        kotlin.jvm.internal.o.g(mediaHWInfo, "mediaHWInfo");
        kotlin.jvm.internal.o.g(specFormat, "specFormat");
    }

    void u(r45.mb4 mb4Var, long j17, kz2.a aVar);

    void v(r45.mb4 mb4Var, long j17, long j18);

    void x(r45.mb4 mb4Var, cw2.wa waVar, int i17, nk4.e eVar);
}
