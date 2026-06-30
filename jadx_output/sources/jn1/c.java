package jn1;

/* loaded from: classes12.dex */
public abstract class c extends gk0.l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g75.r pipeline) {
        super(pipeline);
        kotlin.jvm.internal.o.g(pipeline, "pipeline");
    }

    @Override // g75.f, g75.t
    public void c() {
        super.c();
        f(jn1.b.f300486d);
    }

    @h75.a
    public j75.b handleAvatarImgFlag(g75.z state, jn1.e action) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        com.tencent.mm.vfs.r6 r6Var = (com.tencent.mm.vfs.r6) state.i("Common_TempFolder");
        com.tencent.mm.modelavatar.r0 r0Var = action.f300491b;
        if (r0Var == null) {
            return new g75.v(null, 1, null);
        }
        java.lang.String e17 = r0Var.e();
        kotlin.jvm.internal.o.f(e17, "getUsername(...)");
        return new hn1.a(e17, r6Var);
    }

    @Override // gk0.l, g75.f
    public java.lang.String i() {
        return h().k("Common_ImageKey");
    }
}
