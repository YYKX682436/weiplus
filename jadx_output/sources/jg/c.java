package jg;

/* loaded from: classes3.dex */
public enum c {
    /* JADX INFO: Fake field, exist only in values array */
    None(0),
    JPEGs(1);


    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f299526f = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final int f299528d;

    static {
        for (jg.c cVar : values()) {
            ((java.util.HashMap) f299526f).put(java.lang.Integer.valueOf(cVar.f299528d), cVar);
        }
    }

    c(int i17) {
        this.f299528d = i17;
    }
}
