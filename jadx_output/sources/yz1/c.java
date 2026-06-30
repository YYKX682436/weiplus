package yz1;

/* loaded from: classes15.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.BufferedInputStream f468495a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.StringBuilder f468496b = new java.lang.StringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public final yz1.j f468497c = new yz1.j();

    public c(java.io.BufferedInputStream bufferedInputStream) {
        this.f468495a = bufferedInputStream;
    }

    public java.lang.String a() {
        while (true) {
            int read = this.f468495a.read();
            if (read < 0) {
                return null;
            }
            char c17 = (char) read;
            yz1.j jVar = this.f468497c;
            int i17 = jVar.f468508a;
            if (i17 != 1) {
                if (i17 != 2) {
                    if (i17 != 3) {
                        throw new java.lang.IllegalArgumentException("Unknown state: " + jVar.f468508a);
                    }
                    if (c17 == '\r') {
                        jVar.f468508a = 2;
                    } else {
                        jVar.f468508a = 1;
                    }
                } else if (c17 == '\n') {
                    jVar.f468508a = 3;
                } else {
                    jVar.f468508a = 1;
                }
            } else if (c17 == '\r') {
                jVar.f468508a = 2;
            }
            int i18 = jVar.f468508a;
            java.lang.StringBuilder sb6 = this.f468496b;
            if (i18 == 1) {
                sb6.append(c17);
            } else if (i18 == 3) {
                java.lang.String sb7 = sb6.toString();
                sb6.setLength(0);
                return sb7;
            }
        }
    }
}
