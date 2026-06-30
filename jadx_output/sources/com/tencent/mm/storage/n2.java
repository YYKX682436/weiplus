package com.tencent.mm.storage;

/* loaded from: classes5.dex */
public final class n2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.s1 f195139d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(com.tencent.mm.storage.s1 s1Var) {
        super(0);
        this.f195139d = s1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Map l17 = com.tencent.mm.storage.s2.l(this.f195139d);
        if (l17 == null || com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) l17.get(".msg.appmsg.mmreader.notify_msg.act"))) {
            return "";
        }
        java.lang.String str = (java.lang.String) l17.get(".msg.appmsg.mmreader.notify_msg.title");
        if (str == null) {
            str = "";
        }
        int i17 = 0;
        java.lang.String str2 = "";
        while (i17 < 11) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(".msg.appmsg.mmreader.notify_msg.msg.item");
            sb6.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
            sb6.append(".content");
            java.lang.String str3 = (java.lang.String) l17.get(sb6.toString());
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                break;
            }
            str2 = str2 + str3;
            i17++;
        }
        return str.concat(":") + str2;
    }
}
