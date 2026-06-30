package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f204819a;

    /* renamed from: b, reason: collision with root package name */
    public int f204820b;

    /* renamed from: c, reason: collision with root package name */
    public float f204821c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupBaseItemMvvmView f204822d;

    public l(int i17, int i18, float f17, com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupBaseItemMvvmView chattingMediaGroupBaseItemMvvmView, int i19, kotlin.jvm.internal.i iVar) {
        f17 = (i19 & 4) != 0 ? 0.0f : f17;
        chattingMediaGroupBaseItemMvvmView = (i19 & 8) != 0 ? null : chattingMediaGroupBaseItemMvvmView;
        this.f204819a = i17;
        this.f204820b = i18;
        this.f204821c = f17;
        this.f204822d = chattingMediaGroupBaseItemMvvmView;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.l)) {
            return false;
        }
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.l lVar = (com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.l) obj;
        return this.f204819a == lVar.f204819a && this.f204820b == lVar.f204820b && java.lang.Float.compare(this.f204821c, lVar.f204821c) == 0 && kotlin.jvm.internal.o.b(this.f204822d, lVar.f204822d);
    }

    public int hashCode() {
        int hashCode = ((((java.lang.Integer.hashCode(this.f204819a) * 31) + java.lang.Integer.hashCode(this.f204820b)) * 31) + java.lang.Float.hashCode(this.f204821c)) * 31;
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupBaseItemMvvmView chattingMediaGroupBaseItemMvvmView = this.f204822d;
        return hashCode + (chattingMediaGroupBaseItemMvvmView == null ? 0 : chattingMediaGroupBaseItemMvvmView.hashCode());
    }

    public java.lang.String toString() {
        return "SwipeState(oldIndex=" + this.f204819a + ", newIndex=" + this.f204820b + ", progress=" + this.f204821c + ", oldCenterView=" + this.f204822d + ')';
    }
}
