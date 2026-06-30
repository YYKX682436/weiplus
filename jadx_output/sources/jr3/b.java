package jr3;

/* loaded from: classes4.dex */
public class b implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jr3.c f301395d;

    public b(jr3.c cVar) {
        this.f301395d = cVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        jr3.c cVar = this.f301395d;
        if (cVar.f301399g.isFinishing()) {
            return false;
        }
        android.app.Activity activity = cVar.f301399g;
        cVar.f301397e = db5.e1.Q(activity, activity.getString(com.tencent.mm.R.string.f490573yv), cVar.f301399g.getString(com.tencent.mm.R.string.f490604zq), false, true, new jr3.a(this));
        return false;
    }
}
