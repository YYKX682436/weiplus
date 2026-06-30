package g61;

/* loaded from: classes15.dex */
public class e implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.CloseAAUrgeNotifyEvent f269049a;

    public e(g61.f fVar, com.tencent.mm.autogen.events.CloseAAUrgeNotifyEvent closeAAUrgeNotifyEvent) {
        this.f269049a = closeAAUrgeNotifyEvent;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("CloseAAUrgeNotifyEventIListener", "close aa urge notify cgiback, errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        if (fVar.f70615a != 0 || fVar.f70616b != 0) {
            com.tencent.mars.xlog.Log.i("CloseAAUrgeNotifyEventIListener", "close aa urge notify failed");
            dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.b99, 1).show();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, 28L, 1L, false);
            return null;
        }
        com.tencent.mars.xlog.Log.i("CloseAAUrgeNotifyEventIListener", "close aa urge notify success");
        r45.e eVar = (r45.e) fVar.f70618d;
        if (eVar.f372876d > 0 && !com.tencent.mm.sdk.platformtools.t8.K0(eVar.f372877e)) {
            dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, ((r45.e) fVar.f70618d).f372877e, 0).show();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, 29L, 1L, false);
            return null;
        }
        if (((r45.e) fVar.f70618d).f372876d != 0) {
            com.tencent.mars.xlog.Log.i("CloseAAUrgeNotifyEventIListener", "illegal resp");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, 29L, 1L, false);
            return null;
        }
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.b9_, 0).show();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, 27L, 1L, false);
        if (com.tencent.mm.sdk.platformtools.t8.K0(((r45.e) fVar.f70618d).f372878f)) {
            return null;
        }
        am.c3 c3Var = this.f269049a.f54064g;
        h61.o.t(c3Var.f6308b, c3Var.f6309c, ((r45.e) fVar.f70618d).f372878f);
        return null;
    }
}
