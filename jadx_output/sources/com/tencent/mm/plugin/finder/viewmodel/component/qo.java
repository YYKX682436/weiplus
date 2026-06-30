package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes5.dex */
public final class qo {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f135724a;

    /* renamed from: b, reason: collision with root package name */
    public final wp0.b f135725b;

    public qo(android.view.View view, wp0.b meta) {
        kotlin.jvm.internal.o.g(meta, "meta");
        this.f135724a = view;
        this.f135725b = meta;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.viewmodel.component.qo)) {
            return false;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.qo qoVar = (com.tencent.mm.plugin.finder.viewmodel.component.qo) obj;
        return kotlin.jvm.internal.o.b(this.f135724a, qoVar.f135724a) && kotlin.jvm.internal.o.b(this.f135725b, qoVar.f135725b);
    }

    public int hashCode() {
        android.view.View view = this.f135724a;
        return ((view == null ? 0 : view.hashCode()) * 31) + this.f135725b.hashCode();
    }

    public java.lang.String toString() {
        return "EmojiView(view=" + this.f135724a + ", meta=" + this.f135725b + ')';
    }
}
