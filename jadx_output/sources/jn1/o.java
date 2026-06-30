package jn1;

/* loaded from: classes11.dex */
public final class o {
    public o(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(com.tencent.mm.modelavatar.r0 updateImgFlag, boolean z17, java.lang.String source) {
        kotlin.jvm.internal.o.g(updateImgFlag, "updateImgFlag");
        kotlin.jvm.internal.o.g(source, "source");
        updateImgFlag.f70530b = z17 ? 3 : 4;
        updateImgFlag.f70533e = "";
        updateImgFlag.f70532d = "";
        updateImgFlag.f70537i = -1;
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        boolean y07 = com.tencent.mm.modelavatar.d1.Ni().y0(updateImgFlag);
        com.tencent.mars.xlog.Log.i("MicroMsg.Avatar.AvatarLoadDataFromRemotePPC", "clearImgFlagUrl user:" + updateImgFlag.e() + " existHead:" + z17 + " source:" + source + " ret:" + y07);
        return y07;
    }
}
