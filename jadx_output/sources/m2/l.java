package m2;

/* loaded from: classes14.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.tooling.ComposeViewAdapter f322933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f322934e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f322935f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.compose.ui.tooling.ComposeViewAdapter composeViewAdapter, yz5.p pVar, int i17) {
        super(2);
        this.f322933d = composeViewAdapter;
        this.f322934e = pVar;
        this.f322935f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f322935f | 1;
        androidx.compose.ui.tooling.ComposeViewAdapter.a(this.f322933d, this.f322934e, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
