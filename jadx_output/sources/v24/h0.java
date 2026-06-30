package v24;

/* loaded from: classes15.dex */
public class h0 implements com.tencent.mm.ui.widget.dialog.r3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v24.q f432925a;

    public h0(v24.q qVar) {
        this.f432925a = qVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.r3
    public void a(android.app.Dialog dialog, int i17) {
        this.f432925a.R = i17 == 1;
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
