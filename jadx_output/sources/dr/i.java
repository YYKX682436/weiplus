package dr;

/* loaded from: classes12.dex */
public final class i extends dr.t {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f242388d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, android.widget.ImageView view, android.graphics.drawable.Drawable drawable) {
        super(emojiInfo, view);
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        kotlin.jvm.internal.o.g(view, "view");
        this.f242388d = drawable;
    }

    @Override // dr.s
    public er.f b() {
        zq.h hVar = zq.h.f474972a;
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f242400a;
        kotlin.jvm.internal.o.e(iEmojiInfo, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
        return hVar.a((com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo);
    }

    @Override // dr.s
    public void c(boolean z17) {
        java.lang.ref.WeakReference weakReference = this.f242402c;
        android.view.View view = weakReference != null ? (android.view.View) weakReference.get() : null;
        if (view != null) {
            view.setTag(com.tencent.mm.R.id.dbt, null);
        }
        ar.c cVar = ar.c.f13356a;
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f242400a;
        android.graphics.Bitmap a17 = cVar.a(iEmojiInfo.getMd5());
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCoverRequest", "onLoad: " + iEmojiInfo.getMd5() + ", " + a17 + ", " + (a17 != null ? a17.getWidth() : -1) + ", " + (a17 != null ? a17.getHeight() : -1) + ", " + (a17 != null ? a17.getConfig() : null));
        pm0.v.X(new dr.h(this, z17, a17));
    }

    @Override // dr.s
    public void f(boolean z17) {
        android.widget.ImageView imageView;
        ar.c cVar = ar.c.f13356a;
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f242400a;
        android.graphics.Bitmap a17 = cVar.a(iEmojiInfo.getMd5());
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCoverRequest", "start: " + iEmojiInfo.getMd5() + ", " + a17);
        if (a17 != null) {
            c(true);
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f242402c;
        if (weakReference != null && (imageView = (android.widget.ImageView) weakReference.get()) != null) {
            imageView.setImageDrawable(this.f242388d);
        }
        dr.s.e(this, false, 1, null);
    }
}
