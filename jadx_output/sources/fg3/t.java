package fg3;

/* loaded from: classes12.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f262450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fg3.v f262451e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(android.view.View view, fg3.v vVar) {
        super(0);
        this.f262450d = view;
        this.f262451e = vVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f262450d.postDelayed(new fg3.s(this.f262451e), 100L);
        return jz5.f0.f302826a;
    }
}
