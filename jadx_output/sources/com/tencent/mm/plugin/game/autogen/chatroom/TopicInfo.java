package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class TopicInfo extends com.tencent.mm.protobuf.f {
    public java.lang.String content_id;
    public java.lang.String content_url;
    public boolean has_publish;
    public java.lang.String left_desc;
    public java.lang.String right_desc;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.TopicInfo create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.TopicInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.TopicInfo)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.TopicInfo topicInfo = (com.tencent.mm.plugin.game.autogen.chatroom.TopicInfo) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.has_publish), java.lang.Boolean.valueOf(topicInfo.has_publish)) && n51.f.a(this.content_id, topicInfo.content_id) && n51.f.a(this.content_url, topicInfo.content_url) && n51.f.a(this.left_desc, topicInfo.left_desc) && n51.f.a(this.right_desc, topicInfo.right_desc);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.has_publish);
            java.lang.String str = this.content_id;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.content_url;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.left_desc;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.right_desc;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.has_publish) + 0;
            java.lang.String str5 = this.content_id;
            if (str5 != null) {
                a17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.content_url;
            if (str6 != null) {
                a17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.left_desc;
            if (str7 != null) {
                a17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.right_desc;
            return str8 != null ? a17 + b36.f.j(5, str8) : a17;
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
        com.tencent.mm.plugin.game.autogen.chatroom.TopicInfo topicInfo = (com.tencent.mm.plugin.game.autogen.chatroom.TopicInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            topicInfo.has_publish = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            topicInfo.content_id = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            topicInfo.content_url = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            topicInfo.left_desc = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        topicInfo.right_desc = aVar2.k(intValue);
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.TopicInfo setContent_id(java.lang.String str) {
        this.content_id = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.TopicInfo setContent_url(java.lang.String str) {
        this.content_url = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.TopicInfo setHas_publish(boolean z17) {
        this.has_publish = z17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.TopicInfo setLeft_desc(java.lang.String str) {
        this.left_desc = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.TopicInfo setRight_desc(java.lang.String str) {
        this.right_desc = str;
        return this;
    }
}
