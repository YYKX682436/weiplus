package com.tencent.mm.ui.chatting.adapter;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.adapter.l f198434d = new com.tencent.mm.ui.chatting.adapter.l();

    public l() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Set set = mb5.a.f325492b;
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(mb5.a.f325492b);
        if (!android.text.TextUtils.isEmpty("")) {
            try {
                org.json.JSONArray optJSONArray = new org.json.JSONObject("").optJSONArray("noCompareTypes");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i17 = 0; i17 < length; i17++) {
                        int optInt = optJSONArray.optInt(i17, -1);
                        if (optInt != -1) {
                            hashSet.add(java.lang.Integer.valueOf(optInt));
                        }
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("ChattingViewConfig", th6, "parse err", new java.lang.Object[0]);
            }
        }
        mb5.a aVar = new mb5.a(hashSet);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingDataAdapterHelper", "viewConfig init:%s", aVar);
        return aVar;
    }
}
