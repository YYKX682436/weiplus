package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes8.dex */
public class ChatroomMsgImage extends com.tencent.mm.protobuf.f {
    public java.lang.String aeskey;
    public int crypt_ver;
    public int hd_height;
    public int hd_size;
    public int hd_width;
    public int hevc_hd_size;
    public int hevc_mid_size;
    public int hevc_thumb_size;

    /* renamed from: md5, reason: collision with root package name */
    public java.lang.String f138698md5;
    public int mid_height;
    public int mid_size;
    public int mid_width;
    public int thumb_height;
    public int thumb_size;
    public int thumb_width;
    public java.lang.String url;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage chatroomMsgImage = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage) fVar;
        return n51.f.a(this.aeskey, chatroomMsgImage.aeskey) && n51.f.a(java.lang.Integer.valueOf(this.crypt_ver), java.lang.Integer.valueOf(chatroomMsgImage.crypt_ver)) && n51.f.a(this.url, chatroomMsgImage.url) && n51.f.a(java.lang.Integer.valueOf(this.hd_size), java.lang.Integer.valueOf(chatroomMsgImage.hd_size)) && n51.f.a(java.lang.Integer.valueOf(this.mid_size), java.lang.Integer.valueOf(chatroomMsgImage.mid_size)) && n51.f.a(java.lang.Integer.valueOf(this.thumb_size), java.lang.Integer.valueOf(chatroomMsgImage.thumb_size)) && n51.f.a(java.lang.Integer.valueOf(this.thumb_height), java.lang.Integer.valueOf(chatroomMsgImage.thumb_height)) && n51.f.a(java.lang.Integer.valueOf(this.thumb_width), java.lang.Integer.valueOf(chatroomMsgImage.thumb_width)) && n51.f.a(this.f138698md5, chatroomMsgImage.f138698md5) && n51.f.a(java.lang.Integer.valueOf(this.mid_height), java.lang.Integer.valueOf(chatroomMsgImage.mid_height)) && n51.f.a(java.lang.Integer.valueOf(this.mid_width), java.lang.Integer.valueOf(chatroomMsgImage.mid_width)) && n51.f.a(java.lang.Integer.valueOf(this.hd_height), java.lang.Integer.valueOf(chatroomMsgImage.hd_height)) && n51.f.a(java.lang.Integer.valueOf(this.hd_width), java.lang.Integer.valueOf(chatroomMsgImage.hd_width)) && n51.f.a(java.lang.Integer.valueOf(this.hevc_hd_size), java.lang.Integer.valueOf(chatroomMsgImage.hevc_hd_size)) && n51.f.a(java.lang.Integer.valueOf(this.hevc_mid_size), java.lang.Integer.valueOf(chatroomMsgImage.hevc_mid_size)) && n51.f.a(java.lang.Integer.valueOf(this.hevc_thumb_size), java.lang.Integer.valueOf(chatroomMsgImage.hevc_thumb_size));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.aeskey;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.crypt_ver);
            java.lang.String str2 = this.url;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.hd_size);
            fVar.e(5, this.mid_size);
            fVar.e(6, this.thumb_size);
            fVar.e(7, this.thumb_height);
            fVar.e(8, this.thumb_width);
            java.lang.String str3 = this.f138698md5;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.e(10, this.mid_height);
            fVar.e(11, this.mid_width);
            fVar.e(12, this.hd_height);
            fVar.e(13, this.hd_width);
            fVar.e(14, this.hevc_hd_size);
            fVar.e(15, this.hevc_mid_size);
            fVar.e(16, this.hevc_thumb_size);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.aeskey;
            int j17 = (str4 != null ? b36.f.j(1, str4) + 0 : 0) + b36.f.e(2, this.crypt_ver);
            java.lang.String str5 = this.url;
            if (str5 != null) {
                j17 += b36.f.j(3, str5);
            }
            int e17 = j17 + b36.f.e(4, this.hd_size) + b36.f.e(5, this.mid_size) + b36.f.e(6, this.thumb_size) + b36.f.e(7, this.thumb_height) + b36.f.e(8, this.thumb_width);
            java.lang.String str6 = this.f138698md5;
            if (str6 != null) {
                e17 += b36.f.j(9, str6);
            }
            return e17 + b36.f.e(10, this.mid_height) + b36.f.e(11, this.mid_width) + b36.f.e(12, this.hd_height) + b36.f.e(13, this.hd_width) + b36.f.e(14, this.hevc_hd_size) + b36.f.e(15, this.hevc_mid_size) + b36.f.e(16, this.hevc_thumb_size);
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
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage chatroomMsgImage = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                chatroomMsgImage.aeskey = aVar2.k(intValue);
                return 0;
            case 2:
                chatroomMsgImage.crypt_ver = aVar2.g(intValue);
                return 0;
            case 3:
                chatroomMsgImage.url = aVar2.k(intValue);
                return 0;
            case 4:
                chatroomMsgImage.hd_size = aVar2.g(intValue);
                return 0;
            case 5:
                chatroomMsgImage.mid_size = aVar2.g(intValue);
                return 0;
            case 6:
                chatroomMsgImage.thumb_size = aVar2.g(intValue);
                return 0;
            case 7:
                chatroomMsgImage.thumb_height = aVar2.g(intValue);
                return 0;
            case 8:
                chatroomMsgImage.thumb_width = aVar2.g(intValue);
                return 0;
            case 9:
                chatroomMsgImage.f138698md5 = aVar2.k(intValue);
                return 0;
            case 10:
                chatroomMsgImage.mid_height = aVar2.g(intValue);
                return 0;
            case 11:
                chatroomMsgImage.mid_width = aVar2.g(intValue);
                return 0;
            case 12:
                chatroomMsgImage.hd_height = aVar2.g(intValue);
                return 0;
            case 13:
                chatroomMsgImage.hd_width = aVar2.g(intValue);
                return 0;
            case 14:
                chatroomMsgImage.hevc_hd_size = aVar2.g(intValue);
                return 0;
            case 15:
                chatroomMsgImage.hevc_mid_size = aVar2.g(intValue);
                return 0;
            case 16:
                chatroomMsgImage.hevc_thumb_size = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage setAeskey(java.lang.String str) {
        this.aeskey = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage setCrypt_ver(int i17) {
        this.crypt_ver = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage setHd_height(int i17) {
        this.hd_height = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage setHd_size(int i17) {
        this.hd_size = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage setHd_width(int i17) {
        this.hd_width = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage setHevc_hd_size(int i17) {
        this.hevc_hd_size = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage setHevc_mid_size(int i17) {
        this.hevc_mid_size = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage setHevc_thumb_size(int i17) {
        this.hevc_thumb_size = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage setMd5(java.lang.String str) {
        this.f138698md5 = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage setMid_height(int i17) {
        this.mid_height = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage setMid_size(int i17) {
        this.mid_size = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage setMid_width(int i17) {
        this.mid_width = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage setThumb_height(int i17) {
        this.thumb_height = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage setThumb_size(int i17) {
        this.thumb_size = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage setThumb_width(int i17) {
        this.thumb_width = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage setUrl(java.lang.String str) {
        this.url = str;
        return this;
    }
}
