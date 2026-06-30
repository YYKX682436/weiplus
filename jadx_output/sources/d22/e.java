package d22;

/* loaded from: classes12.dex */
public final class e implements d22.p {
    @Override // d22.p
    public com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener b(d22.v context) {
        kotlin.jvm.internal.o.g(context, "context");
        try {
            return ((d22.d) context).f225833q;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.emoji.MMEmoticonBrowsePageCreator", th6, "unable to cast browseContext", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // d22.p
    public java.lang.String c() {
        return "EmotionMsgBrowseLogicData";
    }

    @Override // d22.p
    public java.lang.String d(d22.v context) {
        java.lang.String str = "";
        kotlin.jvm.internal.o.g(context, "context");
        try {
            d22.d dVar = (d22.d) context;
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = dVar.f225831o;
            if (emojiInfo != null) {
                r45.ri0 ri0Var = new r45.ri0();
                if (emojiInfo != null) {
                    ri0Var.f384886d = emojiInfo.getMd5();
                    ri0Var.f384892m = emojiInfo.field_groupId;
                    ri0Var.f384889g = emojiInfo.field_designerID;
                    ri0Var.f384895p = emojiInfo.field_activityid;
                    ri0Var.f384896q = emojiInfo.field_attachedText;
                    ri0Var.f384897r = emojiInfo.field_attachTextColor;
                    ri0Var.f384887e = emojiInfo.field_cdnUrl;
                    ri0Var.f384891i = emojiInfo.field_aeskey;
                    ri0Var.f384894o = emojiInfo.field_externMd5;
                    ri0Var.f384893n = emojiInfo.field_externUrl;
                    ri0Var.f384890h = emojiInfo.field_encrypturl;
                    ri0Var.f384900u = emojiInfo.field_linkId;
                    ri0Var.f384898s = emojiInfo.field_lensId;
                    ri0Var.f384888f = emojiInfo.field_thumbUrl;
                    ri0Var.f384901v = emojiInfo.H2;
                }
                str = android.util.Base64.encodeToString(ri0Var.toByteArray(), 2);
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("emojiInfo", str);
            linkedHashMap.put("emotionScene", java.lang.Integer.valueOf(dVar.f364155a));
            linkedHashMap.put("requestID", dVar.c());
            linkedHashMap.put("enterTime", java.lang.Long.valueOf(dVar.f364158d));
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo2 = dVar.f225831o;
            if (emojiInfo2 != null) {
                if (emojiInfo2.field_storeUnique == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.emoji.MMEmoticonBrowsePageCreator", "has uniquestore " + emojiInfo2.getMd5());
                }
                if (emojiInfo2.field_storeUnique == 1 && android.text.TextUtils.isEmpty(emojiInfo2.field_designerID)) {
                    linkedHashMap.put("storeUnique", 1);
                    com.tencent.mars.xlog.Log.i("MicroMsg.emoji.MMEmoticonBrowsePageCreator", "uniquestore liteapp " + emojiInfo2.getMd5());
                }
            }
            java.lang.String gVar = new cl0.g(linkedHashMap).toString();
            kotlin.jvm.internal.o.f(gVar, "toString(...)");
            return gVar;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.emoji.MMEmoticonBrowsePageCreator", th6, "unable to cast browseContext", new java.lang.Object[0]);
            return "";
        }
    }

    @Override // d22.p
    public java.lang.String e() {
        return "pages/view/emoticon";
    }

    @Override // d22.p
    public void f(d22.v liteAppContext) {
        kotlin.jvm.internal.o.g(liteAppContext, "liteAppContext");
    }

    @Override // d22.p
    public java.lang.Object g(d22.v context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (!(context instanceof d22.d)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.MMEmoticonBrowsePageCreator", "unable to cast browseContext");
            return null;
        }
        d22.d dVar = (d22.d) context;
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = dVar.f225831o;
        if (emojiInfo == null) {
            return null;
        }
        d22.k0 k0Var = new d22.k0(emojiInfo);
        k0Var.f364223a = dVar.f364155a;
        k0Var.f364226d = java.lang.String.valueOf(dVar.f225832p);
        k0Var.f364224b = dVar.f225831o;
        k0Var.f364225c = dVar.f364007i;
        java.lang.String str = dVar.f364011m;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        k0Var.f364228f = str;
        k0Var.f364229g = dVar.f364008j;
        java.lang.String str2 = dVar.f364009k;
        kotlin.jvm.internal.o.g(str2, "<set-?>");
        k0Var.f364230h = str2;
        k0Var.f364227e = dVar.f364010l;
        return k0Var;
    }

    @Override // d22.p
    public com.tencent.mm.plugin.lite.s i(d22.v context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
        if (!(context instanceof d22.d)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.MMEmoticonBrowsePageCreator", "unable to cast browseContext");
            return sVar;
        }
        d22.d dVar = (d22.d) context;
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = dVar.f225831o;
        if (emojiInfo != null) {
            d22.k0 k0Var = new d22.k0(emojiInfo);
            k0Var.f364223a = dVar.f364155a;
            k0Var.f364226d = java.lang.String.valueOf(dVar.f225832p);
            k0Var.f364224b = dVar.f225831o;
            k0Var.f364225c = dVar.f364007i;
            java.lang.String str = dVar.f364011m;
            kotlin.jvm.internal.o.g(str, "<set-?>");
            k0Var.f364228f = str;
            k0Var.f364229g = dVar.f364008j;
            java.lang.String str2 = dVar.f364009k;
            kotlin.jvm.internal.o.g(str2, "<set-?>");
            k0Var.f364230h = str2;
            k0Var.f364227e = dVar.f364010l;
            sVar.f144167d = k0Var;
        }
        return sVar;
    }

    @Override // d22.p
    public java.lang.String j() {
        return "wxalite70a1e8c60370e23abcc1bde4e2c32f6f";
    }

    @Override // d22.p
    public void k(android.content.Context viewContext, d22.v liteAppContext) {
        kotlin.jvm.internal.o.g(viewContext, "viewContext");
        kotlin.jvm.internal.o.g(liteAppContext, "liteAppContext");
    }

    @Override // d22.p
    public boolean l() {
        return false;
    }

    @Override // d22.p
    public boolean n(d22.v context) {
        kotlin.jvm.internal.o.g(context, "context");
        return true;
    }
}
