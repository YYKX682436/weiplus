package hr3;

/* loaded from: classes11.dex */
public class ga implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.va f283584d;

    public ga(hr3.va vaVar) {
        this.f283584d = vaVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f283584d.f284108d = true;
    }
}
