package t61;

/* loaded from: classes9.dex */
public class a implements ns.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t61.c f415983d;

    public a(t61.c cVar) {
        this.f415983d = cVar;
    }

    @Override // ns.e
    public void a(boolean z17, boolean z18, java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecoverFriendSortView", "canAddContact %s,%s", str, java.lang.Boolean.valueOf(z17));
        t61.c cVar = this.f415983d;
        if (!z17) {
            if (z18) {
                r61.z1.c(cVar.f415985d.f415994g.f393000a.field_encryptUsername, 1);
                fb5.m mVar = cVar.f415986e.f415987a.f197866g;
                mVar.c(mVar.f260894d);
                return;
            }
            return;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(cVar.f415985d.f415994g.f393000a.field_encryptUsername, true);
        int i17 = (int) n17.E2;
        t61.e eVar = cVar.f415985d;
        if (i17 == 0) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                n17.X1(eVar.f415994g.f393000a.field_encryptUsername);
            } else {
                n17.X1(str);
            }
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h0(n17);
            n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(n17.d1(), true);
        }
        if (((int) n17.E2) <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RecoverFriendSortView", "addContact : insert contact failed");
            return;
        }
        c01.e2.m0(n17);
        t61.d dVar = cVar.f415986e;
        db5.e1.T(dVar.f415987a.getContext(), dVar.f415987a.getContext().getString(com.tencent.mm.R.string.f490006i8));
        r61.z1.c(eVar.f415994g.f393000a.field_encryptUsername, 0);
        fb5.m mVar2 = dVar.f415987a.f197866g;
        mVar2.c(mVar2.f260894d);
    }
}
