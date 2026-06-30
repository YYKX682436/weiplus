package hd2;

/* loaded from: classes10.dex */
public final class s implements dr.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderEmojiView f280525a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f280526b;

    public s(com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView, android.widget.ImageView imageView) {
        this.f280525a = finderEmojiView;
        this.f280526b = imageView;
    }

    @Override // dr.r
    public void a(int i17, com.tencent.mm.api.IEmojiInfo emojiInfo, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView = this.f280525a;
        finderEmojiView.setVisibility(4);
        finderEmojiView.y();
        this.f280526b.setImageBitmap((android.graphics.Bitmap) obj);
    }
}
