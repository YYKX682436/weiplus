package ua1;

/* loaded from: classes7.dex */
public class e extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ua1.f f425953a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ua1.f fVar, android.os.Handler handler) {
        super(handler);
        this.f425953a = fVar;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17) {
        ua1.f fVar = this.f425953a;
        int streamVolume = fVar.f425957d.getStreamVolume(3);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameRecordAudioLogic", "user vol changed old:%d new:%d max:%d", java.lang.Integer.valueOf(fVar.f425959f), java.lang.Integer.valueOf(streamVolume), java.lang.Integer.valueOf(fVar.f425958e));
        fVar.f425959f = streamVolume;
    }
}
