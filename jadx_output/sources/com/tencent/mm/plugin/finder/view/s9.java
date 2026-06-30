package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class s9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView f133028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.m70 f133029e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f133030f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9(com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView finderFeedLiveNoticeView, r45.m70 m70Var, java.lang.String str) {
        super(0);
        this.f133028d = finderFeedLiveNoticeView;
        this.f133029e = m70Var;
        this.f133030f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        i95.m c17 = i95.n0.c(s40.w0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        android.content.Context context = this.f133028d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        s40.w0.z5((s40.w0) c17, context, this.f133029e, null, this.f133030f, "1", 4, null);
        return jz5.f0.f302826a;
    }
}
