package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes2.dex */
public final class za extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f120555d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(java.lang.String str) {
        super(1);
        this.f120555d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.o.b(((com.tencent.mm.protocal.protobuf.FinderContact) obj).getUsername(), this.f120555d));
    }
}
