package com.tencent.mm.ui.chatting.component;

/* loaded from: classes12.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public long[] f199958a;

    /* renamed from: b, reason: collision with root package name */
    public int f199959b;

    public t(int i17) {
        this.f199958a = new long[i17];
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(hashCode());
        sb6.append('#');
        long[] copyOf = java.util.Arrays.copyOf(this.f199958a, this.f199959b);
        kotlin.jvm.internal.o.f(copyOf, "copyOf(...)");
        java.lang.String arrays = java.util.Arrays.toString(copyOf);
        kotlin.jvm.internal.o.f(arrays, "toString(...)");
        sb6.append(arrays);
        return sb6.toString();
    }
}
