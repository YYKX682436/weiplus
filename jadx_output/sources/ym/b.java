package ym;

/* loaded from: classes7.dex */
public class b implements com.tencent.mm.vfs.t6 {
    public b(java.lang.String str) {
    }

    @Override // com.tencent.mm.vfs.t6
    public boolean accept(com.tencent.mm.vfs.r6 r6Var) {
        return r6Var.getName().endsWith(".zst");
    }
}
