package ox2;

/* loaded from: classes2.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg f349641d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg centerInteractionEasterEgg) {
        super(1);
        this.f349641d = centerInteractionEasterEgg;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return java.lang.Integer.valueOf(e06.p.g(((java.lang.Number) obj).intValue(), this.f349641d.emojiSize));
    }
}
