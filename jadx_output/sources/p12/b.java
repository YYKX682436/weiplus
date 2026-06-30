package p12;

/* loaded from: classes10.dex */
public class b extends p12.h {

    /* renamed from: g, reason: collision with root package name */
    public final androidx.appcompat.widget.AppCompatImageView f351015g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.app.Activity activity, com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorPreviewLayout previewLayout) {
        super(activity, previewLayout);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(previewLayout, "previewLayout");
        this.f351015g = new androidx.appcompat.widget.AppCompatImageView(activity, null);
    }

    @Override // p12.h
    public android.view.View a() {
        return this.f351015g;
    }

    @Override // p12.h
    public void b() {
    }

    @Override // p12.h
    public java.lang.Object c(kotlin.coroutines.Continuation continuation) {
        return d(this.f351022a.getIntent().getStringExtra("media_path"), continuation);
    }

    public java.lang.Object d(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        if (str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GifRenderViewController", "media path is null");
            return null;
        }
        try {
            this.f351027f = new java.io.File(str);
            com.tencent.mm.plugin.gif.k kVar = new com.tencent.mm.plugin.gif.k(str);
            kVar.F = new p12.a(this, kVar);
            androidx.appcompat.widget.AppCompatImageView appCompatImageView = this.f351015g;
            appCompatImageView.setImageDrawable(kVar);
            appCompatImageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            this.f351023b.addView(appCompatImageView, new android.view.ViewGroup.LayoutParams(-2, -2));
            return l12.a.f314981f;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GifRenderViewController", "failed to setup photo render. " + th6);
            return null;
        }
    }
}
