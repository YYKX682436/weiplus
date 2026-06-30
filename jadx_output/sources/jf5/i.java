package jf5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final jf5.i f299466d;

    /* renamed from: e, reason: collision with root package name */
    public static final jf5.i f299467e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ jf5.i[] f299468f;

    static {
        jf5.i iVar = new jf5.i("START", 0);
        f299466d = iVar;
        jf5.i iVar2 = new jf5.i("END", 1);
        f299467e = iVar2;
        jf5.i[] iVarArr = {iVar, iVar2};
        f299468f = iVarArr;
        rz5.b.a(iVarArr);
    }

    public i(java.lang.String str, int i17) {
    }

    public static jf5.i valueOf(java.lang.String str) {
        return (jf5.i) java.lang.Enum.valueOf(jf5.i.class, str);
    }

    public static jf5.i[] values() {
        return (jf5.i[]) f299468f.clone();
    }
}
