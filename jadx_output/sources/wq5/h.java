package wq5;

/* loaded from: classes13.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public long f448703a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f448704b;

    /* renamed from: c, reason: collision with root package name */
    public long f448705c;

    /* renamed from: d, reason: collision with root package name */
    public long f448706d;

    /* renamed from: e, reason: collision with root package name */
    public char f448707e;

    /* renamed from: f, reason: collision with root package name */
    public final java.io.Reader f448708f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f448709g;

    /* renamed from: h, reason: collision with root package name */
    public long f448710h;

    public h(java.io.Reader reader) {
        this.f448708f = reader.markSupported() ? reader : new java.io.BufferedReader(reader);
        this.f448704b = false;
        this.f448709g = false;
        this.f448707e = (char) 0;
        this.f448705c = 0L;
        this.f448703a = 1L;
        this.f448710h = 0L;
        this.f448706d = 1L;
    }

    public void a() {
        if (!this.f448709g) {
            long j17 = this.f448705c;
            if (j17 > 0) {
                this.f448705c = j17 - 1;
                char c17 = this.f448707e;
                if (c17 == '\r' || c17 == '\n') {
                    this.f448706d--;
                    this.f448703a = this.f448710h;
                } else {
                    long j18 = this.f448703a;
                    if (j18 > 0) {
                        this.f448703a = j18 - 1;
                    }
                }
                this.f448709g = true;
                this.f448704b = false;
                return;
            }
        }
        throw new wq5.b("Stepping back two steps is not supported");
    }

    public boolean b() {
        java.io.Reader reader = this.f448708f;
        if (this.f448709g) {
            return true;
        }
        try {
            reader.mark(1);
            try {
                if (reader.read() <= 0) {
                    this.f448704b = true;
                    return false;
                }
                reader.reset();
                return true;
            } catch (java.io.IOException e17) {
                throw new wq5.b("Unable to read the next character from the stream", e17);
            }
        } catch (java.io.IOException e18) {
            throw new wq5.b("Unable to preserve stream position", e18);
        }
    }

    public char c() {
        int read;
        if (this.f448709g) {
            this.f448709g = false;
            read = this.f448707e;
        } else {
            try {
                read = this.f448708f.read();
            } catch (java.io.IOException e17) {
                throw new wq5.b(e17);
            }
        }
        if (read <= 0) {
            this.f448704b = true;
            return (char) 0;
        }
        if (read > 0) {
            this.f448705c++;
            if (read == 13) {
                this.f448706d++;
                this.f448710h = this.f448703a;
                this.f448703a = 0L;
            } else if (read == 10) {
                if (this.f448707e != '\r') {
                    this.f448706d++;
                    this.f448710h = this.f448703a;
                }
                this.f448703a = 0L;
            } else {
                this.f448703a++;
            }
        }
        char c17 = (char) read;
        this.f448707e = c17;
        return c17;
    }

    public char d() {
        char c17;
        do {
            c17 = c();
            if (c17 == 0) {
                break;
            }
        } while (c17 <= ' ');
        return c17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x016e, code lost:
    
        throw f("Substring bounds error");
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x01c5, code lost:
    
        throw f("Unterminated string");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e() {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wq5.h.e():java.lang.Object");
    }

    public wq5.b f(java.lang.String str) {
        return new wq5.b(str + toString());
    }

    public java.lang.String toString() {
        return " at " + this.f448705c + " [character " + this.f448703a + " line " + this.f448706d + "]";
    }
}
