package gh2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ gh2.c[] f271866d;

    static {
        gh2.c[] cVarArr = {new gh2.c("Audience", 0, 0), new gh2.c("Singer", 1, 1)};
        f271866d = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17, int i18) {
    }

    public static gh2.c valueOf(java.lang.String str) {
        return (gh2.c) java.lang.Enum.valueOf(gh2.c.class, str);
    }

    public static gh2.c[] values() {
        return (gh2.c[]) f271866d.clone();
    }
}
