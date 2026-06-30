package xm3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final xm3.c f455296d;

    /* renamed from: e, reason: collision with root package name */
    public static final xm3.c f455297e;

    /* renamed from: f, reason: collision with root package name */
    public static final xm3.c f455298f;

    /* renamed from: g, reason: collision with root package name */
    public static final xm3.c f455299g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ xm3.c[] f455300h;

    static {
        xm3.c cVar = new xm3.c("Insert", 0);
        f455296d = cVar;
        xm3.c cVar2 = new xm3.c("Remove", 1);
        f455297e = cVar2;
        xm3.c cVar3 = new xm3.c("Move", 2);
        f455298f = cVar3;
        xm3.c cVar4 = new xm3.c("Change", 3);
        f455299g = cVar4;
        xm3.c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
        f455300h = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    public static xm3.c valueOf(java.lang.String str) {
        return (xm3.c) java.lang.Enum.valueOf(xm3.c.class, str);
    }

    public static xm3.c[] values() {
        return (xm3.c[]) f455300h.clone();
    }
}
