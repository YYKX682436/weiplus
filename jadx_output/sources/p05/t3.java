package p05;

/* loaded from: classes5.dex */
public final class t3 {
    public t3(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(java.lang.String name, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(name, "name");
        com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui("ilinkres_c42c04f5", name);
        if (Ui == null) {
            return null;
        }
        int intValue = num != null ? num.intValue() : 0;
        if (Ui.f217590e >= intValue) {
            if (com.tencent.mm.vfs.w6.j(Ui.getPath())) {
                return Ui.getPath();
            }
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WeVisUDRService", "Resource version unmatched, name: " + name + ", curVer: " + Ui.f217590e + ", requiredVer: " + intValue);
        return null;
    }
}
