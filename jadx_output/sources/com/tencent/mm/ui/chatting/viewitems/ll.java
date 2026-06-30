package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public final class ll {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f204492a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f204493b;

    public ll(java.lang.String topic, java.lang.String content) {
        kotlin.jvm.internal.o.g(topic, "topic");
        kotlin.jvm.internal.o.g(content, "content");
        this.f204492a = topic;
        this.f204493b = content;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.chatting.viewitems.ll)) {
            return false;
        }
        com.tencent.mm.ui.chatting.viewitems.ll llVar = (com.tencent.mm.ui.chatting.viewitems.ll) obj;
        return kotlin.jvm.internal.o.b(this.f204492a, llVar.f204492a) && kotlin.jvm.internal.o.b(this.f204493b, llVar.f204493b);
    }

    public int hashCode() {
        return (this.f204492a.hashCode() * 31) + this.f204493b.hashCode();
    }

    public java.lang.String toString() {
        return "InfoItem(topic=" + this.f204492a + ", content=" + this.f204493b + ')';
    }
}
