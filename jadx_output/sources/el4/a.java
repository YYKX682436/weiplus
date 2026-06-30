package el4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ el4.a[] f254001d;

    static {
        el4.a[] aVarArr = {new el4.a("MMLISTEN_BYPNOTIFY_TYPE_SYNC", 0, 1), new el4.a("MMLISTEN_BYPNOTIFY_TYPE_WITHDRAW", 1, 2), new el4.a("MMLISTEN_BYPNOTIFY_TYPE_MEMBERSHIP", 2, 3)};
        f254001d = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, int i18) {
    }

    public static el4.a valueOf(java.lang.String str) {
        return (el4.a) java.lang.Enum.valueOf(el4.a.class, str);
    }

    public static el4.a[] values() {
        return (el4.a[]) f254001d.clone();
    }
}
