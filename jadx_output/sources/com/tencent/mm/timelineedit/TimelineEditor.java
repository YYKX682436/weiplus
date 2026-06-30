package com.tencent.mm.timelineedit;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0007\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001RJ\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 J!\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0082 J\u0011\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 J\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000bH\u0082 J#\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082 J\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0006H\u0082 J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0006H\u0082 J\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0006H\u0082 J\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0082 J#\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0082 J\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 J\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0082 J\u0019\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0082 J!\u0010\"\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0002H\u0082 J!\u0010&\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u000fH\u0082 J\u0019\u0010'\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0082 J!\u0010(\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0002H\u0082 J!\u0010)\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u000fH\u0082 J\u0019\u0010*\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0082 J!\u0010+\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0002H\u0082 J!\u0010,\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u000fH\u0082 J\u0019\u0010-\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0082 J!\u0010.\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0002H\u0082 J!\u0010/\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u000fH\u0082 J\u0019\u00100\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0082 J!\u00101\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0002H\u0082 J!\u00102\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u000fH\u0082 J\u0019\u00103\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0082 J!\u00104\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0002H\u0082 J!\u00105\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u000fH\u0082 J!\u00108\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00022\u0006\u00107\u001a\u00020\u000bH\u0082 J!\u00109\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0082 J\u0019\u0010:\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u0002H\u0082 J;\u0010?\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\u0002H\u0082 J\u001b\u0010@\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\u0006H\u0082 J\u0013\u0010A\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 J\u0011\u0010B\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 J\u001b\u0010C\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 J\u001b\u0010D\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0082 J\u0019\u0010F\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010E\u001a\u00020\u0002H\u0082 JS\u0010P\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010G\u001a\u00020\u00112\u0006\u0010I\u001a\u00020H2\u0006\u0010J\u001a\u00020H2\u0006\u0010K\u001a\u00020\u00022\u0006\u0010L\u001a\u00020\u00112\u0006\u0010M\u001a\u00020H2\u0006\u0010N\u001a\u00020H2\u0006\u0010O\u001a\u00020\u0002H\u0082 J\u0011\u0010Q\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 ¨\u0006S"}, d2 = {"Lcom/tencent/mm/timelineedit/TimelineEditor;", "", "", "nPtr", "Ljz5/f0;", "nSetNativeLog", "", "canvasRectBytes", "validRectBytes", "editorConfig", "nCreate", "", "nSave", "replace", "nRestore", "", com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "", "type", "nCreateTrack", "trackBytes", "nAddTrack", "nUpdateTrack", "nRemoveTrack", "nAddWrapDurationAudioTrack", "startMs", "endMs", "nUpdateCompositionDuration", "nGetNoTransitionComposition", "trackId", "nGetSingleFullRangeComposition", "nCreateTransitionEffectPath", "bytes", "length", "nCreateTransitionEffectBytes", "Landroid/content/res/AssetManager;", "asset", "assetPath", "nCreateTransitionEffectAsset", "nCreatePAGStickerEffectPath", "nCreatePAGStickerEffectBytes", "nCreatePAGStickerEffectAsset", "nCreateTextEffectPath", "nCreateTextEffectBytes", "nCreateTextEffectAsset", "nCreateVideoTemplateEffectPath", "nCreateVideoTemplateEffectBytes", "nCreateVideoTemplateEffectAsset", "nCreateGlobalAnimationEffectPath", "nCreateGlobalAnimationEffectBytes", "nCreateGlobalAnimationEffectAsset", "nCreateDecodeStickerEffectPath", "nCreateDecodeStickerEffectBytes", "nCreateDecodeStickerEffectAsset", "effectPtr", "bindTrack", "nAddEffectToTimeline", "nAddEffectToTimelineBindToTrack", "nRemoveEffect", "beforeTrack", "afterTrack", "transitionEffect", "durationMs", "nSetTransition", "nRemoveTransition", "nClearTransition", "nGetEffectManager", "nUpdateValidRect", "nUpdateConfig", "displayTime", "nUpdateDisplayTime", "actionA", "", "pointAX", "pointAY", "keyA", "actionB", "pointBX", "pointBY", "keyB", "nTouchMotionEvent", "nDestroy", "Companion", "timelinelib_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes10.dex */
public final class TimelineEditor {

    /* renamed from: e, reason: collision with root package name */
    public static volatile boolean f196413e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.timelineedit.TimelineEditor.Companion f196414f = new com.tencent.mm.timelineedit.TimelineEditor.Companion(null);

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.xeffect.effect.EffectManager f196417c;

