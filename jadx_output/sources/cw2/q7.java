package cw2;

/* loaded from: classes10.dex */
public final class q7 implements ek4.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cw2.s6 f223955a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f223956b;

    public q7(cw2.s6 s6Var, int i17) {
        this.f223955a = s6Var;
        this.f223956b = i17;
    }

    @Override // ek4.u
    public dn.o a(java.lang.String id6) {
        kotlin.jvm.internal.o.g(id6, "id");
        int i17 = this.f223956b;
        cw2.s6 s6Var = this.f223955a;
        cw2.wa waVar = s6Var.f224000e;
        java.lang.String string = waVar.f224098e.e().getString(54);
        if (string == null) {
            string = "";
        }
        mn2.j4 j4Var = waVar.f224098e;
        java.lang.String string2 = j4Var.e().getString(55);
        if (string2 == null) {
            string2 = "";
        }
        yr2.f fVar = new yr2.f(string, string2, j4Var.d());
        yr2.d dVar = yr2.d.f464663a;
        com.tencent.mm.plugin.finder.storage.FeedData feedData = waVar.f224099f;
        int position = feedData.getPosition();
        long feedId = feedData.getFeedId();
        java.lang.String str = s6Var.f224002g.field_originMediaId;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = s6Var.f223999d;
        java.lang.String str3 = waVar.f224094a;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = waVar.f224095b;
        int Ai = ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).Ai(1, waVar.f224095b);
        java.lang.String str5 = s6Var.f224002g.field_fileFormat;
        java.lang.String str6 = str5 == null ? "" : str5;
        java.lang.String i18 = j4Var.i();
        java.lang.String string3 = j4Var.e().getString(17);
        if (string3 == null) {
            string3 = "";
        }
        boolean z17 = j4Var.e().getInteger(39) == 1;
        java.lang.String fTPPTag = s6Var.f224006n.getFTPPTag();
        com.tencent.mm.protobuf.g byteString = j4Var.e().getByteString(66);
        return dVar.a(position, feedId, str, str2, str3, str4, Ai, str6, i18, string3, z17, s6Var, i17, fTPPTag, fVar, byteString != null ? byteString.f192156a : null);
    }
}
