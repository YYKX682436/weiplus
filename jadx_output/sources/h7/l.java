package h7;

/* loaded from: classes13.dex */
public class l implements android.os.Handler.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h7.m f279348d;

    public l(h7.m mVar) {
        this.f279348d = mVar;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        int i17 = message.what;
        h7.m mVar = this.f279348d;
        if (i17 == 1) {
            mVar.b((h7.j) message.obj);
            return true;
        }
        if (i17 != 2) {
            return false;
        }
        mVar.f279352d.i((h7.j) message.obj);
        return false;
    }
}
