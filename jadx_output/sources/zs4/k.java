package zs4;

/* loaded from: classes9.dex */
public class k implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f475296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f475297e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f475298f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f475299g;

    public k(boolean z17, android.app.Activity activity, int i17, int i18) {
        this.f475296d = z17;
        this.f475297e = activity;
        this.f475298f = i17;
        this.f475299g = i18;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        if (this.f475296d) {
            this.f475297e.finish();
        }
        dialogInterface.dismiss();
        int i18 = this.f475298f;
        com.tencent.mm.wallet_core.ui.r1.r0(i18 == 1 ? 8 : i18 == 2 ? 11 : 0, 1, com.tencent.mm.sdk.platformtools.t8.i1(), this.f475299g);
    }
}
