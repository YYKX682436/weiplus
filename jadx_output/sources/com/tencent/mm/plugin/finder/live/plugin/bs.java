package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class bs extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f112068d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f112069e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f112070f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs(long j17, java.lang.String str, com.tencent.mm.plugin.finder.live.plugin.et etVar) {
        super(0);
        this.f112068d = j17;
        this.f112069e = str;
        this.f112070f = etVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("PARAM_FINDER_LIVE_SEND_MSG_SESSION_ID", this.f112068d);
        bundle.putString("PARAM_FINDER_LIVE_NOTIFY_SEND_MSG_CONTENT", this.f112069e);
        this.f112070f.f112448p.statusChange(qo0.b.A4, bundle);
        return jz5.f0.f302826a;
    }
}
