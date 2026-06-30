package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes.dex */
public final class cj0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f126592d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f126593e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj0(java.util.LinkedList linkedList, kotlin.jvm.internal.f0 f0Var) {
        super(0);
        this.f126592d = linkedList;
        this.f126593e = f0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return "[checkOldSessionInfo] status, total:" + this.f126592d.size() + ", failed:" + this.f126593e.f310116d;
    }
}
