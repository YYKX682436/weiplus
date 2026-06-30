package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class t8 {

    /* renamed from: a, reason: collision with root package name */
    public final int f201408a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f201409b;

    /* renamed from: c, reason: collision with root package name */
    public final fk4.u f201410c;

    public t8(int i17, com.tencent.mm.storage.f9 msg, fk4.u uVar, int i18, kotlin.jvm.internal.i iVar) {
        uVar = (i18 & 4) != 0 ? null : uVar;
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f201408a = i17;
        this.f201409b = msg;
        this.f201410c = uVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.chatting.gallery.t8)) {
            return false;
        }
        com.tencent.mm.ui.chatting.gallery.t8 t8Var = (com.tencent.mm.ui.chatting.gallery.t8) obj;
        return this.f201408a == t8Var.f201408a && kotlin.jvm.internal.o.b(this.f201409b, t8Var.f201409b) && kotlin.jvm.internal.o.b(this.f201410c, t8Var.f201410c);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.f201408a) * 31) + this.f201409b.hashCode()) * 31;
        fk4.u uVar = this.f201410c;
        return hashCode + (uVar == null ? 0 : uVar.hashCode());
    }

    public java.lang.String toString() {
        return "VideoItem(position=" + this.f201408a + ", msg=" + this.f201409b + ", downloader=" + this.f201410c + ')';
    }
}
