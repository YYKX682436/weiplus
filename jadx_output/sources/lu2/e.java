package lu2;

/* loaded from: classes.dex */
public final class e implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f321368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f321369e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f321370f;

    public e(java.lang.String str, java.lang.String str2, android.content.Context context) {
        this.f321368d = str;
        this.f321369e = str2;
        this.f321370f = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DebugDialog", "onClick1");
        com.tencent.mm.sdk.platformtools.b0.e(this.f321368d + '\n' + this.f321369e);
        dp.a.makeText(this.f321370f, "copy done", 0).show();
    }
}
