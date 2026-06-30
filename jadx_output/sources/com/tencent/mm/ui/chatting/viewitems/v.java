package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes2.dex */
public final class v implements j45.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f205731a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.g92 f205732b;

    public v(boolean z17, r45.g92 g92Var) {
        this.f205731a = z17;
        this.f205732b = g92Var;
    }

    @Override // j45.g
    public final void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i18 == -1) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new java.util.ArrayList<>(0);
            }
            java.util.Iterator<T> it = stringArrayListExtra.iterator();
            java.lang.String str = "";
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.String str2 = (java.lang.String) it.next();
                if (str.length() == 0) {
                    str = str + str2;
                } else {
                    str = str + ';' + str2;
                }
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("share_username", str);
            boolean z17 = this.f205731a;
            vs5.a aVar = vs5.a.f439924a;
            r45.g92 g92Var = this.f205732b;
            if (z17) {
                aVar.a(g92Var.getString(0), g92Var.getString(2), g92Var.getString(1), "4", "1", "0", (i17 & 64) != 0 ? null : jSONObject, (i17 & 128) != 0 ? "" : null);
            } else {
                aVar.a(g92Var.getString(0), g92Var.getString(2), g92Var.getString(1), "3", "1", "0", (i17 & 64) != 0 ? null : jSONObject, (i17 & 128) != 0 ? "" : null);
            }
        }
    }
}
