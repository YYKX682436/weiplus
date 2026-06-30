package df2;

/* loaded from: classes3.dex */
public final class tx implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.cy f231481d;

    public tx(df2.cy cyVar) {
        this.f231481d = cyVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        df2.cy cyVar = this.f231481d;
        com.tencent.mars.xlog.Log.i(cyVar.f229915m, "showAlertDialog dismiss");
        df2.k kVar = (df2.k) cyVar.controller(df2.k.class);
        if (kVar != null) {
            com.tencent.mars.xlog.Log.i(kVar.f230522m, "notifyWarningDismiss ".concat("showAlertDialog dismiss"));
            kVar.a7("liveWarningEnd", "");
        }
    }
}
