package ot0;

/* loaded from: classes9.dex */
public class d extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.storage.emotion.EmojiInfo f348438b;

    /* renamed from: c, reason: collision with root package name */
    public int f348439c = 0;

    @Override // ot0.h
    public ot0.h a() {
        return new ot0.d();
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        if (qVar.f348666i == 2001) {
            qg0.h0 h0Var = (qg0.h0) i95.n0.c(qg0.h0.class);
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = this.f348438b;
            if (emojiInfo == null) {
                emojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo();
            }
            int i19 = this.f348439c;
            ((pg0.s3) h0Var).getClass();
            gb3.q.a(sb6, emojiInfo, i19);
        }
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        if (qVar.f348666i == 2001) {
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo();
            java.lang.String str = (java.lang.String) map.get(".msg.appmsg.emoji.md5");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            emojiInfo.field_md5 = str;
            emojiInfo.field_type = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.emoji.type"), 0);
            emojiInfo.field_width = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.emoji.width"), 0);
            emojiInfo.field_height = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.emoji.height"), 0);
            emojiInfo.field_size = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.emoji.len"), 0);
            java.lang.String str2 = (java.lang.String) map.get(".msg.appmsg.emoji.aeskey");
            if (str2 == null) {
                str2 = "";
            }
            emojiInfo.field_aeskey = str2;
            java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.emoji.cdnurl");
            if (str3 == null) {
                str3 = "";
            }
            emojiInfo.field_cdnUrl = str3;
            java.lang.String str4 = (java.lang.String) map.get(".msg.appmsg.emoji.encrypturl");
            if (str4 == null) {
                str4 = "";
            }
            emojiInfo.field_encrypturl = str4;
            java.lang.String str5 = (java.lang.String) map.get(".msg.appmsg.emoji.externurl");
            if (str5 == null) {
                str5 = "";
            }
            emojiInfo.field_externUrl = str5;
            java.lang.String str6 = (java.lang.String) map.get(".msg.appmsg.emoji.externmd5");
            if (str6 == null) {
                str6 = "";
            }
            emojiInfo.field_externMd5 = str6;
            java.lang.String str7 = (java.lang.String) map.get(".msg.appmsg.emoji.productid");
            if (str7 == null) {
                str7 = "";
            }
            emojiInfo.field_groupId = str7;
            java.lang.String str8 = (java.lang.String) map.get(".msg.appmsg.emoji.designerid");
            if (str8 == null) {
                str8 = "";
            }
            emojiInfo.field_designerID = str8;
            java.lang.String str9 = (java.lang.String) map.get(".msg.appmsg.emoji.attachedtext");
            emojiInfo.field_attachedText = str9 != null ? str9 : "";
            emojiInfo.field_temp = 1;
            emojiInfo.field_catalog = 65;
            emojiInfo.field_state = 8;
            this.f348438b = emojiInfo;
            this.f348439c = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.emoji.localreceivestatus"), 0);
            if (map.get(".msg.appmsg.emoji.localreceivestatus") == null && map.get(".msg.appmsg.wcpayinfo.receivestatus") != null) {
                this.f348439c = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.wcpayinfo.receivestatus"), 0);
            }
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            if (com.tencent.mm.storage.n5.f().c().u1(emojiInfo.field_md5) == null) {
                ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
                com.tencent.mm.storage.n5.f().c().J0(this.f348438b);
            }
        }
    }
}
