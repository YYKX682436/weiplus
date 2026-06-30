package p61;

/* loaded from: classes14.dex */
public class z implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p61.b0 f352414d;

    public z(p61.b0 b0Var) {
        this.f352414d = b0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        n61.d dVar = new n61.d(1);
        com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI bindLinkedInUI = this.f352414d.f352216d;
        bindLinkedInUI.D = db5.e1.Q(bindLinkedInUI, null, bindLinkedInUI.getString(com.tencent.mm.R.string.ggc), true, false, new p61.y(this, dVar));
        gm0.j1.d().g(dVar);
    }
}
