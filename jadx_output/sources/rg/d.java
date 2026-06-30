package rg;

/* loaded from: classes5.dex */
public enum d {
    MP4(0),
    /* JADX INFO: Fake field, exist only in values array */
    MOV(1),
    /* JADX INFO: Fake field, exist only in values array */
    MP3(2),
    /* JADX INFO: Fake field, exist only in values array */
    M4A(3);


    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f395151f = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final int f395153d;

    static {
        for (rg.d dVar : values()) {
            ((java.util.HashMap) f395151f).put(java.lang.Integer.valueOf(dVar.f395153d), dVar);
        }
    }

    d(int i17) {
        this.f395153d = i17;
    }
}
