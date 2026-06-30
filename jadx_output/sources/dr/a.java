package dr;

/* loaded from: classes12.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr.d f242372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.Drawable f242373e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.view.AbsEmojiView f242374f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f242375g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(dr.d dVar, android.graphics.drawable.Drawable drawable, com.tencent.mm.emoji.view.AbsEmojiView absEmojiView, boolean z17) {
        super(0);
        this.f242372d = dVar;
        this.f242373e = drawable;
        this.f242374f = absEmojiView;
        this.f242375g = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.platformtools.r2 r2Var = ar.b.f13355a;
        dr.d dVar = this.f242372d;
        java.lang.String str = dVar.f242378g;
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiLoader.AnimateCache", "put " + str);
        android.graphics.drawable.Drawable drawable = this.f242373e;
        if (str != null) {
            com.tencent.mm.sdk.platformtools.r2 r2Var2 = ar.b.f13355a;
            if (drawable != null) {
                r2Var2.put(str, new java.lang.ref.WeakReference(drawable));
            } else {
                r2Var2.remove(str);
            }
        }
        com.tencent.mm.emoji.view.AbsEmojiView absEmojiView = this.f242374f;
        if (absEmojiView != null) {
            absEmojiView.setImageDrawable(drawable);
        }
        if (absEmojiView != null) {
            absEmojiView.resume();
        }
        dr.q qVar = dVar.f242397d;
        if (qVar != null) {
            qVar.a(this.f242375g && drawable != null);
        }
        return jz5.f0.f302826a;
    }
}
