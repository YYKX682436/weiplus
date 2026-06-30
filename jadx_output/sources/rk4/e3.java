package rk4;

/* loaded from: classes11.dex */
public final class e3 implements qk.d8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.ting.TingAudioRecordCallback f396626a;

    public e3(com.tencent.pigeon.ting.TingAudioRecordCallback tingAudioRecordCallback) {
        this.f396626a = tingAudioRecordCallback;
    }

    @Override // qk.d8
    public void a(double d17, double d18) {
        com.tencent.pigeon.ting.TingAudioRecordCallback tingAudioRecordCallback = this.f396626a;
        if (tingAudioRecordCallback != null) {
            tingAudioRecordCallback.onLoudnessUpdate(d17, d18, rk4.d3.f396608d);
        }
    }
}
