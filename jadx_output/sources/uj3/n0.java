package uj3;

/* loaded from: classes14.dex */
public final class n0 extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.v0 f428332d;

    public n0(uj3.v0 v0Var) {
        this.f428332d = v0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        if (com.tencent.mm.plugin.multitalk.model.e3.Ri().f150169n) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new uj3.m0(this.f428332d));
    }
}
