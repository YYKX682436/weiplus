package jr;

/* loaded from: classes4.dex */
public final class l implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.mmdata.rpt.SuggestEmoiconWordListStruct f301310a;

    public l(com.tencent.mm.autogen.mmdata.rpt.SuggestEmoiconWordListStruct suggestEmoiconWordListStruct) {
        this.f301310a = suggestEmoiconWordListStruct;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        r45.af3 af3Var = (r45.af3) fVar.f70618d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateWordList: ");
        sb6.append(i17);
        sb6.append(", ");
        sb6.append(i18);
        sb6.append("; ");
        sb6.append((af3Var == null || (linkedList2 = af3Var.f369977d) == null) ? null : java.lang.Integer.valueOf(linkedList2.size()));
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiSuggestCache", sb6.toString());
        jr.m.f301311a = false;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.autogen.mmdata.rpt.SuggestEmoiconWordListStruct suggestEmoiconWordListStruct = this.f301310a;
        suggestEmoiconWordListStruct.f61015e = currentTimeMillis;
        if (i17 == 0 && i18 == 0) {
            suggestEmoiconWordListStruct.f61016f = 1L;
            suggestEmoiconWordListStruct.f61017g = (af3Var == null || (linkedList = af3Var.f369977d) == null) ? 0 : linkedList.size();
            suggestEmoiconWordListStruct.f61018h = suggestEmoiconWordListStruct.b("WordVersion", java.lang.String.valueOf(af3Var != null ? af3Var.f369979f : 0L), true);
            if (af3Var != null && af3Var.f369977d.size() > 0) {
                gr.v vVar = gr.v.f274696a;
                int i19 = (int) com.tencent.mm.sdk.platformtools.t8.i1();
                vVar.a(false);
                vVar.b().putInt("word_list_update_time", i19);
                byte[] byteArray = af3Var.toByteArray();
                z85.x e17 = com.tencent.mm.storage.n5.f().e();
                e17.getClass();
                e17.replace(new z85.w("cache_type_words_list", byteArray));
                jr.j.f301305a.c();
            }
        } else {
            suggestEmoiconWordListStruct.f61016f = 2L;
        }
        return java.lang.Boolean.valueOf(suggestEmoiconWordListStruct.k());
    }
}
