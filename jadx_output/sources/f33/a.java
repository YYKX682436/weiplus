package f33;

/* loaded from: classes10.dex */
public class a implements ck5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f259303a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.emoji.EmojiImagePreviewUI f259304b;

    public a(com.tencent.mm.plugin.gallery.ui.emoji.EmojiImagePreviewUI emojiImagePreviewUI, android.view.View view) {
        this.f259304b = emojiImagePreviewUI;
        this.f259303a = view;
    }

    @Override // ck5.b
    public void a() {
        com.tencent.mm.plugin.gallery.ui.emoji.EmojiImagePreviewUI emojiImagePreviewUI = this.f259304b;
        db5.e1.s(emojiImagePreviewUI.getContext(), "", emojiImagePreviewUI.getContext().getString(com.tencent.mm.R.string.oeh));
    }

    @Override // ck5.b
    public void b(ck5.c cVar) {
        int i17 = com.tencent.mm.plugin.gallery.ui.emoji.EmojiImagePreviewUI.f138641n2;
        this.f259304b.L7(this.f259303a);
    }
}
