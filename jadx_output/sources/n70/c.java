package n70;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final n70.c f335246d;

    /* renamed from: e, reason: collision with root package name */
    public static final n70.c f335247e;

    /* renamed from: f, reason: collision with root package name */
    public static final n70.c f335248f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ n70.c[] f335249g;

    static {
        n70.c cVar = new n70.c("Success", 0);
        f335246d = cVar;
        n70.c cVar2 = new n70.c("PrepareError", 1);
        f335247e = cVar2;
        n70.c cVar3 = new n70.c("DBError", 2);
        f335248f = cVar3;
        n70.c[] cVarArr = {cVar, cVar2, cVar3, new n70.c("Error", 3)};
        f335249g = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    public static n70.c valueOf(java.lang.String str) {
        return (n70.c) java.lang.Enum.valueOf(n70.c.class, str);
    }

    public static n70.c[] values() {
        return (n70.c[]) f335249g.clone();
    }
}
