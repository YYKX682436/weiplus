package de2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ de2.f[] f229376d;

    static {
        de2.f[] fVarArr = {new de2.f("TRANSPORT", 0), new de2.f("ENTER_HINT", 1)};
        f229376d = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17) {
    }

    public static de2.f valueOf(java.lang.String str) {
        return (de2.f) java.lang.Enum.valueOf(de2.f.class, str);
    }

    public static de2.f[] values() {
        return (de2.f[]) f229376d.clone();
    }
}
