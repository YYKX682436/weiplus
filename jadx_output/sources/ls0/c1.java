package ls0;

/* loaded from: classes.dex */
public final class c1 {
    public c1(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(java.lang.String file) {
        kotlin.jvm.internal.o.g(file, "file");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            java.lang.String str = gm0.j1.u().h() + "videoMix/";
            com.tencent.mm.vfs.w6.u(str);
            return str + com.tencent.mm.vfs.w6.p(file) + "_cp_video.temp";
        }
        java.lang.String str2 = com.tencent.mm.storage.v3.f196273a + "tmp";
        if (!com.tencent.mm.vfs.w6.j(str2)) {
            com.tencent.mm.vfs.w6.u(str2);
        }
        return str2 + '/' + com.tencent.mm.vfs.w6.p(file) + "_cp_video.temp";
    }
}
