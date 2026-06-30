package m14;

/* loaded from: classes11.dex */
public class l implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m14.f f322880d;

    public l(m14.f fVar) {
        this.f322880d = fVar;
    }

    @Override // c01.da
    public boolean a() {
        return this.f322880d.f322871c;
    }

    @Override // c01.da
    public void c() {
        m14.f fVar = this.f322880d;
        android.app.ProgressDialog progressDialog = fVar.f322870b;
        if (progressDialog != null) {
            progressDialog.dismiss();
            fVar.f322870b = null;
        }
        new com.tencent.mm.autogen.events.ResetBadgeCountEvent().e();
    }
}
