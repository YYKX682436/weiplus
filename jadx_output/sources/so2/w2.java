package so2;

/* loaded from: classes.dex */
public final class w2 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final int f410689d;

    /* renamed from: e, reason: collision with root package name */
    public final long f410690e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.a82 f410691f;

    public w2(int i17, long j17, r45.a82 wecoinHotInfo) {
        kotlin.jvm.internal.o.g(wecoinHotInfo, "wecoinHotInfo");
        this.f410689d = i17;
        this.f410690e = j17;
        this.f410691f = wecoinHotInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        kotlin.jvm.internal.o.g(obj, "obj");
        java.lang.String str = null;
        r45.pe2 pe2Var = obj instanceof r45.pe2 ? (r45.pe2) obj : null;
        if (pe2Var != null) {
            java.lang.String string = pe2Var.getString(0);
            r45.xn1 xn1Var = (r45.xn1) this.f410691f.getCustom(0);
            if (xn1Var != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) != null) {
                str = finderContact.getUsername();
            }
            if (com.tencent.mm.sdk.platformtools.t8.D0(string, str)) {
                return 0;
            }
        }
        return -1;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return so2.w2.class.hashCode();
    }
}
