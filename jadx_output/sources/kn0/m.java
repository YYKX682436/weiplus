package kn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: d, reason: collision with root package name */
    public static final kn0.m f309573d;

    /* renamed from: e, reason: collision with root package name */
    public static final kn0.m f309574e;

    /* renamed from: f, reason: collision with root package name */
    public static final kn0.m f309575f;

    /* renamed from: g, reason: collision with root package name */
    public static final kn0.m f309576g;

    /* renamed from: h, reason: collision with root package name */
    public static final kn0.m f309577h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kn0.m[] f309578i;

    static {
        kn0.m mVar = new kn0.m("NORMAL_MODE", 0);
        f309573d = mVar;
        kn0.m mVar2 = new kn0.m("FLOAT_MODE", 1);
        f309574e = mVar2;
        kn0.m mVar3 = new kn0.m("PERMISSION_MODE", 2);
        kn0.m mVar4 = new kn0.m("LIVE_SQUARE_MODE", 3);
        f309575f = mVar4;
        kn0.m mVar5 = new kn0.m("FLOAT_CLOSE_MODE", 4);
        f309576g = mVar5;
        kn0.m mVar6 = new kn0.m("WAIT_TO_FLOAT_MODE", 5);
        f309577h = mVar6;
        kn0.m[] mVarArr = {mVar, mVar2, mVar3, mVar4, mVar5, mVar6};
        f309578i = mVarArr;
        rz5.b.a(mVarArr);
    }

    public m(java.lang.String str, int i17) {
    }

    public static kn0.m valueOf(java.lang.String str) {
        return (kn0.m) java.lang.Enum.valueOf(kn0.m.class, str);
    }

    public static kn0.m[] values() {
        return (kn0.m[]) f309578i.clone();
    }
}
