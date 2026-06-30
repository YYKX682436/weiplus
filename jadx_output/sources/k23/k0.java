package k23;

/* loaded from: classes12.dex */
public final class k0 implements k23.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k23.v0 f303611a;

    public k0(k23.v0 v0Var) {
        this.f303611a = v0Var;
    }

    @Override // k23.k1
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "[modeswitch] onKeyboardClick");
        k23.k1 k1Var = this.f303611a.f303731z;
        if (k1Var != null) {
            k1Var.a();
        }
    }

    @Override // k23.d1
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "[modeswitch] onMoveToRecognize");
        k23.v0 v0Var = this.f303611a;
        k23.x xVar = v0Var.f303715j;
        if (xVar == null) {
            kotlin.jvm.internal.o.o("recognizingPanel");
            throw null;
        }
        xVar.setTips(false);
        k23.k1 k1Var = v0Var.f303731z;
        if (k1Var != null) {
            k1Var.b();
        }
    }

    @Override // k23.d1
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "[modeswitch] onTouchDown");
        k23.v0 v0Var = this.f303611a;
        k23.v0.c(v0Var);
        k23.k1 k1Var = v0Var.f303731z;
        if (k1Var != null) {
            k1Var.c();
        }
    }

    @Override // k23.k1
    public void d(k23.f0 newMode) {
        k23.k1 k1Var;
        kotlin.jvm.internal.o.g(newMode, "newMode");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[modeswitch] onModeSwitch: ");
        sb6.append(newMode);
        sb6.append(", isTriggeredByConfig=");
        k23.v0 v0Var = this.f303611a;
        sb6.append(v0Var.A);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", sb6.toString());
        if (v0Var.A || (k1Var = v0Var.f303731z) == null) {
            return;
        }
        k1Var.d(newMode);
    }

    @Override // k23.d1
    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "[modeswitch] onMoveUpwardToCancel");
        k23.v0 v0Var = this.f303611a;
        v0Var.H();
        k23.x xVar = v0Var.f303715j;
        if (xVar == null) {
            kotlin.jvm.internal.o.o("recognizingPanel");
            throw null;
        }
        xVar.setTips(true);
        k23.k1 k1Var = v0Var.f303731z;
        if (k1Var != null) {
            k1Var.e();
        }
    }

    @Override // k23.k1
    public void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "[modeswitch] onUploadClick");
        k23.k1 k1Var = this.f303611a.f303731z;
        if (k1Var != null) {
            k1Var.f();
        }
    }

    @Override // k23.d1
    public void g(boolean z17) {
        k23.v0 v0Var = this.f303611a;
        if (v0Var.f303722q) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "[modeswitch] onTouchUp: isCanceling=" + z17);
            if (z17) {
                k23.v0.a(v0Var);
            } else {
                k23.v0.b(v0Var);
            }
            k23.k1 k1Var = v0Var.f303731z;
            if (k1Var != null) {
                k1Var.g(z17);
            }
        }
    }
}
