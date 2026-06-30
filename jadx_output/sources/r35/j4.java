package r35;

/* loaded from: classes8.dex */
public class j4 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r35.k4 f369149d;

    public j4(r35.k4 k4Var) {
        this.f369149d = k4Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        r35.k4 k4Var = this.f369149d;
        android.content.Context context = k4Var.f369170d;
        k4Var.f369173g = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), k4Var.f369170d.getString(com.tencent.mm.R.string.f490604zq), false, true, new r35.i4(this));
        return false;
    }
}
