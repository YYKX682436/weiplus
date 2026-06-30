package com.tencent.mm.vfs;

/* loaded from: classes10.dex */
public final class d0 extends com.tencent.mm.vfs.u {

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f212892b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.vfs.v cleanType, yz5.l cleanerCreator) {
        super(cleanType.f213214d);
        kotlin.jvm.internal.o.g(cleanType, "cleanType");
        kotlin.jvm.internal.o.g(cleanerCreator, "cleanerCreator");
        this.f212892b = cleanerCreator;
    }

    @Override // com.tencent.mm.vfs.u
    public yz5.l a() {
        return this.f212892b;
    }
}
