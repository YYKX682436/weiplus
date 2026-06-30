package com.tencent.mm.sdk.platformtools;

/* loaded from: classes7.dex */
public final class k8 extends java.util.LinkedHashMap {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f192814d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(int i17) {
        super(i17);
        this.f192814d = i17;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(java.util.Map.Entry entry) {
        kotlin.jvm.internal.o.g(entry, "entry");
        return super.size() > this.f192814d;
    }
}
