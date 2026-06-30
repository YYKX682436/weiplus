package i63;

/* loaded from: classes7.dex */
public class a0 extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i63.b0 f288969a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(i63.b0 b0Var, android.os.Handler handler) {
        super(handler);
        this.f288969a = b0Var;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17) {
        i63.b0 b0Var = this.f288969a;
        int streamVolume = b0Var.f288980p.getStreamVolume(3);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "user vol changed old:%d new:%d max:%d", java.lang.Integer.valueOf(b0Var.f288982r), java.lang.Integer.valueOf(streamVolume), java.lang.Integer.valueOf(b0Var.f288981q));
        b0Var.f288982r = streamVolume;
    }
}
