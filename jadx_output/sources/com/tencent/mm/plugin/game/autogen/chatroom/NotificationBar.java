package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class NotificationBar extends com.tencent.mm.protobuf.f {
    public java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.Notification> notification_list = new java.util.LinkedList<>();
    public java.lang.String version;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.NotificationBar create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.NotificationBar();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.NotificationBar)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.NotificationBar notificationBar = (com.tencent.mm.plugin.game.autogen.chatroom.NotificationBar) fVar;
        return n51.f.a(this.notification_list, notificationBar.notification_list) && n51.f.a(this.version, notificationBar.version);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.notification_list);
            java.lang.String str = this.version;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.notification_list) + 0;
            java.lang.String str2 = this.version;
            return str2 != null ? g17 + b36.f.j(2, str2) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.notification_list.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        com.tencent.mm.plugin.game.autogen.chatroom.NotificationBar notificationBar = (com.tencent.mm.plugin.game.autogen.chatroom.NotificationBar) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            notificationBar.version = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            com.tencent.mm.plugin.game.autogen.chatroom.Notification notification = new com.tencent.mm.plugin.game.autogen.chatroom.Notification();
            if (bArr2 != null && bArr2.length > 0) {
                notification.parseFrom(bArr2);
            }
            notificationBar.notification_list.add(notification);
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.NotificationBar setNotification_list(java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.Notification> linkedList) {
        this.notification_list = linkedList;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.NotificationBar setVersion(java.lang.String str) {
        this.version = str;
        return this;
    }
}
