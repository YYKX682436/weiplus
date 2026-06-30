package pr;

/* loaded from: classes11.dex */
public final class g implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pr.h f357706a;

    public g(pr.h hVar) {
        this.f357706a = hVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.ri0 ri0Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        r45.ye yeVar = (r45.ye) fVar.f70618d;
        pr.h hVar = this.f357706a;
        com.tencent.mars.xlog.Log.i(hVar.f357712d, "requestNext: " + i17 + ", " + i18);
        jz5.f0 f0Var = jz5.f0.f302826a;
        yz5.p pVar = hVar.f357711c;
        if (i17 != 0 || i18 != 0) {
            if (pVar == null) {
                return null;
            }
            pVar.invoke(java.lang.Boolean.FALSE, java.lang.Integer.valueOf(hVar.f357713e));
            return f0Var;
        }
        kotlin.jvm.internal.o.d(yeVar);
        java.util.LinkedList<r45.ri0> linkedList = yeVar.f391008g;
        if (linkedList != null) {
            boolean isEmpty = linkedList.isEmpty();
            java.lang.String str = hVar.f357712d;
            if (isEmpty) {
                com.tencent.mars.xlog.Log.i(str, "no serverEmojiList");
            } else {
                java.util.HashMap hashMap = new java.util.HashMap();
                for (r45.ri0 ri0Var2 : linkedList) {
                    if (ri0Var2 != null && !android.text.TextUtils.isEmpty(ri0Var2.f384889g)) {
                        com.tencent.mars.xlog.Log.i(str, "add designer id " + ri0Var2.f384889g + ", md5 " + ri0Var2.f384886d);
                        java.lang.String str2 = ri0Var2.f384886d;
                        kotlin.jvm.internal.o.f(str2, "getMd5(...)");
                        hashMap.put(str2, ri0Var2);
                    }
                }
                java.util.ArrayList a17 = gr.t.g().a();
                if (a17.isEmpty()) {
                    com.tencent.mars.xlog.Log.i(str, "no localEmojis");
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = a17.iterator();
                    while (it.hasNext()) {
                        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = (com.tencent.mm.storage.emotion.EmojiInfo) it.next();
                        if (emojiInfo != null && !android.text.TextUtils.isEmpty(emojiInfo.getMd5()) && hashMap.containsKey(emojiInfo.getMd5()) && (ri0Var = (r45.ri0) hashMap.get(emojiInfo.getMd5())) != null && android.text.TextUtils.isEmpty(emojiInfo.field_designerID)) {
                            com.tencent.mars.xlog.Log.i(str, "designer id match " + ri0Var.f384889g + " , md5: " + ri0Var.f384886d);
                            arrayList.add(ri0Var);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        java.util.Iterator it6 = arrayList.iterator();
                        while (it6.hasNext()) {
                            com.tencent.mm.storage.emotion.EmojiInfo u17 = com.tencent.mm.storage.n5.f().c().u1(((r45.ri0) it6.next()).f384886d);
                            if (u17 != null && u17.field_storeUnique == 0) {
                                u17.field_storeUnique = 1;
                                com.tencent.mars.xlog.Log.i(str, "update storeunique ret " + com.tencent.mm.storage.n5.f().c().G2(u17));
                            }
                        }
                    }
                }
            }
        }
        if (linkedList != null) {
            com.tencent.mm.storage.n5.f().c().O2(linkedList);
        }
        if (hVar.f357714f < hVar.f357709a.size()) {
            hVar.a();
            return f0Var;
        }
        if (pVar == null) {
            return f0Var;
        }
        pVar.invoke(java.lang.Boolean.TRUE, java.lang.Integer.valueOf(hVar.f357714f));
        return f0Var;
    }
}
