package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.x80 f125481d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.plugin.finder.storage.x80 x80Var) {
        super(1);
        this.f125481d = x80Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return java.lang.Boolean.valueOf(((com.tencent.mm.plugin.finder.storage.x80) obj).field_localId == this.f125481d.field_localId);
    }
}
