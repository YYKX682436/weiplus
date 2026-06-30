package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class g4 implements pm5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.io.File f212951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.h4 f212952e;

    public g4(com.tencent.mm.vfs.h4 h4Var, java.io.File file) {
        this.f212952e = h4Var;
        this.f212951d = file;
    }

    @Override // pm5.j
    public java.lang.Object d(java.lang.Object obj) {
        return this.f212952e.K(new java.io.File(this.f212951d, (java.lang.String) obj));
    }
}
