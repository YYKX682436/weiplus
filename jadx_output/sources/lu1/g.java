package lu1;

/* loaded from: classes15.dex */
public class g implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lu1.q f321343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f321344e;

    public g(lu1.q qVar, java.lang.String str) {
        this.f321343d = qVar;
        this.f321344e = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        this.f321343d.b(this.f321344e);
    }
}
