package dr;

/* loaded from: classes12.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f242390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.Drawable f242391e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.view.AbsEmojiView f242392f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dr.p f242393g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(boolean z17, android.graphics.drawable.Drawable drawable, com.tencent.mm.emoji.view.AbsEmojiView absEmojiView, dr.p pVar) {
        super(0);
        this.f242390d = z17;
        this.f242391e = drawable;
        this.f242392f = absEmojiView;
        this.f242393g = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.drawable.Drawable drawable;
        boolean z17 = this.f242390d;
        dr.p pVar = this.f242393g;
        com.tencent.mm.emoji.view.AbsEmojiView absEmojiView = this.f242392f;
        if (!z17 || (drawable = this.f242391e) == null) {
            if (absEmojiView != null) {
                absEmojiView.n();
            }
            dr.q qVar = pVar.f242397d;
            if (qVar != null) {
                qVar.a(false);
            }
        } else {
            if (absEmojiView != null) {
                absEmojiView.setImageDrawable(drawable);
            }
            if (absEmojiView != null) {
                absEmojiView.resume();
            }
            dr.q qVar2 = pVar.f242397d;
            if (qVar2 != null) {
                qVar2.a(true);
            }
        }
        return jz5.f0.f302826a;
    }
}
