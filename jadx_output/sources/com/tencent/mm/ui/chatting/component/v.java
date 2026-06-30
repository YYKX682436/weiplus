package com.tencent.mm.ui.chatting.component;

/* loaded from: classes14.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.component.m f200101a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f200102b;

    public v(com.tencent.mm.ui.chatting.component.m statInfo) {
        kotlin.jvm.internal.o.g(statInfo, "statInfo");
        this.f200101a = statInfo;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.ui.chatting.component.v) && kotlin.jvm.internal.o.b(this.f200101a, ((com.tencent.mm.ui.chatting.component.v) obj).f200101a);
    }

    public int hashCode() {
        return this.f200101a.hashCode();
    }

    public java.lang.String toString() {
        return "StatefulAppMsgWxaStatInfo(statInfo=" + this.f200101a + ')';
    }
}
