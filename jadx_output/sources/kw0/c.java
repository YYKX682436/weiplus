package kw0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final kw0.c f312795d;

    /* renamed from: e, reason: collision with root package name */
    public static final kw0.c f312796e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kw0.c[] f312797f;

    static {
        kw0.c cVar = new kw0.c("EMOTION", 0);
        f312795d = cVar;
        kw0.c cVar2 = new kw0.c("TIME_AND_PLACE", 1);
        f312796e = cVar2;
        kw0.c[] cVarArr = {cVar, cVar2};
        f312797f = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    public static kw0.c valueOf(java.lang.String str) {
        return (kw0.c) java.lang.Enum.valueOf(kw0.c.class, str);
    }

    public static kw0.c[] values() {
        return (kw0.c[]) f312797f.clone();
    }
}
