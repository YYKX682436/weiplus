package p61;

/* loaded from: classes9.dex */
public class e0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n61.a f352237d;

    public e0(com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI bindLinkedInUI, n61.a aVar) {
        this.f352237d = aVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f352237d);
    }
}
