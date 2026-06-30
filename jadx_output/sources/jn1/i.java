package jn1;

/* loaded from: classes12.dex */
public class i extends jn1.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g75.r pipeline) {
        super(pipeline);
        kotlin.jvm.internal.o.g(pipeline, "pipeline");
    }

    @h75.a
    public j75.b handleAvatarCheckExpired(g75.z state, hn1.b action) {
        j75.b pVar;
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        com.tencent.mm.vfs.r6 r6Var = (com.tencent.mm.vfs.r6) state.i("Common_TempFolder");
        java.lang.String k17 = state.k("Common_ImageKey");
        int ordinal = action.f282446b.ordinal();
        java.lang.String str = action.f282447c;
        if (ordinal == 0) {
            java.lang.String o17 = new com.tencent.mm.vfs.r6(r6Var, str).o();
            kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
            pVar = new gk0.p(k17, o17);
        } else {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    return new g75.v(null, 1, null);
                }
                ((hn1.s) ((kv.b0) i95.n0.c(kv.b0.class))).pj(k17);
                return new g75.a0(null, 1, null);
            }
            java.lang.String o18 = new com.tencent.mm.vfs.r6(r6Var, str).o();
            kotlin.jvm.internal.o.f(o18, "getAbsolutePath(...)");
            pVar = new y01.b(k17, o18);
        }
        return pVar;
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
        hn1.s sVar = (hn1.s) ((kv.b0) i95.n0.c(kv.b0.class));
        java.lang.String str = action.f272420b;
        sVar.rj(str, bitmap);
        com.tencent.mars.xlog.Log.i("MicroMsg.Avatar.AvatarLoadBitmapFlowPPC", "put small bitmap to cache " + str);
        g75.z zVar = new g75.z();
        zVar.l("Avatar_ImgBitmap", bitmap);
        return new g75.a0(zVar);
    }

    @Override // gk0.l
    @h75.a
    public j75.b handleDataFromFile(g75.z state, gk0.q action) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        if (action.f272450d != null) {
            state.l("Avatar_ImgPath", action.f272449c);
        }
        return super.handleDataFromFile(state, action);
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
        java.lang.String k17 = state.k("Common_ImageKey");
        java.lang.String k18 = state.k("Avatar_Username");
        android.graphics.Bitmap Ui = ((hn1.s) ((kv.b0) i95.n0.c(kv.b0.class))).Ui(k17);
        if (Ui == null) {
            return new jn1.d(k18);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Avatar.AvatarLoadBitmapFlowPPC", "hit small bitmap cache " + k17);
        g75.z zVar = new g75.z();
        zVar.l("Avatar_ImgBitmap", Ui);
        return new g75.a0(zVar);
    }
}
