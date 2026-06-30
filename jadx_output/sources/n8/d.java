package n8;

/* loaded from: classes13.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final n8.d f335481c = new n8.d(new int[]{2}, 2);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f335482a;

    /* renamed from: b, reason: collision with root package name */
    public final int f335483b;

    public d(int[] iArr, int i17) {
        if (iArr != null) {
            int[] copyOf = java.util.Arrays.copyOf(iArr, iArr.length);
            this.f335482a = copyOf;
            java.util.Arrays.sort(copyOf);
        } else {
            this.f335482a = new int[0];
        }
        this.f335483b = i17;
    }

    public static n8.d a(android.content.Context context) {
        android.content.Intent registerReceiver = context.registerReceiver(null, new android.content.IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        return (registerReceiver == null || registerReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? f335481c : new n8.d(registerReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), registerReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 0));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8.d)) {
            return false;
        }
        n8.d dVar = (n8.d) obj;
        return java.util.Arrays.equals(this.f335482a, dVar.f335482a) && this.f335483b == dVar.f335483b;
    }

    public int hashCode() {
        return this.f335483b + (java.util.Arrays.hashCode(this.f335482a) * 31);
    }

    public java.lang.String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f335483b + ", supportedEncodings=" + java.util.Arrays.toString(this.f335482a) + "]";
    }
}
