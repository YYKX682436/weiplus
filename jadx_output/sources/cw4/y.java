package cw4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class y {

    /* renamed from: d, reason: collision with root package name */
    public static final cw4.y f224299d;

    /* renamed from: e, reason: collision with root package name */
    public static final cw4.y f224300e;

    /* renamed from: f, reason: collision with root package name */
    public static final cw4.y f224301f;

    /* renamed from: g, reason: collision with root package name */
    public static final cw4.y f224302g;

    /* renamed from: h, reason: collision with root package name */
    public static final cw4.y f224303h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ cw4.y[] f224304i;

    static {
        cw4.y yVar = new cw4.y("Unknown", 0);
        f224299d = yVar;
        cw4.y yVar2 = new cw4.y("NeedTrans", 1);
        f224300e = yVar2;
        cw4.y yVar3 = new cw4.y("NoNeedTrans", 2);
        f224301f = yVar3;
        cw4.y yVar4 = new cw4.y("NotSure", 3);
        f224302g = yVar4;
        cw4.y yVar5 = new cw4.y("BadNet", 4);
        f224303h = yVar5;
        cw4.y[] yVarArr = {yVar, yVar2, yVar3, yVar4, yVar5};
        f224304i = yVarArr;
        rz5.b.a(yVarArr);
    }

    public y(java.lang.String str, int i17) {
    }

    public static cw4.y valueOf(java.lang.String str) {
        return (cw4.y) java.lang.Enum.valueOf(cw4.y.class, str);
    }

    public static cw4.y[] values() {
        return (cw4.y[]) f224304i.clone();
    }
}
