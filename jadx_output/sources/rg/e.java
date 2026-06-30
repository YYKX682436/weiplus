package rg;

/* loaded from: classes5.dex */
public enum e {
    /* JADX INFO: Fake field, exist only in values array */
    H263(0),
    H264(1),
    HEVC(2),
    /* JADX INFO: Fake field, exist only in values array */
    MPEG4(3),
    /* JADX INFO: Fake field, exist only in values array */
    MPEG2(4),
    /* JADX INFO: Fake field, exist only in values array */
    MPEG1(5),
    /* JADX INFO: Fake field, exist only in values array */
    MJPEG(6);


    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f395156g = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final int f395158d;

    static {
        for (rg.e eVar : values()) {
            ((java.util.HashMap) f395156g).put(java.lang.Integer.valueOf(eVar.f395158d), eVar);
        }
    }

    e(int i17) {
        this.f395158d = i17;
    }
}
