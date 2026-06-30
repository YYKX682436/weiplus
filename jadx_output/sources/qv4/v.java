package qv4;

/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qv4.z f367025d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(qv4.z zVar) {
        super(0);
        this.f367025d = zVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View j17 = this.f367025d.j();
        android.view.View findViewById = j17 != null ? j17.findViewById(com.tencent.mm.R.id.f485222rr1) : null;
        if (findViewById != null) {
            pv4.b.c(findViewById, 8.0f);
            pv4.b.d(findViewById, 16.0f);
        }
        return findViewById;
    }
}
