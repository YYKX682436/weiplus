package qn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final qn.c f364877e;

    /* renamed from: f, reason: collision with root package name */
    public static final qn.c f364878f;

    /* renamed from: g, reason: collision with root package name */
    public static final qn.c f364879g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ qn.c[] f364880h;

    /* renamed from: d, reason: collision with root package name */
    public final int f364881d;

    static {
        qn.c cVar = new qn.c("Other", 0, 0);
        f364877e = cVar;
        qn.c cVar2 = new qn.c("Self", 1, 1);
        f364878f = cVar2;
        qn.c cVar3 = new qn.c("FileHelper", 2, 2);
        f364879g = cVar3;
        qn.c[] cVarArr = {cVar, cVar2, cVar3};
        f364880h = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17, int i18) {
        this.f364881d = i18;
    }

    public static qn.c valueOf(java.lang.String str) {
        return (qn.c) java.lang.Enum.valueOf(qn.c.class, str);
    }

    public static qn.c[] values() {
        return (qn.c[]) f364880h.clone();
    }
}
