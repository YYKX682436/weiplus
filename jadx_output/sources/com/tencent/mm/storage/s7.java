package com.tencent.mm.storage;

/* loaded from: classes4.dex */
public class s7 {

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.storage.s7 f195299c = new com.tencent.mm.storage.s7("timeline");

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.storage.s7 f195300d = new com.tencent.mm.storage.s7("album_friend");

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.storage.s7 f195301e = new com.tencent.mm.storage.s7("album_self");

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.storage.s7 f195302f = new com.tencent.mm.storage.s7("album_stranger");

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.storage.s7 f195303g = new com.tencent.mm.storage.s7("profile_friend");

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.storage.s7 f195304h = new com.tencent.mm.storage.s7("profile_stranger");

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mm.storage.s7 f195305i = new com.tencent.mm.storage.s7(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_COMMENT);

    /* renamed from: j, reason: collision with root package name */
    public static final com.tencent.mm.storage.s7 f195306j = new com.tencent.mm.storage.s7("comment_detail");

    /* renamed from: k, reason: collision with root package name */
    public static final com.tencent.mm.storage.s7 f195307k = new com.tencent.mm.storage.s7("other");

    /* renamed from: l, reason: collision with root package name */
    public static final com.tencent.mm.storage.s7 f195308l = new com.tencent.mm.storage.s7("snssight");

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.mm.storage.s7 f195309m = new com.tencent.mm.storage.s7("fts");

    /* renamed from: n, reason: collision with root package name */
    public static final com.tencent.mm.storage.s7 f195310n = new com.tencent.mm.storage.s7("storysight");

    /* renamed from: o, reason: collision with root package name */
    public static final com.tencent.mm.storage.s7 f195311o = new com.tencent.mm.storage.s7("storyalbum");

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f195312a;

    /* renamed from: b, reason: collision with root package name */
    public int f195313b = 0;

    public s7(java.lang.String str) {
        this.f195312a = "";
        this.f195312a = str;
    }

    public static com.tencent.mm.storage.s7 a() {
        return new com.tencent.mm.storage.s7("album_self");
    }

    public static com.tencent.mm.storage.s7 c() {
        return new com.tencent.mm.storage.s7("snssight");
    }

    public static com.tencent.mm.storage.s7 d() {
        return new com.tencent.mm.storage.s7("timeline");
    }

    public com.tencent.mm.storage.s7 b(int i17) {
        this.f195313b = i17;
        return this;
    }

    public boolean equals(java.lang.Object obj) {
        return obj instanceof com.tencent.mm.storage.s7 ? ((com.tencent.mm.storage.s7) obj).f195312a.equals(this.f195312a) : super.equals(obj);
    }

    public java.lang.String toString() {
        return this.f195312a + "@" + this.f195313b;
    }
}
