package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class GetChatroomRealtimeInfoResponse extends r45.js5 {
    public com.tencent.mm.plugin.game.autogen.chatroom.AtInfo at_info;
    public com.tencent.mm.plugin.game.autogen.chatroom.Broadcast broadcast;
    public com.tencent.mm.plugin.game.autogen.chatroom.RealtimeControlInfo control_info;
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData current_chatroom_data;
    public java.lang.String next_version;
    public com.tencent.mm.plugin.game.autogen.chatroom.NotificationBar notification_bar;
    public com.tencent.mm.plugin.game.autogen.chatroom.Popup popup;
    public com.tencent.mm.plugin.game.autogen.chatroom.SlotList slot_list;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomRealtimeInfoResponse create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomRealtimeInfoResponse();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomRealtimeInfoResponse)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomRealtimeInfoResponse getChatroomRealtimeInfoResponse = (com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomRealtimeInfoResponse) fVar;
        return n51.f.a(this.BaseResponse, getChatroomRealtimeInfoResponse.BaseResponse) && n51.f.a(this.notification_bar, getChatroomRealtimeInfoResponse.notification_bar) && n51.f.a(this.slot_list, getChatroomRealtimeInfoResponse.slot_list) && n51.f.a(this.broadcast, getChatroomRealtimeInfoResponse.broadcast) && n51.f.a(this.next_version, getChatroomRealtimeInfoResponse.next_version) && n51.f.a(this.at_info, getChatroomRealtimeInfoResponse.at_info) && n51.f.a(this.current_chatroom_data, getChatroomRealtimeInfoResponse.current_chatroom_data) && n51.f.a(this.control_info, getChatroomRealtimeInfoResponse.control_info) && n51.f.a(this.popup, getChatroomRealtimeInfoResponse.popup);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.NotificationBar notificationBar = this.notification_bar;
            if (notificationBar != null) {
                fVar.i(2, notificationBar.computeSize());
                this.notification_bar.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.SlotList slotList = this.slot_list;
            if (slotList != null) {
                fVar.i(3, slotList.computeSize());
                this.slot_list.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.Broadcast broadcast = this.broadcast;
            if (broadcast != null) {
                fVar.i(4, broadcast.computeSize());
                this.broadcast.writeFields(fVar);
            }
            java.lang.String str = this.next_version;
            if (str != null) {
                fVar.j(5, str);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.AtInfo atInfo = this.at_info;
            if (atInfo != null) {
                fVar.i(6, atInfo.computeSize());
                this.at_info.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData chatroomData = this.current_chatroom_data;
            if (chatroomData != null) {
                fVar.i(7, chatroomData.computeSize());
                this.current_chatroom_data.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.RealtimeControlInfo realtimeControlInfo = this.control_info;
            if (realtimeControlInfo != null) {
                fVar.i(8, realtimeControlInfo.computeSize());
                this.control_info.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.Popup popup = this.popup;
            if (popup != null) {
                fVar.i(9, popup.computeSize());
                this.popup.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            com.tencent.mm.plugin.game.autogen.chatroom.NotificationBar notificationBar2 = this.notification_bar;
            if (notificationBar2 != null) {
                i18 += b36.f.i(2, notificationBar2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.SlotList slotList2 = this.slot_list;
            if (slotList2 != null) {
                i18 += b36.f.i(3, slotList2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.Broadcast broadcast2 = this.broadcast;
            if (broadcast2 != null) {
                i18 += b36.f.i(4, broadcast2.computeSize());
            }
            java.lang.String str2 = this.next_version;
            if (str2 != null) {
                i18 += b36.f.j(5, str2);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.AtInfo atInfo2 = this.at_info;
            if (atInfo2 != null) {
                i18 += b36.f.i(6, atInfo2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData chatroomData2 = this.current_chatroom_data;
            if (chatroomData2 != null) {
                i18 += b36.f.i(7, chatroomData2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.RealtimeControlInfo realtimeControlInfo2 = this.control_info;
            if (realtimeControlInfo2 != null) {
                i18 += b36.f.i(8, realtimeControlInfo2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.Popup popup2 = this.popup;
            return popup2 != null ? i18 + b36.f.i(9, popup2.computeSize()) : i18;
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
        com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomRealtimeInfoResponse getChatroomRealtimeInfoResponse = (com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomRealtimeInfoResponse) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    getChatroomRealtimeInfoResponse.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.tencent.mm.plugin.game.autogen.chatroom.NotificationBar notificationBar3 = new com.tencent.mm.plugin.game.autogen.chatroom.NotificationBar();
                    if (bArr2 != null && bArr2.length > 0) {
                        notificationBar3.parseFrom(bArr2);
                    }
                    getChatroomRealtimeInfoResponse.notification_bar = notificationBar3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    com.tencent.mm.plugin.game.autogen.chatroom.SlotList slotList3 = new com.tencent.mm.plugin.game.autogen.chatroom.SlotList();
                    if (bArr3 != null && bArr3.length > 0) {
                        slotList3.parseFrom(bArr3);
                    }
                    getChatroomRealtimeInfoResponse.slot_list = slotList3;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    com.tencent.mm.plugin.game.autogen.chatroom.Broadcast broadcast3 = new com.tencent.mm.plugin.game.autogen.chatroom.Broadcast();
                    if (bArr4 != null && bArr4.length > 0) {
                        broadcast3.parseFrom(bArr4);
                    }
                    getChatroomRealtimeInfoResponse.broadcast = broadcast3;
                }
                return 0;
            case 5:
                getChatroomRealtimeInfoResponse.next_version = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    com.tencent.mm.plugin.game.autogen.chatroom.AtInfo atInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.AtInfo();
                    if (bArr5 != null && bArr5.length > 0) {
                        atInfo3.parseFrom(bArr5);
                    }
                    getChatroomRealtimeInfoResponse.at_info = atInfo3;
                }
                return 0;
            case 7:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData chatroomData3 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData();
                    if (bArr6 != null && bArr6.length > 0) {
                        chatroomData3.parseFrom(bArr6);
                    }
                    getChatroomRealtimeInfoResponse.current_chatroom_data = chatroomData3;
                }
                return 0;
            case 8:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    com.tencent.mm.plugin.game.autogen.chatroom.RealtimeControlInfo realtimeControlInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.RealtimeControlInfo();
                    if (bArr7 != null && bArr7.length > 0) {
                        realtimeControlInfo3.parseFrom(bArr7);
                    }
                    getChatroomRealtimeInfoResponse.control_info = realtimeControlInfo3;
                }
                return 0;
            case 9:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    com.tencent.mm.plugin.game.autogen.chatroom.Popup popup3 = new com.tencent.mm.plugin.game.autogen.chatroom.Popup();
                    if (bArr8 != null && bArr8.length > 0) {
                        popup3.parseFrom(bArr8);
                    }
                    getChatroomRealtimeInfoResponse.popup = popup3;
                }
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomRealtimeInfoResponse setAt_info(com.tencent.mm.plugin.game.autogen.chatroom.AtInfo atInfo) {
        this.at_info = atInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomRealtimeInfoResponse setBroadcast(com.tencent.mm.plugin.game.autogen.chatroom.Broadcast broadcast) {
        this.broadcast = broadcast;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomRealtimeInfoResponse setControl_info(com.tencent.mm.plugin.game.autogen.chatroom.RealtimeControlInfo realtimeControlInfo) {
        this.control_info = realtimeControlInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomRealtimeInfoResponse setCurrent_chatroom_data(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData chatroomData) {
        this.current_chatroom_data = chatroomData;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomRealtimeInfoResponse setNext_version(java.lang.String str) {
        this.next_version = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomRealtimeInfoResponse setNotification_bar(com.tencent.mm.plugin.game.autogen.chatroom.NotificationBar notificationBar) {
        this.notification_bar = notificationBar;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomRealtimeInfoResponse setPopup(com.tencent.mm.plugin.game.autogen.chatroom.Popup popup) {
        this.popup = popup;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomRealtimeInfoResponse setSlot_list(com.tencent.mm.plugin.game.autogen.chatroom.SlotList slotList) {
        this.slot_list = slotList;
        return this;
    }
}
