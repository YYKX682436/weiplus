package pe5;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f353749a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f353750b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f353751c;

    public f(androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f353749a = activity;
        this.f353750b = new java.util.HashMap();
        this.f353751c = new java.util.HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(pe5.f r24, o70.k r25, int r26, java.lang.String r27, int r28, long r29, t15.a r31) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pe5.f.a(pe5.f, o70.k, int, java.lang.String, int, long, t15.a):void");
    }

    public final boolean b(java.lang.String str) {
        if (str == null) {
            return false;
        }
        java.util.HashMap hashMap = this.f353751c;
        java.lang.Object obj = hashMap.get(str);
        if (obj == null) {
            obj = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.y1.c(str));
            hashMap.put(str, obj);
        }
        return ((java.lang.Boolean) obj).booleanValue();
    }

    public final boolean c(java.lang.String str) {
        if (str == null) {
            return false;
        }
        java.util.HashMap hashMap = this.f353750b;
        java.lang.Object obj = hashMap.get(str);
        if (obj == null) {
            obj = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.y1.f(str));
            hashMap.put(str, obj);
        }
        return ((java.lang.Boolean) obj).booleanValue();
    }
}
