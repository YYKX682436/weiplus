package kr3;

/* loaded from: classes8.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kr3.q1 f311494d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(kr3.q1 q1Var) {
        super(0);
        this.f311494d = q1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f311494d.getIntent().getBooleanExtra("key_intent_assemble_ui_half_screen", false));
    }
}
