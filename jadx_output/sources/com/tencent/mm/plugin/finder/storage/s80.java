package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes.dex */
public final class s80 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f127531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f127532e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s80(java.util.LinkedList linkedList, kotlin.jvm.internal.f0 f0Var) {
        super(0);
        this.f127531d = linkedList;
        this.f127532e = f0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return "[checkOldConv] status, total:" + this.f127531d.size() + ", failed:" + this.f127532e.f310116d;
    }
}
