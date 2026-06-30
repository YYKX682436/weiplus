package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes2.dex */
public final class il extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f204199d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        super(1);
        this.f204199d = finderObject;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String str = "";
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                str = str + ((java.lang.String) it.next()) + ';';
            }
        }
        if (r26.i0.o(str, ";", false, 2, null)) {
            str = str.substring(0, str.length() - 1);
            kotlin.jvm.internal.o.f(str, "substring(...)");
        }
        jSONObject.put("share_username", str);
        vs5.a aVar = vs5.a.f439924a;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f204199d;
        r45.nw1 liveInfo = finderObject.getLiveInfo();
        aVar.a(java.lang.String.valueOf(liveInfo != null ? java.lang.Long.valueOf(liveInfo.getLong(0)) : null), pm0.v.u(finderObject.getId()), finderObject.getUsername(), "6", "1", "0", (i17 & 64) != 0 ? null : jSONObject, (i17 & 128) != 0 ? "" : null);
        return jz5.f0.f302826a;
    }
}
