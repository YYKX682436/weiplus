package k41;

/* loaded from: classes11.dex */
public final class i0 implements j41.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f304012a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f304013b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f304014c;

    public i0(com.tencent.mm.pointers.PBool pBool, yz5.l lVar, java.lang.String str, java.lang.String str2) {
        this.f304012a = pBool;
        this.f304013b = lVar;
        this.f304014c = str2;
    }

    @Override // j41.w
    public void a(j41.i0 i0Var) {
        java.lang.String str;
        j41.u uVar = i0Var != null ? i0Var.f297643d : null;
        yz5.l lVar = this.f304013b;
        com.tencent.mm.pointers.PBool pBool = this.f304012a;
        if (uVar == null) {
            pBool.value = false;
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenIMKefuContactCardContent", "kefuCard getShareCardMsgContent contact invalid");
            lVar.invoke(null);
            return;
        }
        k41.g0 g0Var = (k41.g0) uVar;
        java.lang.String fj6 = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(g0Var.field_openImAppId, g0Var.field_openImDescWordingId);
        if (g0Var.field_enterprise_auth_status == 2) {
            str = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Vi(g0Var.field_openImAppId, "openim_desc_icon", j41.a0.TYPE_URL, 1);
            kotlin.jvm.internal.o.f(str, "getAppIDString(...)");
        } else {
            str = "";
        }
        java.lang.String format = java.lang.String.format("<msg bigheadimgurl=\"%s\" smallheadimgurl=\"%s\" username=\"%s\" nickname=\"%s\" openimappid=\"%s\" openimdesc=\"%s\" openimdescicon=\"%s\"/>", java.util.Arrays.copyOf(new java.lang.Object[]{com.tencent.mm.sdk.platformtools.t8.p(g0Var.field_bigHeadImg), com.tencent.mm.sdk.platformtools.t8.p(g0Var.field_smallHeadImg), com.tencent.mm.sdk.platformtools.t8.p(g0Var.field_username), com.tencent.mm.sdk.platformtools.t8.p(g0Var.field_nickname), com.tencent.mm.sdk.platformtools.t8.p(g0Var.field_openImAppId), com.tencent.mm.sdk.platformtools.t8.p(fj6), com.tencent.mm.sdk.platformtools.t8.p(str)}, 7));
        kotlin.jvm.internal.o.f(format, "format(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuContactCardContent", "getShareCardMsgContent toSendUsername: %s, msgContent: %s", this.f304014c, format);
        lVar.invoke(format);
        pBool.value = true;
    }

    @Override // j41.w
    public void b(java.lang.String str) {
    }
}
