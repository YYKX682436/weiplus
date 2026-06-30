package iq2;

/* loaded from: classes2.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iq2.d0 f293745d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(iq2.d0 d0Var) {
        super(0);
        this.f293745d = d0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra;
        android.content.Intent intent = this.f293745d.f293717a.getIntent();
        return (intent == null || (stringExtra = intent.getStringExtra("NEARBY_LIVE_TARGET_FROM_COMMENT_SCENE_KEY")) == null) ? "" : stringExtra;
    }
}
