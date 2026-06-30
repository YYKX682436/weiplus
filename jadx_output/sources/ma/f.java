package ma;

/* loaded from: classes14.dex */
public class f implements android.os.Handler.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ma.g f325126d;

    public f(ma.g gVar) {
        this.f325126d = gVar;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        if (message.what != 0) {
            return false;
        }
        ma.g gVar = this.f325126d;
        android.support.v4.media.f.a(message.obj);
        synchronized (gVar.f325128a) {
            throw null;
        }
    }
}
