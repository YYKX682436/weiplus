package mm2;

/* loaded from: classes3.dex */
public final class a0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f328737a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mm2.e0 f328738b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.ch1 f328739c;

    public a0(java.lang.String str, mm2.e0 e0Var, r45.ch1 ch1Var) {
        this.f328737a = str;
        this.f328738b = e0Var;
        this.f328739c = ch1Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            return jz5.f0.f302826a;
        }
        r45.zm6 zm6Var = (r45.zm6) ((r45.tp2) fVar.f70618d).getCustom(7);
        if (zm6Var != null && zm6Var.getBoolean(1)) {
            java.lang.String string = zm6Var.getString(0);
            if (!(string == null || string.length() == 0)) {
                db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, zm6Var.getString(0), 0).show();
            }
        }
        java.lang.String tag = this.f328737a;
        kotlin.jvm.internal.o.g(tag, "tag");
        com.tencent.mars.xlog.Log.i(tag, "localLikeLog ".concat("cgi failed, revert like op"));
        lm2.h0 h0Var = this.f328738b.f328976s;
        r45.zi1 zi1Var = null;
        if (h0Var == null) {
            return null;
        }
        r45.zi1 zi1Var2 = new r45.zi1();
        r45.ch1 ch1Var = this.f328739c;
        com.tencent.mm.protobuf.g byteString = ch1Var.getByteString(4);
        byte[] g17 = byteString != null ? byteString.g() : null;
        if (g17 != null) {
            try {
                zi1Var2.parseFrom(g17);
                zi1Var = zi1Var2;
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
        if (zi1Var != null) {
            int i17 = zi1Var.f392085f;
            int i18 = qs5.u.f366471a;
            if (i17 == 1) {
                zi1Var.f392085f = 2;
                zi1Var.f392086g--;
            } else if (i17 == 2) {
                zi1Var.f392085f = 1;
                zi1Var.f392086g++;
            }
            zi1Var.f392086g = java.lang.Math.max(0, zi1Var.f392086g);
        }
        return java.lang.Boolean.valueOf(h0Var.h(ch1Var));
    }
}
