package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes4.dex */
public final class yb extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f174455d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(java.lang.String str) {
        super(1);
        this.f174455d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        mj4.h item = (mj4.h) obj;
        kotlin.jvm.internal.o.g(item, "item");
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.o.b(((mj4.k) item).l(), this.f174455d));
    }
}
