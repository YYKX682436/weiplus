package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes8.dex */
public enum h5 {
    OK(1),
    TOKEN_EMPTY(2),
    TOKEN_DATA_NOT_MATCH(3),
    PACKAGE_NAME_INVALID(4),
    GET_TOKEN(99);


    /* renamed from: d, reason: collision with root package name */
    public final int f188929d;

    h5(int i17) {
        this.f188929d = i17;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return java.lang.String.format("%s(%s)", super.toString(), java.lang.Integer.valueOf(this.f188929d));
    }
}
