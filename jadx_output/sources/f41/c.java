package f41;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final f41.c f259470d;

    /* renamed from: e, reason: collision with root package name */
    public static final f41.c f259471e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ f41.c[] f259472f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ rz5.a f259473g;

    /* renamed from: h, reason: collision with root package name */
    public static final f41.c f259474h;

    static {
        f41.c cVar = new f41.c("SelectContact", 0);
        f259470d = cVar;
        f41.c cVar2 = new f41.c("SendMsg", 1);
        f41.c cVar3 = new f41.c("PermissionRequest", 2);
        f259471e = cVar3;
        f41.c cVar4 = new f41.c("Loading", 3);
        f259474h = cVar4;
        f41.c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
        f259472f = cVarArr;
        f259473g = rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    public static f41.c valueOf(java.lang.String str) {
        return (f41.c) java.lang.Enum.valueOf(f41.c.class, str);
    }

    public static f41.c[] values() {
        return (f41.c[]) f259472f.clone();
    }
}
