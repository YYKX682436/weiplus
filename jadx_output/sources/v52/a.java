package v52;

/* loaded from: classes11.dex */
public abstract class a {
    public static int a(java.lang.String str) {
        if (str == null) {
            return -1;
        }
        int i17 = com.tencent.mm.storage.z3.j4(str) ? 4 : (c01.e2.U(str) || com.tencent.mm.storage.z3.D4(str)) ? 5 : str.startsWith("gh_") ? 2 : com.tencent.mm.storage.z3.R4(str) ? 1 : 0;
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellChattingType", "getChatType: %s, %d", str, java.lang.Integer.valueOf(i17));
        return i17;
    }

    public static nm5.b b() {
        java.lang.String c17 = h52.b.c("Chat_User");
        int a17 = a(c17);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellChattingType", "getParamsOfChattingUI, chatType: %d", java.lang.Integer.valueOf(a17));
        return nm5.j.c(c17, java.lang.Integer.valueOf(a17));
    }

    public static nm5.b c() {
        r45.x35 a17 = i52.e.a();
        java.lang.String str = null;
        if (a17 != null) {
            java.util.LinkedList linkedList = a17.f389754d;
            if (!linkedList.isEmpty()) {
                java.util.Iterator it = linkedList.iterator();
                r45.p44 p44Var = null;
                while (it.hasNext()) {
                    r45.p44 p44Var2 = (r45.p44) it.next();
                    if (p44Var2 != null && "Chat_User".equals(p44Var2.f382747d)) {
                        p44Var = p44Var2;
                    }
                }
                if (p44Var != null) {
                    str = p44Var.f382748e;
                }
            }
        }
        int a18 = a(str);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellChattingType", "getParamsOfChattingUIFragment, chatType: %d", java.lang.Integer.valueOf(a18));
        return nm5.j.c(str, java.lang.Integer.valueOf(a18));
    }
}
