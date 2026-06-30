package k23;

/* loaded from: classes12.dex */
public final class p0 implements k23.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k23.v0 f303649a;

    public p0(k23.v0 v0Var) {
        this.f303649a = v0Var;
    }

    @Override // k23.d1
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "[ftsvoiceinput] onMoveToRecognize");
        k23.x xVar = this.f303649a.f303715j;
        if (xVar != null) {
            xVar.setTips(false);
        } else {
            kotlin.jvm.internal.o.o("recognizingPanel");
            throw null;
        }
    }

    @Override // k23.d1
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "[ftsvoiceinput] onTouchDown");
        k23.v0.c(this.f303649a);
    }

    @Override // k23.d1
    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "[ftsvoiceinput] onMoveUpwardToCancel");
        k23.v0 v0Var = this.f303649a;
        v0Var.H();
        k23.x xVar = v0Var.f303715j;
        if (xVar != null) {
            xVar.setTips(true);
        } else {
            kotlin.jvm.internal.o.o("recognizingPanel");
            throw null;
        }
    }

    @Override // k23.d1
    public void g(boolean z17) {
        k23.v0 v0Var = this.f303649a;
        if (v0Var.f303722q) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "[ftsvoiceinput] onTouchUp: isCanceling:" + z17);
            if (z17) {
                k23.v0.a(v0Var);
            } else {
                k23.v0.b(v0Var);
            }
        }
    }
}
