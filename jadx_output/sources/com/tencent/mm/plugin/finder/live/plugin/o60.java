package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class o60 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f113709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.r60 f113710e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o60(android.os.Bundle bundle, com.tencent.mm.plugin.finder.live.plugin.r60 r60Var) {
        super(0);
        this.f113709d = bundle;
        this.f113710e = r60Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.os.Bundle bundle = this.f113709d;
        this.f113710e.z1(bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_PROMOTE_DELETE_BY_ANCHOR") : false, true, bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_PROMOTE_DELETE_BY_VISITOR_CLICK_CLOSE") : false);
        return jz5.f0.f302826a;
    }
}
