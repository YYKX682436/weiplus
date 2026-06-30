package os3;

/* loaded from: classes8.dex */
public class x implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ os3.y f348245d;

    public x(os3.y yVar) {
        this.f348245d = yVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        os3.y yVar = this.f348245d;
        yVar.f348252d.setResult(0);
        yVar.f348252d.finish();
    }
}
