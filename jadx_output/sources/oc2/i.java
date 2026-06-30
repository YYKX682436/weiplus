package oc2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final oc2.i f344202d;

    /* renamed from: e, reason: collision with root package name */
    public static final oc2.i f344203e;

    /* renamed from: f, reason: collision with root package name */
    public static final oc2.i f344204f;

    /* renamed from: g, reason: collision with root package name */
    public static final oc2.i f344205g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ oc2.i[] f344206h;

    static {
        oc2.i iVar = new oc2.i("Success", 0);
        f344202d = iVar;
        oc2.i iVar2 = new oc2.i("Fail", 1);
        f344203e = iVar2;
        oc2.i iVar3 = new oc2.i("Invalid", 2);
        f344204f = iVar3;
        oc2.i iVar4 = new oc2.i("Reuse", 3);
        f344205g = iVar4;
        oc2.i[] iVarArr = {iVar, iVar2, iVar3, iVar4};
        f344206h = iVarArr;
        rz5.b.a(iVarArr);
    }

    public i(java.lang.String str, int i17) {
    }

    public static oc2.i valueOf(java.lang.String str) {
        return (oc2.i) java.lang.Enum.valueOf(oc2.i.class, str);
    }

    public static oc2.i[] values() {
        return (oc2.i[]) f344206h.clone();
    }
}
