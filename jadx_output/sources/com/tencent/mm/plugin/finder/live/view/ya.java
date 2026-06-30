package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class ya extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.gb f116838d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya(com.tencent.mm.plugin.finder.live.view.gb gbVar) {
        super(1);
        this.f116838d = gbVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        gk2.e q57;
        long longValue = ((java.lang.Number) obj).longValue();
        wt2.a aVar = this.f116838d.R;
        if (aVar != null && (q57 = aVar.q5()) != null) {
            bf2.c.b(bf2.c.f19598a, q57, 3, 10, java.lang.String.valueOf(longValue), 0, 16, null);
        }
        return jz5.f0.f302826a;
    }
}
