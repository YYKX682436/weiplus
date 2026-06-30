package hr3;

/* loaded from: classes8.dex */
public final class g2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr3.c f283570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI f283571e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f283572f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(pr3.c cVar, com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI, com.tencent.mm.storage.z3 z3Var) {
        super(1);
        this.f283570d = cVar;
        this.f283571e = contactMoreInfoUI;
        this.f283572f = z3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList;
        java.util.ArrayList galleryImagePathList = (java.util.ArrayList) obj;
        kotlin.jvm.internal.o.g(galleryImagePathList, "galleryImagePathList");
        pr3.c cVar = this.f283570d;
        cVar.getClass();
        cVar.f357964r = galleryImagePathList;
        com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI = this.f283571e;
        cVar.f357965s = new hr3.f2(contactMoreInfoUI, this.f283572f);
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactMoreInfoUI", "submit desc image update:\n" + cVar);
        xm3.t0 t0Var = contactMoreInfoUI.f153683o;
        if (t0Var != null && (mvvmList = t0Var.I) != null) {
            com.tencent.mm.plugin.mvvmlist.MvvmList.A(mvvmList, cVar, false, 2, null);
        }
        return jz5.f0.f302826a;
    }
}
