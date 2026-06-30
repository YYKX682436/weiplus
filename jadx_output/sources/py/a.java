package py;

@j95.b
/* loaded from: classes11.dex */
public class a extends i95.w implements qy.i {
    public boolean Ai(java.lang.String str) {
        com.tencent.mm.storage.a3 a3Var;
        java.util.Map map = c01.v1.f37519a;
        com.tencent.mm.storage.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        a17.getClass();
        java.lang.String str2 = null;
        iz5.a.g(null, str.length() > 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select roomowner from chatroom where chatroomname='");
        com.tencent.mm.sdk.platformtools.t8.n(str);
        sb6.append(str);
        sb6.append("'");
        android.database.Cursor f17 = a17.f193770d.f(sb6.toString(), null, 2);
        if (f17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomStorage", "getChatroomOwner fail, cursor is null");
        } else {
            if (f17.moveToFirst()) {
                a3Var = new com.tencent.mm.storage.a3();
                a3Var.convertFrom(f17);
            } else {
                a3Var = null;
            }
            f17.close();
            if (a3Var != null) {
                str2 = a3Var.field_roomowner;
            }
        }
        java.lang.String r17 = c01.z1.r();
        return (com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.K0(r17) || !str2.equals(r17)) ? false : true;
    }

    public int wi(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return 0;
        }
        return c01.v1.o(str);
    }
}
