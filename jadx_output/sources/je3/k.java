package je3;

/* loaded from: classes7.dex */
public final class k implements je3.i {

    /* renamed from: e, reason: collision with root package name */
    public static final je3.k f299298e = new je3.k();

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ je3.i f299299d = (je3.i) i95.n0.c(je3.i.class);

    @Override // je3.i
    public boolean Ii(float f17) {
        return this.f299299d.Ii(f17);
    }

    @Override // je3.i
    public boolean Nb() {
        return this.f299299d.Nb();
    }

    @Override // je3.i
    public void Rg(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene scene, int i18, int i19) {
        kotlin.jvm.internal.o.g(scene, "scene");
        this.f299299d.Rg(str, str2, str3, str4, i17, scene, i18, i19);
    }

    @Override // je3.i
    public void Sc(java.lang.String key, int i17, java.lang.String str, float f17) {
        kotlin.jvm.internal.o.g(key, "key");
        this.f299299d.Sc(key, i17, str, f17);
    }

    @Override // je3.i
    public void T5(java.lang.String bizName, java.lang.String type, java.lang.String content, java.lang.String extras, float f17) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(extras, "extras");
        this.f299299d.T5(bizName, type, content, extras, f17);
    }

    @Override // je3.i
    public boolean W7() {
        return this.f299299d.W7();
    }

    @Override // je3.i
    public void qa(java.lang.String sessionId, java.lang.String bizName, java.lang.String cardName, com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene scene, long j17, java.util.List list, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(cardName, "cardName");
        kotlin.jvm.internal.o.g(scene, "scene");
        this.f299299d.qa(sessionId, bizName, cardName, scene, j17, list, jSONObject);
    }

    @Override // je3.i
    public void t6(java.lang.String sessionId, java.lang.String bizName, com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene scene, long j17, java.lang.String extras, float f17) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(extras, "extras");
        this.f299299d.t6(sessionId, bizName, scene, j17, extras, f17);
    }

    @Override // je3.i
    public void vb(java.lang.String bizName, int i17, long j17, java.lang.String clickId, com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$RoleType role, com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$EventType eventType, com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$ActionType action, int i18, int i19, java.lang.String extraInfo, java.lang.String cardName) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(clickId, "clickId");
        kotlin.jvm.internal.o.g(role, "role");
        kotlin.jvm.internal.o.g(eventType, "eventType");
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(extraInfo, "extraInfo");
        kotlin.jvm.internal.o.g(cardName, "cardName");
        this.f299299d.vb(bizName, i17, j17, clickId, role, eventType, action, i18, i19, extraInfo, cardName);
    }
}
