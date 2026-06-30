package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes8.dex */
public enum f5 {
    UNKNOWN(-1),
    SUCCESS(0),
    SUCCESS_BY_TOKEN(1),
    FAIL_BY_LOCAL(2),
    FAIL_BY_TOKEN(3),
    NO_TOKEN_SIGNATURE(4);


    /* renamed from: d, reason: collision with root package name */
    public final int f188899d;

    f5(int i17) {
        this.f188899d = i17;
    }

    public static com.tencent.mm.pluginsdk.model.app.f5 a(int i17) {
        return i17 == 0 ? SUCCESS : i17 == 1 ? SUCCESS_BY_TOKEN : i17 == 2 ? FAIL_BY_LOCAL : i17 == 3 ? FAIL_BY_TOKEN : i17 == 4 ? NO_TOKEN_SIGNATURE : UNKNOWN;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return java.lang.String.format("%s(%s)", super.toString(), java.lang.Integer.valueOf(this.f188899d));
    }
}
