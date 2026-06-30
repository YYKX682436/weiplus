package mx0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final mx0.m f332137e;

    /* renamed from: f, reason: collision with root package name */
    public static final mx0.m f332138f;

    /* renamed from: g, reason: collision with root package name */
    public static final mx0.m f332139g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ mx0.m[] f332140h;

    /* renamed from: d, reason: collision with root package name */
    public final int f332141d;

    static {
        mx0.m mVar = new mx0.m("kFinderAiGenderTypeMale", 0, 1);
        f332137e = mVar;
        mx0.m mVar2 = new mx0.m("kFinderAiGenderTypeFemale", 1, 2);
        f332138f = mVar2;
        mx0.m mVar3 = new mx0.m("kFinderAiGenderTypeUnknown", 2, 3);
        f332139g = mVar3;
        mx0.m[] mVarArr = {mVar, mVar2, mVar3};
        f332140h = mVarArr;
        rz5.b.a(mVarArr);
    }

    public m(java.lang.String str, int i17, int i18) {
        this.f332141d = i18;
    }

    public static mx0.m valueOf(java.lang.String str) {
        return (mx0.m) java.lang.Enum.valueOf(mx0.m.class, str);
    }

    public static mx0.m[] values() {
        return (mx0.m[]) f332140h.clone();
    }
}
