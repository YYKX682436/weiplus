package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class m2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wp2.b f121805d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f121806e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(wp2.b bVar, android.widget.TextView textView) {
        super(0);
        this.f121805d = bVar;
        this.f121806e = textView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bindLive: load image span complete, snn=");
        wp2.b bVar = this.f121805d;
        sb6.append(bVar.getFeedObject().getNickName());
        sb6.append(", source=");
        sb6.append(bVar.getFeedObject().getFeedObject().getRecommendReason());
        sb6.append(", feedId=");
        sb6.append(pm0.v.u(bVar.getFeedObject().getId()));
        com.tencent.mars.xlog.Log.i("Finder.LivingConvert", sb6.toString());
        this.f121806e.invalidate();
        return jz5.f0.f302826a;
    }
}
