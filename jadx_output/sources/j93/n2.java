package j93;

/* loaded from: classes.dex */
public final class n2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.p2 f298463d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(j93.p2 p2Var) {
        super(0);
        this.f298463d = p2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f298463d.getIntent().getIntExtra("key_label_click_source", 0));
    }
}
