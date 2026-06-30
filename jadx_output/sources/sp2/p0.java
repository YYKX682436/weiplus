package sp2;

/* loaded from: classes2.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f411177d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(sp2.o2 o2Var) {
        super(0);
        this.f411177d = o2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra;
        android.content.Intent intent = this.f411177d.f411121a.getIntent();
        return (intent == null || (stringExtra = intent.getStringExtra("NEARBY_LIVE_TARGET_FROM_COMMENT_SCENE_KEY")) == null) ? "" : stringExtra;
    }
}
