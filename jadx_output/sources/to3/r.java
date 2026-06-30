package to3;

/* loaded from: classes9.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ to3.u f420977d;

    public r(to3.u uVar) {
        this.f420977d = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        to3.u uVar = this.f420977d;
        to3.v vVar = uVar.f420983c;
        vVar.o(uVar.f338833a, 0, vVar.f213801c);
        ((com.tencent.mm.wallet_core.ui.WalletBaseUI) uVar.f338833a).hideLoading();
    }
}
