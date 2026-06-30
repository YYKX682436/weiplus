package o00;

/* loaded from: classes9.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o00.w f341884d;

    public u(o00.w wVar) {
        this.f341884d = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context;
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        o00.w wVar = this.f341884d;
        o00.t tVar = wVar.f341887b;
        if (tVar != null && (u3Var = ((o00.s) tVar).f341881b) != null) {
            u3Var.dismiss();
        }
        o00.t tVar2 = wVar.f341887b;
        if (tVar2 != null) {
            o00.s sVar = (o00.s) tVar2;
            java.lang.ref.WeakReference weakReference = sVar.f341883a;
            if (weakReference == null || (context = (android.content.Context) weakReference.get()) == null) {
                context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            sVar.f341881b = com.tencent.mm.ui.widget.dialog.u3.f(context, sVar.f341882c, false, 0, null);
        }
    }
}
