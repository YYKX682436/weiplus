package dk2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ad {

    /* renamed from: d, reason: collision with root package name */
    public static final dk2.ad f233204d;

    /* renamed from: e, reason: collision with root package name */
    public static final dk2.ad f233205e;

    /* renamed from: f, reason: collision with root package name */
    public static final dk2.ad f233206f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ dk2.ad[] f233207g;

    static {
        dk2.ad adVar = new dk2.ad("OnPause", 0);
        f233204d = adVar;
        dk2.ad adVar2 = new dk2.ad("OnStop", 1);
        f233205e = adVar2;
        dk2.ad adVar3 = new dk2.ad("GainFail", 2);
        f233206f = adVar3;
        dk2.ad[] adVarArr = {adVar, adVar2, adVar3};
        f233207g = adVarArr;
        rz5.b.a(adVarArr);
    }

    public ad(java.lang.String str, int i17) {
    }

    public static dk2.ad valueOf(java.lang.String str) {
        return (dk2.ad) java.lang.Enum.valueOf(dk2.ad.class, str);
    }

    public static dk2.ad[] values() {
        return (dk2.ad[]) f233207g.clone();
    }
}
