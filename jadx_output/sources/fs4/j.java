package fs4;

/* loaded from: classes9.dex */
public class j implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fs4.k f266343d;

    public j(fs4.k kVar) {
        this.f266343d = kVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        fs4.k kVar = this.f266343d;
        kVar.f266344c.f213801c.putInt("RESET_PWD_USER_ACTION", 2);
        fs4.m mVar = kVar.f266344c;
        mVar.o(kVar.f338833a, 0, mVar.f213801c);
    }
}
