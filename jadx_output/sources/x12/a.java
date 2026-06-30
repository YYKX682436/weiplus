package x12;

/* loaded from: classes5.dex */
public final class a implements zp0.e {

    /* renamed from: a, reason: collision with root package name */
    public final aq0.i f451425a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.RectF f451426b;

    public a(aq0.i scene, android.graphics.RectF fireworkPlayRect) {
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(fireworkPlayRect, "fireworkPlayRect");
        this.f451425a = scene;
        this.f451426b = fireworkPlayRect;
    }

    @Override // zp0.e
    public java.util.Map b() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.f451425a.ordinal()));
        hashMap.put("fireworkPlayRect", cq0.a.f221325a.b(this.f451426b));
        return hashMap;
    }

    @Override // zp0.e
    public java.lang.String getName() {
        return "onFireworkSceneChange";
    }
}
