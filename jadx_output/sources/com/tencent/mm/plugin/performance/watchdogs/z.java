package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes12.dex */
public enum z {
    GLOBAL(new java.lang.String[0]),
    FOREGROUND(new java.lang.String[0]),
    BACKGROUND(new java.lang.String[0]),
    /* JADX INFO: Fake field, exist only in values array */
    VOIP("VideoActivity", "VoipCSMainUI", "MultiTalkMainUI", "VoipScoreDialog"),
    /* JADX INFO: Fake field, exist only in values array */
    SNS("Sns.*UI", "SnsOnlineVideoActivity"),
    /* JADX INFO: Fake field, exist only in values array */
    FINDER("Finder.*UI"),
    /* JADX INFO: Fake field, exist only in values array */
    ALBUM_GALLERY("AlbumPreviewUI", "ImagePreviewUI", "ImageGalleryUI"),
    /* JADX INFO: Fake field, exist only in values array */
    STORY("Story.*UI"),
    /* JADX INFO: Fake field, exist only in values array */
    RECORD("MMRecordUI"),
    /* JADX INFO: Fake field, exist only in values array */
    FINDER_LIVE(".*Live.*UI", "NearbyUI"),
    LAUNCHER_BACKGROUND(new java.lang.String[0]);


    /* renamed from: t, reason: collision with root package name */
    public static final int f153157t = Integer.MIN_VALUE >> values().length;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f153159d;

    /* renamed from: e, reason: collision with root package name */
    public int f153160e;

    /* renamed from: f, reason: collision with root package name */
    public int f153161f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f153162g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f153163h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f153164i = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f153165m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f153166n = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f153167o = false;

    z(java.lang.String... strArr) {
        int i17 = com.tencent.mm.plugin.performance.watchdogs.y.f153152a;
        com.tencent.mm.plugin.performance.watchdogs.y.f153152a = i17 + 1;
        this.f153160e = Integer.MIN_VALUE >>> i17;
        this.f153159d = java.util.Arrays.asList(strArr);
    }

    public static java.util.List a(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mm.plugin.performance.watchdogs.z zVar : values()) {
            java.util.Iterator it = zVar.f153159d.iterator();
            while (true) {
                if (it.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it.next();
                    if (!zVar.f153167o && str.matches(str2)) {
                        zVar.name();
                        arrayList.add(zVar);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }
}
