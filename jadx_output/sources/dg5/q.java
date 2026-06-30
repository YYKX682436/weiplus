package dg5;

/* loaded from: classes9.dex */
public class q implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dg5.u f232393d;

    public q(dg5.u uVar) {
        this.f232393d = uVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f232393d.f232404g = true;
    }
}
