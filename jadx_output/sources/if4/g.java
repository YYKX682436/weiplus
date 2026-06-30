package if4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final if4.g f291250d;

    /* renamed from: e, reason: collision with root package name */
    public static final if4.g f291251e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ if4.g[] f291252f;

    static {
        if4.g gVar = new if4.g("NORMAL", 0);
        f291250d = gVar;
        if4.g gVar2 = new if4.g("UNREAD_FIRST", 1);
        f291251e = gVar2;
        if4.g[] gVarArr = {gVar, gVar2};
        f291252f = gVarArr;
        rz5.b.a(gVarArr);
    }

    public g(java.lang.String str, int i17) {
    }

    public static if4.g valueOf(java.lang.String str) {
        return (if4.g) java.lang.Enum.valueOf(if4.g.class, str);
    }

    public static if4.g[] values() {
        return (if4.g[]) f291252f.clone();
    }
}
