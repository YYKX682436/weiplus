package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

/* loaded from: classes12.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public android.graphics.Bitmap f204809a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView f204810b;

    public i0(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView chattingMediaGroupVideoItemMvvmView) {
        this.f204810b = chattingMediaGroupVideoItemMvvmView;
    }

    public final void a(android.graphics.Bitmap bitmap, boolean z17) {
        this.f204809a = bitmap;
        if (z17) {
            return;
        }
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView chattingMediaGroupVideoItemMvvmView = this.f204810b;
        if (bitmap == null) {
            em.t tVar = chattingMediaGroupVideoItemMvvmView.f204738y;
            if (tVar != null) {
                tVar.c().setImageResource(com.tencent.mm.R.color.f478490b);
                return;
            } else {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
        }
        em.t tVar2 = chattingMediaGroupVideoItemMvvmView.f204738y;
        if (tVar2 != null) {
            tVar2.c().setImageBitmap(bitmap);
        } else {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
    }
}
