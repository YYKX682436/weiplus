package ws2;

/* loaded from: classes3.dex */
public final class l0 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f449088d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f449089e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f449090f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f449091g;

    public l0(java.lang.ref.WeakReference rHelper, java.lang.String tag, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(rHelper, "rHelper");
        kotlin.jvm.internal.o.g(tag, "tag");
        this.f449088d = rHelper;
        this.f449089e = tag;
        this.f449090f = z17;
        this.f449091g = z18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.i72 i72Var;
        int integer;
        r45.i72 i72Var2;
        r45.i72 i72Var3;
        com.tencent.mm.modelbase.f result = (com.tencent.mm.modelbase.f) obj;
        kotlin.jvm.internal.o.g(result, "result");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkFinderObject(forRestar:");
        boolean z17 = this.f449090f;
        sb6.append(z17);
        sb6.append(") result ");
        sb6.append(result.f70615a);
        sb6.append(' ');
        sb6.append(result.f70616b);
        sb6.append(",playTransition:");
        boolean z18 = this.f449091g;
        sb6.append(z18);
        sb6.append('!');
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(sb6.toString());
        int i17 = result.f70615a;
        java.lang.ref.WeakReference weakReference = this.f449088d;
        if (i17 == 0 && result.f70616b == 0) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) result.f70618d).getCustom(2);
            if (finderObject != null) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("newFeed ");
                sb7.append(finderObject.getNickname());
                sb7.append(" id:");
                sb7.append(finderObject.getId());
                sb7.append(",replay info:[");
                r45.nw1 liveInfo = finderObject.getLiveInfo();
                sb7.append((liveInfo == null || (i72Var3 = (r45.i72) liveInfo.getCustom(44)) == null) ? null : java.lang.Integer.valueOf(i72Var3.getInteger(0)));
                sb7.append(',');
                r45.nw1 liveInfo2 = finderObject.getLiveInfo();
                sb7.append((liveInfo2 == null || (i72Var2 = (r45.i72) liveInfo2.getCustom(44)) == null) ? null : java.lang.Long.valueOf(i72Var2.getLong(1)));
                sb7.append(']');
                stringBuffer.append(sb7.toString());
                java.lang.String stringBuffer2 = stringBuffer.toString();
                java.lang.String str = this.f449089e;
                com.tencent.mars.xlog.Log.i(str, stringBuffer2);
                ws2.p0 p0Var = (ws2.p0) weakReference.get();
                if (p0Var != null) {
                    mm2.e1 e1Var = (mm2.e1) p0Var.b(mm2.e1.class);
                    if (e1Var != null && finderObject.getId() == e1Var.f328983m) {
                        km2.m data = p0Var.f449117a.getData();
                        if (data != null) {
                            data.f309129d = zl2.l.c(zl2.l.f473865a, finderObject, 0, false, 6, null);
                            cm2.a.f43328a.v(data, finderObject, 2);
                            r45.nw1 liveInfo3 = finderObject.getLiveInfo();
                            if (liveInfo3 != null && (i72Var = (r45.i72) liveInfo3.getCustom(44)) != null && (integer = i72Var.getInteger(2)) > 0) {
                                ((ct2.j) data.f309130e.a(ct2.j.class)).a7(integer, java.lang.Boolean.TRUE);
                            }
                        }
                        ws2.p0.a(p0Var, z17, z18);
                    } else {
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("resp id different with local objectId:");
                        mm2.e1 e1Var2 = (mm2.e1) p0Var.b(mm2.e1.class);
                        sb8.append(e1Var2 != null ? java.lang.Long.valueOf(e1Var2.f328983m) : null);
                        sb8.append('!');
                        com.tencent.mars.xlog.Log.e(str, sb8.toString());
                    }
                }
            }
        } else {
            ws2.p0 p0Var2 = (ws2.p0) weakReference.get();
            if (p0Var2 != null) {
                ws2.p0.a(p0Var2, z17, z18);
            }
        }
        return jz5.f0.f302826a;
    }
}
