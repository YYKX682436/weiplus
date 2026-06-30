package jn1;

/* loaded from: classes12.dex */
public final class y extends jn1.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(g75.r pipeline) {
        super(pipeline);
        kotlin.jvm.internal.o.g(pipeline, "pipeline");
    }

    @h75.a
    public final j75.b handleAvatarCheckExpired(g75.z state, hn1.b action) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        com.tencent.mm.vfs.r6 r6Var = (com.tencent.mm.vfs.r6) state.i("Common_TempFolder");
        java.lang.String k17 = state.k("Common_ImageKey");
        int ordinal = action.f282446b.ordinal();
        if (ordinal == 0) {
            return new g75.a0(null, 1, null);
        }
        if (ordinal == 1) {
            java.lang.String o17 = new com.tencent.mm.vfs.r6(r6Var, action.f282447c).o();
            kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
            return new y01.b(k17, o17);
        }
        if (ordinal != 2) {
            return new g75.v(null, 1, null);
        }
        ((hn1.s) ((kv.b0) i95.n0.c(kv.b0.class))).pj(k17);
        return new g75.a0(null, 1, null);
    }

    @Override // jn1.c
    @h75.a
    public j75.b handleAvatarImgFlag(g75.z state, jn1.e action) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        return super.handleAvatarImgFlag(state, action);
    }

    @Override // gk0.l
    @h75.a
    public j75.b handleConvertDataToBitmap(g75.z state, gk0.e action) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        android.graphics.Bitmap bitmap = action.f272421c;
        if (bitmap == null) {
            return new g75.v(null, 1, null);
        }
        ((hn1.s) ((kv.b0) i95.n0.c(kv.b0.class))).rj(action.f272420b, bitmap);
        g75.z zVar = new g75.z();
        zVar.l("Avatar_ImgBitmap", bitmap);
        return new g75.a0(zVar);
    }

    @Override // gk0.l
    @h75.a
    public j75.b handleDataFromRemote(g75.z state, y01.c action) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        if (action.f458588d != null) {
            state.l("Avatar_ImgPath", action.f458587c);
        }
        return super.handleDataFromRemote(state, action);
    }

    @Override // gk0.l, g75.f
    public j75.b l(g75.z state) {
        kotlin.jvm.internal.o.g(state, "state");
        return new jn1.d(state.k("Avatar_Username"));
    }
}
