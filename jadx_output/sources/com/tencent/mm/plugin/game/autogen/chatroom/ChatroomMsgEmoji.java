package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes12.dex */
public class ChatroomMsgEmoji extends com.tencent.mm.protobuf.f {
    public java.lang.String activityid;
    public java.lang.String aeskey;
    public java.lang.String attachedtext;
    public java.lang.String attachedtextcolor;
    public java.lang.String authkey;
    public java.lang.String cdnurl;
    public java.lang.String designerid;
    public java.lang.String emojiattr;
    public java.lang.String encrypturl;
    public java.lang.String externmd5;
    public java.lang.String externurl;
    public java.lang.String extxml;
    public int height;
    public boolean is_charge;
    public int len;
    public java.lang.String lensid;

    /* renamed from: md5, reason: collision with root package name */
    public java.lang.String f138697md5;
    public int newxmlflag;
    public java.lang.String productid;
    public java.lang.String thumburl;
    public java.lang.String tpurl;
    public int type;
    public int width;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji chatroomMsgEmoji = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji) fVar;
        return n51.f.a(this.f138697md5, chatroomMsgEmoji.f138697md5) && n51.f.a(java.lang.Integer.valueOf(this.len), java.lang.Integer.valueOf(chatroomMsgEmoji.len)) && n51.f.a(this.productid, chatroomMsgEmoji.productid) && n51.f.a(java.lang.Integer.valueOf(this.type), java.lang.Integer.valueOf(chatroomMsgEmoji.type)) && n51.f.a(this.extxml, chatroomMsgEmoji.extxml) && n51.f.a(this.cdnurl, chatroomMsgEmoji.cdnurl) && n51.f.a(java.lang.Integer.valueOf(this.newxmlflag), java.lang.Integer.valueOf(chatroomMsgEmoji.newxmlflag)) && n51.f.a(this.designerid, chatroomMsgEmoji.designerid) && n51.f.a(this.thumburl, chatroomMsgEmoji.thumburl) && n51.f.a(this.encrypturl, chatroomMsgEmoji.encrypturl) && n51.f.a(this.aeskey, chatroomMsgEmoji.aeskey) && n51.f.a(java.lang.Integer.valueOf(this.width), java.lang.Integer.valueOf(chatroomMsgEmoji.width)) && n51.f.a(java.lang.Integer.valueOf(this.height), java.lang.Integer.valueOf(chatroomMsgEmoji.height)) && n51.f.a(this.externurl, chatroomMsgEmoji.externurl) && n51.f.a(this.externmd5, chatroomMsgEmoji.externmd5) && n51.f.a(this.activityid, chatroomMsgEmoji.activityid) && n51.f.a(this.tpurl, chatroomMsgEmoji.tpurl) && n51.f.a(this.authkey, chatroomMsgEmoji.authkey) && n51.f.a(this.attachedtext, chatroomMsgEmoji.attachedtext) && n51.f.a(this.attachedtextcolor, chatroomMsgEmoji.attachedtextcolor) && n51.f.a(this.lensid, chatroomMsgEmoji.lensid) && n51.f.a(java.lang.Boolean.valueOf(this.is_charge), java.lang.Boolean.valueOf(chatroomMsgEmoji.is_charge)) && n51.f.a(this.emojiattr, chatroomMsgEmoji.emojiattr);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f138697md5;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.len);
            java.lang.String str2 = this.productid;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.type);
            java.lang.String str3 = this.extxml;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.cdnurl;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.newxmlflag);
            java.lang.String str5 = this.designerid;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.thumburl;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.encrypturl;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            java.lang.String str8 = this.aeskey;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            fVar.e(12, this.width);
            fVar.e(13, this.height);
            java.lang.String str9 = this.externurl;
            if (str9 != null) {
                fVar.j(14, str9);
            }
            java.lang.String str10 = this.externmd5;
            if (str10 != null) {
                fVar.j(15, str10);
            }
            java.lang.String str11 = this.activityid;
            if (str11 != null) {
                fVar.j(16, str11);
            }
            java.lang.String str12 = this.tpurl;
            if (str12 != null) {
                fVar.j(17, str12);
            }
            java.lang.String str13 = this.authkey;
            if (str13 != null) {
                fVar.j(18, str13);
            }
            java.lang.String str14 = this.attachedtext;
            if (str14 != null) {
                fVar.j(19, str14);
            }
            java.lang.String str15 = this.attachedtextcolor;
            if (str15 != null) {
                fVar.j(20, str15);
            }
            java.lang.String str16 = this.lensid;
            if (str16 != null) {
                fVar.j(21, str16);
            }
            fVar.a(22, this.is_charge);
            java.lang.String str17 = this.emojiattr;
            if (str17 != null) {
                fVar.j(23, str17);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str18 = this.f138697md5;
            int j17 = (str18 != null ? b36.f.j(1, str18) + 0 : 0) + b36.f.e(2, this.len);
            java.lang.String str19 = this.productid;
            if (str19 != null) {
                j17 += b36.f.j(3, str19);
            }
            int e17 = j17 + b36.f.e(4, this.type);
            java.lang.String str20 = this.extxml;
            if (str20 != null) {
                e17 += b36.f.j(5, str20);
            }
            java.lang.String str21 = this.cdnurl;
            if (str21 != null) {
                e17 += b36.f.j(6, str21);
            }
            int e18 = e17 + b36.f.e(7, this.newxmlflag);
            java.lang.String str22 = this.designerid;
            if (str22 != null) {
                e18 += b36.f.j(8, str22);
            }
            java.lang.String str23 = this.thumburl;
            if (str23 != null) {
                e18 += b36.f.j(9, str23);
            }
            java.lang.String str24 = this.encrypturl;
            if (str24 != null) {
                e18 += b36.f.j(10, str24);
            }
            java.lang.String str25 = this.aeskey;
            if (str25 != null) {
                e18 += b36.f.j(11, str25);
            }
            int e19 = e18 + b36.f.e(12, this.width) + b36.f.e(13, this.height);
            java.lang.String str26 = this.externurl;
            if (str26 != null) {
                e19 += b36.f.j(14, str26);
            }
            java.lang.String str27 = this.externmd5;
            if (str27 != null) {
                e19 += b36.f.j(15, str27);
            }
            java.lang.String str28 = this.activityid;
            if (str28 != null) {
                e19 += b36.f.j(16, str28);
            }
            java.lang.String str29 = this.tpurl;
            if (str29 != null) {
                e19 += b36.f.j(17, str29);
            }
            java.lang.String str30 = this.authkey;
            if (str30 != null) {
                e19 += b36.f.j(18, str30);
            }
            java.lang.String str31 = this.attachedtext;
            if (str31 != null) {
                e19 += b36.f.j(19, str31);
            }
            java.lang.String str32 = this.attachedtextcolor;
            if (str32 != null) {
                e19 += b36.f.j(20, str32);
            }
            java.lang.String str33 = this.lensid;
            if (str33 != null) {
                e19 += b36.f.j(21, str33);
            }
            int a17 = e19 + b36.f.a(22, this.is_charge);
            java.lang.String str34 = this.emojiattr;
            return str34 != null ? a17 + b36.f.j(23, str34) : a17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji chatroomMsgEmoji = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                chatroomMsgEmoji.f138697md5 = aVar2.k(intValue);
                return 0;
            case 2:
                chatroomMsgEmoji.len = aVar2.g(intValue);
                return 0;
            case 3:
                chatroomMsgEmoji.productid = aVar2.k(intValue);
                return 0;
            case 4:
                chatroomMsgEmoji.type = aVar2.g(intValue);
                return 0;
            case 5:
                chatroomMsgEmoji.extxml = aVar2.k(intValue);
                return 0;
            case 6:
                chatroomMsgEmoji.cdnurl = aVar2.k(intValue);
                return 0;
            case 7:
                chatroomMsgEmoji.newxmlflag = aVar2.g(intValue);
                return 0;
            case 8:
                chatroomMsgEmoji.designerid = aVar2.k(intValue);
                return 0;
            case 9:
                chatroomMsgEmoji.thumburl = aVar2.k(intValue);
                return 0;
            case 10:
                chatroomMsgEmoji.encrypturl = aVar2.k(intValue);
                return 0;
            case 11:
                chatroomMsgEmoji.aeskey = aVar2.k(intValue);
                return 0;
            case 12:
                chatroomMsgEmoji.width = aVar2.g(intValue);
                return 0;
            case 13:
                chatroomMsgEmoji.height = aVar2.g(intValue);
                return 0;
            case 14:
                chatroomMsgEmoji.externurl = aVar2.k(intValue);
                return 0;
            case 15:
                chatroomMsgEmoji.externmd5 = aVar2.k(intValue);
                return 0;
            case 16:
                chatroomMsgEmoji.activityid = aVar2.k(intValue);
                return 0;
            case 17:
                chatroomMsgEmoji.tpurl = aVar2.k(intValue);
                return 0;
            case 18:
                chatroomMsgEmoji.authkey = aVar2.k(intValue);
                return 0;
            case 19:
                chatroomMsgEmoji.attachedtext = aVar2.k(intValue);
                return 0;
            case 20:
                chatroomMsgEmoji.attachedtextcolor = aVar2.k(intValue);
                return 0;
            case 21:
                chatroomMsgEmoji.lensid = aVar2.k(intValue);
                return 0;
            case 22:
                chatroomMsgEmoji.is_charge = aVar2.c(intValue);
                return 0;
            case 23:
                chatroomMsgEmoji.emojiattr = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji setActivityid(java.lang.String str) {
        this.activityid = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji setAeskey(java.lang.String str) {
        this.aeskey = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji setAttachedtext(java.lang.String str) {
        this.attachedtext = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji setAttachedtextcolor(java.lang.String str) {
        this.attachedtextcolor = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji setAuthkey(java.lang.String str) {
        this.authkey = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji setCdnurl(java.lang.String str) {
        this.cdnurl = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji setDesignerid(java.lang.String str) {
        this.designerid = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji setEmojiattr(java.lang.String str) {
        this.emojiattr = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji setEncrypturl(java.lang.String str) {
        this.encrypturl = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji setExternmd5(java.lang.String str) {
        this.externmd5 = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji setExternurl(java.lang.String str) {
        this.externurl = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji setExtxml(java.lang.String str) {
        this.extxml = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji setHeight(int i17) {
        this.height = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji setIs_charge(boolean z17) {
        this.is_charge = z17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji setLen(int i17) {
        this.len = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji setLensid(java.lang.String str) {
        this.lensid = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji setMd5(java.lang.String str) {
        this.f138697md5 = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji setNewxmlflag(int i17) {
        this.newxmlflag = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji setProductid(java.lang.String str) {
        this.productid = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji setThumburl(java.lang.String str) {
        this.thumburl = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji setTpurl(java.lang.String str) {
        this.tpurl = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji setType(int i17) {
        this.type = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji setWidth(int i17) {
        this.width = i17;
        return this;
    }
}
