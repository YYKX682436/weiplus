package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class ro extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.so f132980d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro(com.tencent.mm.plugin.finder.view.so soVar) {
        super(1);
        this.f132980d = soVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return java.lang.Boolean.valueOf(this.f132980d.f132250c.size() - 1 == ((java.lang.Number) obj).intValue());
    }
}
