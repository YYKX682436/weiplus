package com.tencent.mm.ui;

/* loaded from: classes.dex */
public final class hj implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f208886d;

    /* renamed from: e, reason: collision with root package name */
    public final int f208887e;

    /* renamed from: f, reason: collision with root package name */
    public final int f208888f;

    public hj(java.lang.String userName, int i17, int i18) {
        kotlin.jvm.internal.o.g(userName, "userName");
        this.f208886d = userName;
        this.f208887e = i17;
        this.f208888f = i18;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f208886d.hashCode();
    }

    @Override // in5.c
    public int h() {
        return 1;
    }
}
