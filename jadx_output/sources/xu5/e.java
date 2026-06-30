package xu5;

/* loaded from: classes12.dex */
public class e extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xu5.o f457304a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(xu5.o oVar, android.os.Looper looper) {
        super(looper);
        this.f457304a = oVar;
    }

    @Override // android.os.Handler
    public void dispatchMessage(android.os.Message message) {
        this.f457304a.dispatchMessage(message);
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        this.f457304a.b(message);
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(android.os.Message message, long j17) {
        xu5.o oVar = this.f457304a;
        message.setTarget(oVar.f457332f);
        return oVar.sendMessageAtTime(message, j17);
    }

    @Override // android.os.Handler
    public java.lang.String toString() {
        return this.f457304a.toString();
    }
}
