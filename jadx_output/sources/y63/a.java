package y63;

/* loaded from: classes5.dex */
public class a extends dm.c6 {
    public static final l75.e0 R = dm.c6.initAutoDBInfo(y63.a.class);
    public java.lang.String H = "";
    public java.lang.String I = "";

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f459651J = "";
    public java.lang.String K = " ";
    public int L = 1;
    public boolean M = false;
    public java.util.HashMap N = new java.util.HashMap();
    public boolean P = false;
    public int Q = 0;

    @Override // dm.c6, l75.f0
    public l75.e0 getDBInfo() {
        return R;
    }

    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public y63.a clone() {
        y63.a aVar;
        java.lang.Exception e17;
        try {
            aVar = new y63.a();
        } catch (java.lang.Exception e18) {
            aVar = null;
            e17 = e18;
        }
        try {
            aVar.systemRowid = this.systemRowid;
            aVar.field_username = this.field_username;
            aVar.field_key = this.field_key;
            aVar.field_content = this.field_content;
            aVar.field_creator = this.field_creator;
            aVar.field_num = this.field_num;
            aVar.field_firstMsgId = this.field_firstMsgId;
            aVar.field_msgSvrId = this.field_msgSvrId;
            aVar.field_active = this.field_active;
            aVar.field_lastActiveTime = this.field_lastActiveTime;
            aVar.H = this.H;
            aVar.I = this.I;
            aVar.f459651J = this.f459651J;
            aVar.K = this.K;
            aVar.L = this.L;
            aVar.Q = this.Q;
            aVar.P = this.P;
            aVar.N = new java.util.HashMap();
            for (int i17 = 1; i17 <= this.N.size(); i17++) {
                aVar.N.put(java.lang.Integer.valueOf(i17), ((y63.b) this.N.get(java.lang.Integer.valueOf(i17))).clone());
            }
        } catch (java.lang.Exception e19) {
            e17 = e19;
            com.tencent.mars.xlog.Log.i("MicroMsg.groupsolitaire.GroupSolitatire", "clone() Exception:%s %s", e17.getClass(), e17.getMessage());
            return aVar;
        }
        return aVar;
    }

    public java.lang.String toString() {
        return "GroupSolitatire{header='" + this.H + "', example='" + this.I + "', tail='" + this.f459651J + "', separator='" + this.K + "', hasRealTitle=" + this.L + ", content=" + this.N + ", includeRepeatedContent=" + this.P + ", includeWhiteContentNum=" + this.Q + ", field_username='" + this.field_username + "', field_key='" + this.field_key + "', field_content='" + this.field_content + "', field_creator='" + this.field_creator + "', field_num=" + this.field_num + ", field_firstMsgId=" + this.field_firstMsgId + ", field_msgSvrId=" + this.field_msgSvrId + ", field_active=" + this.field_active + ", field_lastActiveTime=" + this.field_lastActiveTime + ", systemRowid=" + this.systemRowid + '}';
    }
}
