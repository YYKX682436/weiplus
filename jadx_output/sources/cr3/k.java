package cr3;

/* loaded from: classes11.dex */
public class k implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f221954e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cr3.d0 f221955f;

    public k(cr3.d0 d0Var, java.lang.String str, boolean z17) {
        this.f221955f = d0Var;
        this.f221953d = str;
        this.f221954e = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        cr3.d0 d0Var = this.f221955f;
        g0Var.d(14553, 2, 3, d0Var.f221932e.d1());
        d0Var.f221937m.show();
        d0Var.f221936i = false;
        d0Var.f(this.f221953d, this.f221954e);
    }
}
