package p12;

/* loaded from: classes10.dex */
public final class c extends p12.b {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f351016h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.app.Activity activity, com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorPreviewLayout previewLayout, java.lang.String mediaPath) {
        super(activity, previewLayout);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(previewLayout, "previewLayout");
        kotlin.jvm.internal.o.g(mediaPath, "mediaPath");
        this.f351016h = mediaPath;
    }

    @Override // p12.b, p12.h
    public java.lang.Object c(kotlin.coroutines.Continuation continuation) {
        return d(this.f351016h, continuation);
    }
}
