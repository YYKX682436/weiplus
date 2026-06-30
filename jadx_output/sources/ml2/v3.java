package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class v3 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ml2.v3[] f328148d;

    static {
        ml2.v3[] v3VarArr = {new ml2.v3("CHAT", 0, 1), new ml2.v3("CHAT_GROUP", 1, 2), new ml2.v3("SNS", 2, 3), new ml2.v3("CHAT_KEFU", 3, 4)};
        f328148d = v3VarArr;
        rz5.b.a(v3VarArr);
    }

    public v3(java.lang.String str, int i17, int i18) {
    }

    public static ml2.v3 valueOf(java.lang.String str) {
        return (ml2.v3) java.lang.Enum.valueOf(ml2.v3.class, str);
    }

    public static ml2.v3[] values() {
        return (ml2.v3[]) f328148d.clone();
    }
}
