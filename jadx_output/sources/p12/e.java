package p12;

/* loaded from: classes10.dex */
public final class e extends p12.w {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f351018m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.app.Activity activity, com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorPreviewLayout previewLayout, java.lang.String mediaPath) {
        super(activity, previewLayout);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(previewLayout, "previewLayout");
        kotlin.jvm.internal.o.g(mediaPath, "mediaPath");
        this.f351018m = mediaPath;
    }

    @Override // p12.w, p12.h
    public java.lang.Object c(kotlin.coroutines.Continuation continuation) {
        return p12.w.g(this, this.f351018m, continuation);
    }
}
