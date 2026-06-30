package p12;

/* loaded from: classes10.dex */
public class g extends p12.h {

    /* renamed from: i, reason: collision with root package name */
    public static final p12.f f351019i = new p12.f(null);

    /* renamed from: g, reason: collision with root package name */
    public final androidx.appcompat.widget.AppCompatImageView f351020g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Bitmap f351021h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.app.Activity activity, com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorPreviewLayout previewLayout) {
        super(activity, previewLayout);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(previewLayout, "previewLayout");
        this.f351020g = new androidx.appcompat.widget.AppCompatImageView(activity, null);
    }

    @Override // p12.h
    public android.view.View a() {
        return this.f351020g;
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
            com.tencent.mars.xlog.Log.e("MicroMsg.PhotoRenderViewController", "media path is null");
            return null;
        }
        try {
            this.f351027f = new java.io.File(str);
            android.graphics.Bitmap a17 = p12.f.a(f351019i, str, 0, 0, 6, null);
            if (a17 == null) {
                return null;
            }
            this.f351021h = a17;
            ((kotlinx.coroutines.flow.h3) this.f351025d).k(new android.util.Size(a17.getWidth(), a17.getHeight()));
            androidx.appcompat.widget.AppCompatImageView appCompatImageView = this.f351020g;
            appCompatImageView.setImageBitmap(a17);
            appCompatImageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            this.f351023b.addView(appCompatImageView, new android.view.ViewGroup.LayoutParams(-2, -2));
            return l12.a.f314981f;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PhotoRenderViewController", "failed to setup photo render. " + th6);
            return null;
        }
    }
}
