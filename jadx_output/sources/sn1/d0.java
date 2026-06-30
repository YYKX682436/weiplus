package sn1;

/* loaded from: classes12.dex */
public class d0 {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f410004b;

    /* renamed from: c, reason: collision with root package name */
    public final int f410005c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f410003a = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public int f410006d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.io.InputStream f410007e = null;

    public d0(java.lang.String str) {
        this.f410004b = null;
        this.f410005c = 0;
        this.f410004b = str;
        int k17 = (int) com.tencent.mm.vfs.w6.k(str);
        this.f410005c = k17;
        if (k17 < 0) {
            this.f410005c = 0;
        }
    }
}
