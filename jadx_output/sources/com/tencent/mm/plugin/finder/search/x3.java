package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class x3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.search.x3 f125977d = new com.tencent.mm.plugin.finder.search.x3();

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
        sb6.append(com.tencent.mm.plugin.finder.assist.e9.f102145n);
        sb6.append("popular.info");
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(sb7);
        r45.cp2 cp2Var = com.tencent.mm.plugin.finder.search.y3.f125986c;
        byte[] byteArray = cp2Var != null ? cp2Var.toByteArray() : null;
        if (!com.tencent.mm.vfs.w6.j(java.lang.String.valueOf(r6Var.s()))) {
            com.tencent.mm.vfs.w6.u(java.lang.String.valueOf(r6Var.s()));
        }
        com.tencent.mm.vfs.w6.R(sb7, byteArray);
    }
}
