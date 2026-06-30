package yu;

/* loaded from: classes9.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final yu.i f465763a = new yu.i();

    public final int a(yu.a aVar) {
        boolean z17 = aVar.f465756d;
        boolean z18 = aVar.f465753a;
        return z17 ? z18 ? com.tencent.mm.R.raw.unknown_expired_dark : com.tencent.mm.R.raw.unknown_expired_light : aVar.f465754b ? z18 ? com.tencent.mm.R.raw.nologo_dark : com.tencent.mm.R.raw.nologo_light : aVar.f465755c ? z18 ? com.tencent.mm.R.raw.unknown_unfinished_dark : com.tencent.mm.R.raw.unknown_unfinished_light : z18 ? com.tencent.mm.R.raw.unknown_default_dark : com.tencent.mm.R.raw.unknown_default_light;
    }

    public final int b(boolean z17, java.lang.String str, boolean z18, boolean z19) {
        boolean C = com.tencent.mm.ui.bk.C();
        yu.a aVar = new yu.a(C, z17, z18, z19);
        if (str == null) {
            return a(aVar);
        }
        yu.g gVar = yu.g.f465761b;
        yu.d dVar = yu.d.f465758b;
        yu.c cVar = yu.h.f465762a;
        int i17 = 0;
        if (z17 && !z19) {
            yu.h a17 = cVar.a(str);
            if (kotlin.jvm.internal.o.b(a17, dVar) ? true : kotlin.jvm.internal.o.b(a17, gVar)) {
                return a(aVar);
            }
            ((ht.s) ((jt.a0) i95.n0.c(jt.a0.class))).getClass();
            java.lang.String p17 = com.tencent.mm.pluginsdk.model.t3.p(str);
            int i18 = -1;
            while (i17 < 12) {
                if (com.tencent.mm.pluginsdk.model.t3.f189442a[i17].equals(p17)) {
                    i18 = i17;
                }
                i17++;
            }
            return i18 != -1 ? com.tencent.mm.ui.bk.C() ? com.tencent.mm.pluginsdk.model.t3.f189455n[i18] : com.tencent.mm.pluginsdk.model.t3.f189454m[i18] : com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.raw.nologo_dark : com.tencent.mm.R.raw.nologo_light;
        }
        yu.h a18 = cVar.a(str);
        if (kotlin.jvm.internal.o.b(a18, dVar)) {
            return z19 ? C ? com.tencent.mm.R.raw.photo_expired_dark : com.tencent.mm.R.raw.photo_expired_light : z18 ? C ? com.tencent.mm.R.raw.photo_unfinished_dark : com.tencent.mm.R.raw.photo_unfinished_light : C ? com.tencent.mm.R.raw.photo_default_dark : com.tencent.mm.R.raw.photo_default_light;
        }
        if (kotlin.jvm.internal.o.b(a18, gVar)) {
            return z19 ? C ? com.tencent.mm.R.raw.video_expired_dark : com.tencent.mm.R.raw.video_expired_light : z18 ? C ? com.tencent.mm.R.raw.video_unfinished_dark : com.tencent.mm.R.raw.video_unfinished_light : C ? com.tencent.mm.R.raw.video_default_dark : com.tencent.mm.R.raw.video_default_light;
        }
        if (kotlin.jvm.internal.o.b(a18, yu.b.f465757b)) {
            return z19 ? C ? com.tencent.mm.R.raw.voice_expired_dark : com.tencent.mm.R.raw.voice_expired_light : z18 ? C ? com.tencent.mm.R.raw.voice_unfinished_dark : com.tencent.mm.R.raw.voice_unfinished_light : C ? com.tencent.mm.R.raw.voice_default_dark : com.tencent.mm.R.raw.voice_default_light;
        }
        if (kotlin.jvm.internal.o.b(a18, yu.e.f465759b)) {
            return z19 ? C ? com.tencent.mm.R.raw.md_expired_dark : com.tencent.mm.R.raw.md_expired_light : z18 ? C ? com.tencent.mm.R.raw.md_unfinished_dark : com.tencent.mm.R.raw.md_unfinished_light : C ? com.tencent.mm.R.raw.md_default_dark : com.tencent.mm.R.raw.md_default_light;
        }
        if (!kotlin.jvm.internal.o.b(a18, yu.f.f465760b)) {
            throw new jz5.j();
        }
        ((ht.s) ((jt.a0) i95.n0.c(jt.a0.class))).getClass();
        java.lang.String[] strArr = com.tencent.mm.pluginsdk.model.t3.f189442a;
        if (z19) {
            boolean C2 = com.tencent.mm.ui.bk.C();
            java.lang.String p18 = com.tencent.mm.pluginsdk.model.t3.p(str);
            int i19 = -1;
            while (i17 < 12) {
                if (strArr[i17].equals(p18)) {
                    i19 = i17;
                }
                i17++;
            }
            return i19 != -1 ? C2 ? com.tencent.mm.pluginsdk.model.t3.f189451j[i19] : com.tencent.mm.pluginsdk.model.t3.f189450i[i19] : C2 ? com.tencent.mm.R.raw.unknown_expired_dark : com.tencent.mm.R.raw.unknown_expired_light;
        }
        if (!z18) {
            return com.tencent.mm.pluginsdk.model.t3.o(str);
        }
        boolean C3 = com.tencent.mm.ui.bk.C();
        java.lang.String p19 = com.tencent.mm.pluginsdk.model.t3.p(str);
        int i27 = -1;
        while (i17 < 12) {
            if (strArr[i17].equals(p19)) {
                i27 = i17;
            }
            i17++;
        }
        return i27 != -1 ? C3 ? com.tencent.mm.pluginsdk.model.t3.f189449h[i27] : com.tencent.mm.pluginsdk.model.t3.f189448g[i27] : C3 ? com.tencent.mm.R.raw.unknown_unfinished_dark : com.tencent.mm.R.raw.unknown_unfinished_light;
    }
}
