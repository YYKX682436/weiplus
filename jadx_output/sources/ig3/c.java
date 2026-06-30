package ig3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final ig3.c f291416d;

    /* renamed from: e, reason: collision with root package name */
    public static final ig3.c f291417e;

    /* renamed from: f, reason: collision with root package name */
    public static final ig3.c f291418f;

    /* renamed from: g, reason: collision with root package name */
    public static final ig3.c f291419g;

    /* renamed from: h, reason: collision with root package name */
    public static final ig3.c f291420h;

    /* renamed from: i, reason: collision with root package name */
    public static final ig3.c f291421i;

    /* renamed from: m, reason: collision with root package name */
    public static final ig3.c f291422m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ ig3.c[] f291423n;

    static {
        ig3.c cVar = new ig3.c("UNKNOWN", 0);
        f291416d = cVar;
        ig3.c cVar2 = new ig3.c("PLAYING", 1);
        f291417e = cVar2;
        ig3.c cVar3 = new ig3.c("FIRST_FRAME_RENDER", 2);
        f291418f = cVar3;
        ig3.c cVar4 = new ig3.c("PAUSE", 3);
        f291419g = cVar4;
        ig3.c cVar5 = new ig3.c("BUFFER", 4);
        f291420h = cVar5;
        ig3.c cVar6 = new ig3.c("STOP", 5);
        f291421i = cVar6;
        ig3.c cVar7 = new ig3.c("ERROR", 6);
        f291422m = cVar7;
        ig3.c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        f291423n = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    public static ig3.c valueOf(java.lang.String str) {
        return (ig3.c) java.lang.Enum.valueOf(ig3.c.class, str);
    }

    public static ig3.c[] values() {
        return (ig3.c[]) f291423n.clone();
    }
}
