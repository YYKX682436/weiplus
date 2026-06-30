package hr3;

/* loaded from: classes11.dex */
public class lb implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.nb f283757d;

    public lb(hr3.nb nbVar) {
        this.f283757d = nbVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        hr3.nb nbVar = this.f283757d;
        nbVar.o();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Intro_Switch", true).addFlags(67108864);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.u(intent, nbVar.f283832g.f197770d);
    }
}
