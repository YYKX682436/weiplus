package uf5;

/* loaded from: classes4.dex */
public class i0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.privacy.ContactMgrUIBase f427246d;

    public i0(com.tencent.mm.ui.contact.privacy.ContactMgrUIBase contactMgrUIBase) {
        this.f427246d = contactMgrUIBase;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.ui.contact.privacy.ContactMgrUIBase contactMgrUIBase = this.f427246d;
        g4Var.g(0, contactMgrUIBase.getString(com.tencent.mm.R.string.f489876e7), com.tencent.mm.R.drawable.f481342c14);
        g4Var.g(1, contactMgrUIBase.getString(com.tencent.mm.R.string.hl_), com.tencent.mm.R.drawable.f481342c14);
        g4Var.g(2, contactMgrUIBase.getString(com.tencent.mm.R.string.f489875e6), com.tencent.mm.R.drawable.f481342c14);
    }
}
