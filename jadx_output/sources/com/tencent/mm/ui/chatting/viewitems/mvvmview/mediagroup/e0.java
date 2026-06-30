package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

/* loaded from: classes8.dex */
public final class e0 implements com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final b11.d f204783a;

    public e0(b11.d viewModel) {
        kotlin.jvm.internal.o.g(viewModel, "viewModel");
        this.f204783a = viewModel;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.e0) && kotlin.jvm.internal.o.b(this.f204783a, ((com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.e0) obj).f204783a);
    }

    public int hashCode() {
        return this.f204783a.hashCode();
    }

    public java.lang.String toString() {
        return "UpdateThumbIfNeed(viewModel=" + this.f204783a + ')';
    }
}
