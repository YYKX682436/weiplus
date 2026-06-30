package q10;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lq10/m;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-nirvana_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes7.dex */
public final class m implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        byte[] byteArray;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle == null || (byteArray = bundle.getByteArray("key_jump_info_bytes")) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicEcsNirvanaPreloadTask", "MagicEcsNirvanaPreloadTask, jumpInfoBytes is null");
            if (rVar != null) {
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCVoid());
                return;
            }
            return;
        }
        try {
            ((g10.v) ((c00.i4) i95.n0.c(c00.i4.class))).Ai(new bw5.x7().parseFrom(byteArray));
            if (rVar != null) {
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCVoid());
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicEcsNirvanaPreloadTask", "MagicEcsNirvanaPreloadTask, parse jumpInfo failed: " + e17.getMessage());
            if (rVar != null) {
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCVoid());
            }
        }
    }
}
