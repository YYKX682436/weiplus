package ib2;

/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ib2.w f290101d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ib2.w wVar) {
        super(1);
        this.f290101d = wVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.content.Intent intent = new android.content.Intent();
        ib2.w wVar = this.f290101d;
        java.lang.String str = wVar.f290172w;
        if (str == null) {
            kotlin.jvm.internal.o.o("authorUsername");
            throw null;
        }
        intent.putExtra("finder_username", str);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(wVar.getContext(), intent);
        return jz5.f0.f302826a;
    }
}
