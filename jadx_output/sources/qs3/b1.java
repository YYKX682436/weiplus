package qs3;

/* loaded from: classes13.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.radar.ui.RadarViewController f366336d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(com.tencent.mm.plugin.radar.ui.RadarViewController radarViewController) {
        super(0);
        this.f366336d = radarViewController;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f366336d.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        return (com.tencent.mm.plugin.radar.ui.RadarWaveView) ((android.app.Activity) context).findViewById(com.tencent.mm.R.id.lhr);
    }
}
