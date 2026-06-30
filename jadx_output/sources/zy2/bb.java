package zy2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class bb {

    /* renamed from: d, reason: collision with root package name */
    public static final zy2.bb f477354d;

    /* renamed from: e, reason: collision with root package name */
    public static final zy2.bb f477355e;

    /* renamed from: f, reason: collision with root package name */
    public static final zy2.bb f477356f;

    /* renamed from: g, reason: collision with root package name */
    public static final zy2.bb f477357g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ zy2.bb[] f477358h;

    static {
        zy2.bb bbVar = new zy2.bb("RECEIVE", 0);
        f477354d = bbVar;
        zy2.bb bbVar2 = new zy2.bb("GET_SESSION_ID", 1);
        f477355e = bbVar2;
        zy2.bb bbVar3 = new zy2.bb("SELF_REPLY", 2);
        f477356f = bbVar3;
        zy2.bb bbVar4 = new zy2.bb("FOR_TEST", 3);
        f477357g = bbVar4;
        zy2.bb[] bbVarArr = {bbVar, bbVar2, bbVar3, bbVar4};
        f477358h = bbVarArr;
        rz5.b.a(bbVarArr);
    }

    public bb(java.lang.String str, int i17) {
    }

    public static zy2.bb valueOf(java.lang.String str) {
        return (zy2.bb) java.lang.Enum.valueOf(zy2.bb.class, str);
    }

    public static zy2.bb[] values() {
        return (zy2.bb[]) f477358h.clone();
    }
}
