package uf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final uf.n f427046d;

    /* renamed from: e, reason: collision with root package name */
    public static final uf.n f427047e;

    /* renamed from: f, reason: collision with root package name */
    public static final uf.n f427048f;

    /* renamed from: g, reason: collision with root package name */
    public static final uf.n f427049g;

    /* renamed from: h, reason: collision with root package name */
    public static final uf.n f427050h;

    /* renamed from: i, reason: collision with root package name */
    public static final uf.n f427051i;

    /* renamed from: m, reason: collision with root package name */
    public static final uf.n f427052m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ uf.n[] f427053n;

    static {
        uf.n nVar = new uf.n("ACTION_EMPTY", 0);
        uf.n nVar2 = new uf.n("ACTION_ADD_DEVICE", 1);
        uf.n nVar3 = new uf.n("ACTION_REMOVE_DEVICE", 2);
        uf.n nVar4 = new uf.n("ACTION_UPDATE_DEVICE", 3);
        uf.n nVar5 = new uf.n("ACTION_SET_VOLUME", 4);
        uf.n nVar6 = new uf.n("ACTION_PLAYING", 5);
        f427046d = nVar6;
        uf.n nVar7 = new uf.n("ACTION_PAUSED", 6);
        f427047e = nVar7;
        uf.n nVar8 = new uf.n("ACTION_STOPPED", 7);
        f427048f = nVar8;
        uf.n nVar9 = new uf.n("ACTION_VOLUME", 8);
        f427049g = nVar9;
        uf.n nVar10 = new uf.n("ACTION_MUTE", 9);
        f427050h = nVar10;
        uf.n nVar11 = new uf.n("ACTION_PROGRESS", 10);
        f427051i = nVar11;
        uf.n nVar12 = new uf.n("ACTION_ERROR", 11);
        f427052m = nVar12;
        uf.n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8, nVar9, nVar10, nVar11, nVar12};
        f427053n = nVarArr;
        rz5.b.a(nVarArr);
    }

    public n(java.lang.String str, int i17) {
    }

    public static uf.n valueOf(java.lang.String str) {
        return (uf.n) java.lang.Enum.valueOf(uf.n.class, str);
    }

    public static uf.n[] values() {
        return (uf.n[]) f427053n.clone();
    }
}
