package ul4;

/* loaded from: classes11.dex */
public final class i extends com.tencent.unit_rc.BaseObject implements qk.a9, f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.unit_rc.WeakPtr f428616d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.unit_rc.WeakPtr f428617e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f428618f;

    /* renamed from: g, reason: collision with root package name */
    public f25.l0 f428619g;

    /* renamed from: h, reason: collision with root package name */
    public f25.m0 f428620h;

    /* renamed from: i, reason: collision with root package name */
    public jm4.e0 f428621i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f428622m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f428623n;

    public i(bw5.eq0 appId, com.tencent.unit_rc.WeakPtr weakPtr, com.tencent.unit_rc.WeakPtr weakPtr2) {
        f25.l0 e0Var;
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f428616d = weakPtr;
        this.f428617e = weakPtr2;
        java.lang.String taskId = appId.name() + '-' + java.util.UUID.randomUUID();
        this.f428618f = taskId;
        kotlin.jvm.internal.o.g(taskId, "taskId");
        int ordinal = appId.ordinal();
        if (ordinal == 2) {
            e0Var = new f25.e0(taskId);
        } else if (ordinal == 3 || ordinal == 5) {
            vl4.u uVar = vl4.u.f437904a;
            e0Var = uVar.c(uVar.a()) ? new f25.c0(taskId) : new f25.b0(taskId);
        } else {
            e0Var = ordinal != 6 ? ordinal != 7 ? new f25.a0(taskId) : new f25.d0(taskId) : f25.k.f259101c;
        }
        this.f428619g = e0Var;
    }

    public final b66.n a() {
        b66.g gVar;
        b66.n a17;
        com.tencent.unit_rc.WeakPtr weakPtr = this.f428616d;
        if (weakPtr != null && (gVar = (b66.g) weakPtr.lock()) != null && (a17 = ((b66.i) gVar).a()) != null) {
            return a17;
        }
        com.tencent.unit_rc.WeakPtr weakPtr2 = this.f428617e;
        if (weakPtr2 != null) {
            return (b66.n) weakPtr2.lock();
        }
        return null;
    }

    @Override // f25.f
    public void c(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingAudioFocusController", "TingAudioFocusController " + this.f428618f + " onPause, canDuck:" + z17);
        pm0.v.X(new ul4.c(this));
    }

    public final void d(f25.m0 m0Var, boolean z17) {
        java.lang.String G;
        if (!z17) {
            if (!((m0Var != null ? ((g25.e) m0Var).f267981d : null) instanceof f25.t)) {
                if (!((m0Var != null ? ((g25.e) m0Var).f267981d : null) instanceof f25.h0)) {
                    if (!((m0Var != null ? ((g25.e) m0Var).f267981d : null) instanceof f25.u)) {
                        pm0.v.X(ul4.e.f428610d);
                        return;
                    }
                }
            }
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (z17) {
            G = context.getString(com.tencent.mm.R.string.ge8);
        } else {
            G = (m0Var != null ? ((g25.e) m0Var).f267981d : null) instanceof f25.h0 ? iq.b.G(context, iq.b.E()) : iq.b.G(context, false);
        }
        pm0.v.X(new ul4.d(context, G));
    }

    public void e(jm4.h0 type, byte[] context) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(context, "context");
        ((ku5.t0) ku5.t0.f312615d).h(new ul4.h(this, type, context), "TingPlayAppAudioFocus.requestFocus");
    }

    @Override // f25.f
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingAudioFocusController", "TingAudioFocusController " + this.f428618f + " onResume");
        pm0.v.X(new ul4.g(this));
    }

    @Override // f25.f
    public void onStop() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingAudioFocusController", "TingAudioFocusController " + this.f428618f + " onStop");
        b66.n a17 = a();
        if (a17 != null) {
            b66.m.a(a17, null, 1, null);
        }
        if (kl4.g.f308906b) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingAudioFocusLossToastLogic", "mark lost audio focus in background");
            kl4.g.f308905a = true;
        }
    }
}
