package qo4;

/* loaded from: classes10.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f365659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f365660e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i17, kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f365659d = i17;
        this.f365660e = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject it = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(it, "it");
        qo4.c cVar = qo4.c.f365661a;
        if (it.optInt("key", -1) == this.f365659d) {
            this.f365660e.f310123d = it;
        }
        return jz5.f0.f302826a;
    }
}
