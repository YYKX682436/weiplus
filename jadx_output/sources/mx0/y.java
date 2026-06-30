package mx0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class y {

    /* renamed from: d, reason: collision with root package name */
    public static final mx0.y f332439d;

    /* renamed from: e, reason: collision with root package name */
    public static final mx0.y f332440e;

    /* renamed from: f, reason: collision with root package name */
    public static final mx0.y f332441f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ mx0.y[] f332442g;

    static {
        mx0.y yVar = new mx0.y("NoLyric", 0);
        f332439d = yVar;
        mx0.y yVar2 = new mx0.y("Fetching", 1);
        f332440e = yVar2;
        mx0.y yVar3 = new mx0.y("FetchFailed", 2);
        f332441f = yVar3;
        mx0.y[] yVarArr = {yVar, yVar2, yVar3};
        f332442g = yVarArr;
        rz5.b.a(yVarArr);
    }

    public y(java.lang.String str, int i17) {
    }

    public static mx0.y valueOf(java.lang.String str) {
        return (mx0.y) java.lang.Enum.valueOf(mx0.y.class, str);
    }

    public static mx0.y[] values() {
        return (mx0.y[]) f332442g.clone();
    }
}
