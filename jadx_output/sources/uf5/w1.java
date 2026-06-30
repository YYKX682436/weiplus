package uf5;

/* loaded from: classes10.dex */
public class w1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.e3 f427319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.privacy.SnsTagDetailUI f427320e;

    public w1(com.tencent.mm.ui.contact.privacy.SnsTagDetailUI snsTagDetailUI, com.tencent.mm.plugin.sns.model.e3 e3Var) {
        this.f427320e = snsTagDetailUI;
        this.f427319d = e3Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.i();
        gm0.j1.n().f273288b.d(this.f427319d);
        int i17 = com.tencent.mm.ui.contact.privacy.SnsTagDetailUI.K;
        com.tencent.mm.ui.contact.privacy.SnsTagDetailUI snsTagDetailUI = this.f427320e;
        snsTagDetailUI.n7();
        snsTagDetailUI.c7();
    }
}
