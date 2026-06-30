package z83;

/* loaded from: classes5.dex */
public final class u implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x83.h f470754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegMobileVerifyUI f470755e;

    public u(x83.h hVar, com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegMobileVerifyUI kidsWatchRegMobileVerifyUI) {
        this.f470754d = hVar;
        this.f470755e = kidsWatchRegMobileVerifyUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f470754d);
        gm0.j1.d().q(5888, this.f470755e);
    }
}
