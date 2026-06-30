package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class nb {

    /* renamed from: a, reason: collision with root package name */
    public final long f201227a;

    /* renamed from: b, reason: collision with root package name */
    public final long f201228b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f201229c;

    public nb(long j17, long j18, boolean z17) {
        this.f201227a = j17;
        this.f201228b = j18;
        this.f201229c = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.chatting.gallery.nb)) {
            return false;
        }
        com.tencent.mm.ui.chatting.gallery.nb nbVar = (com.tencent.mm.ui.chatting.gallery.nb) obj;
        return this.f201227a == nbVar.f201227a && this.f201228b == nbVar.f201228b && this.f201229c == nbVar.f201229c;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f201227a) * 31) + java.lang.Long.hashCode(this.f201228b)) * 31) + java.lang.Boolean.hashCode(this.f201229c);
    }

    public java.lang.String toString() {
        return "DownloadInfo(downloadedBytes=" + this.f201227a + ", totalBytes=" + this.f201228b + ", isConfirmedComplete=" + this.f201229c + ')';
    }
}
