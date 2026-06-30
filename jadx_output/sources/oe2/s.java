package oe2;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f344782a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f344783b;

    public s(java.util.List liveList, java.lang.String chatRoomId) {
        kotlin.jvm.internal.o.g(liveList, "liveList");
        kotlin.jvm.internal.o.g(chatRoomId, "chatRoomId");
        this.f344782a = liveList;
        this.f344783b = chatRoomId;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe2.s)) {
            return false;
        }
        oe2.s sVar = (oe2.s) obj;
        return kotlin.jvm.internal.o.b(this.f344782a, sVar.f344782a) && kotlin.jvm.internal.o.b(this.f344783b, sVar.f344783b);
    }

    public int hashCode() {
        return (this.f344782a.hashCode() * 31) + this.f344783b.hashCode();
    }

    public java.lang.String toString() {
        return "NewXmlFinderChatRoomLiveTipsbar(liveList=" + this.f344782a + ", chatRoomId=" + this.f344783b + ')';
    }
}
