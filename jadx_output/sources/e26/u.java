package e26;

/* loaded from: classes16.dex */
public class u implements e26.c0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f247036d = r26.n0.s0(e26.u.class.getCanonicalName(), ".", "");

    /* renamed from: e, reason: collision with root package name */
    public static final e26.c0 f247037e = new e26.d("NO_LOCKS", e26.k.f247020a, e26.c.f247016b);

    /* renamed from: a, reason: collision with root package name */
    public final e26.z f247038a;

    /* renamed from: b, reason: collision with root package name */
    public final e26.k f247039b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f247040c;

    public u(java.lang.String str, e26.k kVar, e26.z zVar) {
        if (str == null) {
            a(4);
            throw null;
        }
        if (kVar == null) {
            a(5);
            throw null;
        }
        if (zVar != null) {
            this.f247038a = zVar;
            this.f247039b = kVar;
            this.f247040c = str;
            return;
        }
        a(6);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e26.u.a(int):void");
    }

    public static java.lang.Throwable g(java.lang.Throwable th6) {
        if (th6 == null) {
            a(36);
            throw null;
        }
        java.lang.StackTraceElement[] stackTrace = th6.getStackTrace();
        int length = stackTrace.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                i17 = -1;
                break;
            }
            if (!stackTrace[i17].getClassName().startsWith(f247036d)) {
                break;
            }
            i17++;
        }
        java.util.List subList = java.util.Arrays.asList(stackTrace).subList(i17, length);
        th6.setStackTrace((java.lang.StackTraceElement[]) subList.toArray(new java.lang.StackTraceElement[subList.size()]));
        return th6;
    }

    public e26.x b(yz5.a aVar) {
        if (aVar != null) {
            return new e26.o(this, aVar);
        }
        a(23);
        throw null;
    }

    public e26.v c(yz5.l lVar) {
        if (lVar != null) {
            return new e26.r(this, new java.util.concurrent.ConcurrentHashMap(3, 1.0f, 2), lVar);
        }
        a(9);
        throw null;
    }

    public e26.w d(yz5.l lVar) {
        if (lVar != null) {
            return new e26.q(this, new java.util.concurrent.ConcurrentHashMap(3, 1.0f, 2), lVar);
        }
        a(19);
        throw null;
    }

    public e26.y e(yz5.a aVar) {
        if (aVar != null) {
            return new e26.m(this, aVar);
        }
        a(30);
        throw null;
    }

    public e26.t f(java.lang.String str, java.lang.Object obj) {
        java.lang.String str2;
        if (str == null) {
            a(35);
            throw null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Recursion detected ");
        sb6.append(str);
        if (obj == null) {
            str2 = "";
        } else {
            str2 = "on input: " + obj;
        }
        sb6.append(str2);
        sb6.append(" under ");
        sb6.append(this);
        java.lang.AssertionError assertionError = new java.lang.AssertionError(sb6.toString());
        g(assertionError);
        throw assertionError;
    }

    public java.lang.String toString() {
        return getClass().getSimpleName() + "@" + java.lang.Integer.toHexString(hashCode()) + " (" + this.f247040c + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u(java.lang.String r4) {
        /*
            r3 = this;
            e26.k r0 = e26.k.f247020a
            int r1 = e26.z.f247041a
            e26.b r1 = new e26.b
            java.util.concurrent.locks.ReentrantLock r2 = new java.util.concurrent.locks.ReentrantLock
            r2.<init>()
            r1.<init>(r2)
            r3.<init>(r4, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e26.u.<init>(java.lang.String):void");
    }
}
