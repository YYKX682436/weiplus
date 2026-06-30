package com.tencent.mm.plugin.finder.service;

/* loaded from: classes5.dex */
public final class j4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126092a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f126093b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f126094c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f126095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f126096e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f126097f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zy2.bb f126098g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.s f126099h;

    public j4(int i17, android.content.Context context, java.lang.String str, java.lang.String str2, long j17, long j18, zy2.bb bbVar, yz5.s sVar) {
        this.f126092a = i17;
        this.f126093b = context;
        this.f126094c = str;
        this.f126095d = str2;
        this.f126096e = j17;
        this.f126097f = j18;
        this.f126098g = bbVar;
        this.f126099h = sVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String e17;
        java.lang.String string;
        java.lang.String string2;
        com.tencent.mm.protobuf.g byteString;
        java.lang.String string3;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.vi2 vi2Var = (r45.vi2) ((r45.r81) fVar.f70618d).getCustom(4);
            java.lang.String str = (vi2Var == null || (string3 = vi2Var.getString(1)) == null) ? "" : string3;
            r45.lo2 lo2Var = new r45.lo2();
            r45.vi2 vi2Var2 = (r45.vi2) ((r45.r81) fVar.f70618d).getCustom(4);
            if (vi2Var2 == null || (byteString = vi2Var2.getByteString(4)) == null || lo2Var.parseFrom(byteString.g()) == null) {
                com.tencent.mm.plugin.finder.service.m4 m4Var = com.tencent.mm.plugin.finder.service.m4.f126148a;
                com.tencent.mars.xlog.Log.e("Finder.SessionInfoService", "extInfo is null! ");
            }
            int i18 = (lo2Var.getInteger(1) & 1) > 0 ? 1 : 0;
            r45.vi2 vi2Var3 = (r45.vi2) ((r45.r81) fVar.f70618d).getCustom(4);
            java.lang.String str2 = (vi2Var3 == null || (string2 = vi2Var3.getString(0)) == null) ? "" : string2;
            r45.vi2 vi2Var4 = (r45.vi2) ((r45.r81) fVar.f70618d).getCustom(4);
            int integer = vi2Var4 != null ? vi2Var4.getInteger(5) : 0;
            r45.vi2 vi2Var5 = (r45.vi2) ((r45.r81) fVar.f70618d).getCustom(4);
            boolean z17 = vi2Var5 != null ? vi2Var5.getBoolean(6) : false;
            android.content.Context context = this.f126093b;
            int i19 = this.f126092a;
            int i27 = 2;
            if (i19 == 1) {
                e17 = xy2.c.e(context);
            } else if (i19 == 2) {
                e17 = c01.z1.r();
            } else if (i19 != 3) {
                e17 = i19 != 14 ? c01.z1.r() : xy2.c.e(context);
            } else {
                e17 = c01.z1.k();
                i27 = 3;
            }
            java.lang.String str3 = e17;
            int i28 = (lo2Var.getInteger(1) & 4) > 0 ? 1 : 0;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getSessionId] ");
            java.lang.String str4 = this.f126094c;
            sb6.append(str4);
            sb6.append(',');
            sb6.append(this.f126095d);
            sb6.append(',');
            sb6.append(this.f126096e);
            sb6.append('#');
            sb6.append(this.f126097f);
            sb6.append(" => ");
            sb6.append(str);
            sb6.append(" enableAction=");
            sb6.append(i18);
            sb6.append(" from server. username is equal?");
            sb6.append(kotlin.jvm.internal.o.b(str2, str4));
            sb6.append(" followFlag=");
            sb6.append(integer);
            com.tencent.mars.xlog.Log.i("Finder.SessionInfoService", sb6.toString());
            if (str.length() > 0) {
                if (str2.length() > 0) {
                    if (i19 == 1 && com.tencent.mm.storage.z3.E4(str2)) {
                        com.tencent.mm.plugin.finder.service.m4 m4Var2 = com.tencent.mm.plugin.finder.service.m4.f126148a;
                        if (m4Var2.e().z0(str2, 1).length() > 0) {
                            com.tencent.mars.xlog.Log.i("Finder.SessionInfoService", "build session to alias, but local has save sessionId, the talker has rebuild alias , so delete old sessionInfo");
                            m4Var2.e().y0(m4Var2.e().z0(str2, 1), false);
                        }
                    }
                    com.tencent.mm.plugin.finder.storage.dj0 e18 = com.tencent.mm.plugin.finder.service.m4.f126148a.e();
                    zy2.bb bbVar = this.f126098g;
                    kotlin.jvm.internal.o.d(str3);
                    e18.L0(str, str2, i27, i18, bbVar, i28, 0, str3, integer, z17);
                }
            }
            yz5.s sVar = this.f126099h;
            r45.vi2 vi2Var6 = (r45.vi2) ((r45.r81) fVar.f70618d).getCustom(4);
            sVar.v((vi2Var6 == null || (string = vi2Var6.getString(1)) == null) ? "" : string, java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b), fVar.f70617c);
        } else {
            this.f126099h.v("", java.lang.Boolean.FALSE, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(fVar.f70616b), fVar.f70617c);
        }
        return jz5.f0.f302826a;
    }
}
