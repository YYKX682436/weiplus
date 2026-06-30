package rk4;

/* loaded from: classes11.dex */
public final class z2 implements qk.d8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.ting.TingAudioRecordCallback f397121a;

    public z2(com.tencent.pigeon.ting.TingAudioRecordCallback tingAudioRecordCallback) {
        this.f397121a = tingAudioRecordCallback;
    }

    @Override // qk.d8
    public void a(double d17, double d18) {
        com.tencent.pigeon.ting.TingAudioRecordCallback tingAudioRecordCallback = this.f397121a;
        if (tingAudioRecordCallback != null) {
            tingAudioRecordCallback.onLoudnessUpdate(d17, d18, rk4.y2.f397097d);
        }
    }
}
