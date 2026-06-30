package pp4;

/* loaded from: classes10.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f357532d;

    /* renamed from: e, reason: collision with root package name */
    public int f357533e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f357534f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f357535g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorPlatformVideoPluginLayout f357536h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f357537i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f357538m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f357539n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f357540o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f357541p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorPlatformVideoPluginLayout timelineEditorPlatformVideoPluginLayout, java.lang.String str, android.graphics.Rect rect, android.graphics.Rect rect2, android.graphics.Rect rect3, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357534f = audioCacheInfo;
        this.f357535g = h0Var;
        this.f357536h = timelineEditorPlatformVideoPluginLayout;
        this.f357537i = str;
        this.f357538m = rect;
        this.f357539n = rect2;
        this.f357540o = rect3;
        this.f357541p = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pp4.i(this.f357534f, this.f357535g, this.f357536h, this.f357537i, this.f357538m, this.f357539n, this.f357540o, this.f357541p, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pp4.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pp4.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
