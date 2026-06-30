package vw2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final vw2.c f440832d;

    /* renamed from: e, reason: collision with root package name */
    public static final vw2.c f440833e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ vw2.c[] f440834f;

    static {
        vw2.c cVar = new vw2.c("Thumb", 0);
        f440832d = cVar;
        vw2.c cVar2 = new vw2.c("Heart", 1);
        f440833e = cVar2;
        vw2.c[] cVarArr = {cVar, cVar2};
        f440834f = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    public static vw2.c valueOf(java.lang.String str) {
        return (vw2.c) java.lang.Enum.valueOf(vw2.c.class, str);
    }

    public static vw2.c[] values() {
        return (vw2.c[]) f440834f.clone();
    }
}
