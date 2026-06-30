package ef0;

/* loaded from: classes11.dex */
public final class j1 implements jk3.d {
    @Override // jk3.d
    public void a(int i17, com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        java.lang.Integer valueOf = multiTaskInfo != null ? java.lang.Integer.valueOf(multiTaskInfo.field_type) : null;
        byte[] bArr = multiTaskInfo != null ? multiTaskInfo.field_data : null;
        if (bArr != null) {
            if (!(bArr.length == 0)) {
                if ((valueOf != null && valueOf.intValue() == 23) || (valueOf != null && valueOf.intValue() == 24)) {
                    try {
                        bw5.zo0 zo0Var = new bw5.zo0();
                        zo0Var.parseFrom(bArr);
                        bw5.v70 v70Var = zo0Var.f36075e[1] ? zo0Var.f36074d : new bw5.v70();
                        com.tencent.mars.xlog.Log.i("MicroMsg.TingAddToPlayListFeatureService", "onMultiTaskInfoChanged " + v70Var.getListenId() + ", " + v70Var.getTitle());
                        com.tencent.pigeon.ting.TingStarItemChangeChannel tingStarItemChangeChannel = rk4.l3.f396815u;
                        if (tingStarItemChangeChannel != null) {
                            java.lang.String listenId = v70Var.getListenId();
                            kotlin.jvm.internal.o.f(listenId, "getListenId(...)");
                            tingStarItemChangeChannel.onRemoveFromStar(listenId, ef0.i1.f252230d);
                        }
                    } catch (java.lang.Exception e17) {
                        e17.toString();
                    }
                }
            }
        }
    }
}
