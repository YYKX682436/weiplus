package kn;

/* loaded from: classes11.dex */
public abstract class m0 {
    public static void a(java.lang.String str, int i17, int i18, int i19) {
        int i27 = c01.e2.T(str) ? 2 : 1;
        com.tencent.mm.autogen.mmdata.rpt.ChatRoomToolEditeLogStruct chatRoomToolEditeLogStruct = new com.tencent.mm.autogen.mmdata.rpt.ChatRoomToolEditeLogStruct();
        chatRoomToolEditeLogStruct.f55648d = chatRoomToolEditeLogStruct.b("roomusrname", str, true);
        chatRoomToolEditeLogStruct.f55649e = i17;
        chatRoomToolEditeLogStruct.f55650f = i27;
        chatRoomToolEditeLogStruct.f55651g = i18;
        chatRoomToolEditeLogStruct.f55652h = i19;
        chatRoomToolEditeLogStruct.k();
    }
}
