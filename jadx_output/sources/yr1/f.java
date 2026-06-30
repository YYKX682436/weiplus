package yr1;

/* loaded from: classes14.dex */
public final class f implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.profile.BizContactInfoDialogFragment f464640d;

    public f(com.tencent.mm.plugin.brandservice.ui.profile.BizContactInfoDialogFragment bizContactInfoDialogFragment) {
        this.f464640d = bizContactInfoDialogFragment;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        al5.f3 f3Var = (com.tencent.mm.ui.vas.VASActivity) obj;
        if (f3Var instanceof lk5.a) {
            yr1.e eVar = new yr1.e(this.f464640d);
            com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = (com.tencent.mm.plugin.profile.ui.ContactInfoUI) ((lk5.a) f3Var);
            contactInfoUI.getClass();
            java.util.Objects.toString(eVar);
            contactInfoUI.T = eVar;
        }
        return jz5.f0.f302826a;
    }
}
