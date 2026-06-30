package hn1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final hn1.u f282490d;

    /* renamed from: e, reason: collision with root package name */
    public static final hn1.u f282491e;

    /* renamed from: f, reason: collision with root package name */
    public static final hn1.u f282492f;

    /* renamed from: g, reason: collision with root package name */
    public static final hn1.u f282493g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ hn1.u[] f282494h;

    static {
        hn1.u uVar = new hn1.u("NotExpired", 0);
        f282490d = uVar;
        hn1.u uVar2 = new hn1.u("Expired", 1);
        f282491e = uVar2;
        hn1.u uVar3 = new hn1.u("Empty", 2);
        f282492f = uVar3;
        hn1.u uVar4 = new hn1.u("NotExist", 3);
        f282493g = uVar4;
        hn1.u[] uVarArr = {uVar, uVar2, uVar3, uVar4};
        f282494h = uVarArr;
        rz5.b.a(uVarArr);
    }

    public u(java.lang.String str, int i17) {
    }

    public static hn1.u valueOf(java.lang.String str) {
        return (hn1.u) java.lang.Enum.valueOf(hn1.u.class, str);
    }

    public static hn1.u[] values() {
        return (hn1.u[]) f282494h.clone();
    }
}
