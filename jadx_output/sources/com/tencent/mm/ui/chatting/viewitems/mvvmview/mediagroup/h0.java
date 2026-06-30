package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

/* loaded from: classes12.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final b11.f f204798a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f204799b;

    /* renamed from: c, reason: collision with root package name */
    public final t21.v2 f204800c;

    /* renamed from: d, reason: collision with root package name */
    public final fk4.u f204801d;

    public h0(b11.f mediaInfo, com.tencent.mm.storage.f9 msgInfo, t21.v2 videoInfo, fk4.u videoDownloader) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        kotlin.jvm.internal.o.g(videoInfo, "videoInfo");
        kotlin.jvm.internal.o.g(videoDownloader, "videoDownloader");
        this.f204798a = mediaInfo;
        this.f204799b = msgInfo;
        this.f204800c = videoInfo;
        this.f204801d = videoDownloader;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.h0)) {
            return false;
        }
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.h0 h0Var = (com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.h0) obj;
        return kotlin.jvm.internal.o.b(this.f204798a, h0Var.f204798a) && kotlin.jvm.internal.o.b(this.f204799b, h0Var.f204799b) && kotlin.jvm.internal.o.b(this.f204800c, h0Var.f204800c) && kotlin.jvm.internal.o.b(this.f204801d, h0Var.f204801d);
    }

    public int hashCode() {
        return (((((this.f204798a.hashCode() * 31) + this.f204799b.hashCode()) * 31) + this.f204800c.hashCode()) * 31) + this.f204801d.hashCode();
    }

    public java.lang.String toString() {
        return "PrepareContext(mediaInfo=" + this.f204798a + ", msgInfo=" + this.f204799b + ", videoInfo=" + this.f204800c + ", videoDownloader=" + this.f204801d + ')';
    }
}
