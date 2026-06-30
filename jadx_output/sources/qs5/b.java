package qs5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ qs5.b[] f366422d;

    static {
        qs5.b[] bVarArr = {new qs5.b("DisPlayMode_Vertical", 0, 0), new qs5.b("DisPlayMode_Horizontal", 1, 1)};
        f366422d = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17, int i18) {
    }

    public static qs5.b valueOf(java.lang.String str) {
        return (qs5.b) java.lang.Enum.valueOf(qs5.b.class, str);
    }

    public static qs5.b[] values() {
        return (qs5.b[]) f366422d.clone();
    }
}
