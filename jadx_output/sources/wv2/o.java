package wv2;

/* loaded from: classes2.dex */
public final class o extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.x80 f450034g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f450035h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f450036i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f450037m;

    /* renamed from: n, reason: collision with root package name */
    public final r45.op2 f450038n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderObject f450039o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f450040p;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013d A[EDGE_INSN: B:50:0x013d->B:51:0x013d BREAK  A[LOOP:0: B:21:0x00b2->B:32:0x0137], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o(com.tencent.mm.plugin.finder.storage.x80 r18, java.lang.String r19, r45.qt2 r20, byte[] r21, int r22, kotlin.jvm.internal.i r23) {
        /*
            Method dump skipped, instructions count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wv2.o.<init>(com.tencent.mm.plugin.finder.storage.x80, java.lang.String, r45.qt2, byte[], int, kotlin.jvm.internal.i):void");
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderDraftPost2", "errType %d, errCode %d, errMsg %s, localId:" + this.f450034g.field_localId, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.modelbase.u0 u0Var = this.f450037m;
        if (u0Var != null) {
            kotlin.jvm.internal.o.d(u0Var);
            u0Var.onSceneEnd(i18, i19, str, this);
        }
        hz2.d.f286313a.h(i18, i19, str);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f450037m = u0Var;
        return dispatch(sVar, this.f450036i, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 6649;
    }

    @Override // az2.u, com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        super.onGYNetEnd(i17, i18, i19, str, v0Var, bArr);
        com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderDraftPost2", "errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        com.tencent.mm.modelbase.u0 u0Var = this.f450037m;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
