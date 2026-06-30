package qv4;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qv4.z f367001d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(qv4.z zVar) {
        super(0);
        this.f367001d = zVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View j17 = this.f367001d.j();
        android.view.View findViewById = j17 != null ? j17.findViewById(com.tencent.mm.R.id.rqw) : null;
        if (findViewById != null) {
            pv4.b.c(findViewById, 20.0f);
            pv4.b.d(findViewById, 20.0f);
            int a17 = (int) (findViewById.getResources().getDisplayMetrics().density * 2.0f * pv4.b.a());
            findViewById.setPadding(a17, a17, a17, a17);
        }
        return findViewById;
    }
}
