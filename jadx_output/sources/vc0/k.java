package vc0;

/* loaded from: classes10.dex */
public final class k implements i21.o {
    @Override // i21.o
    public void a(boolean z17, java.util.LinkedList imgInfoList) {
        kotlin.jvm.internal.o.g(imgInfoList, "imgInfoList");
        com.tencent.mars.xlog.Log.i("MicroMsg.ExtensionsForRemark", "upload cdn finish, succeed:%s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            com.tencent.mm.sdk.platformtools.u3.h(new vc0.j(imgInfoList));
        }
    }
}
