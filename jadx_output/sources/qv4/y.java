package qv4;

/* loaded from: classes12.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qv4.z f367028d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(qv4.z zVar) {
        super(0);
        this.f367028d = zVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = (android.view.View) ((jz5.n) this.f367028d.f367035m).getValue();
        if (view != null) {
            return (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f485224rr2);
        }
        return null;
    }
}
