package uw0;

/* loaded from: classes5.dex */
public final class u0 extends ov0.a {

    /* renamed from: y1, reason: collision with root package name */
    public final int f431613y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f431613y1 = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.akc);
    }

    @Override // ov0.t
    public void L() {
        getNextBtn().setVisibility(8);
    }

    @Override // ov0.t
    public boolean N() {
        java.lang.Boolean bool = (java.lang.Boolean) j("key_enable_dual_language_edit", java.lang.Boolean.FALSE);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.y
    public int getEditTextMaxLineOnExpand() {
        return 1;
    }

    @Override // ov0.t
    public int getInputBoxHeight() {
        return this.f431613y1;
    }
}
