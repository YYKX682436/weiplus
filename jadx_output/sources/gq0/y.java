package gq0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class y {

    /* renamed from: d, reason: collision with root package name */
    public static final gq0.y f274490d;

    /* renamed from: e, reason: collision with root package name */
    public static final gq0.y f274491e;

    /* renamed from: f, reason: collision with root package name */
    public static final gq0.y f274492f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ gq0.y[] f274493g;

    static {
        gq0.y yVar = new gq0.y("Ok", 0);
        f274490d = yVar;
        gq0.y yVar2 = new gq0.y("Invalid", 1);
        f274491e = yVar2;
        gq0.y yVar3 = new gq0.y("CacheExceed", 2);
        f274492f = yVar3;
        gq0.y[] yVarArr = {yVar, yVar2, yVar3};
        f274493g = yVarArr;
        rz5.b.a(yVarArr);
    }

    public y(java.lang.String str, int i17) {
    }

    public static gq0.y valueOf(java.lang.String str) {
        return (gq0.y) java.lang.Enum.valueOf(gq0.y.class, str);
    }

    public static gq0.y[] values() {
        return (gq0.y[]) f274493g.clone();
    }
}
