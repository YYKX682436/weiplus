package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

/* loaded from: classes8.dex */
public final class y implements com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final b11.d f204876a;

    public y(b11.d viewModel) {
        kotlin.jvm.internal.o.g(viewModel, "viewModel");
        this.f204876a = viewModel;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.y) && kotlin.jvm.internal.o.b(this.f204876a, ((com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.y) obj).f204876a);
    }

    public int hashCode() {
        return this.f204876a.hashCode();
    }

    public java.lang.String toString() {
        return "PreloadPrepareContext(viewModel=" + this.f204876a + ')';
    }
}
