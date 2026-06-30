package xu5;

/* loaded from: classes12.dex */
public final class w extends xu5.n {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ xu5.x f457344i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(xu5.x xVar, android.os.Message message) {
        super(xVar, message);
        this.f457344i = xVar;
    }

    @Override // xu5.n, java.lang.Runnable
    public void run() {
        synchronized (this.f457344i.f457345h) {
            super.run();
        }
    }
}
