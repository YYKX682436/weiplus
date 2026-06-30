package com.tencent.mm.ui.contact;

/* loaded from: classes.dex */
public final class v8 implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.contact.w8 f207220d;

    /* renamed from: e, reason: collision with root package name */
    public int f207221e;

    public v8(com.tencent.mm.ui.contact.w8 data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f207220d = data;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f207220d.hashCode();
    }

    @Override // in5.c
    public int h() {
        return this.f207221e;
    }
}
