package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public abstract class n4 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f213084a = {10, 20};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f213085b = {11, 21};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f213086c = {12, 22};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f213087d = {13, 23};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f213088e = {14, 24};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f213089f = {15, 25};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f213090g = {16, 26};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f213091h = {17, 27};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f213092i = {18, 28};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f213093j = {19, 29};

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.Map f213094k;

    static {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("attachment", 1966120);
        linkedHashMap.put("Download", 2031657);
        linkedHashMap.put("voice", 2097194);
        linkedHashMap.put("voice2", 2162731);
        linkedHashMap.put("image", 2228268);
        linkedHashMap.put("oldimage2", 2293805);
        linkedHashMap.put("video", 2359342);
        linkedHashMap.put("oneday", 2424879);
        linkedHashMap.put("emoji", 2490416);
        linkedHashMap.put("finder", 2555953);
        linkedHashMap.put("CDNDownloadBigFile", 9896088);
        linkedHashMap.put("CheckResUpdate", 10092699);
        f213094k = java.util.Collections.unmodifiableMap(linkedHashMap);
    }

    public static boolean a(com.tencent.mm.vfs.m0 m0Var) {
        java.util.List K = m0Var.K();
        java.util.Iterator it = K.subList(1, K.size()).iterator();
        while (it.hasNext()) {
            java.lang.Iterable list = ((com.tencent.mm.vfs.q2) it.next()).list("");
            if (list != null && list.iterator().hasNext()) {
                return false;
            }
        }
        return true;
    }
}
