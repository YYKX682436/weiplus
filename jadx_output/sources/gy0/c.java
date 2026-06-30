package gy0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final gy0.c f277501d;

    /* renamed from: e, reason: collision with root package name */
    public static final gy0.c f277502e;

    /* renamed from: f, reason: collision with root package name */
    public static final gy0.c f277503f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ gy0.c[] f277504g;

    static {
        gy0.c cVar = new gy0.c("TouchLeft", 0);
        f277501d = cVar;
        gy0.c cVar2 = new gy0.c("TouchRight", 1);
        f277502e = cVar2;
        gy0.c cVar3 = new gy0.c("LongPressDrag", 2);
        f277503f = cVar3;
        gy0.c[] cVarArr = {cVar, cVar2, cVar3};
        f277504g = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    public static gy0.c valueOf(java.lang.String str) {
        return (gy0.c) java.lang.Enum.valueOf(gy0.c.class, str);
    }

    public static gy0.c[] values() {
        return (gy0.c[]) f277504g.clone();
    }
}
