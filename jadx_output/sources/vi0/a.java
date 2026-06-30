package vi0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ vi0.a[] f437247d;

    static {
        vi0.a[] aVarArr = {new vi0.a("Image", 0), new vi0.a("Video", 1), new vi0.a("Live", 2)};
        f437247d = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static vi0.a valueOf(java.lang.String str) {
        return (vi0.a) java.lang.Enum.valueOf(vi0.a.class, str);
    }

    public static vi0.a[] values() {
        return (vi0.a[]) f437247d.clone();
    }
}
