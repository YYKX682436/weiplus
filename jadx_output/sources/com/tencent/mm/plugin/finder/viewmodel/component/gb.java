package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class gb extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f134488d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(long j17) {
        super(1);
        this.f134488d = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return java.lang.Boolean.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.fb) obj).f134388c < this.f134488d);
    }
}
