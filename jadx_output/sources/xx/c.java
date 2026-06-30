package xx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final xx.c f457774e;

    /* renamed from: f, reason: collision with root package name */
    public static final xx.c f457775f;

    /* renamed from: g, reason: collision with root package name */
    public static final xx.c f457776g;

    /* renamed from: h, reason: collision with root package name */
    public static final xx.c f457777h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ xx.c[] f457778i;

    /* renamed from: d, reason: collision with root package name */
    public final int f457779d;

    static {
        xx.c cVar = new xx.c("TimeOut", 0, 1);
        f457774e = cVar;
        xx.c cVar2 = new xx.c("UserExitRoom", 1, 2);
        f457775f = cVar2;
        xx.c cVar3 = new xx.c("UserSpeak", 2, 3);
        f457776g = cVar3;
        xx.c cVar4 = new xx.c("AIAnswer", 3, 4);
        f457777h = cVar4;
        xx.c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
        f457778i = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17, int i18) {
        this.f457779d = i18;
    }

    public static xx.c valueOf(java.lang.String str) {
        return (xx.c) java.lang.Enum.valueOf(xx.c.class, str);
    }

    public static xx.c[] values() {
        return (xx.c[]) f457778i.clone();
    }
}
