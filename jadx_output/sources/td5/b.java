package td5;

/* loaded from: classes5.dex */
public class b extends d21.c {

    /* renamed from: l, reason: collision with root package name */
    public int f417760l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f417761m;

    /* renamed from: n, reason: collision with root package name */
    public long f417762n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f417763o;

    public b(java.util.Map map, com.tencent.mm.storage.f9 f9Var) {
        super(map, f9Var);
        this.f417762n = 0L;
    }

    @Override // d21.c
    public boolean b() {
        int i17 = 0;
        if (this.f225785a == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.InvokeMessageNewXmlMsg", "[parseXml] values == null ");
            return false;
        }
        com.tencent.mm.storage.f9 f9Var = this.f225786b;
        if (f9Var == null || !f9Var.P2()) {
            if (this.f225785a.containsKey(".sysmsg.invokeMessage.preContent")) {
                com.tencent.mm.storage.f9 f9Var2 = this.f225786b;
                if (f9Var2 == null || f9Var2.getType() == 10002) {
                    this.f417761m = (java.lang.String) this.f225785a.get(".sysmsg.invokeMessage.preContent");
                } else {
                    this.f417761m = this.f225786b.j();
                }
            }
            if (this.f225785a.containsKey(".sysmsg.invokeMessage.msgSource")) {
                this.f417763o = (java.lang.String) this.f225785a.get(".sysmsg.invokeMessage.msgSource");
            }
            if (this.f225785a.containsKey(".sysmsg.invokeMessage.timestamp")) {
                this.f417762n = com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) this.f225785a.get(".sysmsg.invokeMessage.timestamp"));
            }
            if (this.f225785a.containsKey(".sysmsg.invokeMessage.type")) {
                this.f417760l = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) this.f225785a.get(".sysmsg.invokeMessage.type"), 0);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int i18 = 0;
            for (java.lang.String str : this.f225785a.keySet()) {
                if (str.startsWith(".sysmsg.invokeMessage.text")) {
                    if (sb6.length() > 0) {
                        sb6.insert(0, (java.lang.String) this.f225785a.get(str));
                    } else {
                        sb6.append((java.lang.String) this.f225785a.get(str));
                    }
                } else if (str.startsWith(".sysmsg.invokeMessage.link.text") && !com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) this.f225785a.get(str))) {
                    java.lang.String str2 = (java.lang.String) this.f225785a.get(str);
                    sb6.append(str2);
                    this.f225791g.add(str2);
                    i18 = str2.length();
                }
            }
            this.f225792h.addFirst(java.lang.Integer.valueOf(sb6.length() - i18));
            this.f225793i.add(java.lang.Integer.valueOf(sb6.length()));
            this.f225787c = sb6.toString();
            c();
            return true;
        }
        w15.h hVar = new w15.h();
        hVar.fromXml(this.f225786b.f2());
        w15.e k17 = hVar.k();
        if (k17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.InvokeMessageNewXmlMsg", "[parseXml] revokeMsg == null ");
            return false;
        }
        this.f225789e = k17.getText();
        this.f225788d = "revokemsg";
        w15.d j17 = k17.j();
        if (j17 != null) {
            this.f225790f = j17.getScene();
            this.f417761m = this.f225786b.j();
            this.f417760l = (int) j17.n();
            this.f417762n = j17.l() * 1000;
            if (j17.k() != null && !j17.k().isEmpty()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.InvokeMessageNewXmlMsg", "[getAtSomebodyUsernames]  atList size:%s", java.lang.Integer.valueOf(j17.k().length()));
                java.util.HashMap hashMap = new java.util.HashMap(1);
                hashMap.put("atuserlist", "<![CDATA[" + j17.k() + "]]>");
                java.lang.String wi6 = ((w11.j1) ((vg3.m4) i95.n0.c(vg3.m4.class))).wi(this.f225786b);
                this.f417763o = wi6;
                com.tencent.mars.xlog.Log.i("MicroMsg.InvokeMessageNewXmlMsg", "[mergeMsgSource] rawSource:%s args is null:%s flag:%s", wi6, false, 1);
                if (com.tencent.mm.sdk.platformtools.t8.K0(wi6) || wi6.startsWith("<msgsource>")) {
                    java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                    if (com.tencent.mm.sdk.platformtools.t8.K0(wi6)) {
                        stringBuffer.append("<msgsource>");
                    }
                    for (java.util.Map.Entry entry : hashMap.entrySet()) {
                        java.lang.String str3 = (java.lang.String) entry.getValue();
                        java.lang.String str4 = (java.lang.String) entry.getKey();
                        if (com.tencent.mm.sdk.platformtools.t8.K0(str3) || com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.InvokeMessageNewXmlMsg", "%s %s", str4, str3);
                        } else if (!"similar_paste_seq".equalsIgnoreCase(str4)) {
                            stringBuffer.append("<");
                            stringBuffer.append(str4);
                            stringBuffer.append(">");
                            stringBuffer.append(str3);
                            stringBuffer.append("</");
                            stringBuffer.append(str4);
                            stringBuffer.append(">");
                        }
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.K0(wi6)) {
                        stringBuffer.append("</msgsource>");
                        wi6 = stringBuffer.toString();
                    } else {
                        wi6 = wi6.replace("<msgsource>", "<msgsource>" + stringBuffer.toString());
                    }
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.InvokeMessageNewXmlMsg", "[mergeMsgSource] the msgsource is right? %s", wi6);
                }
                this.f417763o = wi6;
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            if (!j17.o().isEmpty()) {
                if (sb7.length() > 0) {
                    sb7.insert(0, j17.o());
                } else {
                    sb7.append(j17.o());
                }
            }
            if (((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Ni()) {
                boolean z17 = c01.id.c() - this.f417762n >= 300000;
                if (j17.j() == 1 && !z17) {
                    java.lang.String str5 = "  " + com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.g3_);
                    sb7.append(str5);
                    this.f225791g.add(str5);
                    i17 = str5.length();
                }
                this.f225792h.addFirst(java.lang.Integer.valueOf(sb7.length() - i17));
                this.f225793i.add(java.lang.Integer.valueOf(sb7.length()));
                this.f225787c = sb7.toString();
            } else {
                if (j17.j() == 1) {
                    java.lang.String str6 = "  " + com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.g3_);
                    sb7.append(str6);
                    this.f225791g.add(str6);
                    i17 = str6.length();
                }
                this.f225792h.addFirst(java.lang.Integer.valueOf(sb7.length() - i17));
                this.f225793i.add(java.lang.Integer.valueOf(sb7.length()));
                this.f225787c = sb7.toString();
                if (this.f225786b.A0() == 1) {
                    c();
                }
            }
        }
        return true;
    }

    public final void c() {
        if (c01.id.c() - this.f417762n < 300000 || com.tencent.mm.sdk.platformtools.t8.K0(this.f417761m)) {
            return;
        }
        s75.d.b(new td5.a(this), "[checkExpired]");
    }
}
