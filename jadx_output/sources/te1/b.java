package te1;

/* loaded from: classes13.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    public static final te1.b f417768c = new te1.b(com.eclipsesource.mmv8.Platform.UNKNOWN);

    /* renamed from: d, reason: collision with root package name */
    public static final te1.b f417769d = new te1.b("application/octet-stream");

    /* renamed from: e, reason: collision with root package name */
    public static final te1.b f417770e = new te1.b(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.VIDEO_MP4);

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f417771f = {117, 110, 107, 110, 111, 119, 110};

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.HashMap f417772g = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f417773a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f417774b;

    public b(java.lang.String str) {
        this.f417773a = str;
    }

    public static te1.b a(java.lang.String str) {
        boolean isEmpty = android.text.TextUtils.isEmpty(str);
        te1.b bVar = f417768c;
        return isEmpty ? bVar : str.equals(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.VIDEO_MP4) ? f417770e : str.equals(com.eclipsesource.mmv8.Platform.UNKNOWN) ? bVar : new te1.b(str);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || te1.b.class != obj.getClass()) {
            return false;
        }
        java.lang.String str = ((te1.b) obj).f417773a;
        java.lang.String str2 = this.f417773a;
        if (str2 != null) {
            if (str2.equals(str)) {
                return true;
            }
        } else if (str == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        java.lang.String str = this.f417773a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public java.lang.String toString() {
        return this.f417773a;
    }
}
