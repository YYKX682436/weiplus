package kn;

/* loaded from: classes16.dex */
public abstract class k0 {
    public static void a(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3) {
        int i19 = c01.e2.T(str) ? 2 : c01.e2.V(str) ? 1 : 0;
        com.tencent.mm.autogen.mmdata.rpt.RoomTodoEnterStruct roomTodoEnterStruct = new com.tencent.mm.autogen.mmdata.rpt.RoomTodoEnterStruct();
        roomTodoEnterStruct.f60089d = roomTodoEnterStruct.b("roomId", str, true);
        roomTodoEnterStruct.f60090e = i19;
        roomTodoEnterStruct.f60091f = i17;
        roomTodoEnterStruct.f60092g = i18;
        roomTodoEnterStruct.f60093h = 2L;
        roomTodoEnterStruct.f60094i = roomTodoEnterStruct.b("todoid", str2, true);
        roomTodoEnterStruct.f60095j = roomTodoEnterStruct.b("appusername", str3, true);
        roomTodoEnterStruct.k();
    }

    public static void b(java.lang.String str, int i17, int i18, int i19, java.lang.String str2, java.lang.String str3) {
        int i27 = c01.e2.T(str) ? 2 : c01.e2.V(str) ? 1 : 0;
        com.tencent.mm.autogen.mmdata.rpt.RoomTodoHandleStruct roomTodoHandleStruct = new com.tencent.mm.autogen.mmdata.rpt.RoomTodoHandleStruct();
        roomTodoHandleStruct.f60096d = roomTodoHandleStruct.b("roomId", str, true);
        roomTodoHandleStruct.f60097e = i27;
        roomTodoHandleStruct.f60098f = i17;
        roomTodoHandleStruct.f60099g = i18;
        roomTodoHandleStruct.f60100h = i19;
        roomTodoHandleStruct.f60101i = roomTodoHandleStruct.b("todoid", str2, true);
        roomTodoHandleStruct.f60102j = roomTodoHandleStruct.b("appusername", str3, true);
        roomTodoHandleStruct.k();
    }

    public static void c(java.lang.String str, int i17, int i18, int i19, int i27, java.lang.String str2, java.lang.String str3) {
        int i28 = c01.e2.T(str) ? 2 : 1;
        com.tencent.mm.autogen.mmdata.rpt.RoomTodoMsgTailOpStruct roomTodoMsgTailOpStruct = new com.tencent.mm.autogen.mmdata.rpt.RoomTodoMsgTailOpStruct();
        roomTodoMsgTailOpStruct.f60103d = roomTodoMsgTailOpStruct.b("roomid", str, true);
        roomTodoMsgTailOpStruct.f60104e = i28;
        roomTodoMsgTailOpStruct.f60105f = i17;
        roomTodoMsgTailOpStruct.f60106g = i18;
        roomTodoMsgTailOpStruct.f60107h = i19;
        roomTodoMsgTailOpStruct.f60108i = i27;
        roomTodoMsgTailOpStruct.f60109j = roomTodoMsgTailOpStruct.b("todoid", str2, true);
        roomTodoMsgTailOpStruct.f60110k = roomTodoMsgTailOpStruct.b("appusername", str3, true);
        roomTodoMsgTailOpStruct.k();
    }
}
