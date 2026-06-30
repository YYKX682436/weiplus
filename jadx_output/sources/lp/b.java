package lp;

/* loaded from: classes5.dex */
public class b implements q25.a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f320222a = 0;

    static {
        q25.b.b(new lp.b(), "//chatroom");
    }

    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, final java.lang.String str) {
        if (com.tencent.mars.xlog.Log.getLogLevel() > 1) {
            return false;
        }
        if (strArr.length < 2) {
            return true;
        }
        java.lang.String str2 = strArr[1];
        str2.getClass();
        if (!str2.equals("info")) {
            if (str2.equals("nickname") && com.tencent.mm.storage.z3.N4(str)) {
                com.tencent.mm.storage.a3 W0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(str);
                W0.W0(0);
                ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().replace(W0);
                com.tencent.mm.roomsdk.model.factory.a g17 = ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(str).g(str, 0);
                g17.f192246b = new o65.c() { // from class: lp.b$$a
                    @Override // o65.c
                    /* renamed from: b */
                    public final void a(int i17, int i18, java.lang.String str3, o65.c cVar) {
                        java.lang.String str4 = str;
                        if (i17 != 0 || i18 != 0) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Command.ChatRoom", "getChatroomMemberDetail %s errorType %s errorCoe", str4, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                            return;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.Command.ChatRoom", "getChatroomMemberDetail success %s", str4);
                        ((ku5.t0) ku5.t0.f312615d).B(new lp.b$$c());
                    }
                };
                g17.b();
            }
            return true;
        }
        if (com.tencent.mm.storage.z3.N4(str)) {
            com.tencent.mm.roomsdk.model.factory.a m17 = ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(str).m(str);
            m17.f192246b = new o65.c() { // from class: lp.b$$b
                @Override // o65.c
                /* renamed from: b */
                public final void a(int i17, int i18, java.lang.String str3, o65.c cVar) {
                    java.lang.String str4 = str;
                    if (i17 != 0 || i18 != 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Command.ChatRoom", "getchatRoomInfoDetail %s errorType %s errorCoe", str4, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.Command.ChatRoom", "getchatRoomInfoDetail success %s", str4);
                    ((ku5.t0) ku5.t0.f312615d).B(new lp.b$$d());
                }
            };
            m17.b();
        }
        return true;
    }
}