    /* renamed from: a, reason: collision with root package name */
    public long f196415a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f196416b = -1;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f196418d = new java.util.HashMap();

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/mm/timelineedit/TimelineEditor$Companion;", "", "Ljz5/f0;", "checkInitJNI", "", "TAG", "Ljava/lang/String;", "", "jniInit", "Z", "timelinelib_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes10.dex */
    public static final class Companion {
        public Companion(kotlin.jvm.internal.i iVar) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkInitJNI() {
            if (com.tencent.mm.timelineedit.TimelineEditor.f196413e) {
                return;
            }
            new com.tencent.mm.xeffect.effect.EffectManager();
            com.tencent.mm.timelineedit.TimelineEditor.f196413e = true;
        }
    }

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("WeEffect");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/timelineedit/TimelineEditor", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/timelineedit/TimelineEditor", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add("xlabeffect");
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/timelineedit/TimelineEditor", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList2.get(0));
        yj0.a.f(obj2, "com/tencent/mm/timelineedit/TimelineEditor", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add("timeline-editor");
        java.lang.Object obj3 = new java.lang.Object();
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(obj3, arrayList3.toArray(), "com/tencent/mm/timelineedit/TimelineEditor", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList3.get(0));
        yj0.a.f(obj3, "com/tencent/mm/timelineedit/TimelineEditor", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    private final native long nAddEffectToTimeline(long nPtr, long effectPtr, boolean bindTrack);

    private final native long nAddEffectToTimelineBindToTrack(long nPtr, long effectPtr, long trackId);

    /* JADX INFO: Access modifiers changed from: private */
    public final native byte[] nAddTrack(long nPtr, byte[] trackBytes);

    /* JADX INFO: Access modifiers changed from: private */
    public final native byte[] nAddWrapDurationAudioTrack(long nPtr, java.lang.String path);

    private final native byte[] nClearTransition(long nPtr);

    private final native long nCreate(byte[] canvasRectBytes, byte[] validRectBytes, byte[] editorConfig);

    private final native long nCreateDecodeStickerEffectAsset(long nPtr, android.content.res.AssetManager asset, java.lang.String assetPath);

    private final native long nCreateDecodeStickerEffectBytes(long nPtr, byte[] bytes, long length);

    private final native long nCreateDecodeStickerEffectPath(long nPtr, java.lang.String path);

    private final native long nCreateGlobalAnimationEffectAsset(long nPtr, android.content.res.AssetManager asset, java.lang.String assetPath);

    private final native long nCreateGlobalAnimationEffectBytes(long nPtr, byte[] bytes, long length);

    private final native long nCreateGlobalAnimationEffectPath(long nPtr, java.lang.String path);

    private final native long nCreatePAGStickerEffectAsset(long nPtr, android.content.res.AssetManager asset, java.lang.String assetPath);

    private final native long nCreatePAGStickerEffectBytes(long nPtr, byte[] bytes, long length);

    private final native long nCreatePAGStickerEffectPath(long nPtr, java.lang.String path);

    private final native long nCreateTextEffectAsset(long nPtr, android.content.res.AssetManager asset, java.lang.String assetPath);

    private final native long nCreateTextEffectBytes(long nPtr, byte[] bytes, long length);

    private final native long nCreateTextEffectPath(long nPtr, java.lang.String path);

    /* JADX INFO: Access modifiers changed from: private */
    public final native byte[] nCreateTrack(long nPtr, java.lang.String path, int type);

    private final native long nCreateTransitionEffectAsset(long nPtr, android.content.res.AssetManager asset, java.lang.String assetPath);

    private final native long nCreateTransitionEffectBytes(long nPtr, byte[] bytes, long length);

    private final native long nCreateTransitionEffectPath(long nPtr, java.lang.String path);

    private final native long nCreateVideoTemplateEffectAsset(long nPtr, android.content.res.AssetManager asset, java.lang.String assetPath);

    private final native long nCreateVideoTemplateEffectBytes(long nPtr, byte[] bytes, long length);

    private final native long nCreateVideoTemplateEffectPath(long nPtr, java.lang.String path);

    private final native boolean nDestroy(long nPtr);

    private final native long nGetEffectManager(long nPtr);

    /* JADX INFO: Access modifiers changed from: private */
    public final native byte[] nGetNoTransitionComposition(long nPtr);

    /* JADX INFO: Access modifiers changed from: private */
    public final native byte[] nGetSingleFullRangeComposition(long nPtr, long trackId);

    private final native boolean nRemoveEffect(long nPtr, long effectPtr);

    /* JADX INFO: Access modifiers changed from: private */
    public final native byte[] nRemoveTrack(long nPtr, byte[] trackBytes);

    private final native byte[] nRemoveTransition(long nPtr, byte[] afterTrack);

    /* JADX INFO: Access modifiers changed from: private */
    public final native byte[] nRestore(long nPtr, boolean replace);

    private final native boolean nSave(long nPtr);

    private final native void nSetNativeLog(long j17);

    private final native byte[] nSetTransition(long nPtr, java.lang.String path, byte[] beforeTrack, byte[] afterTrack, long transitionEffect, long durationMs);

    private final native byte[] nTouchMotionEvent(long nPtr, int actionA, float pointAX, float pointAY, long keyA, int actionB, float pointBX, float pointBY, long keyB);

    private final native byte[] nUpdateCompositionDuration(long nPtr, long startMs, long endMs);

    /* JADX INFO: Access modifiers changed from: private */
    public final native byte[] nUpdateConfig(long nPtr, byte[] editorConfig);

    private final native void nUpdateDisplayTime(long j17, long j18);

    /* JADX INFO: Access modifiers changed from: private */
    public final native byte[] nUpdateTrack(long nPtr, byte[] trackBytes);

    private final native byte[] nUpdateValidRect(long nPtr, byte[] canvasRectBytes);

    public final void j(uq5.y effect, boolean z17) {
        kotlin.jvm.internal.o.h(effect, "effect");
        long nAddEffectToTimeline = nAddEffectToTimeline(this.f196415a, effect.f430269c, z17);
        if (nAddEffectToTimeline > 0) {
            synchronized (this.f196418d) {
                this.f196418d.put(java.lang.Long.valueOf(nAddEffectToTimeline), effect);
            }
        }
    }

    public final void k(uq5.y effect, long j17) {
        kotlin.jvm.internal.o.h(effect, "effect");
        long nAddEffectToTimelineBindToTrack = nAddEffectToTimelineBindToTrack(this.f196415a, effect.f430269c, j17);
        if (nAddEffectToTimelineBindToTrack > 0) {
            synchronized (this.f196418d) {
                this.f196418d.put(java.lang.Long.valueOf(nAddEffectToTimelineBindToTrack), effect);
            }
        }
    }

    public final rm5.v l(r95.f track) {
        kotlin.jvm.internal.o.h(track, "track");
        return (rm5.v) s(new q95.a(this, track), new q95.b(this));
    }

    public final boolean m(android.graphics.Rect canvasRect, android.graphics.Rect validRect, r95.b config) {
        kotlin.jvm.internal.o.h(canvasRect, "canvasRect");
        kotlin.jvm.internal.o.h(validRect, "validRect");
        kotlin.jvm.internal.o.h(config, "config");
        f196414f.checkInitJNI();
        byte[] byteArray = r95.a.a(canvasRect).toByteArray();
        kotlin.jvm.internal.o.c(byteArray, "canvasRect.toProto().toByteArray()");
        byte[] byteArray2 = r95.a.a(validRect).toByteArray();
        kotlin.jvm.internal.o.c(byteArray2, "validRect.toProto().toByteArray()");
        long nCreate = nCreate(byteArray, byteArray2, config.b());
        this.f196415a = nCreate;
        return nCreate >= 0;
    }

    public final uq5.w n(java.lang.String path) {
        kotlin.jvm.internal.o.h(path, "path");
        java.lang.Long valueOf = java.lang.Long.valueOf(nCreateDecodeStickerEffectPath(this.f196415a, path));
        if (!(valueOf.longValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return new uq5.w(valueOf.longValue());
        }
        return null;
    }

    public final r95.f o(java.lang.String path, int i17) {
        kotlin.jvm.internal.o.h(path, "path");
        return (r95.f) s(new q95.e(this, path, i17), q95.f.f360938d);
    }

    public final boolean p() {
        return nDestroy(this.f196415a);
    }

    public final com.tencent.mm.xeffect.effect.EffectManager q() {
        if (this.f196416b == -1) {
            long nGetEffectManager = nGetEffectManager(this.f196415a);
            this.f196416b = nGetEffectManager;
            uq5.g gVar = com.tencent.mm.xeffect.effect.EffectManager.f214804c;
            this.f196417c = new com.tencent.mm.xeffect.effect.EffectManager(nGetEffectManager, null);
        }
        return this.f196417c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (r4 != 6) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jz5.l r(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.timelineedit.TimelineEditor.r(android.view.MotionEvent):jz5.l");
    }

    public final java.lang.Object s(yz5.a aVar, yz5.l lVar) {
        java.lang.Object invoke = aVar.invoke();
        if (invoke == null) {
            return null;
        }
        try {
            return lVar.invoke(invoke);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final boolean t() {
        return nSave(this.f196415a);
    }

    public final rm5.v u(r95.f track) {
        kotlin.jvm.internal.o.h(track, "track");
        return (rm5.v) s(new q95.q(this, track), new q95.r(this));
    }
}
