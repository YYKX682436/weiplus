package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class t implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderContact f135948d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f135949e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f135950f;

    public t(com.tencent.mm.protocal.protobuf.FinderContact contact, java.lang.String friend_follow_count_text, java.util.List objects) {
        kotlin.jvm.internal.o.g(contact, "contact");
        kotlin.jvm.internal.o.g(friend_follow_count_text, "friend_follow_count_text");
        kotlin.jvm.internal.o.g(objects, "objects");
        this.f135948d = contact;
        this.f135949e = friend_follow_count_text;
        this.f135950f = objects;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        if (!(obj instanceof com.tencent.mm.plugin.finder.viewmodel.component.t)) {
            return 0;
        }
        java.lang.String username = this.f135948d.getUsername();
        int hashCode = username != null ? username.hashCode() : 0;
        java.lang.String username2 = ((com.tencent.mm.plugin.finder.viewmodel.component.t) obj).f135948d.getUsername();
        return kotlin.jvm.internal.o.i(hashCode, username2 != null ? username2.hashCode() : 0);
    }

    @Override // in5.c
    public long getItemId() {
        return this.f135948d.getUsername() != null ? r0.hashCode() : 0;
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
