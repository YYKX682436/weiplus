package m22;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final m22.u f323065d;

    /* renamed from: e, reason: collision with root package name */
    public static final m22.u f323066e;

    /* renamed from: f, reason: collision with root package name */
    public static final m22.u f323067f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ m22.u[] f323068g;

    static {
        m22.u uVar = new m22.u("Up", 0);
        f323065d = uVar;
        m22.u uVar2 = new m22.u("Down", 1);
        f323066e = uVar2;
        m22.u uVar3 = new m22.u("None", 2);
        f323067f = uVar3;
        m22.u[] uVarArr = {uVar, uVar2, uVar3};
        f323068g = uVarArr;
        rz5.b.a(uVarArr);
    }

    public u(java.lang.String str, int i17) {
    }

    public static m22.u valueOf(java.lang.String str) {
        return (m22.u) java.lang.Enum.valueOf(m22.u.class, str);
    }

    public static m22.u[] values() {
        return (m22.u[]) f323068g.clone();
    }
}
