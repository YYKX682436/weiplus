package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class w4 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201534a;

    public w4(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f201534a = imageGalleryUI;
    }

    @Override // ly1.a
    public java.util.Map b(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("clk_play_status", java.lang.Integer.valueOf(this.f201534a.z8() ? 2 : 1));
        return hashMap;
    }
}
