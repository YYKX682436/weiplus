package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class f1 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ml2.f1[] f327422d;

    static {
        ml2.f1[] f1VarArr = {new ml2.f1("EDIT_MENU_SHOW", 0, 1), new ml2.f1("EDIT_MENU_CLICK", 1, 2), new ml2.f1("EDIT_DONE", 2, 3), new ml2.f1("TOP_COMMENT_MENU_SHOW", 3, 4), new ml2.f1("TOP_COMMENT_MENU_CLICK", 4, 5)};
        f327422d = f1VarArr;
        rz5.b.a(f1VarArr);
    }

    public f1(java.lang.String str, int i17, int i18) {
    }

    public static ml2.f1 valueOf(java.lang.String str) {
        return (ml2.f1) java.lang.Enum.valueOf(ml2.f1.class, str);
    }

    public static ml2.f1[] values() {
        return (ml2.f1[]) f327422d.clone();
    }
}
