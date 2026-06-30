package zl0;

/* loaded from: classes13.dex */
public class d implements com.tencent.mm.vfs.t6 {
    public d(java.lang.String str) {
    }

    @Override // com.tencent.mm.vfs.t6
    public boolean accept(com.tencent.mm.vfs.r6 r6Var) {
        return r6Var.getName().endsWith(".zst");
    }
}
