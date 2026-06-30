package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

/* loaded from: classes8.dex */
public final class w implements com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final b11.d f204870a;

    public w(b11.d viewModel) {
        kotlin.jvm.internal.o.g(viewModel, "viewModel");
        this.f204870a = viewModel;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.w) && kotlin.jvm.internal.o.b(this.f204870a, ((com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.w) obj).f204870a);
    }

    public int hashCode() {
        return this.f204870a.hashCode();
    }

    public java.lang.String toString() {
        return "BindNewViewModel(viewModel=" + this.f204870a + ')';
    }
}
