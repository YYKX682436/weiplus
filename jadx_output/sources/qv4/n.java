package qv4;

/* loaded from: classes12.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qv4.z f366999d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(qv4.z zVar) {
        super(0);
        this.f366999d = zVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View i17 = this.f366999d.i();
        if (i17 != null) {
            return i17.findViewById(com.tencent.mm.R.id.rqy);
        }
        return null;
    }
}
