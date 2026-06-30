package dt5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final dt5.c f243310d;

    /* renamed from: e, reason: collision with root package name */
    public static final dt5.c f243311e;

    /* renamed from: f, reason: collision with root package name */
    public static final dt5.c f243312f;

    /* renamed from: g, reason: collision with root package name */
    public static final dt5.c f243313g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ dt5.c[] f243314h;

    static {
        dt5.c cVar = new dt5.c("DETECT_MODEL", 0);
        f243310d = cVar;
        dt5.c cVar2 = new dt5.c("SR_MODEL", 1);
        f243311e = cVar2;
        dt5.c cVar3 = new dt5.c("SEGMENTATION_MODEL", 2);
        f243312f = cVar3;
        dt5.c cVar4 = new dt5.c("REVERSE_CLS", 3);
        f243313g = cVar4;
        dt5.c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
        f243314h = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    public static dt5.c valueOf(java.lang.String str) {
        return (dt5.c) java.lang.Enum.valueOf(dt5.c.class, str);
    }

    public static dt5.c[] values() {
        return (dt5.c[]) f243314h.clone();
    }
}
