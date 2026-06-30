package ru3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final ru3.o f399763d;

    /* renamed from: e, reason: collision with root package name */
    public static final ru3.o f399764e;

    /* renamed from: f, reason: collision with root package name */
    public static final ru3.o f399765f;

    /* renamed from: g, reason: collision with root package name */
    public static final ru3.o f399766g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ru3.o[] f399767h;

    static {
        ru3.o oVar = new ru3.o("CIRCLE", 0);
        f399763d = oVar;
        ru3.o oVar2 = new ru3.o("RECT_ADJUST", 1);
        f399764e = oVar2;
        ru3.o oVar3 = new ru3.o("RECT_HARD", 2);
        f399765f = oVar3;
        ru3.o oVar4 = new ru3.o("RECT_LINE_HARD", 3);
        f399766g = oVar4;
        ru3.o[] oVarArr = {oVar, oVar2, oVar3, oVar4};
        f399767h = oVarArr;
        rz5.b.a(oVarArr);
    }

    public o(java.lang.String str, int i17) {
    }

    public static ru3.o valueOf(java.lang.String str) {
        return (ru3.o) java.lang.Enum.valueOf(ru3.o.class, str);
    }

    public static ru3.o[] values() {
        return (ru3.o[]) f399767h.clone();
    }
}
