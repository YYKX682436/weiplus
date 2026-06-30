package p61;

/* loaded from: classes14.dex */
public class o5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.VerifyQQUI f352340d;

    public o5(com.tencent.mm.plugin.account.bind.ui.VerifyQQUI verifyQQUI) {
        this.f352340d = verifyQQUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.account.bind.ui.VerifyQQUI verifyQQUI = this.f352340d;
        n61.b bVar = new n61.b(verifyQQUI.f73099f, verifyQQUI.f73100g, verifyQQUI.f73103m.getSecImgSid(), verifyQQUI.f73103m.getSecImgCode(), verifyQQUI.f73103m.getSecImgEncryptKey(), 1, verifyQQUI.f73104n, verifyQQUI.f73105o, true);
        gm0.j1.d().g(bVar);
        verifyQQUI.f73098e = db5.e1.Q(verifyQQUI.getContext(), verifyQQUI.getString(com.tencent.mm.R.string.aig), verifyQQUI.getString(com.tencent.mm.R.string.ai8), true, true, new p61.n5(this, bVar));
    }
}
