package qk;

/* loaded from: classes11.dex */
public interface k6 extends i95.m {
    static boolean Hb(qk.k6 k6Var, qk.p9 p9Var, java.lang.String str, bw5.v70 v70Var, java.lang.String str2, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resume");
        }
        if ((i17 & 1) != 0) {
            p9Var = null;
        }
        if ((i17 & 2) != 0) {
            str = null;
        }
        if ((i17 & 4) != 0) {
            v70Var = null;
        }
        if ((i17 & 8) != 0) {
            str2 = null;
        }
        rk4.a aVar = (rk4.a) k6Var;
        java.util.ArrayList arrayList = aVar.f396526d;
        if (arrayList == null) {
            kotlin.jvm.internal.o.o("mImplList");
            throw null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qk.j6 j6Var = (qk.j6) it.next();
            if (j6Var.m(p9Var, str, v70Var, str2)) {
                return j6Var.resume();
            }
        }
        qk.j6 j6Var2 = aVar.f396527e;
        if (j6Var2 != null) {
            return ((rk4.h) j6Var2).resume();
        }
        kotlin.jvm.internal.o.o("mFallbackImpl");
        throw null;
    }

    static /* synthetic */ void I1(qk.k6 k6Var, android.content.Context context, boolean z17, bw5.lp0 lp0Var, il4.e eVar, bw5.o50 o50Var, android.os.Bundle bundle, bw5.ar0 ar0Var, qk.a aVar, java.lang.Boolean bool, yz5.a aVar2, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToTingPlayerActivity");
        }
        ((rk4.a) k6Var).Ri(context, (i17 & 2) != 0 ? false : z17, (i17 & 4) != 0 ? null : lp0Var, (i17 & 8) != 0 ? null : eVar, (i17 & 16) != 0 ? null : o50Var, (i17 & 32) != 0 ? null : bundle, (i17 & 64) != 0 ? bw5.ar0.TingScene_UnDefined : ar0Var, (i17 & 128) != 0 ? qk.a.f364000d : aVar, (i17 & 256) != 0 ? java.lang.Boolean.FALSE : bool, (i17 & 512) != 0 ? null : aVar2, (i17 & 1024) == 0 ? str : null);
    }

    static android.content.Context R4(qk.k6 k6Var, qk.p9 p9Var, java.lang.String str, bw5.v70 v70Var, java.lang.String str2, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStartActivityContext");
        }
        if ((i17 & 1) != 0) {
            p9Var = null;
        }
        if ((i17 & 2) != 0) {
            str = null;
        }
        if ((i17 & 4) != 0) {
            v70Var = null;
        }
        if ((i17 & 8) != 0) {
            str2 = null;
        }
        rk4.a aVar = (rk4.a) k6Var;
        java.util.ArrayList arrayList = aVar.f396526d;
        if (arrayList == null) {
            kotlin.jvm.internal.o.o("mImplList");
            throw null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qk.j6 j6Var = (qk.j6) it.next();
            if (j6Var.m(p9Var, str, v70Var, str2)) {
                return j6Var.v();
            }
        }
        qk.j6 j6Var2 = aVar.f396527e;
        if (j6Var2 != null) {
            return ((rk4.h) j6Var2).v();
        }
        kotlin.jvm.internal.o.o("mFallbackImpl");
        throw null;
    }

    static void U3(qk.k6 k6Var, boolean z17, qk.p9 p9Var, java.lang.String str, bw5.v70 v70Var, java.lang.String str2, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showAudioFloatBall");
        }
        if ((i17 & 2) != 0) {
            p9Var = null;
        }
        if ((i17 & 4) != 0) {
            str = null;
        }
        if ((i17 & 8) != 0) {
            v70Var = null;
        }
        if ((i17 & 16) != 0) {
            str2 = null;
        }
        rk4.a aVar = (rk4.a) k6Var;
        java.util.ArrayList arrayList = aVar.f396526d;
        if (arrayList == null) {
            kotlin.jvm.internal.o.o("mImplList");
            throw null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qk.j6 j6Var = (qk.j6) it.next();
            if (j6Var.m(p9Var, str, v70Var, str2)) {
                j6Var.n(z17);
                return;
            }
        }
        qk.j6 j6Var2 = aVar.f396527e;
        if (j6Var2 != null) {
            ((rk4.h) j6Var2).n(z17);
        } else {
            kotlin.jvm.internal.o.o("mFallbackImpl");
            throw null;
        }
    }

    static bw5.cr0 Wi(qk.k6 k6Var, qk.p9 p9Var, java.lang.String str, bw5.v70 v70Var, java.lang.String str2, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: playingTapInfo");
        }
        if ((i17 & 1) != 0) {
            p9Var = null;
        }
        if ((i17 & 2) != 0) {
            str = null;
        }
        if ((i17 & 4) != 0) {
            v70Var = null;
        }
        if ((i17 & 8) != 0) {
            str2 = null;
        }
        rk4.a aVar = (rk4.a) k6Var;
        java.util.ArrayList arrayList = aVar.f396526d;
        if (arrayList == null) {
            kotlin.jvm.internal.o.o("mImplList");
            throw null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qk.j6 j6Var = (qk.j6) it.next();
            if (j6Var.m(p9Var, str, v70Var, str2)) {
                return j6Var.x();
            }
        }
        qk.j6 j6Var2 = aVar.f396527e;
        if (j6Var2 != null) {
            return ((rk4.h) j6Var2).x();
        }
        kotlin.jvm.internal.o.o("mFallbackImpl");
        throw null;
    }

    static int X7(qk.k6 k6Var, qk.p9 p9Var, java.lang.String str, bw5.v70 v70Var, java.lang.String str2, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDuration");
        }
        if ((i17 & 1) != 0) {
            p9Var = null;
        }
        if ((i17 & 2) != 0) {
            str = null;
        }
        if ((i17 & 4) != 0) {
            v70Var = null;
        }
        if ((i17 & 8) != 0) {
            str2 = null;
        }
        rk4.a aVar = (rk4.a) k6Var;
        java.util.ArrayList arrayList = aVar.f396526d;
        if (arrayList == null) {
            kotlin.jvm.internal.o.o("mImplList");
            throw null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qk.j6 j6Var = (qk.j6) it.next();
            if (j6Var.m(p9Var, str, v70Var, str2)) {
                return j6Var.getDuration();
            }
        }
        qk.j6 j6Var2 = aVar.f396527e;
        if (j6Var2 != null) {
            return ((rk4.h) j6Var2).getDuration();
        }
        kotlin.jvm.internal.o.o("mFallbackImpl");
        throw null;
    }

    static boolean Xg(qk.k6 k6Var, qk.p9 p9Var, java.lang.String str, bw5.v70 v70Var, java.lang.String str2, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pause");
        }
        if ((i17 & 1) != 0) {
            p9Var = null;
        }
        if ((i17 & 2) != 0) {
            str = null;
        }
        if ((i17 & 4) != 0) {
            v70Var = null;
        }
        if ((i17 & 8) != 0) {
            str2 = null;
        }
        rk4.a aVar = (rk4.a) k6Var;
        java.util.ArrayList arrayList = aVar.f396526d;
        if (arrayList == null) {
            kotlin.jvm.internal.o.o("mImplList");
            throw null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qk.j6 j6Var = (qk.j6) it.next();
            if (j6Var.m(p9Var, str, v70Var, str2)) {
                return j6Var.pause();
            }
        }
        qk.j6 j6Var2 = aVar.f396527e;
        if (j6Var2 != null) {
            ((rk4.h) j6Var2).pause();
            return true;
        }
        kotlin.jvm.internal.o.o("mFallbackImpl");
        throw null;
    }

    static boolean Yc(qk.k6 k6Var, qk.p9 p9Var, java.lang.String str, bw5.v70 v70Var, java.lang.String str2, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isAvailable");
        }
        if ((i17 & 1) != 0) {
            p9Var = null;
        }
        if ((i17 & 2) != 0) {
            str = null;
        }
        if ((i17 & 4) != 0) {
            v70Var = null;
        }
        if ((i17 & 8) != 0) {
            str2 = null;
        }
        rk4.a aVar = (rk4.a) k6Var;
        java.util.ArrayList arrayList = aVar.f396526d;
        if (arrayList == null) {
            kotlin.jvm.internal.o.o("mImplList");
            throw null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qk.j6 j6Var = (qk.j6) it.next();
            if (j6Var.m(p9Var, str, v70Var, str2)) {
                return j6Var.isAvailable();
            }
        }
        qk.j6 j6Var2 = aVar.f396527e;
        if (j6Var2 != null) {
            return ((rk4.h) j6Var2).isAvailable();
        }
        kotlin.jvm.internal.o.o("mFallbackImpl");
        throw null;
    }

    static void ch(qk.k6 k6Var, boolean z17, qk.p9 p9Var, java.lang.String str, bw5.v70 v70Var, java.lang.String str2, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setCouldShowFloatBall");
        }
        if ((i17 & 2) != 0) {
            p9Var = null;
        }
        if ((i17 & 4) != 0) {
            str = null;
        }
        if ((i17 & 8) != 0) {
            v70Var = null;
        }
        if ((i17 & 16) != 0) {
            str2 = null;
        }
        rk4.a aVar = (rk4.a) k6Var;
        java.util.ArrayList arrayList = aVar.f396526d;
        if (arrayList == null) {
            kotlin.jvm.internal.o.o("mImplList");
            throw null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qk.j6 j6Var = (qk.j6) it.next();
            if (j6Var.m(p9Var, str, v70Var, str2)) {
                j6Var.p(z17);
                return;
            }
        }
        qk.j6 j6Var2 = aVar.f396527e;
        if (j6Var2 != null) {
            ((rk4.h) j6Var2).p(z17);
        } else {
            kotlin.jvm.internal.o.o("mFallbackImpl");
            throw null;
        }
    }

    static boolean hi(qk.k6 k6Var, java.lang.String str, qk.p9 p9Var, java.lang.String str2, bw5.v70 v70Var, java.lang.String str3, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isPaused");
        }
        if ((i17 & 2) != 0) {
            p9Var = null;
        }
        if ((i17 & 4) != 0) {
            str2 = null;
        }
        if ((i17 & 8) != 0) {
            v70Var = null;
        }
        if ((i17 & 16) != 0) {
            str3 = null;
        }
        rk4.a aVar = (rk4.a) k6Var;
        java.util.ArrayList arrayList = aVar.f396526d;
        if (arrayList == null) {
            kotlin.jvm.internal.o.o("mImplList");
            throw null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qk.j6 j6Var = (qk.j6) it.next();
            if (j6Var.m(p9Var, str2, v70Var, str3)) {
                return j6Var.q(str);
            }
        }
        qk.j6 j6Var2 = aVar.f396527e;
        if (j6Var2 != null) {
            return ((rk4.h) j6Var2).q(str);
        }
        kotlin.jvm.internal.o.o("mFallbackImpl");
        throw null;
    }

    static boolean i2(qk.k6 k6Var, java.lang.String clientId, qk.p9 p9Var, java.lang.String str, bw5.v70 v70Var, java.lang.String str2, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isPlaying");
        }
        if ((i17 & 2) != 0) {
            p9Var = null;
        }
        if ((i17 & 4) != 0) {
            str = null;
        }
        if ((i17 & 8) != 0) {
            v70Var = null;
        }
        if ((i17 & 16) != 0) {
            str2 = null;
        }
        rk4.a aVar = (rk4.a) k6Var;
        aVar.getClass();
        kotlin.jvm.internal.o.g(clientId, "clientId");
        java.util.ArrayList arrayList = aVar.f396526d;
        if (arrayList == null) {
            kotlin.jvm.internal.o.o("mImplList");
            throw null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qk.j6 j6Var = (qk.j6) it.next();
            if (j6Var.m(p9Var, str, v70Var, str2)) {
                return j6Var.e(clientId);
            }
        }
        qk.j6 j6Var2 = aVar.f396527e;
        if (j6Var2 != null) {
            return ((rk4.h) j6Var2).e(clientId);
        }
        kotlin.jvm.internal.o.o("mFallbackImpl");
        throw null;
    }

    static /* synthetic */ bw5.lp0 i6(qk.k6 k6Var, qk.p9 p9Var, java.lang.String str, bw5.v70 v70Var, java.lang.String str2, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: playingItem");
        }
        if ((i17 & 1) != 0) {
            p9Var = null;
        }
        if ((i17 & 2) != 0) {
            str = null;
        }
        if ((i17 & 4) != 0) {
            v70Var = null;
        }
        if ((i17 & 8) != 0) {
            str2 = null;
        }
        return ((rk4.a) k6Var).Zi(p9Var, str, v70Var, str2);
    }

    static void q2(qk.k6 k6Var, float f17, qk.p9 p9Var, java.lang.String str, bw5.v70 v70Var, java.lang.String str2, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setPlayRate");
        }
        if ((i17 & 2) != 0) {
            p9Var = null;
        }
        if ((i17 & 4) != 0) {
            str = null;
        }
        if ((i17 & 8) != 0) {
            v70Var = null;
        }
        if ((i17 & 16) != 0) {
            str2 = null;
        }
        rk4.a aVar = (rk4.a) k6Var;
        java.util.ArrayList arrayList = aVar.f396526d;
        if (arrayList == null) {
            kotlin.jvm.internal.o.o("mImplList");
            throw null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qk.j6 j6Var = (qk.j6) it.next();
            if (j6Var.m(p9Var, str, v70Var, str2)) {
                j6Var.c(f17);
                return;
            }
        }
        qk.j6 j6Var2 = aVar.f396527e;
        if (j6Var2 != null) {
            ((rk4.h) j6Var2).c(f17);
        } else {
            kotlin.jvm.internal.o.o("mFallbackImpl");
            throw null;
        }
    }

    static float tg(qk.k6 k6Var, qk.p9 p9Var, java.lang.String str, bw5.v70 v70Var, java.lang.String str2, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPlayRate");
        }
        if ((i17 & 1) != 0) {
            p9Var = null;
        }
        if ((i17 & 2) != 0) {
            str = null;
        }
        if ((i17 & 4) != 0) {
            v70Var = null;
        }
        if ((i17 & 8) != 0) {
            str2 = null;
        }
        rk4.a aVar = (rk4.a) k6Var;
        java.util.ArrayList arrayList = aVar.f396526d;
        if (arrayList == null) {
            kotlin.jvm.internal.o.o("mImplList");
            throw null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qk.j6 j6Var = (qk.j6) it.next();
            if (j6Var.m(p9Var, str, v70Var, str2)) {
                return j6Var.h();
            }
        }
        qk.j6 j6Var2 = aVar.f396527e;
        if (j6Var2 != null) {
            return ((rk4.h) j6Var2).h();
        }
        kotlin.jvm.internal.o.o("mFallbackImpl");
        throw null;
    }

    static boolean vd(qk.k6 k6Var, qk.p9 p9Var, java.lang.String str, bw5.v70 v70Var, java.lang.String str2, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isPaused");
        }
        if ((i17 & 1) != 0) {
            p9Var = null;
        }
        if ((i17 & 2) != 0) {
            str = null;
        }
        if ((i17 & 4) != 0) {
            v70Var = null;
        }
        if ((i17 & 8) != 0) {
            str2 = null;
        }
        rk4.a aVar = (rk4.a) k6Var;
        java.util.ArrayList arrayList = aVar.f396526d;
        if (arrayList == null) {
            kotlin.jvm.internal.o.o("mImplList");
            throw null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qk.j6 j6Var = (qk.j6) it.next();
            if (j6Var.m(p9Var, str, v70Var, str2)) {
                return j6Var.u();
            }
        }
        qk.j6 j6Var2 = aVar.f396527e;
        if (j6Var2 != null) {
            return ((rk4.h) j6Var2).u();
        }
        kotlin.jvm.internal.o.o("mFallbackImpl");
        throw null;
    }

    static qk.p9 w4(qk.k6 k6Var, java.lang.String str, bw5.v70 v70Var, java.lang.String str2, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAudioFeatureInstanceType");
        }
        if ((i17 & 1) != 0) {
            str = null;
        }
        if ((i17 & 2) != 0) {
            v70Var = null;
        }
        if ((i17 & 4) != 0) {
            str2 = null;
        }
        rk4.a aVar = (rk4.a) k6Var;
        java.util.ArrayList arrayList = aVar.f396526d;
        if (arrayList == null) {
            kotlin.jvm.internal.o.o("mImplList");
            throw null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qk.j6 j6Var = (qk.j6) it.next();
            if (j6Var.m(null, str, v70Var, str2)) {
                return j6Var.getType();
            }
        }
        if (aVar.f396527e != null) {
            return qk.p9.f364312d;
        }
        kotlin.jvm.internal.o.o("mFallbackImpl");
        throw null;
    }

    static b66.j wb(qk.k6 k6Var, qk.p9 p9Var, java.lang.String str, bw5.v70 v70Var, java.lang.String str2, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPlayCenterManager");
        }
        if ((i17 & 1) != 0) {
            p9Var = null;
        }
        if ((i17 & 2) != 0) {
            str = null;
        }
        if ((i17 & 4) != 0) {
            v70Var = null;
        }
        if ((i17 & 8) != 0) {
            str2 = null;
        }
        rk4.a aVar = (rk4.a) k6Var;
        java.util.ArrayList arrayList = aVar.f396526d;
        if (arrayList == null) {
            kotlin.jvm.internal.o.o("mImplList");
            throw null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qk.j6 j6Var = (qk.j6) it.next();
            if (j6Var.m(p9Var, str, v70Var, str2)) {
                return j6Var.l();
            }
        }
        qk.j6 j6Var2 = aVar.f396527e;
        if (j6Var2 != null) {
            return ((rk4.h) j6Var2).l();
        }
        kotlin.jvm.internal.o.o("mFallbackImpl");
        throw null;
    }

    static b66.z xa(qk.k6 k6Var, qk.p9 p9Var, java.lang.String str, bw5.v70 v70Var, java.lang.String str2, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getShutdownController");
        }
        if ((i17 & 1) != 0) {
            p9Var = null;
        }
        if ((i17 & 2) != 0) {
            str = null;
        }
        if ((i17 & 4) != 0) {
            v70Var = null;
        }
        if ((i17 & 8) != 0) {
            str2 = null;
        }
        rk4.a aVar = (rk4.a) k6Var;
        java.util.ArrayList arrayList = aVar.f396526d;
        if (arrayList == null) {
            kotlin.jvm.internal.o.o("mImplList");
            throw null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qk.j6 j6Var = (qk.j6) it.next();
            if (j6Var.m(p9Var, str, v70Var, str2)) {
                return j6Var.j();
            }
        }
        qk.j6 j6Var2 = aVar.f396527e;
        if (j6Var2 != null) {
            return ((rk4.h) j6Var2).j();
        }
        kotlin.jvm.internal.o.o("mFallbackImpl");
        throw null;
    }
}
