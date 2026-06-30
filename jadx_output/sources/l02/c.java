package l02;

/* loaded from: classes8.dex */
public class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f314801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f314802e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314803f;

    public c(l02.k kVar, android.content.DialogInterface.OnClickListener onClickListener, com.tencent.mm.pointers.PBool pBool, java.lang.String str) {
        this.f314801d = onClickListener;
        this.f314802e = pBool;
        this.f314803f = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.DialogInterface.OnClickListener onClickListener = this.f314801d;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i17);
        }
        this.f314802e.value = true;
        o02.a.b(15, com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.t.CTRL_INDEX, 1, 3, this.f314803f, "", "");
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            return;
        }
        l02.b bVar = new l02.b(this);
        tb0.i iVar = (tb0.i) i95.n0.c(tb0.i.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String string = context.getString(com.tencent.mm.R.string.fax);
        java.lang.String a17 = n25.a.a();
        ((sb0.f) iVar).getClass();
        com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog.S6(context, string, bVar, true, a17);
    }
}
