package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

/* loaded from: classes12.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State f204788a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f204789b;

    public g0(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State state, java.util.List list) {
        kotlin.jvm.internal.o.g(state, "state");
        this.f204788a = state;
        this.f204789b = list;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.g0)) {
            return false;
        }
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.g0 g0Var = (com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.g0) obj;
        return kotlin.jvm.internal.o.b(this.f204788a, g0Var.f204788a) && kotlin.jvm.internal.o.b(this.f204789b, g0Var.f204789b);
    }

    public int hashCode() {
        int hashCode = this.f204788a.hashCode() * 31;
        java.util.List list = this.f204789b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public java.lang.String toString() {
        return "Next(state=" + this.f204788a + ", actions=" + this.f204789b + ')';
    }

    public /* synthetic */ g0(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State state, java.util.List list, int i17, kotlin.jvm.internal.i iVar) {
        this(state, (i17 & 2) != 0 ? null : list);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g0(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State r2, com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.f0... r3) {
        /*
            r1 = this;
            java.lang.String r0 = "state"
            kotlin.jvm.internal.o.g(r2, r0)
            java.lang.String r0 = "actions"
            kotlin.jvm.internal.o.g(r3, r0)
            java.util.List r3 = kz5.z.z0(r3)
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L18
            goto L19
        L18:
            r3 = 0
        L19:
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.g0.<init>(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView$State, com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.f0[]):void");
    }
}
