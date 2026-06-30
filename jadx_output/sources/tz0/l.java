package tz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class l {

    /* renamed from: g, reason: collision with root package name */
    public static final tz0.l f423195g;

    /* renamed from: h, reason: collision with root package name */
    public static final tz0.l f423196h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ tz0.l[] f423197i;

    /* renamed from: d, reason: collision with root package name */
    public final float f423198d;

    /* renamed from: e, reason: collision with root package name */
    public final int f423199e;

    /* renamed from: f, reason: collision with root package name */
    public final int f423200f;

    static {
        tz0.l lVar = new tz0.l("Large", 0, 76, com.tencent.mm.R.raw.spinner_white_76_outer_holo, com.tencent.mm.R.raw.spinner_76_outer_holo);
        tz0.l lVar2 = new tz0.l("Normal", 1, 48, com.tencent.mm.R.raw.spinner_white_48_outer_holo, com.tencent.mm.R.raw.spinner_48_outer_holo);
        f423195g = lVar2;
        tz0.l lVar3 = new tz0.l("Small", 2, 16, com.tencent.mm.R.raw.spinner_white_16_outer_holo, com.tencent.mm.R.raw.spinner_16_outer_holo);
        f423196h = lVar3;
        tz0.l[] lVarArr = {lVar, lVar2, lVar3};
        f423197i = lVarArr;
        rz5.b.a(lVarArr);
    }

    public l(java.lang.String str, int i17, float f17, int i18, int i19) {
        this.f423198d = f17;
        this.f423199e = i18;
        this.f423200f = i19;
    }

    public static tz0.l valueOf(java.lang.String str) {
        return (tz0.l) java.lang.Enum.valueOf(tz0.l.class, str);
    }

    public static tz0.l[] values() {
        return (tz0.l[]) f423197i.clone();
    }
}
