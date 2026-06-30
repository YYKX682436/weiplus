package lh0;

@j95.b
/* loaded from: classes10.dex */
public final class j extends i95.w implements lh0.i {
    public boolean wi(java.lang.String srcPath, int i17, int i18, java.lang.String dstPath, int i19, int i27, int i28) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(dstPath, "dstPath");
        return com.tencent.mm.plugin.voip.model.WxAMJni.pic2picF2F(srcPath, i17, dstPath, i18, i19, i27, i28) == 0;
    }
}
