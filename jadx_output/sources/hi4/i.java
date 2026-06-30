package hi4;

/* loaded from: classes4.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hi4.j f281549d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(hi4.j jVar) {
        super(0);
        this.f281549d = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f281549d.getIntent().getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0));
    }
}
