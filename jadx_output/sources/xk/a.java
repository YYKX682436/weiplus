package xk;

/* loaded from: classes4.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f454917d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f454918e;

    /* renamed from: f, reason: collision with root package name */
    public final long f454919f = java.lang.System.currentTimeMillis();

    public a(android.content.Context context, java.lang.String str, int i17, android.os.Bundle bundle) {
        r45.r44 r44Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 4790;
        lVar.f70666c = "/cgi-bin/mmsearch-bin/mmgettagjump";
        lVar.f70664a = new r45.mx5();
        lVar.f70665b = new r45.nx5();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f454918e = a17;
        r45.mx5 mx5Var = (r45.mx5) a17.f70710a.f70684a;
        mx5Var.f380898e = str;
        mx5Var.f380897d = i17;
        if (bundle == null) {
            r44Var = null;
        } else {
            r44Var = new r45.r44();
            int i18 = bundle.getInt("biz_type");
            r45.j44 j44Var = new r45.j44();
            j44Var.f377577d = "biz_type";
            j44Var.f377578e = java.lang.String.valueOf(i18);
            java.util.LinkedList linkedList = r44Var.f384542d;
            if (linkedList != null) {
                linkedList.add(j44Var);
            }
            java.lang.String string = bundle.getString("msg_svr_id");
            if (string != null) {
                r45.j44 j44Var2 = new r45.j44();
                j44Var2.f377577d = "msg_svr_id";
                j44Var2.f377578e = string;
                if (linkedList != null) {
                    linkedList.add(j44Var2);
                }
            }
            int i19 = bundle.getInt("pay_channel");
            r45.j44 j44Var3 = new r45.j44();
            j44Var3.f377577d = "pay_channel";
            j44Var3.f377578e = java.lang.String.valueOf(i19);
            if (linkedList != null) {
                linkedList.add(j44Var3);
            }
            java.lang.String string2 = bundle.getString("chat_username");
            if (string2 != null) {
                r45.j44 j44Var4 = new r45.j44();
                j44Var4.f377577d = "chat_username";
                j44Var4.f377578e = string2;
                if (linkedList != null) {
                    linkedList.add(j44Var4);
                }
            }
            java.lang.String string3 = bundle.getString("sender_username");
            if (string3 != null) {
                r45.j44 j44Var5 = new r45.j44();
                j44Var5.f377577d = "sender_username";
                j44Var5.f377578e = string3;
                if (linkedList != null) {
                    linkedList.add(j44Var5);
                }
            }
            int i27 = bundle.getInt("chat_type");
            r45.j44 j44Var6 = new r45.j44();
            j44Var6.f377577d = "chat_type";
            j44Var6.f377578e = java.lang.String.valueOf(i27);
            if (linkedList != null) {
                linkedList.add(j44Var6);
            }
            int i28 = bundle.getInt("send_type");
            r45.j44 j44Var7 = new r45.j44();
            j44Var7.f377577d = "send_type";
            j44Var7.f377578e = java.lang.String.valueOf(i28);
            if (linkedList != null) {
                linkedList.add(j44Var7);
            }
        }
        mx5Var.f380899f = r44Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f454917d = u0Var;
        return dispatch(sVar, this.f454918e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4790;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.NetSceneGetTagJump", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f454919f));
        this.f454917d.onSceneEnd(i18, i19, str, this);
    }
}
