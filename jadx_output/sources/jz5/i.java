package jz5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.i f302829d;

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.i f302830e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.i f302831f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ jz5.i[] f302832g;

    static {
        jz5.i iVar = new jz5.i("SYNCHRONIZED", 0);
        f302829d = iVar;
        jz5.i iVar2 = new jz5.i("PUBLICATION", 1);
        f302830e = iVar2;
        jz5.i iVar3 = new jz5.i("NONE", 2);
        f302831f = iVar3;
        jz5.i[] iVarArr = {iVar, iVar2, iVar3};
        f302832g = iVarArr;
        rz5.b.a(iVarArr);
    }

    public i(java.lang.String str, int i17) {
    }

    public static jz5.i valueOf(java.lang.String str) {
        return (jz5.i) java.lang.Enum.valueOf(jz5.i.class, str);
    }

    public static jz5.i[] values() {
        return (jz5.i[]) f302832g.clone();
    }
}
