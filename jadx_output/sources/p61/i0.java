package p61;

/* loaded from: classes5.dex */
public class i0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r61.e1 f352287d;

    public i0(com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI bindMContactIntroUI, r61.e1 e1Var) {
        this.f352287d = e1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f352287d);
    }
}
