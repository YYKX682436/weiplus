package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class d4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f212896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.e4 f212897e;

    public d4(com.tencent.mm.vfs.e4 e4Var) {
        this.f212897e = e4Var;
        this.f212896d = new pm5.m(e4Var.f212906d.iterator(), e4Var, e4Var, false);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        try {
            return ((pm5.m) this.f212896d).hasNext();
        } catch (java.lang.RuntimeException e17) {
            com.tencent.stubs.logger.Log.w("VFS.NativeFileSystem", e17, "Cannot iterate through directory: " + this.f212897e.f212907e.toString());
            return false;
        }
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        return ((pm5.m) this.f212896d).next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("remove");
    }
}
