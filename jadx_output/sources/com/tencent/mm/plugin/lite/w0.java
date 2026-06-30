package com.tencent.mm.plugin.lite;

/* loaded from: classes15.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem f144572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144573e;

    public w0(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem, java.lang.String str) {
        this.f144572d = galleryItem$MediaItem;
        this.f144573e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.lite.w.m(this.f144572d, this.f144573e);
    }
}
