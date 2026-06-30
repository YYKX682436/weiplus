package jf5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final jf5.o f299486d;

    /* renamed from: e, reason: collision with root package name */
    public static final jf5.o f299487e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ jf5.o[] f299488f;

    static {
        jf5.o oVar = new jf5.o("CHATTING", 0);
        f299486d = oVar;
        jf5.o oVar2 = new jf5.o("PREVIEW", 1);
        f299487e = oVar2;
        jf5.o[] oVarArr = {oVar, oVar2};
        f299488f = oVarArr;
        rz5.b.a(oVarArr);
    }

    public o(java.lang.String str, int i17) {
    }

    public static jf5.o valueOf(java.lang.String str) {
        return (jf5.o) java.lang.Enum.valueOf(jf5.o.class, str);
    }

    public static jf5.o[] values() {
        return (jf5.o[]) f299488f.clone();
    }
}
