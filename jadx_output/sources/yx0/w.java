package yx0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class w {

    /* renamed from: d, reason: collision with root package name */
    public static final yx0.w f467725d;

    /* renamed from: e, reason: collision with root package name */
    public static final yx0.w f467726e;

    /* renamed from: f, reason: collision with root package name */
    public static final yx0.w f467727f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ yx0.w[] f467728g;

    static {
        yx0.w wVar = new yx0.w("ALBUM", 0);
        f467725d = wVar;
        yx0.w wVar2 = new yx0.w("FRONT_CAMERA", 1);
        f467726e = wVar2;
        yx0.w wVar3 = new yx0.w("BACK_CAMERA", 2);
        f467727f = wVar3;
        yx0.w[] wVarArr = {wVar, wVar2, wVar3};
        f467728g = wVarArr;
        rz5.b.a(wVarArr);
    }

    public w(java.lang.String str, int i17) {
    }

    public static yx0.w valueOf(java.lang.String str) {
        return (yx0.w) java.lang.Enum.valueOf(yx0.w.class, str);
    }

    public static yx0.w[] values() {
        return (yx0.w[]) f467728g.clone();
    }
}
