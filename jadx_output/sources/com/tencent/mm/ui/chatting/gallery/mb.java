package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class mb {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.gallery.s8 f201203a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f201204b;

    /* renamed from: c, reason: collision with root package name */
    public final fk4.u f201205c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f201206d;

    public mb(com.tencent.mm.ui.chatting.gallery.s8 currentPlayMode, boolean z17, fk4.u uVar, com.tencent.mm.storage.f9 f9Var) {
        kotlin.jvm.internal.o.g(currentPlayMode, "currentPlayMode");
        this.f201203a = currentPlayMode;
        this.f201204b = z17;
        this.f201205c = uVar;
        this.f201206d = f9Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.chatting.gallery.mb)) {
            return false;
        }
        com.tencent.mm.ui.chatting.gallery.mb mbVar = (com.tencent.mm.ui.chatting.gallery.mb) obj;
        return this.f201203a == mbVar.f201203a && this.f201204b == mbVar.f201204b && kotlin.jvm.internal.o.b(this.f201205c, mbVar.f201205c) && kotlin.jvm.internal.o.b(this.f201206d, mbVar.f201206d);
    }

    public int hashCode() {
        int hashCode = ((this.f201203a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f201204b)) * 31;
        fk4.u uVar = this.f201205c;
        int hashCode2 = (hashCode + (uVar == null ? 0 : uVar.hashCode())) * 31;
        com.tencent.mm.storage.f9 f9Var = this.f201206d;
        return hashCode2 + (f9Var != null ? f9Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "DebugDependencies(currentPlayMode=" + this.f201203a + ", isPlayRawVideo=" + this.f201204b + ", downloader=" + this.f201205c + ", currentMsg=" + this.f201206d + ')';
    }
}
