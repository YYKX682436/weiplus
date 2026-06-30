package w14;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final w14.b f442226e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f442227f;

    /* renamed from: g, reason: collision with root package name */
    public static final w14.c f442228g;

    /* renamed from: h, reason: collision with root package name */
    public static final w14.c f442229h;

    /* renamed from: i, reason: collision with root package name */
    public static final w14.c f442230i;

    /* renamed from: m, reason: collision with root package name */
    public static final w14.c f442231m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ w14.c[] f442232n;

    /* renamed from: d, reason: collision with root package name */
    public final int f442233d;

    static {
        w14.c cVar = new w14.c("HAS_NOT_SET", 0, 0);
        f442228g = cVar;
        w14.c cVar2 = new w14.c("FRIEND_CHATROOM_AND_CONTENT", 1, 1);
        f442229h = cVar2;
        w14.c cVar3 = new w14.c("FRIEND_AND_CHATROOM", 2, 2);
        f442230i = cVar3;
        w14.c cVar4 = new w14.c("CONTENT_DEFAULT_WORDING", 3, 3);
        f442231m = cVar4;
        w14.c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
        f442232n = cVarArr;
        java.util.List a17 = rz5.b.a(cVarArr);
        f442226e = new w14.b(null);
        int d17 = kz5.b1.d(kz5.d0.q(a17, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 < 16 ? 16 : d17);
        kz5.e eVar = new kz5.e((kz5.h) a17);
        while (eVar.hasNext()) {
            java.lang.Object next = eVar.next();
            linkedHashMap.put(java.lang.Integer.valueOf(((w14.c) next).f442233d), next);
        }
        f442227f = linkedHashMap;
    }

    public c(java.lang.String str, int i17, int i18) {
        this.f442233d = i18;
    }

    public static w14.c valueOf(java.lang.String str) {
        return (w14.c) java.lang.Enum.valueOf(w14.c.class, str);
    }

    public static w14.c[] values() {
        return (w14.c[]) f442232n.clone();
    }
}
