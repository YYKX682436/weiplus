package f65;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class w {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f65.w[] f259997d;

    static {
        f65.w[] wVarArr = {new f65.w("SendStart", 0, 1L), new f65.w("SendSuc", 1, 2L), new f65.w("SendFail", 2, 3L), new f65.w("SendResume", 3, 4L), new f65.w("SendPause", 4, 5L)};
        f259997d = wVarArr;
        rz5.b.a(wVarArr);
    }

    public w(java.lang.String str, int i17, long j17) {
    }

    public static f65.w valueOf(java.lang.String str) {
        return (f65.w) java.lang.Enum.valueOf(f65.w.class, str);
    }

    public static f65.w[] values() {
        return (f65.w[]) f259997d.clone();
    }
}
