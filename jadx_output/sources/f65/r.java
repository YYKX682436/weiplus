package f65;

/* loaded from: classes10.dex */
public class r implements qk.v7 {

    /* renamed from: a, reason: collision with root package name */
    public final l45.q f259961a;

    public r(l45.q qVar) {
        this.f259961a = qVar;
    }

    public int a() {
        um.e eVar = (um.e) com.tencent.mm.cache.ArtistCacheManager.a().c(dl.a.DOODLE);
        if (eVar == null) {
            return 0;
        }
        return eVar.A3(true);
    }

    public int b() {
        um.g gVar = (um.g) com.tencent.mm.cache.ArtistCacheManager.a().c(dl.a.EMOJI_AND_TEXT);
        if (gVar == null) {
            return 0;
        }
        return gVar.c(true)[0];
    }

    public int c() {
        um.s sVar = (um.s) com.tencent.mm.cache.ArtistCacheManager.a().c(dl.a.MOSAIC);
        if (sVar == null) {
            return 0;
        }
        return sVar.A3(true);
    }

    public int d() {
        um.e eVar = (um.e) com.tencent.mm.cache.ArtistCacheManager.a().c(dl.a.DOODLE);
        if (eVar == null) {
            return 0;
        }
        int[] iArr = dn5.c.D;
        int[] iArr2 = new int[8];
        java.util.Stack stack = eVar.f428675d;
        if (stack != null) {
            java.util.Iterator it = stack.iterator();
            while (it.hasNext()) {
                xk0.d dVar = (xk0.d) it.next();
                int[] iArr3 = dn5.c.D;
                int i17 = 0;
                while (true) {
                    if (i17 >= 8) {
                        break;
                    }
                    if (dVar.f454939e == iArr3[i17]) {
                        iArr2[i17] = iArr2[i17] + 1;
                        break;
                    }
                    i17++;
                }
            }
        }
        int i18 = 0;
        for (int i19 = 0; i19 < 8; i19++) {
            if (iArr2[i19] > 0) {
                i18++;
            }
        }
        return i18;
    }

    public int e() {
        um.g gVar = (um.g) com.tencent.mm.cache.ArtistCacheManager.a().c(dl.a.EMOJI_AND_TEXT);
        if (gVar == null) {
            return 0;
        }
        return gVar.c(true)[1];
    }

    public int f() {
        um.e eVar = (um.e) com.tencent.mm.cache.ArtistCacheManager.a().c(dl.a.DOODLE);
        int i17 = eVar != null ? 0 + eVar.f428677f : 0;
        um.s sVar = (um.s) com.tencent.mm.cache.ArtistCacheManager.a().c(dl.a.MOSAIC);
        return sVar != null ? i17 + sVar.f428696g : i17;
    }

    public boolean g() {
        um.e eVar = (um.e) com.tencent.mm.cache.ArtistCacheManager.a().c(dl.a.DOODLE);
        um.s sVar = (um.s) com.tencent.mm.cache.ArtistCacheManager.a().c(dl.a.MOSAIC);
        um.d dVar = (um.d) com.tencent.mm.cache.ArtistCacheManager.a().c(dl.a.CROP_PHOTO);
        um.g gVar = (um.g) com.tencent.mm.cache.ArtistCacheManager.a().c(dl.a.EMOJI_AND_TEXT);
        return (eVar != null && eVar.A3(true) > 0) || (sVar != null && sVar.A3(true) > 0) || ((gVar != null && gVar.A3(true) > 0) || (dVar != null && dVar.A3(true) > 0));
    }

    public boolean h() {
        dl.b d17 = ((l45.n) this.f259961a).d(qk.g6.CROP_PHOTO);
        return (d17 == null || d17.m() != dl.a.CROP_PHOTO || ((dl.t) d17).i() == 0.0f) ? false : true;
    }
}
