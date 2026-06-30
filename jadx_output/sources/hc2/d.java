package hc2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final hc2.d f280306d;

    /* renamed from: e, reason: collision with root package name */
    public static final hc2.d f280307e;

    /* renamed from: f, reason: collision with root package name */
    public static final hc2.d f280308f;

    /* renamed from: g, reason: collision with root package name */
    public static final hc2.d f280309g;

    /* renamed from: h, reason: collision with root package name */
    public static final hc2.d f280310h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ hc2.d[] f280311i;

    static {
        hc2.d dVar = new hc2.d("toLocal", 0, "toLocal");
        hc2.d dVar2 = new hc2.d("toStream", 1, "toStream");
        hc2.d dVar3 = new hc2.d("onAttachedToRecyclerView", 2, "onAttachedToRecyclerView");
        f280306d = dVar3;
        hc2.d dVar4 = new hc2.d("onDetachedFromRecyclerView", 3, "onDetachedFromRecyclerView");
        f280307e = dVar4;
        hc2.d dVar5 = new hc2.d("onCreateViewHolder", 4, "onCreateViewHolder");
        hc2.d dVar6 = new hc2.d("onBindViewHolder", 5, "onBindViewHolder");
        f280308f = dVar6;
        hc2.d dVar7 = new hc2.d("onViewRecycled", 6, "onViewRecycled");
        f280309g = dVar7;
        hc2.d dVar8 = new hc2.d("onFeedSelected", 7, "onFeedSelected");
        f280310h = dVar8;
        hc2.d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, new hc2.d("resetContextInStream", 8, "resetContextInStream")};
        f280311i = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17, java.lang.String str2) {
    }

    public static hc2.d valueOf(java.lang.String str) {
        return (hc2.d) java.lang.Enum.valueOf(hc2.d.class, str);
    }

    public static hc2.d[] values() {
        return (hc2.d[]) f280311i.clone();
    }
}
