package jn1;

/* loaded from: classes12.dex */
public final class v extends jn1.i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(g75.r pipeline) {
        super(pipeline);
        kotlin.jvm.internal.o.g(pipeline, "pipeline");
    }

    @Override // jn1.i
    @h75.a
    public j75.b handleAvatarCheckExpired(g75.z state, hn1.b action) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        return super.handleAvatarCheckExpired(state, action);
    }

    @Override // jn1.i, jn1.c
    @h75.a
    public j75.b handleAvatarImgFlag(g75.z state, jn1.e action) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        return super.handleAvatarImgFlag(state, action);
    }

    @Override // jn1.i, gk0.l
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
        com.tencent.mars.xlog.Log.i("MicroMsg.Avatar.HdAvatarLoadPathFlowPPC", "put small bitmap to cache " + str);
        java.lang.String str2 = (java.lang.String) state.d("Avatar_ImgPath");
        g75.z zVar = new g75.z();
        zVar.l("Avatar_ImgPath", str2);
        zVar.l("Avatar_ImgBitmap", bitmap);
        return new g75.a0(zVar);
    }

    @Override // jn1.i, gk0.l
    @h75.a
    public j75.b handleDataFromFile(g75.z state, gk0.q action) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        if (action.f272450d != null) {
            state.l("Avatar_ImgPath", action.f272449c);
        }
        return super.handleDataFromFile(state, action);
    }

    @Override // jn1.i, gk0.l
    @h75.a
    public j75.b handleDataFromRemote(g75.z state, y01.c action) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        if (action.f458588d != null) {
            state.l("Avatar_ImgPath", action.f458587c);
        }
        return super.handleDataFromRemote(state, action);
    }

    @Override // jn1.i, gk0.l, g75.f
    public j75.b l(g75.z state) {
        kotlin.jvm.internal.o.g(state, "state");
        return new jn1.d(state.k("Avatar_Username"));
    }
}
