package kf4;

/* loaded from: classes4.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.SnsPermissionNotifyEvent f307478d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.autogen.events.SnsPermissionNotifyEvent snsPermissionNotifyEvent) {
        super(0);
        this.f307478d = snsPermissionNotifyEvent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.autogen.events.SnsPermissionNotifyEvent snsPermissionNotifyEvent = this.f307478d;
        if ((snsPermissionNotifyEvent != null ? snsPermissionNotifyEvent.f54827g : null) != null) {
            am.jw jwVar = snsPermissionNotifyEvent.f54827g;
            if (jwVar.f7102a && !android.text.TextUtils.isEmpty(jwVar.f7103b)) {
                kf4.o oVar = kf4.o.f307484d;
                am.jw jwVar2 = snsPermissionNotifyEvent.f54827g;
                if (!oVar.c(jwVar2.f7103b)) {
                    if (jwVar2.f7104c) {
                        nf4.g g17 = ef4.w.f252468t.g();
                        java.lang.String username = jwVar2.f7103b;
                        kotlin.jvm.internal.o.f(username, "username");
                        nf4.f y07 = g17.y0(username);
                        java.util.Map map = kf4.o.f307485e;
                        kotlin.jvm.internal.o.f(map, "access$getUserStateMap$p(...)");
                        map.put(jwVar2.f7103b, y07);
                    } else {
                        kf4.o.f307485e.remove(jwVar2.f7103b);
                    }
                    kf4.o.a(oVar);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
