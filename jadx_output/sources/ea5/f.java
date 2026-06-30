package ea5;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f250686d = 0;

    public f(ea5.g gVar, ea5.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f250686d < 55;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f250686d;
        this.f250686d = i17 + 1;
        switch (i17) {
            case 0:
                return u14.a0.INSTANCE;
            case 1:
                return e04.y2.INSTANCE;
            case 2:
                return rh2.l.INSTANCE;
            case 3:
                return g10.z.INSTANCE;
            case 4:
                return qu3.h.INSTANCE;
            case 5:
                return uv4.q.INSTANCE;
            case 6:
                return com.tencent.paymars.smc.UDRKVCommReportFeatureServiceProvider.INSTANCE;
            case 7:
                return nw.l.INSTANCE;
            case 8:
                return ck.f.INSTANCE;
            case 9:
                return com.tencent.mm.plugin.appbrand.networking.l0.INSTANCE;
            case 10:
                return gc0.h3.INSTANCE;
            case 11:
                return com.tencent.mm.plugin.voip.model.v1.INSTANCE;
            case 12:
                return com.tencent.mm.wexnet.t.INSTANCE;
            case 13:
                return x32.i.INSTANCE;
            case 14:
                return z02.f.INSTANCE;
            case 15:
                return su2.j.INSTANCE;
            case 16:
                return sk4.v.INSTANCE;
            case 17:
                return pg4.h.INSTANCE;
            case 18:
                return kx.s.INSTANCE;
            case 19:
                return uj1.f.INSTANCE;
            case 20:
                return vl2.j.INSTANCE;
            case 21:
                return xg4.s.INSTANCE;
            case 22:
                return a30.f.INSTANCE;
            case 23:
                return com.tencent.mm.minigame.v0.INSTANCE;
            case 24:
                return y81.f.INSTANCE;
            case 25:
                return kx.q.INSTANCE;
            case 26:
                return rq1.y.INSTANCE;
            case 27:
                return com.tencent.mm.udr.h1.INSTANCE;
            case 28:
                return ga5.f.INSTANCE;
            case 29:
                return com.tencent.mars.smc.UDRKVCommReportFeatureServiceProvider.INSTANCE;
            case 30:
                return ih1.x.INSTANCE;
            case 31:
                return kq0.g.INSTANCE;
            case 32:
                return my.b.INSTANCE;
            case 33:
                return u12.w.INSTANCE;
            case 34:
                return c10.f.INSTANCE;
            case 35:
                return b41.g.INSTANCE;
            case 36:
                return f05.f.INSTANCE;
            case 37:
                return com.tencent.mm.plugin.lite.logic.f1.INSTANCE;
            case 38:
                return com.tencent.mm.plugin.magicbrush.x7.INSTANCE;
            case 39:
                return fa1.f0.INSTANCE;
            case 40:
                return uj.s.INSTANCE;
            case 41:
                return p05.v3.INSTANCE;
            case 42:
                return ul2.f.INSTANCE;
            case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
                return ja5.f.INSTANCE;
            case 44:
                return com.tencent.luggage.sdk.jsapi.component.service.x1.INSTANCE;
            case 45:
                return ek.g.INSTANCE;
            case 46:
                return k91.k3.INSTANCE;
            case 47:
                return nw.n.INSTANCE;
            case 48:
                return il0.f.INSTANCE;
            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
                return com.tencent.luggage.sdk.jsapi.component.service.c2.INSTANCE;
            case 50:
                return it2.b0.INSTANCE;
            case 51:
                return com.tencent.mm.plugin.lite.logic.a3.INSTANCE;
            case 52:
                return e10.s.INSTANCE;
            case 53:
                return fm.i0.INSTANCE;
            case 54:
                return kx.u.INSTANCE;
            default:
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 55");
        }
    }
}
