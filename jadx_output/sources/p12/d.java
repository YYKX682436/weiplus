package p12;

/* loaded from: classes10.dex */
public final class d extends p12.g {

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f351017j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.app.Activity activity, com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorPreviewLayout previewLayout, java.lang.String mediaPath) {
        super(activity, previewLayout);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(previewLayout, "previewLayout");
        kotlin.jvm.internal.o.g(mediaPath, "mediaPath");
        this.f351017j = mediaPath;
    }

    @Override // p12.g, p12.h
    public java.lang.Object c(kotlin.coroutines.Continuation continuation) {
        return d(this.f351017j, continuation);
    }
}
