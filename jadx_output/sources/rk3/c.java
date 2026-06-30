package rk3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final rk3.c f396488d;

    /* renamed from: e, reason: collision with root package name */
    public static final rk3.c f396489e;

    /* renamed from: f, reason: collision with root package name */
    public static final rk3.c f396490f;

    /* renamed from: g, reason: collision with root package name */
    public static final rk3.c f396491g;

    /* renamed from: h, reason: collision with root package name */
    public static final rk3.c f396492h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ rk3.c[] f396493i;

    static {
        rk3.c cVar = new rk3.c("EXPANDED", 0);
        f396488d = cVar;
        rk3.c cVar2 = new rk3.c("COLLAPSED", 1);
        f396489e = cVar2;
        rk3.c cVar3 = new rk3.c("ANCHORED", 2);
        f396490f = cVar3;
        rk3.c cVar4 = new rk3.c("HIDDEN", 3);
        f396491g = cVar4;
        rk3.c cVar5 = new rk3.c("DRAGGING", 4);
        f396492h = cVar5;
        rk3.c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        f396493i = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    public static rk3.c valueOf(java.lang.String str) {
        return (rk3.c) java.lang.Enum.valueOf(rk3.c.class, str);
    }

    public static rk3.c[] values() {
        return (rk3.c[]) f396493i.clone();
    }
}
