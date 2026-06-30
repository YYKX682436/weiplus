package un;

/* loaded from: classes5.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.j1 f429290d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(un.j1 j1Var) {
        super(0);
        this.f429290d = j1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f429290d.getIntent().getStringExtra("Single_Chat_Talker");
    }
}
