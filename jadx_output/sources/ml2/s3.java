package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class s3 {

    /* renamed from: d, reason: collision with root package name */
    public static final ml2.s3 f327924d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ml2.s3[] f327925e;

    static {
        ml2.s3 s3Var = new ml2.s3("FROM_ONCREATE", 0, 0);
        ml2.s3 s3Var2 = new ml2.s3("FROM_ONRESUME", 1, 1);
        ml2.s3 s3Var3 = new ml2.s3("FROM_ONPLUGIN", 2, 2);
        f327924d = s3Var3;
        ml2.s3[] s3VarArr = {s3Var, s3Var2, s3Var3};
        f327925e = s3VarArr;
        rz5.b.a(s3VarArr);
    }

    public s3(java.lang.String str, int i17, int i18) {
    }

    public static ml2.s3 valueOf(java.lang.String str) {
        return (ml2.s3) java.lang.Enum.valueOf(ml2.s3.class, str);
    }

    public static ml2.s3[] values() {
        return (ml2.s3[]) f327925e.clone();
    }
}
