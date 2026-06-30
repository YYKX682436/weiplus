package hr3;

/* loaded from: classes8.dex */
public final class a2 implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr3.c f283371d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI f283372e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f283373f;

    public a2(pr3.c cVar, com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI, com.tencent.mm.storage.z3 z3Var) {
        this.f283371d = cVar;
        this.f283372e = contactMoreInfoUI;
        this.f283373f = z3Var;
    }

    @Override // o13.x
    public final void X2(p13.v vVar) {
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList;
        int i17 = vVar.f351158c;
        com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI = this.f283372e;
        pr3.c cVar = this.f283371d;
        if (i17 == 0) {
            java.lang.Object obj = ((p13.y) vVar.f351160e.get(0)).f351197o;
            java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
            int intValue = num != null ? num.intValue() : 0;
            cVar.f357956g = contactMoreInfoUI.getString(com.tencent.mm.R.string.f490957bd1, java.lang.Integer.valueOf(intValue));
            hr3.z1 z1Var = new hr3.z1(intValue, contactMoreInfoUI, this.f283373f);
            cVar.getClass();
            cVar.f357966t = z1Var;
        } else {
            cVar.f357956g = contactMoreInfoUI.getString(com.tencent.mm.R.string.f490957bd1, 0);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactMoreInfoUI", "update common chatroom: " + cVar);
        xm3.t0 t0Var = contactMoreInfoUI.f153683o;
        if (t0Var == null || (mvvmList = t0Var.I) == null) {
            return;
        }
        com.tencent.mm.plugin.mvvmlist.MvvmList.r(mvvmList, null, 1, null);
    }
}
