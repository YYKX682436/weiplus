package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class z extends com.tencent.mm.vfs.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.q2[] f213262e;

    /* renamed from: f, reason: collision with root package name */
    public final int f213263f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.CombinedFileSystem f213264g;

    public z(com.tencent.mm.vfs.CombinedFileSystem combinedFileSystem, com.tencent.mm.vfs.q2[] q2VarArr, int i17) {
        this.f213264g = combinedFileSystem;
        this.f213262e = q2VarArr;
        this.f213263f = i17;
    }

    @Override // com.tencent.mm.vfs.m0
    public java.util.List K() {
        return java.util.Arrays.asList(this.f213262e);
    }

    @Override // com.tencent.mm.vfs.m0
    public com.tencent.mm.vfs.q2 L(java.lang.String str, int i17) {
        for (com.tencent.mm.vfs.y yVar : this.f213264g.f212699f) {
            java.util.regex.Pattern pattern = yVar.f213244a;
            if (pattern == null || pattern.matcher(str).matches()) {
                return this.f213262e[yVar.f213245b];
            }
        }
        return null;
    }

    @Override // com.tencent.mm.vfs.m0, com.tencent.mm.vfs.q2
    public com.tencent.mm.vfs.o2 g(java.lang.String str) {
        return this.f213262e[r0.length - 1].g(str);
    }

    @Override // com.tencent.mm.vfs.m0, com.tencent.mm.vfs.q2
    public int o() {
        return this.f213263f;
    }

    @Override // com.tencent.mm.vfs.m0, com.tencent.mm.vfs.q2
    public boolean r(java.lang.String str) {
        boolean z17 = false;
        for (com.tencent.mm.vfs.q2 q2Var : this.f213262e) {
            z17 |= q2Var.r(str);
        }
        return z17;
    }

    @Override // com.tencent.mm.vfs.q2
    public com.tencent.mm.vfs.FileSystem y() {
        return this.f213264g;
    }
}
