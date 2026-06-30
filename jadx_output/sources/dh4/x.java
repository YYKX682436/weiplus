package dh4;

/* loaded from: classes13.dex */
public class x implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dh4.f0 f232615d;

    public x(dh4.f0 f0Var) {
        this.f232615d = f0Var;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomServer", "onServiceConnected ");
        dh4.f0 f0Var = this.f232615d;
        if (iBinder == null) {
            f0Var.f232529x.b("enterTalkRoom bindServie or protocalInit failed", 3, -1);
            return;
        }
        int i17 = ah4.b.f4998d;
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
        f0Var.f232523r = (queryLocalInterface == null || !(queryLocalInterface instanceof ah4.c)) ? new ah4.a(iBinder) : (ah4.c) queryLocalInterface;
        if (f0Var.f232514f >= 2) {
            new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new dh4.w(this));
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomServer", "onServiceDisconnected ");
    }
}
