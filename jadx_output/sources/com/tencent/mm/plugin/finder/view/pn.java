package com.tencent.mm.plugin.finder.view;

/* loaded from: classes.dex */
public final class pn implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f132853a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f132854b;

    public pn(long j17, java.lang.String str) {
        this.f132853a = j17;
        this.f132854b = str;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        return kz5.c1.k(new jz5.l("feed_id", pm0.v.u(this.f132853a)), new jz5.l("thx_to_uin", this.f132854b));
    }
}
