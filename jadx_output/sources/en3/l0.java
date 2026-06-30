package en3;

@j95.b
/* loaded from: classes8.dex */
public final class l0 extends jm0.o implements en3.u {
    public l0() {
        jz5.h.a(jz5.i.f302830e, en3.i0.f255303d);
    }

    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        set.add(jn3.p.class);
        set.add(jn3.q.class);
        set.add(jn3.m.class);
        set.add(jn3.g.class);
        set.add(jn3.o.class);
    }

    @Override // jm0.o
    public void Ni(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // jm0.o
    public void Ui(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String str = ta0.a.f416596a;
        com.tencent.mm.vfs.w6.u(ta0.a.f416596a);
        com.tencent.mm.vfs.w6.u(ta0.a.f416597b);
        com.tencent.mm.vfs.w6.u(ta0.a.f416598c);
    }

    @Override // jm0.o
    public void Vi() {
    }

    @Override // jm0.o, i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        com.tencent.wechat.aff.newlife.NewlifeActionOnLoader.getInstance().registerAffNewLifeActionManager(fn3.c.class);
    }
}
