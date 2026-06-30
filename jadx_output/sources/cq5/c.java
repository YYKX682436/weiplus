package cq5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final cq5.c f221509e;

    /* renamed from: f, reason: collision with root package name */
    public static final cq5.c f221510f;

    /* renamed from: g, reason: collision with root package name */
    public static final cq5.c f221511g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ cq5.c[] f221512h;

    /* renamed from: d, reason: collision with root package name */
    public final int f221513d;

    static {
        cq5.c cVar = new cq5.c("PHOTO", 0, 0);
        f221509e = cVar;
        cq5.c cVar2 = new cq5.c("FILE", 1, 1);
        f221510f = cVar2;
        cq5.c cVar3 = new cq5.c("LAST_SELECT", 2, 2);
        f221511g = cVar3;
        cq5.c[] cVarArr = {cVar, cVar2, cVar3};
        f221512h = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17, int i18) {
        this.f221513d = i18;
    }

    public static cq5.c valueOf(java.lang.String str) {
        return (cq5.c) java.lang.Enum.valueOf(cq5.c.class, str);
    }

    public static cq5.c[] values() {
        return (cq5.c[]) f221512h.clone();
    }
}
