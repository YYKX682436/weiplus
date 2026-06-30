package hr3;

/* loaded from: classes11.dex */
public class bi implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l41.h0 f283433d;

    public bi(hr3.ai aiVar, l41.h0 h0Var) {
        this.f283433d = h0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().d(this.f283433d);
    }
}
