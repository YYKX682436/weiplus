package hr3;

/* loaded from: classes8.dex */
public final class e4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr3.c f283508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact f283509e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.contact.o f283510f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(pr3.c cVar, com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact contactMoreInfoUIWxContact, com.tencent.mm.contact.o oVar) {
        super(1);
        this.f283508d = cVar;
        this.f283509e = contactMoreInfoUIWxContact;
        this.f283510f = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList;
        java.util.ArrayList galleryImagePathList = (java.util.ArrayList) obj;
        kotlin.jvm.internal.o.g(galleryImagePathList, "galleryImagePathList");
        pr3.c cVar = this.f283508d;
        cVar.getClass();
        cVar.f357964r = galleryImagePathList;
        com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact contactMoreInfoUIWxContact = this.f283509e;
        cVar.f357965s = new hr3.d4(contactMoreInfoUIWxContact, this.f283510f);
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactMoreInfoUI", "submit desc image update:\n" + cVar);
        xm3.t0 t0Var = contactMoreInfoUIWxContact.f153702n;
        if (t0Var != null && (mvvmList = t0Var.I) != null) {
            com.tencent.mm.plugin.mvvmlist.MvvmList.A(mvvmList, cVar, false, 2, null);
        }
        return jz5.f0.f302826a;
    }
}
