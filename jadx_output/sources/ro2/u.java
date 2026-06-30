package ro2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class u {

    /* renamed from: e, reason: collision with root package name */
    public static final ro2.u f398102e;

    /* renamed from: f, reason: collision with root package name */
    public static final ro2.u f398103f;

    /* renamed from: g, reason: collision with root package name */
    public static final ro2.u f398104g;

    /* renamed from: h, reason: collision with root package name */
    public static final ro2.u f398105h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ ro2.u[] f398106i;

    /* renamed from: d, reason: collision with root package name */
    public final int f398107d;

    static {
        ro2.u uVar = new ro2.u("LIKE", 0, 1);
        f398102e = uVar;
        ro2.u uVar2 = new ro2.u("FAV", 1, 2);
        f398103f = uVar2;
        ro2.u uVar3 = new ro2.u("FIRE", 2, 3);
        f398104g = uVar3;
        ro2.u uVar4 = new ro2.u("FRIEND_ALSO", 3, 4);
        f398105h = uVar4;
        ro2.u[] uVarArr = {uVar, uVar2, uVar3, uVar4};
        f398106i = uVarArr;
        rz5.b.a(uVarArr);
    }

    public u(java.lang.String str, int i17, int i18) {
        this.f398107d = i18;
    }

    public static ro2.u valueOf(java.lang.String str) {
        return (ro2.u) java.lang.Enum.valueOf(ro2.u.class, str);
    }

    public static ro2.u[] values() {
        return (ro2.u[]) f398106i.clone();
    }
}
