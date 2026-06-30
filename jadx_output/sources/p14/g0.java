package p14;

/* loaded from: classes11.dex */
public class g0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ de0.g f351223d;

    public g0(p14.h0 h0Var, de0.g gVar) {
        this.f351223d = gVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d((com.tencent.mm.modelbase.m1) this.f351223d);
    }
}
