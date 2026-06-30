package p12;

/* loaded from: classes10.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f351022a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorPreviewLayout f351023b;

    /* renamed from: c, reason: collision with root package name */
    public int f351024c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f351025d;

    /* renamed from: e, reason: collision with root package name */
    public android.util.Range f351026e;

    /* renamed from: f, reason: collision with root package name */
    public java.io.File f351027f;

    public h(android.app.Activity activity, com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorPreviewLayout previewLayout) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(previewLayout, "previewLayout");
        this.f351022a = activity;
        this.f351023b = previewLayout;
        this.f351025d = kotlinx.coroutines.flow.i3.a(new android.util.Size(0, 0));
        this.f351026e = new android.util.Range(0, 0);
    }

    public abstract android.view.View a();

    public abstract void b();

    public abstract java.lang.Object c(kotlin.coroutines.Continuation continuation);
}
