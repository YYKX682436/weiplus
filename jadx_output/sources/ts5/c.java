package ts5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final ts5.c f421732d;

    /* renamed from: e, reason: collision with root package name */
    public static final ts5.c f421733e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ts5.c[] f421734f;

    static {
        ts5.c cVar = new ts5.c("TYPE_MEMORY_TREND", 0);
        ts5.c cVar2 = new ts5.c("TYPE_POWER_TREND", 1);
        f421732d = cVar2;
        ts5.c cVar3 = new ts5.c("TYPE_MEMORY_START_AND_END", 2);
        ts5.c cVar4 = new ts5.c("TYPE_AVG_MEMORY", 3);
        ts5.c cVar5 = new ts5.c("TYPE_AVG_POWER", 4);
        ts5.c cVar6 = new ts5.c("TYPE_TEMPERATURE", 5);
        f421733e = cVar6;
        ts5.c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
        f421734f = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    public static ts5.c valueOf(java.lang.String str) {
        return (ts5.c) java.lang.Enum.valueOf(ts5.c.class, str);
    }

    public static ts5.c[] values() {
        return (ts5.c[]) f421734f.clone();
    }
}
