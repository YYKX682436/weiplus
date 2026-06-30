package m05;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final m05.n f322577d;

    /* renamed from: e, reason: collision with root package name */
    public static final m05.n f322578e;

    /* renamed from: f, reason: collision with root package name */
    public static final m05.n f322579f;

    /* renamed from: g, reason: collision with root package name */
    public static final m05.n f322580g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ m05.n[] f322581h;

    static {
        m05.n nVar = new m05.n("Event_OnCreate", 0);
        f322577d = nVar;
        m05.n nVar2 = new m05.n("Event_OnStart", 1);
        f322578e = nVar2;
        m05.n nVar3 = new m05.n("Event_OnResume", 2);
        f322579f = nVar3;
        m05.n nVar4 = new m05.n("Event_OnPause", 3);
        m05.n nVar5 = new m05.n("Event_OnStop", 4);
        m05.n nVar6 = new m05.n("Event_OnDestroy", 5);
        m05.n nVar7 = new m05.n("Event_Custom", 6);
        f322580g = nVar7;
        m05.n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7};
        f322581h = nVarArr;
        rz5.b.a(nVarArr);
    }

    public n(java.lang.String str, int i17) {
    }

    public static m05.n valueOf(java.lang.String str) {
        return (m05.n) java.lang.Enum.valueOf(m05.n.class, str);
    }

    public static m05.n[] values() {
        return (m05.n[]) f322581h.clone();
    }
}
