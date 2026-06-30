package yw3;

/* loaded from: classes12.dex */
public final class e6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerSerializeClassDemoUI f466734d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(com.tencent.mm.plugin.repairer.ui.demo.RepairerSerializeClassDemoUI repairerSerializeClassDemoUI) {
        super(0);
        this.f466734d = repairerSerializeClassDemoUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gx3.a aVar = new gx3.a();
        aVar.n("test1");
        aVar.o(com.tencent.ilink.auth.FaceExtVerifyType.kFaceExtVerifyType_WxPay_End_VALUE);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        gx3.b bVar = new gx3.b();
        bVar.j("itemString1");
        bVar.k(123123);
        linkedList.add(bVar);
        gx3.b bVar2 = new gx3.b();
        bVar2.j("itemString2");
        bVar2.k(12316);
        linkedList.add(bVar2);
        gx3.b bVar3 = new gx3.b();
        bVar3.j("itemString3");
        bVar3.k(12316);
        linkedList.add(bVar3);
        aVar.p(linkedList);
        aVar.l().add("field7String1");
        aVar.l().add("field7String2");
        aVar.l().add("field7String3");
        aVar.l().add("field7String4");
        aVar.j().add(101);
        aVar.j().add(102);
        aVar.j().add(103);
        aVar.k().j("field15String1");
        aVar.k().k(1920938);
        org.json.JSONObject json = aVar.toJson();
        aVar.toJson(false);
        java.lang.String xml = aVar.toXml();
        aVar.toXml(false);
        aVar.toXml(true, "wechat.msg");
        pm0.v.X(new yw3.d6(this.f466734d, json, xml));
        return jz5.f0.f302826a;
    }
}
