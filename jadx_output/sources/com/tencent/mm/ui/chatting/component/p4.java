package com.tencent.mm.ui.chatting.component;

/* loaded from: classes8.dex */
public final class p4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f199672a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f199673b;

    /* renamed from: c, reason: collision with root package name */
    public int f199674c;

    public p4(java.lang.String groupId, java.util.List msgIdList, int i17, int i18, kotlin.jvm.internal.i iVar) {
        msgIdList = (i18 & 2) != 0 ? new java.util.ArrayList() : msgIdList;
        i17 = (i18 & 4) != 0 ? 0 : i17;
        kotlin.jvm.internal.o.g(groupId, "groupId");
        kotlin.jvm.internal.o.g(msgIdList, "msgIdList");
        this.f199672a = groupId;
        this.f199673b = msgIdList;
        this.f199674c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.chatting.component.p4)) {
            return false;
        }
        com.tencent.mm.ui.chatting.component.p4 p4Var = (com.tencent.mm.ui.chatting.component.p4) obj;
        return kotlin.jvm.internal.o.b(this.f199672a, p4Var.f199672a) && kotlin.jvm.internal.o.b(this.f199673b, p4Var.f199673b) && this.f199674c == p4Var.f199674c;
    }

    public int hashCode() {
        return (((this.f199672a.hashCode() * 31) + this.f199673b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f199674c);
    }

    public java.lang.String toString() {
        return "MediaGroupInfo(groupId=" + this.f199672a + ", msgIdList=" + this.f199673b + ", currentIndex=" + this.f199674c + ')';
    }
}
