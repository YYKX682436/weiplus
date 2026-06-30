package t63;

@j95.b
/* loaded from: classes5.dex */
public class e extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public x63.j f416005d = null;

    /* renamed from: e, reason: collision with root package name */
    public y63.c f416006e = null;

    /* renamed from: f, reason: collision with root package name */
    public x63.p f416007f = null;

    public x63.p Ai() {
        gm0.j1.b().c();
        if (this.f416007f == null) {
            this.f416007f = new x63.p();
        }
        return this.f416007f;
    }

    public y63.c Bi() {
        gm0.j1.b().c();
        if (this.f416006e == null) {
            gm0.j1.i();
            this.f416006e = new y63.c(gm0.j1.u().f273153f);
        }
        return this.f416006e;
    }

    public void Di(java.lang.String str, java.lang.String str2, y63.a aVar, y63.a aVar2, y63.a aVar3, boolean z17) {
        java.lang.Object obj;
        if (aVar2 == null) {
            return;
        }
        ot0.q qVar = new ot0.q();
        qVar.f348654f = str;
        qVar.f348666i = 53;
        qVar.f348721v2 = new android.util.Pair(aVar2.field_key, x63.g.a(str, aVar2, false));
        if (((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).rj(qVar.f348666i, str2)) {
            l15.c cVar = new l15.c();
            cVar.fromXml(ot0.q.u(qVar, null, null));
            qu.c cVar2 = new qu.c(str2, cVar, null);
            cVar2.f366715q = aVar2;
            cVar2.f366716r = z17;
            cVar2.f366717s = 1;
            ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).getClass();
            ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).uj(new qu.b(cVar2));
            return;
        }
        ((ez.w0) ot0.j1.a()).getClass();
        android.util.Pair I = com.tencent.mm.pluginsdk.model.app.k0.I(qVar, "", "", str2, "", null);
        if (z17 && I.first != null && I.second != null) {
            ((t63.e) i95.n0.c(t63.e.class)).Ai().a(((java.lang.Long) I.second).longValue(), aVar2, aVar3, true, 1);
        } else if (!z17) {
            ((t63.e) i95.n0.c(t63.e.class)).Ai().i(aVar2, aVar3, 1);
        }
        if (I.first != null && (obj = I.second) != null) {
            x63.g.L(((java.lang.Long) obj).longValue(), c01.z1.r(), aVar, str2);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.groupsolitaire.PluginGroupSolitaire", "sendGroupSolitatire() content ret:%s", I);
    }

    public x63.j wi() {
        gm0.j1.b().c();
        if (this.f416005d == null) {
            this.f416005d = new x63.j();
        }
        return this.f416005d;
    }
}
