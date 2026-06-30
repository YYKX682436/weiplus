package h73;

/* loaded from: classes11.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final h73.g f279492a = new h73.g();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f279493b = com.tencent.mm.sdk.platformtools.o4.M("online_status_kv");

    public final void a(com.tencent.mm.plugin.appbrand.config.GetOnLineInfoInfoResult getOnLineInfoInfoResult) {
        kotlin.jvm.internal.o.g(getOnLineInfoInfoResult, "<this>");
        com.tencent.mm.sdk.platformtools.o4 o4Var = f279493b;
        getOnLineInfoInfoResult.f77351d = o4Var.n("icon_type");
        getOnLineInfoInfoResult.f77352e = o4Var.n("client_version");
        getOnLineInfoInfoResult.f77353f = o4Var.h("is_wx_online");
        getOnLineInfoInfoResult.f77354g = o4Var.h("CAN_XWECHAT_SEND_OPEN_REQUEST");
        getOnLineInfoInfoResult.f77355h = o4Var.h("CAN_SEND_OPEN_REQUEST");
    }
}
