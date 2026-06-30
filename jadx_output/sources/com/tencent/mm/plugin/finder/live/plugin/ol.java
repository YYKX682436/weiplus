package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ol extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f113764d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol(com.tencent.mm.plugin.finder.live.plugin.hm hmVar) {
        super(0);
        this.f113764d = hmVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        vg2.m mVar = this.f113764d.N1;
        if (mVar != null) {
            ce2.i value = (ce2.i) dk2.u7.f234185e.get(mVar.I.field_rewardProductId);
            r45.mb v07 = value != null ? value.v0() : null;
            if (!(v07 == null)) {
                kotlin.jvm.internal.o.g(value, "value");
                mVar.I = value;
                mVar.g0(value);
                if (v07.getInteger(0) == 2) {
                    android.content.Context context = mVar.f118183e;
                    db5.t7.g(context, context.getResources().getString(com.tencent.mm.R.string.oq8));
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
