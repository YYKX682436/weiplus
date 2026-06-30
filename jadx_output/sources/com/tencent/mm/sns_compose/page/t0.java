package com.tencent.mm.sns_compose.page;

/* loaded from: classes5.dex */
public final class t0 extends com.tencent.mm.sns_compose.page.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final n85.t f193587a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(n85.t entity) {
        super(null);
        kotlin.jvm.internal.o.g(entity, "entity");
        this.f193587a = entity;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.sns_compose.page.t0) && kotlin.jvm.internal.o.b(this.f193587a, ((com.tencent.mm.sns_compose.page.t0) obj).f193587a);
    }

    public int hashCode() {
        return this.f193587a.hashCode();
    }

    public java.lang.String toString() {
        return "Remove(entity=" + this.f193587a + ')';
    }
}
