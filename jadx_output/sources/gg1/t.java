package gg1;

/* loaded from: classes7.dex */
public final class t implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.w f271628d;

    public t(gg1.w wVar) {
        this.f271628d = wVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        gg1.w wVar = this.f271628d;
        yz5.p pVar = wVar.f271649v;
        if (pVar != null) {
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime a17 = wVar.f271634d.a();
        if (a17 != null) {
            a17.B1(wVar.f271652y);
        }
    }
}
