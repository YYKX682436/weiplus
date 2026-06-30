package kt4;

/* loaded from: classes9.dex */
public class m implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kt4.n f312042d;

    public m(kt4.n nVar) {
        this.f312042d = nVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenECardProcess", "dismiss alert");
        this.f312042d.f312043c = null;
    }
}
