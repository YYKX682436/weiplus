package wu;

/* loaded from: classes9.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu.w0 f449621d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(wu.w0 w0Var) {
        super(2);
        this.f449621d = w0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.view.View v17 = (android.view.View) obj;
        hu.b item = (hu.b) obj2;
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(item, "item");
        s15.s y17 = item.f284997e.y();
        if (y17 != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_member_inlet_source", 5);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            android.content.Context context = v17.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.lang.String authorFinderUsername = y17.getUsername();
            int i17 = com.tencent.mm.storage.z3.R4(this.f449621d.f449610e.q()) ? 3 : 2;
            kotlin.jvm.internal.o.g(authorFinderUsername, "authorFinderUsername");
            ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Nk(context, intent, authorFinderUsername, i17, 3);
        }
        return jz5.f0.f302826a;
    }
}
