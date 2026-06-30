package w21;

/* loaded from: classes12.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public volatile long f442462a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f442463b = false;

    public s(int i17, int i18) {
        this.f442462a = com.tencent.mm.modelvoice.VoiceOpus.nativeEncInit(i17, 1, i18, 1);
    }

    public int a(int i17, int i18) {
        if (this.f442463b || this.f442462a == 0) {
            return -7;
        }
        return com.tencent.mm.modelvoice.VoiceOpus.nativeSetEncControl(i17, i18, this.f442462a);
    }
}
