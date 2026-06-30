package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class a7 implements com.tencent.mm.ui.chatting.gallery.e2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f200785a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f200786b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f200787c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f200788d;

    public a7(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI, com.tencent.mm.storage.f9 f9Var, boolean z17, java.lang.Runnable runnable) {
        this.f200788d = imageGalleryUI;
        this.f200785a = f9Var;
        this.f200786b = z17;
        this.f200787c = runnable;
    }

    @Override // com.tencent.mm.ui.chatting.gallery.e2
    public void a() {
        this.f200788d.runOnUiThread(new com.tencent.mm.ui.chatting.gallery.z6(this));
    }
}
