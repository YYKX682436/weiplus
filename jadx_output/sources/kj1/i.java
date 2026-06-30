package kj1;

/* loaded from: classes5.dex */
public final class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj1.m f308336d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f308337e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f308338f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f308339g;

    public i(kj1.m mVar, android.app.Activity activity, java.lang.String str, yz5.l lVar) {
        this.f308336d = mVar;
        this.f308337e = activity;
        this.f308338f = str;
        this.f308339g = lVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        this.f308336d.e(this.f308337e, this.f308338f);
        yz5.l lVar = this.f308339g;
        if (lVar != null) {
            lVar.invoke(kj1.g0.f308329g);
        }
    }
}
