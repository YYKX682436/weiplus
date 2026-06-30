package com.tencent.mm.plugin.finder.megavideo.topstory.flow;

/* loaded from: classes2.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bo2.c f120903d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(bo2.c cVar) {
        super(1);
        this.f120903d = cVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return java.lang.Boolean.valueOf(((bo2.c) obj).getItemId() == this.f120903d.getItemId());
    }
}
