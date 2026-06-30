package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$Event$InternalEvent$UpdateViewModel", "", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final /* data */ class ChattingMediaGroupVideoItemMvvmView$Event$InternalEvent$UpdateViewModel implements com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.Event {

    /* renamed from: a, reason: collision with root package name */
    public final b11.d f204749a;

    public ChattingMediaGroupVideoItemMvvmView$Event$InternalEvent$UpdateViewModel(b11.d viewModel) {
        kotlin.jvm.internal.o.g(viewModel, "viewModel");
        this.f204749a = viewModel;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView$Event$InternalEvent$UpdateViewModel) && kotlin.jvm.internal.o.b(this.f204749a, ((com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView$Event$InternalEvent$UpdateViewModel) obj).f204749a);
    }

    public int hashCode() {
        return this.f204749a.hashCode();
    }

    public java.lang.String toString() {
        return "UpdateViewModel(viewModel=" + this.f204749a + ')';
    }
}
