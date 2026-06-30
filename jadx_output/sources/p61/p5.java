package p61;

/* loaded from: classes14.dex */
public class p5 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.VerifyQQUI f352349d;

    public p5(com.tencent.mm.plugin.account.bind.ui.VerifyQQUI verifyQQUI) {
        this.f352349d = verifyQQUI;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f352349d.f73103m = null;
    }
}
