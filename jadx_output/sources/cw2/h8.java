package cw2;

/* loaded from: classes2.dex */
public final class h8 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FeedData f223745a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f223746b;

    /* renamed from: c, reason: collision with root package name */
    public final mn2.g4 f223747c;

    /* renamed from: d, reason: collision with root package name */
    public final int f223748d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f223749e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f223750f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f223751g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f223752h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f223753i;

    /* renamed from: j, reason: collision with root package name */
    public final r45.dd4 f223754j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f223755k;

    public h8(com.tencent.mm.plugin.finder.storage.FeedData feed, java.lang.String mediaId, mn2.g4 media, int i17, java.util.LinkedList mediaList, boolean z17, boolean z18, boolean z19, boolean z27, r45.dd4 dd4Var, boolean z28, int i18, kotlin.jvm.internal.i iVar) {
        z19 = (i18 & 128) != 0 ? false : z19;
        z27 = (i18 & 256) != 0 ? false : z27;
        dd4Var = (i18 & 512) != 0 ? null : dd4Var;
        z28 = (i18 & 1024) != 0 ? false : z28;
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(media, "media");
        kotlin.jvm.internal.o.g(mediaList, "mediaList");
        this.f223745a = feed;
        this.f223746b = mediaId;
        this.f223747c = media;
        this.f223748d = i17;
        this.f223749e = mediaList;
        this.f223750f = z17;
        this.f223751g = z18;
        this.f223752h = z19;
        this.f223753i = z27;
        this.f223754j = dd4Var;
        this.f223755k = z28;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw2.h8)) {
            return false;
        }
        cw2.h8 h8Var = (cw2.h8) obj;
        return kotlin.jvm.internal.o.b(this.f223745a, h8Var.f223745a) && kotlin.jvm.internal.o.b(this.f223746b, h8Var.f223746b) && kotlin.jvm.internal.o.b(this.f223747c, h8Var.f223747c) && this.f223748d == h8Var.f223748d && kotlin.jvm.internal.o.b(this.f223749e, h8Var.f223749e) && this.f223750f == h8Var.f223750f && this.f223751g == h8Var.f223751g && this.f223752h == h8Var.f223752h && this.f223753i == h8Var.f223753i && kotlin.jvm.internal.o.b(this.f223754j, h8Var.f223754j) && this.f223755k == h8Var.f223755k;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((this.f223745a.hashCode() * 31) + this.f223746b.hashCode()) * 31) + this.f223747c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f223748d)) * 31) + this.f223749e.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f223750f)) * 31) + java.lang.Boolean.hashCode(this.f223751g)) * 31) + java.lang.Boolean.hashCode(this.f223752h)) * 31) + java.lang.Boolean.hashCode(this.f223753i)) * 31;
        r45.dd4 dd4Var = this.f223754j;
        return ((hashCode + (dd4Var == null ? 0 : dd4Var.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f223755k);
    }

    public java.lang.String toString() {
        return "PlayInfo(feed=" + this.f223745a + ", mediaId=" + this.f223746b + ", media=" + this.f223747c + ", position=" + this.f223748d + ", mediaList=" + this.f223749e + ", isLocal=" + this.f223750f + ", isFocusPlaying=" + this.f223751g + ", isSeekMode=" + this.f223752h + ", isHasPlayed=" + this.f223753i + ", cropInfo=" + this.f223754j + ", pauseWhenSeek=" + this.f223755k + ')';
    }
}
