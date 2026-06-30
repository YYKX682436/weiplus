package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class q1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f124137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f124138e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f124139f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(android.content.Intent intent, long j17, android.view.View view) {
        super(2);
        this.f124137d = intent;
        this.f124138e = j17;
        this.f124139f = view;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.content.Intent intent = (android.content.Intent) obj2;
        kotlin.jvm.internal.o.g(intent, "intent");
        android.content.Intent intent2 = this.f124137d;
        intent2.putExtra("CURRENT_FEED_ID", this.f124138e);
        intent2.putExtra("LAUNCH_WITH_ANIM", booleanValue);
        i95.m c17 = i95.n0.c(c61.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        android.content.Context context = this.f124139f.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        c61.zb.U7((c61.zb) c17, context, this.f124137d, false, 4, null);
        return jz5.f0.f302826a;
    }
}
