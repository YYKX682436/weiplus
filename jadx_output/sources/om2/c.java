package om2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final om2.c f346276d;

    /* renamed from: e, reason: collision with root package name */
    public static final om2.c f346277e;

    /* renamed from: f, reason: collision with root package name */
    public static final om2.c f346278f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ om2.c[] f346279g;

    static {
        om2.c cVar = new om2.c("Success", 0);
        f346276d = cVar;
        om2.c cVar2 = new om2.c("Acc_Download_Failed", 1);
        f346277e = cVar2;
        om2.c cVar3 = new om2.c("Acc_Parse_Failed", 2);
        f346278f = cVar3;
        om2.c[] cVarArr = {cVar, cVar2, cVar3};
        f346279g = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    public static om2.c valueOf(java.lang.String str) {
        return (om2.c) java.lang.Enum.valueOf(om2.c.class, str);
    }

    public static om2.c[] values() {
        return (om2.c[]) f346279g.clone();
    }
}
