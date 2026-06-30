package w8;

/* loaded from: classes15.dex */
public final class e implements w8.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f443619a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f443620b;

    public e(int i17, java.util.List list) {
        this.f443619a = i17;
        if (!c(32) && list.isEmpty()) {
            list = java.util.Collections.singletonList(com.google.android.exoplayer2.Format.h(null, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_CEA608, 0, null, null));
        }
        this.f443620b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    public final w8.y a(w8.e0 e0Var) {
        int i17;
        java.lang.String str;
        boolean c17 = c(32);
        java.util.List list = this.f443620b;
        if (c17) {
            return new w8.y(list);
        }
        t9.p pVar = new t9.p(e0Var.f443623c);
        java.util.ArrayList arrayList = list;
        while (pVar.f416542c - pVar.f416541b > 0) {
            int m17 = pVar.m();
            int m18 = pVar.f416541b + pVar.m();
            if (m17 == 134) {
                arrayList = new java.util.ArrayList();
                int m19 = pVar.m() & 31;
                for (int i18 = 0; i18 < m19; i18++) {
                    java.lang.String k17 = pVar.k(3);
                    int m27 = pVar.m();
                    if ((m27 & 128) != 0) {
                        i17 = m27 & 63;
                        str = com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_CEA708;
                    } else {
                        i17 = 1;
                        str = com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_CEA608;
                    }
                    arrayList.add(com.google.android.exoplayer2.Format.i(null, str, null, -1, 0, k17, i17, null, com.tencent.wcdb.core.Database.DictDefaultMatchValue, java.util.Collections.emptyList()));
                    pVar.x(2);
                }
            }
            pVar.w(m18);
            arrayList = arrayList;
        }
        return new w8.y(arrayList);
    }

    public w8.h0 b(int i17, w8.e0 e0Var) {
        if (i17 == 2) {
            return new w8.t(new w8.j());
        }
        if (i17 == 3 || i17 == 4) {
            return new w8.t(new w8.r(e0Var.f443621a));
        }
        if (i17 == 15) {
            if (c(2)) {
                return null;
            }
            return new w8.t(new w8.d(false, e0Var.f443621a));
        }
        if (i17 == 21) {
            return new w8.t(new w8.q());
        }
        if (i17 == 27) {
            if (c(4)) {
                return null;
            }
            return new w8.t(new w8.n(a(e0Var), c(1), c(8)));
        }
        if (i17 == 36) {
            return new w8.t(new w8.p(a(e0Var)));
        }
        if (i17 == 89) {
            return new w8.t(new w8.g(e0Var.f443622b));
        }
        if (i17 != 138) {
            if (i17 != 129) {
                if (i17 != 130) {
                    if (i17 == 134) {
                        if (c(16)) {
                            return null;
                        }
                        return new w8.x(new w8.z());
                    }
                    if (i17 != 135) {
                        return null;
                    }
                }
            }
            return new w8.t(new w8.b(e0Var.f443621a));
        }
        return new w8.t(new w8.f(e0Var.f443621a));
    }

    public final boolean c(int i17) {
        return (i17 & this.f443619a) != 0;
    }
}
