package yf5;

/* loaded from: classes11.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f461851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f461852e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(java.lang.ref.WeakReference weakReference, java.lang.String str) {
        super(0);
        this.f461851d = weakReference;
        this.f461852e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.ref.WeakReference weakReference = this.f461851d;
        if (weakReference.get() != null) {
            com.tencent.mm.ui.base.NoMeasuredTextView noMeasuredTextView = (com.tencent.mm.ui.base.NoMeasuredTextView) weakReference.get();
            java.lang.Object tag = noMeasuredTextView != null ? noMeasuredTextView.getTag(com.tencent.mm.R.id.f483942t06) : null;
            java.lang.String str = this.f461852e;
            if (kotlin.jvm.internal.o.b(tag, str)) {
                ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).rj((com.tencent.mm.ui.base.NoMeasuredTextView) weakReference.get(), str, bi4.c.CONVERSATION_LIST);
            }
        }
        return jz5.f0.f302826a;
    }
}
