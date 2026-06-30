package ne0;

@j95.b
/* loaded from: classes3.dex */
public final class r extends i95.w implements oe0.x, oe0.t {
    public void Ai(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicLiveCardOuterService", "register appId:".concat(appId));
        xg4.m mVar = xg4.m.f454446a;
        synchronized (mVar) {
            if (!mVar.c()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SurfaceApp.MagicLiveCardMgr", "register not open!");
                return;
            }
            ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) xg4.m.f454448c).getValue()).removeCallbacks(new xg4.l(xg4.m.f454450e));
            if (xg4.m.f454447b != null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SurfaceApp.MagicLiveCardMgr", "has registered");
                xg4.p pVar = xg4.m.f454447b;
                if (pVar != null) {
                    pVar.N1();
                }
                return;
            }
            xg4.p pVar2 = new xg4.p();
            pVar2.X0();
            xg4.k kVar = new xg4.k();
            com.tencent.mars.xlog.Log.i("MicroMsg.SurfaceApp.MagicLiveCardService", "register AppId:".concat(appId));
            pVar2.D = kVar;
            pVar2.N1();
            xg4.m.f454447b = pVar2;
            com.tencent.mars.xlog.Log.i("MicroMsg.SurfaceApp.MagicLiveCardMgr", "register AppId:".concat(appId));
        }
    }

    public void Bi(java.lang.String id6) {
        kotlin.jvm.internal.o.g(id6, "id");
        xg4.m mVar = xg4.m.f454446a;
        xg4.p pVar = xg4.m.f454447b;
        if (pVar != null) {
            pVar.F1(id6);
        }
    }

    public void Di(oe0.w wVar) {
        if (!xg4.m.f454446a.c()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SurfaceApp.MagicLiveCardMgr", "setFinderLiveCallback not open!");
            return;
        }
        xg4.p pVar = xg4.m.f454447b;
        if (pVar != null) {
            java.util.Objects.toString(wVar);
            oe0.w wVar2 = pVar.B;
            if (wVar2 != null) {
                wVar2.hashCode();
            }
            if (wVar != null) {
                wVar.hashCode();
            }
            pVar.B = wVar;
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        xg4.m.f454446a.b();
    }

    public hq0.e0 wi(java.lang.Object target, android.content.Context context, oe0.u extData) {
        kotlin.jvm.internal.o.g(target, "target");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(extData, "extData");
        xg4.m mVar = xg4.m.f454446a;
        java.lang.String a17 = extData.a();
        xg4.p pVar = xg4.m.f454447b;
        if (pVar != null) {
            return hq0.i0.K0(pVar, target, context, "wxe208ce76dfa39515", "frames", a17, false, 32, null);
        }
        return null;
    }
}
