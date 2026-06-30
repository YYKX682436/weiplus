package qw2;

/* loaded from: classes10.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qw2.k f367130d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.sticker.StickerEffectView f367131e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(qw2.k kVar, com.tencent.mm.plugin.finder.video.sticker.StickerEffectView stickerEffectView) {
        super(1);
        this.f367130d = kVar;
        this.f367131e = stickerEffectView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.a loadMoreCallback;
        if (((java.lang.Number) obj).intValue() >= this.f367130d.f367134c.getItemCount() - 4 && (loadMoreCallback = this.f367131e.getLoadMoreCallback()) != null) {
            loadMoreCallback.invoke();
        }
        return jz5.f0.f302826a;
    }
}
