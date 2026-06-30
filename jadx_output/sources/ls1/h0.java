package ls1;

/* loaded from: classes8.dex */
public final class h0 implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f320991d;

    public h0(int i17) {
        this.f320991d = i17;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        android.os.Looper.myQueue().removeIdleHandler(this);
        int i17 = this.f320991d;
        if (i17 == -1) {
            is1.l lVar = is1.l.f294423a;
            for (java.lang.Integer num : (java.lang.Integer[]) ((jz5.n) is1.l.f294426d).getValue()) {
                ls1.j0.a(ls1.j0.f320995a, num.intValue());
            }
        } else {
            ls1.j0.a(ls1.j0.f320995a, i17);
        }
        return false;
    }
}
