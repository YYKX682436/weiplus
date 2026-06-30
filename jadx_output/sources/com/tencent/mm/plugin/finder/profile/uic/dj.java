package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes.dex */
public final class dj extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f123634d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj(long j17) {
        super(1);
        this.f123634d = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        so2.j5 it = (so2.j5) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(it.getItemId() == this.f123634d);
    }
}
