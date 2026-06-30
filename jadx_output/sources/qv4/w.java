package qv4;

/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qv4.z f367026d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(qv4.z zVar) {
        super(0);
        this.f367026d = zVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View j17 = this.f367026d.j();
        if (j17 != null) {
            return j17.findViewById(com.tencent.mm.R.id.f485223u20);
        }
        return null;
    }
}
