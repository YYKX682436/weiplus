package si0;

/* loaded from: classes4.dex */
public final class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.SnsUserUINotifyEvent f408124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ si0.m1 f408125e;

    public l1(com.tencent.mm.autogen.events.SnsUserUINotifyEvent snsUserUINotifyEvent, si0.m1 m1Var) {
        this.f408124d = snsUserUINotifyEvent;
        this.f408125e = m1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        am.hx hxVar = this.f408124d.f54851g;
        if (hxVar.f6876a != 3) {
            return;
        }
        java.lang.String snsId = hxVar.f6877b;
        kotlin.jvm.internal.o.f(snsId, "snsId");
        this.f408125e.getClass();
        com.tencent.wechat.aff.sns.h.f217503b.a(com.tencent.mm.plugin.sns.storage.w2.n(snsId), si0.i1.f408088a);
    }
}
