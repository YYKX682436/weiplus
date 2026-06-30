package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class hm extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi2.w f118575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.wm f118576e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm(zi2.w wVar, com.tencent.mm.plugin.finder.live.widget.wm wmVar) {
        super(2);
        this.f118575d = wVar;
        this.f118576e = wmVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        ((java.lang.Number) obj2).longValue();
        ((mm2.c1) this.f118575d.P0(mm2.c1.class)).w8(longValue);
        this.f118576e.f120209g.setClickable(true);
        return jz5.f0.f302826a;
    }
}
