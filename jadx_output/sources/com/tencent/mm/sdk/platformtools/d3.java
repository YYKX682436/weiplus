package com.tencent.mm.sdk.platformtools;

/* loaded from: classes5.dex */
public final class d3 implements com.tencent.mm.vfs.b7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f192522a;

    public d3(long j17) {
        this.f192522a = j17;
    }

    @Override // com.tencent.mm.vfs.b7
    public final boolean a(com.tencent.mm.vfs.r6 r6Var, java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        return !kotlin.jvm.internal.o.b(name, java.lang.String.valueOf(this.f192522a));
    }
}
