package jr;

/* loaded from: classes4.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final jr.k f301309d = new jr.k();

    public k() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_emoji_suggest_personal_words_interval, 0);
        gr.v vVar = gr.v.f274696a;
        vVar.a(false);
        int i17 = vVar.b().getInt("word_list_update_time", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiSuggestCache", "checkWordListUpdate: config " + Ni + ", last " + i17 + ", running " + jr.m.f301311a);
        if (Ni > 0 && com.tencent.mm.sdk.platformtools.t8.H1(i17) >= Ni * 3600 && !jr.m.f301311a) {
            jr.m.f301311a = true;
            com.tencent.mm.autogen.mmdata.rpt.SuggestEmoiconWordListStruct suggestEmoiconWordListStruct = new com.tencent.mm.autogen.mmdata.rpt.SuggestEmoiconWordListStruct();
            suggestEmoiconWordListStruct.f61014d = java.lang.System.currentTimeMillis();
            new gr.d().l().K(new jr.l(suggestEmoiconWordListStruct));
        }
        return jz5.f0.f302826a;
    }
}
