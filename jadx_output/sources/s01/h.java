package s01;

/* loaded from: classes11.dex */
public class h extends dm.y0 {
    public static final l75.e0 S = dm.y0.initAutoDBInfo(s01.h.class);
    public final java.util.Map Q = new java.util.HashMap();
    public java.util.List R;

    @Override // dm.y0, l75.f0
    public l75.e0 getDBInfo() {
        return S;
    }

    public boolean t0(int i17) {
        return (i17 & this.field_bitFlag) != 0;
    }

    public s01.a0 u0(java.lang.String str) {
        java.util.HashMap hashMap = (java.util.HashMap) this.Q;
        if (!hashMap.containsKey(str) || hashMap.get(str) == null) {
            java.lang.System.currentTimeMillis();
            ((c01.d0) ((qk.m6) i95.n0.c(qk.m6.class))).getClass();
            s01.a0 y07 = r01.q3.Vi().y0(str);
            if (y07 != null) {
                hashMap.put(y07.field_userId, y07);
            }
            java.lang.System.currentTimeMillis();
        }
        if (hashMap.containsKey(str)) {
            return (s01.a0) hashMap.get(str);
        }
        return null;
    }

    public java.lang.String v0(java.lang.String str) {
        s01.a0 u07 = u0(str);
        if (u07 == null) {
            return "";
        }
        java.lang.String str2 = u07.field_userName;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return str2 == null ? "" : str2;
    }

    public java.util.List w0() {
        java.util.List list = this.R;
        if (list != null) {
            return list;
        }
        java.lang.String str = this.field_userList;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return new java.util.LinkedList();
        }
        java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(str.split(";"));
        this.R = P1;
        return P1;
    }

    public boolean y0() {
        java.lang.String str = this.field_bizChatServId;
        if (str == null) {
            return false;
        }
        return str.endsWith("@qy_g");
    }

    public boolean z0() {
        if (this.field_needToUpdate) {
            return true;
        }
        if (y0() && com.tencent.mm.sdk.platformtools.t8.K0(this.field_userList)) {
            return true;
        }
        return com.tencent.mm.sdk.platformtools.t8.K0(this.field_chatNamePY) && !com.tencent.mm.sdk.platformtools.t8.K0(this.field_chatName);
    }
}
