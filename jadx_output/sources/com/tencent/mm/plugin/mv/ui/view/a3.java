package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class a3 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f151777a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f151778b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f151779c;

    public a3(java.lang.String songName, java.lang.String singer, java.lang.String albumUrl, int i17, kotlin.jvm.internal.i iVar) {
        songName = (i17 & 1) != 0 ? "" : songName;
        singer = (i17 & 2) != 0 ? "" : singer;
        albumUrl = (i17 & 4) != 0 ? "" : albumUrl;
        kotlin.jvm.internal.o.g(songName, "songName");
        kotlin.jvm.internal.o.g(singer, "singer");
        kotlin.jvm.internal.o.g(albumUrl, "albumUrl");
        this.f151777a = songName;
        this.f151778b = singer;
        this.f151779c = albumUrl;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.mv.ui.view.a3)) {
            return false;
        }
        com.tencent.mm.plugin.mv.ui.view.a3 a3Var = (com.tencent.mm.plugin.mv.ui.view.a3) obj;
        return kotlin.jvm.internal.o.b(this.f151777a, a3Var.f151777a) && kotlin.jvm.internal.o.b(this.f151778b, a3Var.f151778b) && kotlin.jvm.internal.o.b(this.f151779c, a3Var.f151779c);
    }

    public int hashCode() {
        return (((this.f151777a.hashCode() * 31) + this.f151778b.hashCode()) * 31) + this.f151779c.hashCode();
    }

    public java.lang.String toString() {
        return "SongInfo(songName=" + this.f151777a + ", singer=" + this.f151778b + ", albumUrl=" + this.f151779c + ')';
    }
}
