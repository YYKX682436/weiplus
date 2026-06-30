package h72;

/* loaded from: classes10.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f279443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h72.s f279444e;

    public i(h72.s sVar, int i17) {
        this.f279444e = sVar;
        this.f279443d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        ei3.m mVar = this.f279444e.f279467a;
        if (mVar != null) {
            mVar.i(this.f279443d);
        }
    }
}
