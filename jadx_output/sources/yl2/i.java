package yl2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final yl2.i f463021d;

    /* renamed from: e, reason: collision with root package name */
    public static final yl2.i f463022e;

    /* renamed from: f, reason: collision with root package name */
    public static final yl2.i f463023f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ yl2.i[] f463024g;

    static {
        yl2.i iVar = new yl2.i("WEPAY", 0);
        f463021d = iVar;
        yl2.i iVar2 = new yl2.i("CTID", 1);
        f463022e = iVar2;
        yl2.i iVar3 = new yl2.i("CANCEL", 2);
        f463023f = iVar3;
        yl2.i[] iVarArr = {iVar, iVar2, iVar3};
        f463024g = iVarArr;
        rz5.b.a(iVarArr);
    }

    public i(java.lang.String str, int i17) {
    }

    public static yl2.i valueOf(java.lang.String str) {
        return (yl2.i) java.lang.Enum.valueOf(yl2.i.class, str);
    }

    public static yl2.i[] values() {
        return (yl2.i[]) f463024g.clone();
    }
}
