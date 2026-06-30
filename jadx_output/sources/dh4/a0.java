package dh4;

/* loaded from: classes15.dex */
public class a0 extends ah4.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dh4.f0 f232503d;

    public a0(dh4.f0 f0Var) {
        this.f232503d = f0Var;
    }

    @Override // ah4.e, com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL
    public void keep_OnError(int i17) {
        com.tencent.mars.xlog.Log.e("MicroMsg.TalkRoomServer", "engineCallback OnError: %d", java.lang.Integer.valueOf(i17));
        dh4.v Bi = dh4.l.Bi();
        long j17 = Bi.A;
        if (j17 != 0) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            Bi.f232590c = android.os.SystemClock.elapsedRealtime() - j17;
        }
        dh4.l.Bi().f232591d = 1;
        this.f232503d.f232529x.b("component OnError " + i17, 99, i17);
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new dh4.z(this));
    }

    @Override // ah4.e, com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL
    public void keep_OnOpenSuccess() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomServer", "OnOpenSuccess");
        dh4.f0 f0Var = this.f232503d;
        int i17 = f0Var.f232514f;
        if (i17 != 1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TalkRoomServer", "has exit the talkroom state:%d", java.lang.Integer.valueOf(i17));
            return;
        }
        dh4.v Bi = dh4.l.Bi();
        long j17 = Bi.A;
        if (j17 != 0) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            Bi.f232590c = android.os.SystemClock.elapsedRealtime() - j17;
        }
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new dh4.y(this));
        f0Var.g();
        dh4.t0 t0Var = f0Var.f232529x;
        t0Var.getClass();
        dh4.k0 k0Var = new dh4.k0(t0Var);
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            k0Var.run();
        } else {
            t0Var.f232587b.post(k0Var);
        }
    }
}
