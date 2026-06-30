package gp2;

/* loaded from: classes10.dex */
public final class t0 implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp2.v0 f274322d;

    public t0(gp2.v0 v0Var) {
        this.f274322d = v0Var;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        gp2.v0 v0Var = this.f274322d;
        if (v0Var.f274328d.size() < 2 && !v0Var.f274331g) {
            v0Var.f274328d.add(v0Var.O6());
            v0Var.f274332h++;
            return true;
        }
        com.tencent.mars.xlog.Log.i("NearbyLivePlayerViewRecycler", "[preInflateVideoView] completed! preInflateCount=" + v0Var.f274332h + " isReleased=" + v0Var.f274331g);
        return false;
    }
}
