package dz4;

/* loaded from: classes12.dex */
public final class f3 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz4.s f245241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ iz4.k f245242e;

    public f3(mz4.s sVar, iz4.k kVar) {
        this.f245241d = sVar;
        this.f245242e = kVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        mz4.s sVar = this.f245241d;
        sVar.f333348p = true;
        sVar.interrupt();
        this.f245242e.f296120w = true;
    }
}
