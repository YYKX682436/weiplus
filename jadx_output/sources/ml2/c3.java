package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class c3 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ml2.c3[] f327331d;

    static {
        ml2.c3[] c3VarArr = {new ml2.c3("ENTRY_EXPOSED", 0, 1), new ml2.c3("ENTRY_CLICKED", 1, 2), new ml2.c3("GENERATED", 2, 3), new ml2.c3("CANCELED", 3, 4), new ml2.c3("SAVED_TO_ALBUM", 4, 5), new ml2.c3("SHARED_TO_FRIEND", 5, 6), new ml2.c3("COVER_CHANGED", 6, 7)};
        f327331d = c3VarArr;
        rz5.b.a(c3VarArr);
    }

    public c3(java.lang.String str, int i17, int i18) {
    }

    public static ml2.c3 valueOf(java.lang.String str) {
        return (ml2.c3) java.lang.Enum.valueOf(ml2.c3.class, str);
    }

    public static ml2.c3[] values() {
        return (ml2.c3[]) f327331d.clone();
    }
}
