package dr;

/* loaded from: classes12.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr.p f242396d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(dr.p pVar) {
        super(0);
        this.f242396d = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.emoji.view.AbsEmojiView absEmojiView;
        dr.p pVar = this.f242396d;
        java.lang.ref.WeakReference weakReference = pVar.f242402c;
        if (weakReference != null && (absEmojiView = (com.tencent.mm.emoji.view.AbsEmojiView) weakReference.get()) != null) {
            absEmojiView.n();
        }
        dr.s.e(pVar, false, 1, null);
        return jz5.f0.f302826a;
    }
}
