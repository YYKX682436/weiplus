package jq5;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f301262d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context) {
        super(0);
        this.f301262d = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            v65.i.b(lifecycleScope, null, new jq5.f(this.f301262d, null), 1, null);
        }
        return jz5.f0.f302826a;
    }
}
