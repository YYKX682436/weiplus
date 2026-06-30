package jn1;

/* loaded from: classes12.dex */
public final class a0 extends jn1.z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(g75.r pipeline) {
        super(pipeline);
        kotlin.jvm.internal.o.g(pipeline, "pipeline");
    }

    @Override // jn1.z
    @h75.a
    public j75.b handleAvatarCheckExpired(g75.z state, hn1.b action) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        com.tencent.mm.vfs.r6 r6Var = (com.tencent.mm.vfs.r6) state.i("Common_TempFolder");
        java.lang.String k17 = state.k("Avatar_Username");
        int ordinal = action.f282446b.ordinal();
        java.lang.String str = action.f282447c;
        if (ordinal != 0) {
            if (ordinal != 1) {
                return new g75.v(null, 1, null);
            }
            java.lang.String o17 = new com.tencent.mm.vfs.r6(r6Var, str).o();
            kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
            return new y01.b(k17, o17);
        }
        java.lang.String o18 = new com.tencent.mm.vfs.r6(r6Var, str).o();
        kotlin.jvm.internal.o.f(o18, "getAbsolutePath(...)");
        g75.z zVar = new g75.z();
        zVar.l("Avatar_HdImgPath", o18);
        return new g75.a0(zVar);
    }

    @Override // jn1.z, jn1.c
    @h75.a
    public j75.b handleAvatarImgFlag(g75.z state, jn1.e action) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        return super.handleAvatarImgFlag(state, action);
    }

    @Override // jn1.z, gk0.l
    @h75.a
    public j75.b handleDataFromRemote(g75.z state, y01.c action) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        if (action.f458588d == null) {
            return new g75.v(null, 1, null);
        }
        g75.z zVar = new g75.z();
        zVar.l("Avatar_HdImgPath", action.f458587c);
        return new g75.a0(zVar);
    }

    @Override // jn1.z, gk0.l, g75.f
    public j75.b l(g75.z state) {
        kotlin.jvm.internal.o.g(state, "state");
        return new jn1.d(state.k("Avatar_Username"));
    }
}
