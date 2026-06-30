package fh4;

/* loaded from: classes11.dex */
public class r implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fh4.s f262705d;

    public r(fh4.s sVar) {
        this.f262705d = sVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        fh4.s sVar = this.f262705d;
        sVar.f262706d.f172467r = false;
        dh4.l.Di().i();
        sVar.f262706d.finish();
    }
}
