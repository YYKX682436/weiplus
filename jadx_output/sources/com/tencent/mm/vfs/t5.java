package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class t5 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.vfs.a0 f213187a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Object f213188b;

    public t5(com.tencent.mm.vfs.a0 a0Var) {
        this.f213187a = a0Var;
    }

    public java.lang.Object a(java.util.Map map, java.lang.String str) {
        if (this.f213188b == null) {
            this.f213188b = this.f213187a.b(map);
            com.tencent.stubs.logger.Log.i("VFS.FileSystemManager", "configure: " + str + " => " + this.f213188b);
        }
        return this.f213188b;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.tencent.mm.vfs.t5) {
            if (this.f213187a.equals(((com.tencent.mm.vfs.t5) obj).f213187a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return com.tencent.mm.vfs.t5.class.hashCode() ^ this.f213187a.hashCode();
    }

    public java.lang.String toString() {
        com.tencent.mm.vfs.a0 a0Var = this.f213187a;
        return a0Var == null ? "[NULL]" : a0Var.toString();
    }

    public t5(com.tencent.mm.vfs.t5 t5Var) {
        this.f213187a = t5Var.f213187a;
        this.f213188b = null;
    }
}
