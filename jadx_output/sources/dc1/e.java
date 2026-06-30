package dc1;

/* loaded from: classes7.dex */
public final class e extends dc1.d {
    public static final int CTRL_INDEX = 1152;
    public static final java.lang.String NAME = "openCustomerServiceChatForFakeNative";

    /* renamed from: h, reason: collision with root package name */
    public final boolean f228692h = true;

    @Override // dc1.d
    public void C(com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest request) {
        kotlin.jvm.internal.o.g(request, "request");
        request.f72275g = true;
    }

    @Override // dc1.d
    public boolean D() {
        return this.f228692h;
    }

    @Override // dc1.d
    public java.lang.String F(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject extInfo, org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = extInfo.optString("entity", super.F(lVar, extInfo, data));
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        return optString;
    }
}
