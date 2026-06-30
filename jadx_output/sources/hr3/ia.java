package hr3;

/* loaded from: classes11.dex */
public class ia implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f283652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283653e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hr3.va f283654f;

    public ia(hr3.va vaVar, android.app.ProgressDialog progressDialog, java.lang.String str) {
        this.f283654f = vaVar;
        this.f283652d = progressDialog;
        this.f283653e = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        hr3.va vaVar = this.f283654f;
        g0Var.d(14553, 2, 3, vaVar.f284109e.L.d1());
        this.f283652d.show();
        vaVar.f284108d = false;
        vaVar.d(this.f283653e);
    }
}
