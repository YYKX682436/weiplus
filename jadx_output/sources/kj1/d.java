package kj1;

/* loaded from: classes5.dex */
public final class d implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj1.m f308299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f308300e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f308301f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f308302g;

    public d(kj1.m mVar, android.app.Activity activity, java.lang.String str, yz5.l lVar) {
        this.f308299d = mVar;
        this.f308300e = activity;
        this.f308301f = str;
        this.f308302g = lVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        this.f308299d.e(this.f308300e, this.f308301f);
        yz5.l lVar = this.f308302g;
        if (lVar != null) {
            lVar.invoke(kj1.g0.f308329g);
        }
    }
}
