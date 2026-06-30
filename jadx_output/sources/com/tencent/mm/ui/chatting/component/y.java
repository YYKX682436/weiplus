package com.tencent.mm.ui.chatting.component;

/* loaded from: classes14.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.component.y f200265d = new com.tencent.mm.ui.chatting.component.y();

    public y() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj).longValue();
        com.tencent.mm.ui.chatting.component.v statefulStatInfo = (com.tencent.mm.ui.chatting.component.v) obj2;
        kotlin.jvm.internal.o.g(statefulStatInfo, "statefulStatInfo");
        com.tencent.mm.ui.chatting.component.m mVar = statefulStatInfo.f200101a;
        return java.lang.Boolean.valueOf(mVar.f199465l || 0 < mVar.a());
    }
}
