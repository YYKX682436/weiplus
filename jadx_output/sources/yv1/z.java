package yv1;

/* loaded from: classes5.dex */
public final class z implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f466195d;

    public z(yz5.a aVar) {
        this.f466195d = aVar;
    }

    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "CalcWxNewService.EventRunnable";
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f466195d.invoke();
    }
}
