package com.tencent.mm.sdk.platformtools;

/* loaded from: classes9.dex */
public final class v4 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o4 f193038a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f193039b;

    public v4(com.tencent.mm.sdk.platformtools.o4 mmkv) {
        kotlin.jvm.internal.o.g(mmkv, "mmkv");
        this.f193038a = mmkv;
        this.f193039b = jz5.h.b(com.tencent.mm.sdk.platformtools.u4.f193018d);
    }

    public final boolean a(java.lang.String key, java.lang.String str, boolean z17) {
        kotlin.jvm.internal.o.g(key, "key");
        boolean D = this.f193038a.D(key, str);
        if (D && z17) {
            ((e75.g) ((jz5.n) this.f193039b).getValue()).notify(new com.tencent.mm.sdk.platformtools.w3(com.tencent.mm.sdk.platformtools.x3.f193079d, key));
        }
        return D;
    }
}
