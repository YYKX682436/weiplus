package xi0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ xi0.b[] f454667d;

    static {
        xi0.b[] bVarArr = {new xi0.b("Image", 0), new xi0.b("Video", 1)};
        f454667d = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static xi0.b valueOf(java.lang.String str) {
        return (xi0.b) java.lang.Enum.valueOf(xi0.b.class, str);
    }

    public static xi0.b[] values() {
        return (xi0.b[]) f454667d.clone();
    }
}
