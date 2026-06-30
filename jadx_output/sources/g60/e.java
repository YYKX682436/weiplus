package g60;

@j95.b
/* loaded from: classes8.dex */
public class e extends i95.w implements h60.i {
    public java.util.List wi() {
        if (com.tencent.mm.plugin.game.commlib.i.e() != null) {
            m53.c0 c0Var = com.tencent.mm.plugin.game.commlib.i.f139381a.DownloadIntercept;
            if (c0Var != null) {
                java.util.LinkedList<m53.y5> linkedList = c0Var.f323592d;
                if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (m53.y5 y5Var : linkedList) {
                        if (y5Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(y5Var.f324212d)) {
                            arrayList.add(y5Var.f324212d);
                        }
                    }
                    return arrayList;
                }
            }
        } else {
            com.tencent.mm.plugin.game.commlib.i.s();
        }
        return null;
    }
}
