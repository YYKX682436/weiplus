package df2;

/* loaded from: classes3.dex */
public final class hi implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.wi f230331d;

    public hi(df2.wi wiVar) {
        this.f230331d = wiVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i(this.f230331d.f231690m, "dialog cancel");
        dialogInterface.dismiss();
    }
}
