package xc2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final xc2.l f453195d;

    /* renamed from: e, reason: collision with root package name */
    public static final xc2.l f453196e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ xc2.l[] f453197f;

    static {
        xc2.l lVar = new xc2.l("Unknown", 0, 0);
        xc2.l lVar2 = new xc2.l("Button", 1, 1);
        f453195d = lVar2;
        xc2.l lVar3 = new xc2.l("Card", 2, 2);
        f453196e = lVar3;
        xc2.l[] lVarArr = {lVar, lVar2, lVar3};
        f453197f = lVarArr;
        rz5.b.a(lVarArr);
    }

    public l(java.lang.String str, int i17, int i18) {
    }

    public static xc2.l valueOf(java.lang.String str) {
        return (xc2.l) java.lang.Enum.valueOf(xc2.l.class, str);
    }

    public static xc2.l[] values() {
        return (xc2.l[]) f453197f.clone();
    }
}
