package vd1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final vd1.m f435595e;

    /* renamed from: f, reason: collision with root package name */
    public static final vd1.m f435596f;

    /* renamed from: g, reason: collision with root package name */
    public static final vd1.m f435597g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ vd1.m[] f435598h;

    /* renamed from: d, reason: collision with root package name */
    public final int f435599d;

    static {
        vd1.m mVar = new vd1.m("Enqueued", 0, 1);
        f435595e = mVar;
        vd1.m mVar2 = new vd1.m("Succeed", 1, 2);
        f435596f = mVar2;
        vd1.m mVar3 = new vd1.m("Failed", 2, 3);
        f435597g = mVar3;
        vd1.m[] mVarArr = {mVar, mVar2, mVar3};
        f435598h = mVarArr;
        rz5.b.a(mVarArr);
    }

    public m(java.lang.String str, int i17, int i18) {
        this.f435599d = i18;
    }

    public static vd1.m valueOf(java.lang.String str) {
        return (vd1.m) java.lang.Enum.valueOf(vd1.m.class, str);
    }

    public static vd1.m[] values() {
        return (vd1.m[]) f435598h.clone();
    }
}
