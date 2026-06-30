package zn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final zn0.k f474359d;

    /* renamed from: e, reason: collision with root package name */
    public static final zn0.k f474360e;

    /* renamed from: f, reason: collision with root package name */
    public static final zn0.k f474361f;

    /* renamed from: g, reason: collision with root package name */
    public static final zn0.k f474362g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ zn0.k[] f474363h;

    static {
        zn0.k kVar = new zn0.k("None", 0);
        f474359d = kVar;
        zn0.k kVar2 = new zn0.k("WaitingStartResult", 1);
        f474360e = kVar2;
        zn0.k kVar3 = new zn0.k("WaitingUpdateResult", 2);
        f474361f = kVar3;
        zn0.k kVar4 = new zn0.k("WaitingStopResult", 3);
        f474362g = kVar4;
        zn0.k[] kVarArr = {kVar, kVar2, kVar3, kVar4};
        f474363h = kVarArr;
        rz5.b.a(kVarArr);
    }

    public k(java.lang.String str, int i17) {
    }

    public static zn0.k valueOf(java.lang.String str) {
        return (zn0.k) java.lang.Enum.valueOf(zn0.k.class, str);
    }

    public static zn0.k[] values() {
        return (zn0.k[]) f474363h.clone();
    }
}
