package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b2 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ml2.b2[] f327213d;

    static {
        ml2.b2[] b2VarArr = {new ml2.b2("UNFOLLOW", 0, 0), new ml2.b2("FOLLOWED", 1, 1)};
        f327213d = b2VarArr;
        rz5.b.a(b2VarArr);
    }

    public b2(java.lang.String str, int i17, int i18) {
    }

    public static ml2.b2 valueOf(java.lang.String str) {
        return (ml2.b2) java.lang.Enum.valueOf(ml2.b2.class, str);
    }

    public static ml2.b2[] values() {
        return (ml2.b2[]) f327213d.clone();
    }
}
