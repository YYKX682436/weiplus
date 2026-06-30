package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class r1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f124167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f124168e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f124169f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(android.content.Intent intent, long j17, android.view.View view) {
        super(0);
        this.f124167d = intent;
        this.f124168e = j17;
        this.f124169f = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Intent intent = this.f124167d;
        intent.putExtra("CURRENT_FEED_ID", this.f124168e);
        intent.putExtra("LAUNCH_WITH_ANIM", true);
        i95.m c17 = i95.n0.c(c61.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        android.content.Context context = this.f124169f.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        c61.zb.U7((c61.zb) c17, context, this.f124167d, false, 4, null);
        return jz5.f0.f302826a;
    }
}
