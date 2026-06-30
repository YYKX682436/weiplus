package rq4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final rq4.o f399057d;

    /* renamed from: e, reason: collision with root package name */
    public static final rq4.o f399058e;

    /* renamed from: f, reason: collision with root package name */
    public static final rq4.o f399059f;

    /* renamed from: g, reason: collision with root package name */
    public static final rq4.o f399060g;

    /* renamed from: h, reason: collision with root package name */
    public static final rq4.o f399061h;

    /* renamed from: i, reason: collision with root package name */
    public static final rq4.o f399062i;

    /* renamed from: m, reason: collision with root package name */
    public static final rq4.o f399063m;

    /* renamed from: n, reason: collision with root package name */
    public static final rq4.o f399064n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ rq4.o[] f399065o;

    static {
        rq4.o oVar = new rq4.o("UNKOWN", 0);
        f399057d = oVar;
        rq4.o oVar2 = new rq4.o("HANGUP", 1);
        f399058e = oVar2;
        rq4.o oVar3 = new rq4.o("CANCEL", 2);
        f399059f = oVar3;
        rq4.o oVar4 = new rq4.o("SHUTDOWN", 3);
        f399060g = oVar4;
        rq4.o oVar5 = new rq4.o("ERROR", 4);
        f399061h = oVar5;
        rq4.o oVar6 = new rq4.o("PHONE_INTERRUPTER", 5);
        f399062i = oVar6;
        rq4.o oVar7 = new rq4.o("NO_RESP", 6);
        f399063m = oVar7;
        rq4.o oVar8 = new rq4.o("REJECT", 7);
        f399064n = oVar8;
        rq4.o[] oVarArr = {oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7, oVar8};
        f399065o = oVarArr;
        rz5.b.a(oVarArr);
    }

    public o(java.lang.String str, int i17) {
    }

    public static rq4.o valueOf(java.lang.String str) {
        return (rq4.o) java.lang.Enum.valueOf(rq4.o.class, str);
    }

    public static rq4.o[] values() {
        return (rq4.o[]) f399065o.clone();
    }
}
