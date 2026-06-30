package x83;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final x83.c f452552e;

    /* renamed from: f, reason: collision with root package name */
    public static final x83.c f452553f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ x83.c[] f452554g;

    /* renamed from: d, reason: collision with root package name */
    public final int f452555d;

    static {
        x83.c cVar = new x83.c("ACCOUNT_TYPE_NORMAL", 0, 0);
        f452552e = cVar;
        x83.c cVar2 = new x83.c("ACCOUNT_TYPE_KIDS", 1, 1);
        f452553f = cVar2;
        x83.c[] cVarArr = {cVar, cVar2};
        f452554g = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17, int i18) {
        this.f452555d = i18;
    }

    public static x83.c valueOf(java.lang.String str) {
        return (x83.c) java.lang.Enum.valueOf(x83.c.class, str);
    }

    public static x83.c[] values() {
        return (x83.c[]) f452554g.clone();
    }
}
