package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes12.dex */
public abstract class n4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f191790a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f191791b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f191792c;

    public n4(com.tencent.mm.pluginsdk.ui.tools.r4 r4Var, int i17, xu5.b bVar) {
        this.f191790a = java.lang.Math.max(1, i17);
        this.f191792c = new com.tencent.mm.pluginsdk.ui.tools.m4(this, bVar, r4Var);
    }

    public abstract java.lang.Object a();
}
