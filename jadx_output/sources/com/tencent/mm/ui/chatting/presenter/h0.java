package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public final class h0 implements zb5.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f202235d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f202236e;

    /* renamed from: f, reason: collision with root package name */
    public zb5.b f202237f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.gallery.EmojiHistoryListFragment f202238g;

    /* renamed from: h, reason: collision with root package name */
    public int f202239h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f202240i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f202241m;

    /* renamed from: n, reason: collision with root package name */
    public long f202242n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f202243o;

    public h0(android.content.Context context, java.lang.String talker) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(talker, "talker");
        this.f202235d = context;
        this.f202236e = talker;
        this.f202239h = 1;
        this.f202240i = "";
        this.f202241m = "";
        this.f202243o = jz5.h.b(com.tencent.mm.ui.chatting.presenter.g0.f202223d);
    }

    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiHistoryListPresenter", "[firstLoad] :: query " + this.f202240i);
        com.tencent.mm.ui.chatting.gallery.EmojiHistoryListFragment emojiHistoryListFragment = this.f202238g;
        if (emojiHistoryListFragment != null) {
            emojiHistoryListFragment.f200554w = false;
            emojiHistoryListFragment.f200555x = false;
        }
        this.f202241m = "";
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.chatting.presenter.b0(this));
    }

    public final boolean d(com.tencent.mm.api.IEmojiInfo emojiInfo, java.lang.String mQuery) {
        boolean z17;
        boolean z18;
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        kotlin.jvm.internal.o.g(mQuery, "mQuery");
        java.lang.String Bi = ((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Bi(emojiInfo.getMd5());
        char[] charArray = mQuery.toCharArray();
        kotlin.jvm.internal.o.f(charArray, "toCharArray(...)");
        int length = charArray.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                z17 = false;
                break;
            }
            char c17 = charArray[i17];
            if (19968 <= c17 && c17 < 40892) {
                z17 = true;
                break;
            }
            i17++;
        }
        if (!z17 && !com.tencent.mm.sdk.platformtools.t8.K0(Bi)) {
            kotlin.jvm.internal.o.d(Bi);
            java.util.Locale locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.o.f(locale, "getDefault(...)");
            java.lang.String lowerCase = Bi.toLowerCase(locale);
            kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
            if (com.tencent.mm.sdk.platformtools.t8.K0(lowerCase)) {
                z18 = false;
            } else {
                java.util.regex.Matcher matcher = ((java.util.regex.Pattern) ((jz5.n) this.f202243o).getValue()).matcher(lowerCase);
                z18 = false;
                while (matcher.find()) {
                    java.lang.String group = matcher.group();
                    kotlin.jvm.internal.o.d(group);
                    boolean y17 = r26.i0.y(group, mQuery, false);
                    com.tencent.mars.xlog.Log.i("MicroMsg.EmojiHistoryListPresenter", "[isContains] search=" + mQuery + " group=" + group);
                    z18 = y17;
                    if (y17) {
                        break;
                    }
                }
            }
            if (z18) {
                return true;
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(Bi)) {
            kotlin.jvm.internal.o.d(Bi);
            java.util.Locale locale2 = java.util.Locale.getDefault();
            kotlin.jvm.internal.o.f(locale2, "getDefault(...)");
            java.lang.String lowerCase2 = Bi.toLowerCase(locale2);
            kotlin.jvm.internal.o.f(lowerCase2, "toLowerCase(...)");
            if (r26.n0.B(lowerCase2, mQuery, false)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.presenter.z
    public void onDetach() {
        zb5.b bVar = this.f202237f;
        if (bVar != null) {
            ((com.tencent.mm.ui.chatting.gallery.EmojiHistoryListUI) bVar).f200557d = null;
        }
        this.f202237f = null;
        de5.a aVar = de5.a.f229396a;
        aVar.l("");
        aVar.k(21, 7, 8);
    }
}
