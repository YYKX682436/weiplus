package gq2;

/* loaded from: classes2.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gq2.j f274555d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(gq2.j jVar) {
        super(0);
        this.f274555d = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra;
        android.content.Intent intent = this.f274555d.f274562e.getIntent();
        return (intent == null || (stringExtra = intent.getStringExtra("NEARBY_LIVE_TARGET_FROM_COMMENT_SCENE_KEY")) == null) ? "" : stringExtra;
    }
}
