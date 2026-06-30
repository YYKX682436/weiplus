package yw3;

/* loaded from: classes8.dex */
public final class d6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerSerializeClassDemoUI f466720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f466721e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f466722f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(com.tencent.mm.plugin.repairer.ui.demo.RepairerSerializeClassDemoUI repairerSerializeClassDemoUI, org.json.JSONObject jSONObject, java.lang.String str) {
        super(0);
        this.f466720d = repairerSerializeClassDemoUI;
        this.f466721e = jSONObject;
        this.f466722f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.repairer.ui.demo.RepairerSerializeClassDemoUI repairerSerializeClassDemoUI = this.f466720d;
        em.m3 m3Var = (em.m3) ((jz5.n) repairerSerializeClassDemoUI.d).getValue();
        if (m3Var.f254616b == null) {
            m3Var.f254616b = (android.widget.TextView) m3Var.f254615a.findViewById(com.tencent.mm.R.id.hpa);
        }
        m3Var.f254616b.setText("jsonTrim: \n" + this.f466721e);
        em.m3 m3Var2 = (em.m3) ((jz5.n) repairerSerializeClassDemoUI.d).getValue();
        if (m3Var2.f254617c == null) {
            m3Var2.f254617c = (android.widget.TextView) m3Var2.f254615a.findViewById(com.tencent.mm.R.id.psq);
        }
        m3Var2.f254617c.setText("xmlTrim: \n" + this.f466722f);
        return jz5.f0.f302826a;
    }
}
