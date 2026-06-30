package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public final class n90 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.o90 f127237d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n90(com.tencent.mm.plugin.finder.storage.o90 o90Var) {
        super(0);
        this.f127237d = o90Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String b17 = this.f127237d.b();
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        return java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.w2.b(b17.getBytes()).hashCode());
    }
}
