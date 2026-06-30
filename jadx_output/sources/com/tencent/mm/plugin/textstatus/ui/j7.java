package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class j7 implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pj4.p1 f174006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 f174007e;

    public j7(pj4.p1 p1Var, com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        this.f174006d = p1Var;
        this.f174007e = textStatusDoWhatActivityV2;
    }

    @Override // l81.p0
    public final java.lang.String a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject json = this.f174006d.toJSON();
        com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f174007e;
        jSONObject.put(textStatusDoWhatActivityV2.f173559y, json);
        jSONObject.put(textStatusDoWhatActivityV2.f173562z, textStatusDoWhatActivityV2.A);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "initEmojiPanel: configJson：%s", json.toString());
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }
}
