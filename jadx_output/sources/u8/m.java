package u8;

/* loaded from: classes15.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final int f425304a = t9.d0.f("nam");

    /* renamed from: b, reason: collision with root package name */
    public static final int f425305b = t9.d0.f("trk");

    /* renamed from: c, reason: collision with root package name */
    public static final int f425306c = t9.d0.f("cmt");

    /* renamed from: d, reason: collision with root package name */
    public static final int f425307d = t9.d0.f("day");

    /* renamed from: e, reason: collision with root package name */
    public static final int f425308e = t9.d0.f("ART");

    /* renamed from: f, reason: collision with root package name */
    public static final int f425309f = t9.d0.f("too");

    /* renamed from: g, reason: collision with root package name */
    public static final int f425310g = t9.d0.f("alb");

    /* renamed from: h, reason: collision with root package name */
    public static final int f425311h = t9.d0.f("com");

    /* renamed from: i, reason: collision with root package name */
    public static final int f425312i = t9.d0.f("wrt");

    /* renamed from: j, reason: collision with root package name */
    public static final int f425313j = t9.d0.f("lyr");

    /* renamed from: k, reason: collision with root package name */
    public static final int f425314k = t9.d0.f("gen");

    /* renamed from: l, reason: collision with root package name */
    public static final int f425315l = t9.d0.f("covr");

    /* renamed from: m, reason: collision with root package name */
    public static final int f425316m = t9.d0.f("gnre");

    /* renamed from: n, reason: collision with root package name */
    public static final int f425317n = t9.d0.f("grp");

    /* renamed from: o, reason: collision with root package name */
    public static final int f425318o = t9.d0.f("disk");

    /* renamed from: p, reason: collision with root package name */
    public static final int f425319p = t9.d0.f("trkn");

    /* renamed from: q, reason: collision with root package name */
    public static final int f425320q = t9.d0.f("tmpo");

    /* renamed from: r, reason: collision with root package name */
    public static final int f425321r = t9.d0.f("cpil");

    /* renamed from: s, reason: collision with root package name */
    public static final int f425322s = t9.d0.f("aART");

    /* renamed from: t, reason: collision with root package name */
    public static final int f425323t = t9.d0.f("sonm");

    /* renamed from: u, reason: collision with root package name */
    public static final int f425324u = t9.d0.f("soal");

    /* renamed from: v, reason: collision with root package name */
    public static final int f425325v = t9.d0.f("soar");

    /* renamed from: w, reason: collision with root package name */
    public static final int f425326w = t9.d0.f("soaa");

    /* renamed from: x, reason: collision with root package name */
    public static final int f425327x = t9.d0.f("soco");

    /* renamed from: y, reason: collision with root package name */
    public static final int f425328y = t9.d0.f("rtng");

    /* renamed from: z, reason: collision with root package name */
    public static final int f425329z = t9.d0.f("pgap");
    public static final int A = t9.d0.f("sosn");
    public static final int B = t9.d0.f("tvsh");
    public static final int C = t9.d0.f("----");
    public static final java.lang.String[] D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    public static com.google.android.exoplayer2.metadata.id3.TextInformationFrame a(int i17, java.lang.String str, t9.p pVar) {
        int c17 = pVar.c();
        if (pVar.c() == u8.c.F0 && c17 >= 22) {
            pVar.x(10);
            int r17 = pVar.r();
            if (r17 > 0) {
                java.lang.String str2 = "" + r17;
                int r18 = pVar.r();
                if (r18 > 0) {
                    str2 = str2 + "/" + r18;
                }
                return new com.google.android.exoplayer2.metadata.id3.TextInformationFrame(str, null, str2);
            }
        }
        u8.c.a(i17);
        return null;
    }

    public static com.google.android.exoplayer2.metadata.id3.Id3Frame b(t9.p pVar, int i17) {
        java.lang.String str = null;
        java.lang.String str2 = null;
        int i18 = -1;
        int i19 = -1;
        while (true) {
            int i27 = pVar.f416541b;
            if (i27 >= i17) {
                break;
            }
            int c17 = pVar.c();
            int c18 = pVar.c();
            pVar.x(4);
            if (c18 == u8.c.D0) {
                str = pVar.j(c17 - 12);
            } else if (c18 == u8.c.E0) {
                str2 = pVar.j(c17 - 12);
            } else {
                if (c18 == u8.c.F0) {
                    i18 = i27;
                    i19 = c17;
                }
                pVar.x(c17 - 12);
            }
        }
        if (!"com.apple.iTunes".equals(str) || !"iTunSMPB".equals(str2) || i18 == -1) {
            return null;
        }
        pVar.w(i18);
        pVar.x(16);
        return new com.google.android.exoplayer2.metadata.id3.CommentFrame("und", str2, pVar.j(i19 - 16));
    }

    public static com.google.android.exoplayer2.metadata.id3.TextInformationFrame c(int i17, java.lang.String str, t9.p pVar) {
        int c17 = pVar.c();
        if (pVar.c() == u8.c.F0) {
            pVar.x(8);
            return new com.google.android.exoplayer2.metadata.id3.TextInformationFrame(str, null, pVar.j(c17 - 16));
        }
        u8.c.a(i17);
        return null;
    }

    public static com.google.android.exoplayer2.metadata.id3.Id3Frame d(int i17, java.lang.String str, t9.p pVar, boolean z17, boolean z18) {
        int i18;
        pVar.x(4);
        if (pVar.c() == u8.c.F0) {
            pVar.x(8);
            i18 = pVar.m();
        } else {
            i18 = -1;
        }
        if (z18) {
            i18 = java.lang.Math.min(1, i18);
        }
        if (i18 >= 0) {
            return z17 ? new com.google.android.exoplayer2.metadata.id3.TextInformationFrame(str, null, java.lang.Integer.toString(i18)) : new com.google.android.exoplayer2.metadata.id3.CommentFrame("und", str, java.lang.Integer.toString(i18));
        }
        u8.c.a(i17);
        return null;
    }
}
