package em2;

/* loaded from: classes3.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ em2.u f255153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f255154e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f255155f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(em2.u uVar, android.view.View view, long j17) {
        super(3);
        this.f255153d = uVar;
        this.f255154e = view;
        this.f255155f = j17;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.content.Context context;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ug5.v performer = (ug5.v) obj2;
        android.content.Intent intent = (android.content.Intent) obj3;
        kotlin.jvm.internal.o.g(performer, "performer");
        kotlin.jvm.internal.o.g(intent, "intent");
        em2.u uVar = this.f255153d;
        android.view.View it = this.f255154e;
        kotlin.jvm.internal.o.f(it, "$it");
        long j17 = this.f255155f;
        android.view.View view = performer.f427660c;
        if (view == null || (context = view.getContext()) == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        android.content.Context context2 = context;
        kotlin.jvm.internal.o.d(context2);
        uVar.d(it, booleanValue, j17, context2, intent);
        return jz5.f0.f302826a;
    }
}
