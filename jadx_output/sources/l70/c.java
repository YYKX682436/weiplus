package l70;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final l70.c f316797d;

    /* renamed from: e, reason: collision with root package name */
    public static final l70.c f316798e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ l70.c[] f316799f;

    static {
        l70.c cVar = new l70.c("Start", 0);
        f316797d = cVar;
        l70.c cVar2 = new l70.c("AlreadyStart", 1);
        l70.c cVar3 = new l70.c("Finish", 2);
        f316798e = cVar3;
        l70.c[] cVarArr = {cVar, cVar2, cVar3};
        f316799f = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    public static l70.c valueOf(java.lang.String str) {
        return (l70.c) java.lang.Enum.valueOf(l70.c.class, str);
    }

    public static l70.c[] values() {
        return (l70.c[]) f316799f.clone();
    }
}
