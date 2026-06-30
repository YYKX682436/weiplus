package x31;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ x31.b[] f451599d;

    static {
        x31.b[] bVarArr = {new x31.b("PlayableEnd", 0, 0), new x31.b("PlayableFirstFrame", 1, 1), new x31.b("PlayableError", 2, 2), new x31.b("PlayableCustomEvent", 3, 3)};
        f451599d = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17, int i18) {
    }

    public static x31.b valueOf(java.lang.String str) {
        return (x31.b) java.lang.Enum.valueOf(x31.b.class, str);
    }

    public static x31.b[] values() {
        return (x31.b[]) f451599d.clone();
    }
}
