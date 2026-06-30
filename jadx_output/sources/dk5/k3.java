package dk5;

/* loaded from: classes9.dex */
public class k3 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f234706e;

    public k3(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI, java.lang.String str, android.view.View view) {
        this.f234705d = str;
        this.f234706e = view;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        k01.u0 u0Var = (k01.u0) i95.n0.c(k01.u0.class);
        ((ij1.j) u0Var).Ui(this.f234705d, this.f234706e);
    }
}
