package ox2;

/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg f349701d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg centerInteractionEasterEgg) {
        super(0);
        this.f349701d = centerInteractionEasterEgg;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView = this.f349701d.f132373h;
        if (finderEmojiView != null) {
            finderEmojiView.setScaleX(1.0f);
        }
        return jz5.f0.f302826a;
    }
}
