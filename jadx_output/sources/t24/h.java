package t24;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a24.i f415321d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a24.i iVar) {
        super(2);
        this.f415321d = iVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String string = (java.lang.String) obj;
        android.widget.ImageView view = (android.widget.ImageView) obj2;
        kotlin.jvm.internal.o.g(string, "string");
        kotlin.jvm.internal.o.g(view, "view");
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(view, string, null);
        view.setAlpha(((s24.f) this.f415321d).x7());
        return jz5.f0.f302826a;
    }
}
