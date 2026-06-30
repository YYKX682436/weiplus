package ek5;

/* loaded from: classes9.dex */
public final class b0 extends ek5.c {
    @Override // ek5.b
    public android.content.Intent c(android.content.Context context, int i17, java.lang.String content, android.content.Intent retransmitIntent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(retransmitIntent, "retransmitIntent");
        android.content.Intent c17 = super.c(context, i17, content, retransmitIntent);
        pf5.j0.a(c17, gk5.r0.class);
        return c17;
    }

    @Override // ek5.b
    public co.a d(android.content.Intent intent, n50.i param) {
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(param, "param");
        dc5.a aVar = new dc5.a();
        param.a(aVar);
        aVar.l(intent.getLongExtra("select_fav_local_id", 0L));
        l15.c cVar = new l15.c();
        cVar.fromXml(param.d());
        aVar.n(cVar);
        aVar.o(intent.getIntExtra("scene_from", 0));
        return aVar;
    }

    @Override // ek5.b
    public java.lang.Class e() {
        return gk5.s0.class;
    }

    @Override // ek5.b
    public java.lang.Class f() {
        return hk5.z.class;
    }

    @Override // ek5.b
    public int g() {
        return 49;
    }

    @Override // ek5.b
    public java.lang.Class h() {
        return dc5.a.class;
    }

    @Override // ek5.b
    public java.util.List i() {
        return kz5.b0.c(24);
    }
}
