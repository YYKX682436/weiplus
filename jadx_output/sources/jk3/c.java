package jk3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final jk3.c f300080d;

    /* renamed from: e, reason: collision with root package name */
    public static final jk3.c f300081e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ jk3.c[] f300082f;

    static {
        jk3.c cVar = new jk3.c(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0);
        f300080d = cVar;
        jk3.c cVar2 = new jk3.c("ITEM", 1);
        f300081e = cVar2;
        jk3.c[] cVarArr = {cVar, cVar2};
        f300082f = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    public static jk3.c valueOf(java.lang.String str) {
        return (jk3.c) java.lang.Enum.valueOf(jk3.c.class, str);
    }

    public static jk3.c[] values() {
        return (jk3.c[]) f300082f.clone();
    }
}
