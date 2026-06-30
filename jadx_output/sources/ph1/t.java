package ph1;

/* loaded from: classes7.dex */
public class t implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph1.v f354349d;

    public t(ph1.v vVar) {
        this.f354349d = vVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        ph1.v vVar = this.f354349d;
        ph1.g0.h(vVar.f354355h, ((com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo) vVar.f354352e.f291824a).name, ph1.g.CANCEL);
    }
}
