package qi5;

/* loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qi5.b0 f363795d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(qi5.b0 b0Var) {
        super(0);
        this.f363795d = b0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f363795d.f363799d.getIntent().getBooleanExtra("Intent_KEY_SHOW_IV_MORE", false));
    }
}
