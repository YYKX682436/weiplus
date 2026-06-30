package com.tencent.mm.plugin.gallery.model;

/* loaded from: classes10.dex */
public class GalleryItem$AlbumItem implements android.os.Parcelable, java.lang.Comparable<com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem> {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem> CREATOR = new t23.z0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f138415d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f138416e;

    /* renamed from: f, reason: collision with root package name */
    public int f138417f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f138418g;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem f138420i;

    /* renamed from: h, reason: collision with root package name */
    public int f138419h = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f138421m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f138422n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f138423o = false;

    public GalleryItem$AlbumItem(java.lang.String str, int i17) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        str = str == null ? "" : str;
        this.f138415d = str;
        this.f138417f = i17;
        this.f138416e = str;
    }

    @Override // java.lang.Comparable
    public int compareTo(com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem galleryItem$AlbumItem) {
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem;
        com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem galleryItem$AlbumItem2 = galleryItem$AlbumItem;
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem2 = this.f138420i;
        if (galleryItem$MediaItem2 != null && (galleryItem$MediaItem = galleryItem$AlbumItem2.f138420i) != null) {
            long j17 = galleryItem$MediaItem2.f138435m;
            long j18 = galleryItem$MediaItem.f138435m;
            if (j17 == j18) {
                return java.lang.Long.compare(galleryItem$MediaItem.f138437o, galleryItem$MediaItem2.f138437o);
            }
            if (j17 <= j18) {
                return 1;
            }
        } else if (galleryItem$MediaItem2 == null) {
            return galleryItem$AlbumItem2.f138420i != null ? 1 : 0;
        }
        return -1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String h() {
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = this.f138420i;
        if (galleryItem$MediaItem != null) {
            return galleryItem$MediaItem.f138430e;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AlbumItem", "getOriginalPath mediaItem is null");
        return null;
    }

    public long i() {
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = this.f138420i;
        if (galleryItem$MediaItem != null) {
            return galleryItem$MediaItem.f138434i;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AlbumItem", "getThumbMediaOrigId mediaItem is null");
        return -1L;
    }

    public long m() {
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = this.f138420i;
        if (galleryItem$MediaItem != null) {
            return galleryItem$MediaItem.f138435m;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AlbumItem", "getThumbModifyDate mediaItem is null");
        return -1L;
    }

    public java.lang.String n() {
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = this.f138420i;
        if (galleryItem$MediaItem != null) {
            return galleryItem$MediaItem.o();
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AlbumItem", "getThumbPath mediaItem is null");
        return null;
    }

    public int o() {
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = this.f138420i;
        if (galleryItem$MediaItem != null) {
            return galleryItem$MediaItem.getType();
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AlbumItem", "getThumbType mediaItem is null");
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(java.lang.String r3) {
        /*
            r2 = this;
            r2.f138418g = r3
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.K0(r3)
            if (r3 != 0) goto Lbc
            java.lang.String r3 = r2.f138418g
            java.lang.Class<t23.j1> r0 = t23.j1.class
            i95.m r0 = i95.n0.c(r0)
            t23.j1 r0 = (t23.j1) r0
            t23.g1 r0 = (t23.g1) r0
            r0.getClass()
            java.lang.String r0 = "bucketID"
            kotlin.jvm.internal.o.g(r3, r0)
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r3)
            if (r0 != 0) goto Lb3
            r0 = 0
            int r3 = com.tencent.mm.sdk.platformtools.t8.D1(r3, r0)
            int r0 = j33.d0.f297429b
            if (r0 != r3) goto L36
            android.content.Context r3 = com.tencent.mm.sdk.platformtools.x2.f193071a
            r0 = 2131768763(0x7f1035bb, float:1.9168782E38)
            java.lang.String r3 = r3.getString(r0)
            goto Lb4
        L36:
            int r0 = j33.d0.f297430c
            if (r0 != r3) goto L45
            android.content.Context r3 = com.tencent.mm.sdk.platformtools.x2.f193071a
            r0 = 2131768737(0x7f1035a1, float:1.9168729E38)
            java.lang.String r3 = r3.getString(r0)
            goto Lb4
        L45:
            int r0 = j33.d0.f297431d
            if (r0 != r3) goto L53
            android.content.Context r3 = com.tencent.mm.sdk.platformtools.x2.f193071a
            r0 = 2131768742(0x7f1035a6, float:1.916874E38)
            java.lang.String r3 = r3.getString(r0)
            goto Lb4
        L53:
            java.util.ArrayList r0 = j33.d0.f297432e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L69
            android.content.Context r3 = com.tencent.mm.sdk.platformtools.x2.f193071a
            r0 = 2131768746(0x7f1035aa, float:1.9168747E38)
            java.lang.String r3 = r3.getString(r0)
            goto Lb4
        L69:
            java.util.ArrayList r0 = j33.d0.f297433f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L7f
            android.content.Context r3 = com.tencent.mm.sdk.platformtools.x2.f193071a
            r0 = 2131768747(0x7f1035ab, float:1.916875E38)
            java.lang.String r3 = r3.getString(r0)
            goto Lb4
        L7f:
            t23.p0 r0 = t23.p0.j()
            android.util.SparseArray r0 = r0.f415241m
            java.lang.Object r3 = r0.get(r3)
            t23.c1 r3 = (t23.c1) r3
            if (r3 == 0) goto Lb3
            java.lang.String r0 = r3.f415121a
            java.lang.String r1 = "key"
            kotlin.jvm.internal.o.f(r0, r1)
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "toLowerCase(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            java.lang.String r1 = "WeChatWork"
            boolean r0 = kotlin.jvm.internal.o.b(r0, r1)
            if (r0 == 0) goto Lb0
            android.content.Context r3 = com.tencent.mm.sdk.platformtools.x2.f193071a
            r0 = 2131768762(0x7f1035ba, float:1.916878E38)
            java.lang.String r3 = r3.getString(r0)
            goto Lb4
        Lb0:
            java.lang.String r3 = r3.f415123c
            goto Lb4
        Lb3:
            r3 = 0
        Lb4:
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r3)
            if (r0 != 0) goto Lbc
            r2.f138416e = r3
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem.r(java.lang.String):void");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f138415d);
        parcel.writeInt(this.f138417f);
        parcel.writeParcelable(this.f138420i, i17);
    }

    public GalleryItem$AlbumItem(android.os.Parcel parcel) {
        this.f138415d = parcel.readString();
        this.f138417f = parcel.readInt();
        this.f138420i = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) parcel.readParcelable(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.class.getClassLoader());
    }
}
