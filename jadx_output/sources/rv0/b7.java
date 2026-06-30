package rv0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b7 {

    /* renamed from: d, reason: collision with root package name */
    public static final rv0.a7 f399942d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ rv0.b7[] f399943e;

    static {
        rv0.b7[] b7VarArr = {new rv0.b7(org.webrtc.PeerConnectionFactory.TRIAL_ENABLED, 0, 1.0f), new rv0.b7("Disabled", 1, 0.3f)};
        f399943e = b7VarArr;
        rz5.b.a(b7VarArr);
        f399942d = new rv0.a7(null);
    }

    public b7(java.lang.String str, int i17, float f17) {
    }

    public static rv0.b7 valueOf(java.lang.String str) {
        return (rv0.b7) java.lang.Enum.valueOf(rv0.b7.class, str);
    }

    public static rv0.b7[] values() {
        return (rv0.b7[]) f399943e.clone();
    }
}
