package m14;

/* loaded from: classes11.dex */
public class k implements c01.e8 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m14.f f322879d;

    public k(m14.f fVar) {
        this.f322879d = fVar;
    }

    @Override // c01.e8
    public void b(int i17, int i18) {
    }

    @Override // c01.e8
    public void c(boolean z17, long j17, int i17) {
        m14.f fVar = this.f322879d;
        android.app.ProgressDialog progressDialog = fVar.f322870b;
        if (progressDialog != null) {
            progressDialog.dismiss();
            fVar.f322870b = null;
        }
        new com.tencent.mm.autogen.events.ResetBadgeCountEvent().e();
    }
}
