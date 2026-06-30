package hd1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final hd1.c f280393d;

    /* renamed from: e, reason: collision with root package name */
    public static final hd1.c f280394e;

    /* renamed from: f, reason: collision with root package name */
    public static final hd1.c f280395f;

    /* renamed from: g, reason: collision with root package name */
    public static final hd1.c f280396g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ hd1.c[] f280397h;

    static {
        hd1.c cVar = new hd1.c("SUCCESS", 0);
        f280393d = cVar;
        hd1.c cVar2 = new hd1.c("FAIL_SYSTEM_INTERNAL_ERROR", 1);
        f280394e = cVar2;
        hd1.c cVar3 = new hd1.c("FAIL_ALREADY_STARTED", 2);
        f280395f = cVar3;
        hd1.c cVar4 = new hd1.c("FAIL_NOT_STARTED", 3);
        f280396g = cVar4;
        hd1.c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
        f280397h = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    public static hd1.c valueOf(java.lang.String str) {
        return (hd1.c) java.lang.Enum.valueOf(hd1.c.class, str);
    }

    public static hd1.c[] values() {
        return (hd1.c[]) f280397h.clone();
    }
}
