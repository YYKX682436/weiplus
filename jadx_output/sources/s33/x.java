package s33;

/* loaded from: classes8.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f402540a = new java.util.LinkedHashMap();

    static {
        b(0, c43.w.class);
        b(10000, c43.s.class);
        b(10001, c43.c.class);
        b(10002, c43.v.class);
        b(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL, c43.r.class);
        b(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID, c43.o.class);
        b(10005, c43.e.class);
        b(10006, c43.m.class);
        b(10007, c43.p.class);
        b(10008, c43.i.class);
        b(10009, c43.l.class);
        b(10010, c43.h.class);
    }

    public static int a(int i17, int i18) {
        if (i17 == 1) {
            return 10000;
        }
        if (i17 == 3) {
            return 10009;
        }
        if (i17 == 47) {
            return 10005;
        }
        if (i17 != 32) {
            return 0;
        }
        switch (i18) {
            case 1:
                return 10001;
            case 2:
                return 10002;
            case 3:
                return com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL;
            case 4:
                return com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID;
            case 5:
                return 10006;
            case 6:
                return 10007;
            case 7:
                return 10008;
            case 8:
                return 10010;
            default:
                return 0;
        }
    }

    public static void b(int i17, java.lang.Class cls) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.util.Map map = f402540a;
        if (map.containsKey(valueOf)) {
            return;
        }
        map.put(java.lang.Integer.valueOf(i17), cls);
    }
}
