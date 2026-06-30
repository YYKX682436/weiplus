package if4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final if4.i f291260d;

    /* renamed from: e, reason: collision with root package name */
    public static final if4.i f291261e;

    /* renamed from: f, reason: collision with root package name */
    public static final if4.i f291262f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ if4.i[] f291263g;

    static {
        if4.i iVar = new if4.i("Empty", 0);
        f291260d = iVar;
        if4.i iVar2 = new if4.i("Fake", 1);
        f291261e = iVar2;
        if4.i iVar3 = new if4.i("Uploading", 2);
        if4.i iVar4 = new if4.i("Normal", 3);
        f291262f = iVar4;
        if4.i[] iVarArr = {iVar, iVar2, iVar3, iVar4};
        f291263g = iVarArr;
        rz5.b.a(iVarArr);
    }

    public i(java.lang.String str, int i17) {
    }

    public static if4.i valueOf(java.lang.String str) {
        return (if4.i) java.lang.Enum.valueOf(if4.i.class, str);
    }

    public static if4.i[] values() {
        return (if4.i[]) f291263g.clone();
    }
}
