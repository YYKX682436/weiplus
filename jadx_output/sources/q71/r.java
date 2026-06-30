package q71;

/* loaded from: classes15.dex */
public class r extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f360363d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f360364e;

    /* renamed from: f, reason: collision with root package name */
    public r45.pu5 f360365f;

    public r(i83.b bVar) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ou5();
        lVar.f70665b = new r45.pu5();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaapp/autofill/saveinfo";
        lVar.f70667d = bb1.d.CTRL_INDEX;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f360364e = a17;
        r45.ou5 ou5Var = (r45.ou5) a17.f70710a.f70684a;
        ou5Var.f382531f = 2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("{\"user_uin\":" + c01.d9.b().C() + " ,\"user_data_list\": [");
        if (bVar.f289635e.equals("0")) {
            sb6.append("{\"group_key\": \"invoice_info\",\"group_info\": {\"group_id\": " + bVar.f289634d + ",\"field_list\": [{\"key\": \"type\",\"value\": \"" + bVar.f289635e + "\"},{\"key\": \"title\",\"value\": \"" + bVar.f289636f + "\"},{\"key\": \"tax_number\",\"value\": \"" + bVar.f289638h + "\"},{\"key\": \"bank_number\",\"value\": \"" + bVar.f289639i + "\"},{\"key\": \"phone\",\"value\": \"" + bVar.f289642o + "\"},{\"key\": \"company_address_detail\",\"value\": \"" + bVar.f289645r + "\"},{\"key\": \"bank_name\",\"value\": \"" + bVar.f289640m + "\"}]}}");
        } else {
            sb6.append("{\"group_key\": \"invoice_info\",\"group_info\": {\"group_id\": " + bVar.f289634d + ",\"field_list\": [{\"key\": \"type\",\"value\": \"" + bVar.f289635e + "\"},{\"key\": \"title\",\"value\": \"" + bVar.f289637g + "\"},{\"key\": \"phone\",\"value\": \"" + bVar.f289643p + "\"},{\"key\": \"email\",\"value\": \"" + bVar.f289644q + "\"}]}}");
        }
        sb6.append("]}");
        ou5Var.f382530e = sb6.toString();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f360363d = u0Var;
        return dispatch(sVar, this.f360364e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return bb1.d.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        java.util.LinkedList linkedList;
        if (i18 == 0 && i19 == 0) {
            r45.pu5 pu5Var = (r45.pu5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
            this.f360365f = pu5Var;
            if (pu5Var != null && (linkedList = pu5Var.f383411d) != null && linkedList.size() > 0 && this.f360365f.f383411d.get(0) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSaveUserAutoFillInfo", "resp groupId is.." + ((r45.bu3) this.f360365f.f383411d.get(0)).f371065e);
            }
        }
        this.f360363d.onSceneEnd(i18, i19, str, this);
    }
}
