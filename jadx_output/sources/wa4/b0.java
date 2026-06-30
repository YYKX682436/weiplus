package wa4;

/* loaded from: classes4.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final wa4.b0 f444203a = new wa4.b0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f444204b = new java.util.LinkedHashMap();

    public final void a(java.lang.String localId, wa4.f0 postInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addPostingItem", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionManager");
        kotlin.jvm.internal.o.g(localId, "localId");
        kotlin.jvm.internal.o.g(postInfo, "postInfo");
        f444204b.put(localId, postInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addPostingItem", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionManager");
    }

    public final wa4.f0 b(java.lang.String localId) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findPostInfoByLocalId", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionManager");
        kotlin.jvm.internal.o.g(localId, "localId");
        wa4.f0 f0Var = (wa4.f0) ((java.util.LinkedHashMap) f444204b).get(localId);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findPostInfoByLocalId", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionManager");
        return f0Var;
    }
}
