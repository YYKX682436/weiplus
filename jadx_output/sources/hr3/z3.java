package hr3;

/* loaded from: classes8.dex */
public final class z3 implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr3.c f284228d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact f284229e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.contact.o f284230f;

    public z3(pr3.c cVar, com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact contactMoreInfoUIWxContact, com.tencent.mm.contact.o oVar) {
        this.f284228d = cVar;
        this.f284229e = contactMoreInfoUIWxContact;
        this.f284230f = oVar;
    }

    @Override // o13.x
    public final void X2(p13.v vVar) {
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList;
        int i17 = vVar.f351158c;
        com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact contactMoreInfoUIWxContact = this.f284229e;
        pr3.c cVar = this.f284228d;
        if (i17 == 0) {
            java.lang.Object obj = ((p13.y) vVar.f351160e.get(0)).f351197o;
            java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
            int intValue = num != null ? num.intValue() : 0;
            cVar.f357956g = contactMoreInfoUIWxContact.getString(com.tencent.mm.R.string.f490957bd1, java.lang.Integer.valueOf(intValue));
            hr3.y3 y3Var = new hr3.y3(intValue, contactMoreInfoUIWxContact, this.f284230f);
            cVar.getClass();
            cVar.f357966t = y3Var;
        } else {
            cVar.f357956g = contactMoreInfoUIWxContact.getString(com.tencent.mm.R.string.f490957bd1, 0);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactMoreInfoUI", "update common chatroom: " + cVar);
        xm3.t0 t0Var = contactMoreInfoUIWxContact.f153702n;
        if (t0Var == null || (mvvmList = t0Var.I) == null) {
            return;
        }
        com.tencent.mm.plugin.mvvmlist.MvvmList.r(mvvmList, null, 1, null);
    }
}
