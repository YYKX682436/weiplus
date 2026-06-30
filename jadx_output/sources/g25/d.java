package g25;

/* loaded from: classes14.dex */
public final class d implements f25.n0 {

    /* renamed from: i, reason: collision with root package name */
    public static g25.e f267973i;

    /* renamed from: d, reason: collision with root package name */
    public static final g25.d f267968d = new g25.d();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicLong f267969e = new java.util.concurrent.atomic.AtomicLong();

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f267970f = jz5.h.b(g25.a.f267964d);

    /* renamed from: g, reason: collision with root package name */
    public static final f25.e f267971g = new f25.e(false, null);

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f267972h = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: m, reason: collision with root package name */
    public static final boolean f267974m = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_audio_ignore_lock_focus, false);

    /* renamed from: n, reason: collision with root package name */
    public static final boolean f267975n = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_audio_old_callback_logic, false);

    /* renamed from: o, reason: collision with root package name */
    public static final boolean f267976o = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_audio_block_duck, false);

    /* renamed from: p, reason: collision with root package name */
    public static final boolean f267977p = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_audio_use_system_request_result, false);

    @Override // f25.n0
    public f25.e Vd() {
        return f267971g;
    }

    public final void b(f25.l0 l0Var) {
        g25.e eVar = f267973i;
        if (eVar != null) {
            if (kotlin.jvm.internal.o.b(l0Var, eVar != null ? eVar.f267979b : null)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AFS.AudioFocusManagerImpl", "muteModeLastsession set null");
                f267973i = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final f25.m0 c(f25.l0 r20, f25.f r21) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g25.d.c(f25.l0, f25.f):f25.m0");
    }

    public final void f(g25.e eVar, boolean z17, boolean z18) {
        f25.e eVar2 = f267971g;
        if (!kotlin.jvm.internal.o.b(eVar2.f259093b, eVar) && !z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AFS.AudioFocusManagerImpl", "updateFocusState: not current focus session, no need to update");
            return;
        }
        if (z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AFS.AudioFocusManagerImpl", "updateFocusState: force update, current focus state " + eVar2);
        }
        g25.c cVar = new g25.c(z17, eVar);
        eVar2.getClass();
        synchronized (eVar2) {
            cVar.invoke(eVar2);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AFS.AudioFocusManagerImpl", "updateFocusState: " + eVar2);
    }

    @Override // f25.n0
    public synchronized f25.m0 m9(f25.l0 requestScene, f25.f fVar) {
        f25.m0 m0Var;
        kotlin.jvm.internal.o.g(requestScene, "requestScene");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestFocus: ");
        sb6.append(requestScene);
        sb6.append(", ");
        sb6.append(fVar);
        sb6.append(", ");
        f25.e eVar = f267971g;
        sb6.append(eVar.f259093b);
        com.tencent.mars.xlog.Log.i("MicroMsg.AFS.AudioFocusManagerImpl", sb6.toString());
        m0Var = eVar.f259093b;
        if (m0Var != null) {
            if (!(eVar.f259092a && ((g25.e) m0Var).f267980c && kotlin.jvm.internal.o.b(((g25.e) m0Var).f267979b, requestScene))) {
                m0Var = null;
            }
            if (m0Var != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AFS.AudioFocusManagerImpl", "requestFocus: already has focus " + m0Var);
            }
        }
        m0Var = c(requestScene, fVar);
        return m0Var;
    }

    @Override // f25.n0
    public synchronized boolean yg(f25.m0 session) {
        boolean z17;
        f25.f fVar;
        kotlin.jvm.internal.o.g(session, "session");
        z17 = c4.h.a((android.media.AudioManager) ((jz5.n) f267970f).getValue(), ((g25.e) session).f267982e) == 1;
        f267972h.remove(((g25.e) session).f267979b);
        f((g25.e) session, false, false);
        boolean a17 = e25.a.a(((g25.e) session).f267979b);
        java.lang.Object[] objArr = new java.lang.Object[3];
        g25.e eVar = f267973i;
        objArr[0] = eVar;
        objArr[1] = java.lang.Boolean.valueOf(eVar != null);
        objArr[2] = java.lang.Boolean.valueOf(a17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AFS.AudioFocusManagerImpl", "abandonFocus muteModeLastsession:%s, null:%s,  forbidFocus:%s", objArr);
        g25.e eVar2 = f267973i;
        if (eVar2 != null && a17 && eVar2.f267983f != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AFS.AudioFocusManagerImpl", "onResume!!");
            g25.e eVar3 = f267973i;
            if (eVar3 != null && (fVar = eVar3.f267983f) != null) {
                fVar.onResume();
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AFS.AudioFocusManagerImpl", "abandonFocus : " + session + " ,success:" + z17 + ", currentFocusState.focusSession:" + f267971g.f259093b);
        b(((g25.e) session).f267979b);
        return z17;
    }
}
