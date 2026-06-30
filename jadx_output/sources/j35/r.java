package j35;

/* loaded from: classes3.dex */
public class r implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f297519d;

    public r(android.content.Context context) {
        this.f297519d = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        j35.u.g(this.f297519d);
    }
}
