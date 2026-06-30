package lp;

/* loaded from: classes7.dex */
public class a implements q25.a {
    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, java.lang.String str) {
        if ("FLAVOR_CHATBOT".equalsIgnoreCase(com.tencent.mm.sdk.platformtools.z.f193124t.a("FEATURE_ID"))) {
            ((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).aj(context, 0, "wxid_wi_1d142z0zdj03", true, null, null);
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ChatBotTestCommand", "[-] wrong featureId, please use 'MANUAL' version.");
        return false;
    }
}
